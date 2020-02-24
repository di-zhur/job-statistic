package fantastic.job.statistic.domain.converter;

import fantastic.job.statistic.client.dto.JobDetail;
import fantastic.job.statistic.client.dto.KeySkill;
import fantastic.job.statistic.client.utils.DateUtils;
import fantastic.job.statistic.domain.JobInfo;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class JobDetailToJobInfoConverter implements Converter<JobDetail, JobInfo> {

    @Override
    public JobInfo convert(JobDetail source) {
        JobInfo jobInfo = new JobInfo();
        jobInfo.setId(source.getId());
        jobInfo.setName(source.getName());
        jobInfo.setArea(source.getArea());
        jobInfo.setSalary(source.getSalary());
        jobInfo.setExperience(source.getExperience());
        jobInfo.setDescription(source.getDescription());
        if (!CollectionUtils.isEmpty(source.getKeySkills())) {
            List<String> keySkills = source.getKeySkills()
                .stream()
                .map(KeySkill::getName)
                .collect(Collectors.toList());
            jobInfo.setKeySkills(keySkills);
        }
        jobInfo.setArchived(source.getArchived());
        jobInfo.setSpecializations(source.getSpecializations());
        jobInfo.setHidden(source.getHidden());
        jobInfo.setEmployer(source.getEmployer());
        jobInfo.setPublishedAt(DateUtils.convertStringToDate(source.getPublishedAt()));
        jobInfo.setCreatedAt(DateUtils.convertStringToDate(source.getCreatedAt()));
        jobInfo.setAlternateUrl(source.getAlternateUrl());
        return jobInfo;
    }

}

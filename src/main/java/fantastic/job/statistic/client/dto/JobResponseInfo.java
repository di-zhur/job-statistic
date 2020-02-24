package fantastic.job.statistic.client.dto;

import java.util.Objects;

public class JobResponseInfo {

    private JobResponse jobResponse;
    private long dateFrom;
    private long dateTo;

    public JobResponseInfo(JobResponse jobResponse, long dateFrom, long dateTo) {
        this.jobResponse = jobResponse;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public JobResponse getJobResponse() {
        return jobResponse;
    }

    public long getDateFrom() {
        return dateFrom;
    }

    public long getDateTo() {
        return dateTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobResponseInfo that = (JobResponseInfo) o;
        return Objects.equals(jobResponse, that.jobResponse) &&
                Objects.equals(dateFrom, that.dateFrom) &&
                Objects.equals(dateTo, that.dateTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobResponse, dateFrom, dateTo);
    }
}

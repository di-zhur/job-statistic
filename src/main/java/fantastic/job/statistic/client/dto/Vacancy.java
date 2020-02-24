package fantastic.job.statistic.client.dto;

import java.util.Date;
import java.util.Objects;

public class Vacancy {

    private long id;
    private int areaId;
    private Date loadDate = new Date();
    private String description;
    private VacancyEmployer vacancyEmployer;

    public int getAreaId() {
        return areaId;
    }

    public Date getLoadDate() {
        return loadDate;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public VacancyEmployer getVacancyEmployer() { return vacancyEmployer; }

    public void setId(long id) {
        this.id = id;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVacancyEmployer(VacancyEmployer vacancyEmployer) {
        this.vacancyEmployer = vacancyEmployer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vacancy vacancy = (Vacancy) o;
        return id == vacancy.id &&
                areaId == vacancy.areaId &&
                Objects.equals(loadDate, vacancy.loadDate) &&
                Objects.equals(description, vacancy.description) &&
                Objects.equals(vacancyEmployer, vacancy.vacancyEmployer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, areaId, loadDate, description, vacancyEmployer);
    }

    @Override
    public String toString() {
        return "Vacancy{" +
                "id=" + id +
                ", areaId=" + areaId +
                ", loadDate=" + loadDate +
                ", description='" + description + '\'' +
                ", vacancyEmployer=" + vacancyEmployer +
                '}';
    }
}

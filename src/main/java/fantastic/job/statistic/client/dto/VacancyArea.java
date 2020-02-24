package fantastic.job.statistic.client.dto;

import java.util.Objects;

public class VacancyArea {

    private int id;
    private int parentId;
    private String name;

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getParentId() {
        return parentId;
    }


    public void setParentId(int parentId) {
        this.parentId = parentId;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacancyArea vacancyArea = (VacancyArea) o;
        return Objects.equals(id, vacancyArea.id) &&
                Objects.equals(parentId, vacancyArea.parentId) &&
                Objects.equals(name, vacancyArea.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, name);
    }

    @Override
    public String toString() {
        return "VacancyArea{" +
                "id='" + id + '\'' +
                ", parentId='" + parentId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

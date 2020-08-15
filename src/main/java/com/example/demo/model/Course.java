package com.example.demo.model;

import java.util.UUID;

public class Course {
    private UUID id;
    private String name;
    private int numberOfWeek;
    private double cost;
    private boolean certificateAdvelable;

    public Course(UUID id, String name, int numberOfWeek, double cost, boolean certificateAdvelable) {
        this.id = id;
        this.name = name;
        this.numberOfWeek = numberOfWeek;
        this.cost = cost;
        this.certificateAdvelable = certificateAdvelable;
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfWeek() {
        return this.numberOfWeek;
    }

    public double getCost() {
        return this.cost;
    }

    public boolean isCertificateAdvelable() {
        return this.certificateAdvelable;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfWeek(int numberOfWeek) {
        this.numberOfWeek = numberOfWeek;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCertificateAdvelable(boolean certificateAdvelable) {
        this.certificateAdvelable = certificateAdvelable;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Course)) return false;
        final Course other = (Course) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getNumberOfWeek() != other.getNumberOfWeek()) return false;
        if (Double.compare(this.getCost(), other.getCost()) != 0) return false;
        if (this.isCertificateAdvelable() != other.isCertificateAdvelable()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Course;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getNumberOfWeek();
        final long $cost = Double.doubleToLongBits(this.getCost());
        result = result * PRIME + (int) ($cost >>> 32 ^ $cost);
        result = result * PRIME + (this.isCertificateAdvelable() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "Course(id=" + this.getId() + ", name=" + this.getName() + ", numberOfWeek=" + this.getNumberOfWeek() + ", cost=" + this.getCost() + ", certificateAdvelable=" + this.isCertificateAdvelable() + ")";
    }
}

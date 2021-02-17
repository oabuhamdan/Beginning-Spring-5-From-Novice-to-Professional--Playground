package com.beginning_spring.chapter4;

import java.util.Objects;

public abstract class HasData {
    String datum = "default";

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HasData)) return false;
        HasData hasData = (HasData) o;
        return Objects.equals(getDatum(), hasData.getDatum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDatum());
    }
}
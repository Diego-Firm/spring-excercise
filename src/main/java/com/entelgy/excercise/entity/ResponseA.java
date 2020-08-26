package com.entelgy.excercise.entity;

import java.util.List;
import java.util.Objects;

public class ResponseA {
    public ResponseA(List<String> data) {
        this.data = data;
    }

    List<String> data;


    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseA responseA = (ResponseA) o;
        return Objects.equals(data, responseA.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}

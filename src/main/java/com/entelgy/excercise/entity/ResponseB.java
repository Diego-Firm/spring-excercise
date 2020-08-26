package com.entelgy.excercise.entity;

import java.util.Objects;

public class ResponseB {
    public ResponseB(ResponseA a) {
        this.a = a;
    }

    ResponseA a;

    public ResponseA getA() {
        return a;
    }

    public void setA(ResponseA a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseB responseB = (ResponseB) o;
        return Objects.equals(a, responseB.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}

package org.example.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class Employee {

    @JsonProperty
    long id;
    @JsonProperty
    String name;
    @JsonProperty
    OffsetDateTime createDate;

    public Employee() {
    }

    public Employee(long id, String name, OffsetDateTime createDate) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
    }
}

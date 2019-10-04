package org.example.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "department")
@JacksonXmlRootElement(localName = "City")
public class Department {

    @JacksonXmlProperty
    long departmentId;

    @JacksonXmlProperty
    String departmentName;

    @JacksonXmlProperty
    long empId;

    public Department(long departmentId, String departmentName, long empId) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.empId = empId;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", empId=" + empId +
                '}';
    }
}

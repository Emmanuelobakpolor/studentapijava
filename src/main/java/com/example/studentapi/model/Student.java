package com.example.studentapi.model;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@JsonPropertyOrder({ "id", "name", "email", "age" })
public class Student{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String email;
    private int age;

}

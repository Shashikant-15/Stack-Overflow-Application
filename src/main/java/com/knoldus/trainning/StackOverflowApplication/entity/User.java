package com.knoldus.trainning.StackOverflowApplication.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "name of User should not be null")
    private String firstName;
    @NotBlank(message = "name of User should not be null")
    private String lastName;
    @NotBlank(message = "email  of User should not be null")
    @Indexed(unique=true)
    private String email;
    private String designation;
    private String location;
    @Column(name= "created_at",nullable = false,updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;



}

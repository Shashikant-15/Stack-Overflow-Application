package com.knoldus.trainning.StackOverflowApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

  @Id
  @SequenceGenerator(name = "user_sequence",
          sequenceName = "user_sequence",
          allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE,
          generator = "user_sequence")
  @Column(name = "id")
  private Long id;

  @Column(unique = true, nullable = false)
  private String username;

  @Column(nullable = false)
  private String email;

  @NotEmpty
  @Size(min = 2, message = "Answer should have at least 2 characters")
  @Column(nullable = false)
  private String password;

  @Column(nullable = false)
  private String address;

    public <T> User(String username, String s, Collection<T> unmodifiableCollection) {
    }
}

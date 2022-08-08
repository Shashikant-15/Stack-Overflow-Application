package com.knoldus.trainning.StackOverflowApplication.CO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCO {

  @NotNull
  @Min(value = 2, message = "Id should be more than 0")
  private Long id;
  @NotEmpty
  @Size(min = 2, message = "Username should have at least 2 characters")
  private String username;
  @NotEmpty
  @Size(min = 2, message = "email should have at least 2 characters")
  @Email
  private String email;
  @NotEmpty
  @Size(min = 2, message = "password should have at least 2 characters")
  private String password;
  @NotEmpty
  @Size(min = 2, message = "address should have at least 2 characters")
  private String address;



}

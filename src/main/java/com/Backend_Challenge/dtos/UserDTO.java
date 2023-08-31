package com.Backend_Challenge.dtos;

import com.Backend_Challenge.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO (String firstName, String LastName, String document, String password, String email, BigDecimal balance, UserType userType){

}

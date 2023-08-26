package com.PicPayBackend_Challenge.dtos;

import com.PicPayBackend_Challenge.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO (String firstName, String LastName, String document, String password, String email, BigDecimal balance, UserType userType){

}

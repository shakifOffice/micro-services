package com.penta.accounts.Dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CustomerDto {
    private String email;
    private String name;
    private String mobileNumber;
}

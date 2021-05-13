package com.account.management.transaction.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class AccountEnquiryDto {

    @NotNull(message = "Customer id is required")
    private String customerId;
}

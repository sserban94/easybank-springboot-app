package com.ing.tech.EasyBank.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestSentDtoInput {
    @NotBlank
    String receiver;
    @NotBlank
    String transferAccount;
    @Min(0)
    Double amount;
    @NotBlank
    String currency;
    @NotBlank
    String message;
}

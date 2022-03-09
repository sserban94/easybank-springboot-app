package com.ing.tech.EasyBank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason="Accounts have different currencies !")
public class AccountsHaveDifferentCurrencies extends RuntimeException{

}

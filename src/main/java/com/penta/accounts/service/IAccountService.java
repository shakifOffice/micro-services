package com.penta.accounts.service;

import com.penta.accounts.Dto.CustomerDto;

public interface IAccountService {
    /***
     *
     * @param customerDto - CustomerDto object
     */
    void createAccount(CustomerDto customerDto);
}

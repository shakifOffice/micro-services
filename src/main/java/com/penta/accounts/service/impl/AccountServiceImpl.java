package com.penta.accounts.service.impl;

import com.penta.accounts.Dto.CustomerDto;
import com.penta.accounts.repository.AccountsRepository;
import com.penta.accounts.repository.CustomerRepository;
import com.penta.accounts.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {
    private CustomerRepository customerRepository;
    private AccountsRepository accountsRepository;
    /***
     *
     * @param customerDto - CustomerDto object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}

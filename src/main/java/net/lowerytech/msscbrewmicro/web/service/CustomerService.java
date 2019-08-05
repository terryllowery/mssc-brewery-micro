package net.lowerytech.msscbrewmicro.web.service;

import net.lowerytech.msscbrewmicro.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerByID(UUID id);

    CustomerDTO saveNewCustomer(CustomerDTO customerDTO);

    void updateCustomer(UUID customerId, CustomerDTO customerDTO);

    void deleteById(UUID customerId);
}

package net.lowerytech.msscbrewmicro.web.service;

import net.lowerytech.msscbrewmicro.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerByID(UUID id) {
        return CustomerDTO.builder().id(UUID.randomUUID())
                .customerName("Terry Lowery")
                .build();
    }
}

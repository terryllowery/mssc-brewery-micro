package net.lowerytech.msscbrewmicro.web.service;

import lombok.extern.slf4j.Slf4j;
import net.lowerytech.msscbrewmicro.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerByID(UUID id) {
        return CustomerDTO.builder().id(UUID.randomUUID())
                .customerName("Terry Lowery")
                .build();
    }

    @Override
    public CustomerDTO saveNewCustomer(CustomerDTO customerDTO) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .customerName(customerDTO.toString())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDTO customerDTO) {
        log.info("Updating customer: " + customerId);
        log.info("Customer info: " + customerDTO);

    }

    @Override
    public void deleteById(UUID customerId) {
        log.info("Deleting customer:" + customerId);
    }
}

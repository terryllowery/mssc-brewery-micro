package net.lowerytech.msscbrewmicro.web.controller;

import com.sun.net.httpserver.Headers;
import net.lowerytech.msscbrewmicro.web.model.CustomerDTO;
import net.lowerytech.msscbrewmicro.web.service.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable UUID customerId){
        return new ResponseEntity<>(customerService.getCustomerByID(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(CustomerDTO customerDTO){
        CustomerDTO savedDto = customerService.saveNewCustomer(customerDTO);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customers/" + savedDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity handleUpdate(@PathVariable UUID customerId, CustomerDTO customerDTO){
        customerService.updateCustomer(customerId, customerDTO);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable UUID customerId){
        customerService.deleteById(customerId);
    }
}

package com.vivekanandpv.lumenjpademo.apis;

import com.vivekanandpv.lumenjpademo.services.CustomerAccountService;
import com.vivekanandpv.lumenjpademo.viewmodels.CustomerAccountCreateViewModel;
import com.vivekanandpv.lumenjpademo.viewmodels.CustomerAccountViewModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("api/v1/customer-accounts")
public class CustomerAccountApi {
    private final CustomerAccountService customerAccountService;

    public CustomerAccountApi(CustomerAccountService customerAccountService) {
        this.customerAccountService = customerAccountService;
    }

    @GetMapping
    public ResponseEntity<List<CustomerAccountViewModel>> getAll() {

    }

    @GetMapping("by-customer/{customerId}")
    public ResponseEntity<List<CustomerAccountViewModel>> getAllByCustomerId(@PathVariable int customerId) {

    }

    @GetMapping("{id}")
    public ResponseEntity<CustomerAccountViewModel> getById(@PathVariable int id) {

    }

    @PostMapping
    public ResponseEntity<CustomerAccountViewModel> create(@RequestBody CustomerAccountCreateViewModel viewModel) {

    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id) {

    }
}

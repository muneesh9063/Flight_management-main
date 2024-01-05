package com.vivekanandpv.lumenjpademo.apis;

import com.vivekanandpv.lumenjpademo.services.CustomerService;
import com.vivekanandpv.lumenjpademo.viewmodels.CustomerCreateViewModel;
import com.vivekanandpv.lumenjpademo.viewmodels.CustomerUpdateViewModel;
import com.vivekanandpv.lumenjpademo.viewmodels.CustomerViewModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerApi {
    private final CustomerService customerService;

    public CustomerApi(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<List<CustomerViewModel>> getAll() {

    }

    @GetMapping("{id}")
    public ResponseEntity<CustomerViewModel> getById(@PathVariable int id) {

    }

    @PostMapping
    public ResponseEntity<CustomerViewModel> create(@RequestBody CustomerCreateViewModel viewModel) {

    }

    @PutMapping("{id}")
    public ResponseEntity<CustomerViewModel> update(@PathVariable int id, @RequestBody CustomerUpdateViewModel viewModel) {

    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id) {

    }
}

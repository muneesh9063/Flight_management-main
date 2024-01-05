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
        return ResponseEntity.ok(customerService.getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<CustomerViewModel> getById(@PathVariable int id) {
        return ResponseEntity.ok(customerService.getById(id));
    }

    @PostMapping
    public ResponseEntity<CustomerViewModel> create(@RequestBody CustomerCreateViewModel viewModel) {
        return ResponseEntity.ok(customerService.create(viewModel));
    }

    @PutMapping("{id}")
    public ResponseEntity<CustomerViewModel> update(@PathVariable int id, @RequestBody CustomerUpdateViewModel viewModel) {
        return ResponseEntity.ok(customerService.update(id, viewModel));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id) {
        customerService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

package com.vivekanandpv.lumenjpademo.services;

import com.vivekanandpv.lumenjpademo.exceptions.RecordNotFoundException;
import com.vivekanandpv.lumenjpademo.models.Customer;
import com.vivekanandpv.lumenjpademo.repositories.CustomerRepository;
import com.vivekanandpv.lumenjpademo.viewmodels.CustomerCreateViewModel;
import com.vivekanandpv.lumenjpademo.viewmodels.CustomerUpdateViewModel;
import com.vivekanandpv.lumenjpademo.viewmodels.CustomerViewModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImplementation implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImplementation(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerViewModel> getAll() {
        return customerRepository
                .findAll()
                .stream()
                .map(this::toViewModel)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerViewModel getById(int id) {
        return toViewModel(getEntityById(id));
    }

    @Override
    public CustomerViewModel create(CustomerCreateViewModel viewModel) {
        return toViewModel(customerRepository.saveAndFlush(toEntity(viewModel)));
    }

    @Override
    public CustomerViewModel update(int id, CustomerUpdateViewModel viewModel) {
        Customer entity = getEntityById(id);

        BeanUtils.copyProperties(viewModel, entity);

        return toViewModel(customerRepository.saveAndFlush(entity));
    }

    @Override
    public void deleteById(int id) {
        customerRepository.delete(getEntityById(id));
    }

    private CustomerViewModel toViewModel(Customer entity) {
        CustomerViewModel viewModel = new CustomerViewModel();
        BeanUtils.copyProperties(entity, viewModel);

        return viewModel;
    }

    private Customer toEntity(CustomerCreateViewModel viewModel) {
        Customer entity = new Customer();
        BeanUtils.copyProperties(viewModel, entity);
        return entity;
    }

    private Customer getEntityById(int id) {
        return customerRepository.findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(
                                String.format("Customer with id: %d is not found", id)
                        )
                );
    }
}

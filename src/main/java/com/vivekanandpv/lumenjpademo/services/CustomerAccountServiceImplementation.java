package com.vivekanandpv.lumenjpademo.services;

import com.vivekanandpv.lumenjpademo.exceptions.RecordNotFoundException;
import com.vivekanandpv.lumenjpademo.models.Customer;
import com.vivekanandpv.lumenjpademo.models.CustomerAccount;
import com.vivekanandpv.lumenjpademo.repositories.CustomerAccountRepository;
import com.vivekanandpv.lumenjpademo.viewmodels.CustomerAccountCreateViewModel;
import com.vivekanandpv.lumenjpademo.viewmodels.CustomerAccountViewModel;
import com.vivekanandpv.lumenjpademo.viewmodels.CustomerViewModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerAccountServiceImplementation implements CustomerAccountService {
    private final CustomerAccountRepository customerAccountRepository;

    public CustomerAccountServiceImplementation(CustomerAccountRepository customerAccountRepository) {
        this.customerAccountRepository = customerAccountRepository;
    }

    @Override
    public List<CustomerAccountViewModel> getAll() {
        return null;
    }

    @Override
    public CustomerAccountViewModel getById(int id) {
        return null;
    }

    @Override
    public List<CustomerAccountViewModel> getByCustomerId(int customerId) {
        return null;
    }

    @Override
    public CustomerAccountViewModel create(CustomerAccountCreateViewModel viewModel) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    private CustomerAccountViewModel toViewModel(CustomerAccount entity) {
        CustomerAccountViewModel viewModel = new CustomerAccountViewModel();
        BeanUtils.copyProperties(entity, viewModel);
        return viewModel;
    }

    private CustomerViewModel toViewModel(Customer entity) {
        CustomerViewModel viewModel = new CustomerViewModel();
        BeanUtils.copyProperties(entity, viewModel);
        return viewModel;
    }

    private CustomerAccount toEntity(CustomerAccountCreateViewModel viewModel) {
        CustomerAccount entity = new CustomerAccount();
        BeanUtils.copyProperties(viewModel, entity);
        return entity;
    }

    private CustomerAccount getEntityById(int id) {
        return customerAccountRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException(String.format("Account with id: %d is not found", id)));
    }
}

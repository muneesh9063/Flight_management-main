package com.vivekanandpv.lumenjpademo.services;

import com.vivekanandpv.lumenjpademo.viewmodels.CustomerAccountCreateViewModel;
import com.vivekanandpv.lumenjpademo.viewmodels.CustomerAccountViewModel;

import java.util.List;

public interface CustomerAccountService {
    List<CustomerAccountViewModel> getAll();
    CustomerAccountViewModel getById(int id);
    List<CustomerAccountViewModel> getByCustomerId(int customerId);
    CustomerAccountViewModel create(CustomerAccountCreateViewModel viewModel);
    void deleteById(int id);
}

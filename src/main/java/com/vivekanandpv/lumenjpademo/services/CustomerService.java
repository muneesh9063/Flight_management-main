package com.vivekanandpv.lumenjpademo.services;

import com.vivekanandpv.lumenjpademo.viewmodels.CustomerCreateViewModel;
import com.vivekanandpv.lumenjpademo.viewmodels.CustomerUpdateViewModel;
import com.vivekanandpv.lumenjpademo.viewmodels.CustomerViewModel;

import java.util.List;

public interface CustomerService {
    List<CustomerViewModel> getAll();
    CustomerViewModel getById(int id);
    CustomerViewModel create(CustomerCreateViewModel viewModel);
    CustomerViewModel update(int id, CustomerUpdateViewModel viewModel);
    void deleteById(int id);
}

package com.form.service;

import com.form.model.FormResponse;
import com.form.repository.FormRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormService {

    private final FormRepository repository;

    public FormService(FormRepository repository) {
        this.repository = repository;
    }

    public FormResponse saveForm(FormResponse form) {
        return repository.save(form);
    }

    // ✅ GET all form data
    public List<FormResponse> getAllForms() {
        return repository.findAll();
    }
}

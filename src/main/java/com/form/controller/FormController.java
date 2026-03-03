package com.form.controller;

import com.form.model.FormResponse;
import com.form.service.FormService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/form")
@CrossOrigin("*")
public class FormController {

    private final FormService service;

    public FormController(FormService service) {
        this.service = service;
    }

    @PostMapping("/submit")
    public String submitForm(@RequestBody FormResponse form) {
        service.saveForm(form);
        return "Form submitted successfully ✅";
    }

    // ✅ GET API to fetch all form responses
    @GetMapping("/all")
    public List<FormResponse> getAllFormData() {
        return service.getAllForms();
    }
}

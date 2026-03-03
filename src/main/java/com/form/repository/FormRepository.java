package com.form.repository;

import com.form.model.FormResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FormRepository extends MongoRepository<FormResponse, String> {
}

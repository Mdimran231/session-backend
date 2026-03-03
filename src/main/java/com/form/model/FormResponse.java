package com.form.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "form_responses")
public class FormResponse {

    @Id
    private String id;

    private String name;
    private String email;
    private String phone;
    private String city;

    private String gender;

    private String tenthPercentage;
    private String twelfthPercentage;

    private String course;

    private String message;
}

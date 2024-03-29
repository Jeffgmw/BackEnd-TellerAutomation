package com.teller.BackEndTellerAutomation.Utils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntityResponse<T> {
    private String message;
    private T entity;
    private Integer statusCode;
    }


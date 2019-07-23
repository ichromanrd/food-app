package com.ichromanrd.app.foodapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@Entity
public class Food {
    @Id
    private Long id;
    private String type;
    private int price;
}

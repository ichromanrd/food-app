package com.ichromanrd.app.foodapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@Entity
public class Food implements FoodPrice {
    @Id
    private Long id;
    private String type;
    private int price;

    @ManyToOne
    private Store store;
}

@Data
@Entity
@Table(name = "store")
class Store {
    @Id
    private Long id;
}

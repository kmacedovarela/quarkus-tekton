package org.kvarela.order;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

/**
 * Order
 */
@Entity
public class CustomerOrder extends PanacheEntity{
    public String nome;
    public Double value;
}
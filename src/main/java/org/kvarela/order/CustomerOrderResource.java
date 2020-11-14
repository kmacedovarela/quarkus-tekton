package org.kvarela.order;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

/**
 * OrderResource
 */
public interface CustomerOrderResource extends PanacheEntityResource<CustomerOrder, Long>{
}
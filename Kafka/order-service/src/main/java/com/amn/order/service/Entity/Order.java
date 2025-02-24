package com.amn.order.service.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.kafka.common.protocol.types.Field;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = "orders"
)
public class Order {
    @Setter
    @Id
    private String orderId;
    private String name;
    private int quantity;
    private double price;

}

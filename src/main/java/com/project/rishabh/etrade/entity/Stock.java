package com.project.rishabh.etrade.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue
    @Column(name = "stock_id")
    private Integer stockId;

    private String name;

    private String sector;

    private String unitPrice;

    private String exchange;

    private long category;

    private String risk;

    private LocalDateTime date;
}

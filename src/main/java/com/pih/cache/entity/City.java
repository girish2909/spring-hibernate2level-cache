package com.pih.cache.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="city")
@Cache(usage= CacheConcurrencyStrategy.READ_WRITE)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class City {

    @Id
    @Column(name = "cityid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "population")
    private Long population;

}

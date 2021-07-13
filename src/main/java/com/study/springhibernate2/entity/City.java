package com.study.springhibernate2.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Getter
@Setter
@ToString
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
public class City {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "population")
    private Long population;
}

//https://examples.javacodegeeks.com/enterprise-java/hibernate/second-level-cache-hibernate-example/
//https://www.netsurfingzone.com/hibernate/hibernate-jpa-ehcache-configuration-example/

package com.hendisantika.searchthymeleaf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by IntelliJ IDEA.
 * Project : Spring-Boot-Search-Example-using-Thymeleaf-and-Spring-Data-JPA
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2/27/23
 * Time: 06:39
 * To change this template use File | Settings | File Templates.
 */
@Getter
@ToString
@Entity
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ownerName;
    private long shopNo;
    private String shopType;
    private String address;
    private String country;
}

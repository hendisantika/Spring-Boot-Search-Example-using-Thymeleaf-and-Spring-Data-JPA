package com.hendisantika.searchthymeleaf.repository;

import com.hendisantika.searchthymeleaf.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : Spring-Boot-Search-Example-using-Thymeleaf-and-Spring-Data-JPA
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2/27/23
 * Time: 06:40
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer> {
    //Custom query
    @Query(value = "SELECT * FROM shop s WHERE s.owner_name LIKE %:keyword% OR s.shop_type LIKE %:keyword%",
            nativeQuery = true)
    List<Shop> findByKeyword(@Param("keyword") String keyword);
}

package com.hendisantika.searchthymeleaf.service;

import com.hendisantika.searchthymeleaf.repository.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : Spring-Boot-Search-Example-using-Thymeleaf-and-Spring-Data-JPA
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2/27/23
 * Time: 06:41
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class ShopService {
    private final ShopRepository shopRepository;
}

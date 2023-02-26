package com.hendisantika.searchthymeleaf.controller;

import com.hendisantika.searchthymeleaf.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * Project : Spring-Boot-Search-Example-using-Thymeleaf-and-Spring-Data-JPA
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2/27/23
 * Time: 06:42
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequiredArgsConstructor
public class ShopController {
    private final ShopService shopService;
}

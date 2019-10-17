package com.zaq.ssncv.ssncvapi.service;

import com.zaq.ssncv.ssncvapi.entity.Result;
import com.zaq.ssncv.ssncvapi.entity.User;
import com.zaq.ssncv.ssncvapi.fallback.UserServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ZAQ
 */
@FeignClient(value = "SSNCV-PROVIDER-USER", fallbackFactory = UserServiceFallbackFactory.class)
@RequestMapping("/user")
public interface UserService {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String index();

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    Result<User> login(@RequestBody User user);

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    Result<String> register(@RequestBody User user);

    @RequestMapping(value = "/logOut", method = RequestMethod.GET)
    Result<String> logout();
}

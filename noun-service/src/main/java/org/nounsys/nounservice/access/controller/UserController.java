package org.nounsys.nounservice.access.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.nounsys.nounservice.base.utils.JwtUtils;
import org.nounsys.nounservice.domain.response.UserDetailResponse;
import org.nounsys.nounservice.datasource.account.entity.User;
import org.nounsys.nounservice.datasource.account.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:gaoxu
 * @create:2020-03-16 15:38
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    private JwtUtils jwtUtils;
    private UserMapper userMapper;

    @Autowired
    public UserController(JwtUtils jwtUtils, UserMapper userMapper) {
        this.jwtUtils = jwtUtils;
        this.userMapper = userMapper;
    }

    @ApiOperation("用户登陆")
    @ApiImplicitParams({@ApiImplicitParam(name = "userName", value = "用户名", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query")})
    @PostMapping(value = "/login")
    public String Login(@RequestParam String userName, @RequestParam String password) {
        if (userName.equals("admin") && password.equals("admin")) {
            return "OK";
        } else {
            return "Fail";
        }
    }

    @ApiOperation("获取用户授权Token码")
    @PostMapping(value = "/token")
    public String getToken() {
        Map<String, String> claims = new HashMap<>();
        claims.put("privateKey", "bl");
        claims.put("seractKey", "Mp");
        return jwtUtils.sign(claims);
    }

    @ApiOperation("获取用户信息")
    @PostMapping(value = "/get")
    public User getUserById(@RequestParam Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @ApiOperation("获取用户信息")
    @GetMapping(value = "/get/info")
    public User getUserByIdInfo(@RequestParam Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @ApiOperation("用户登录请求")
    @RequestMapping(value = "/login/info", method = RequestMethod.POST)
    public String putAdmin(@RequestBody UserDetailResponse userDetailResponse) {
        return userDetailResponse.getUserName();
    }
}

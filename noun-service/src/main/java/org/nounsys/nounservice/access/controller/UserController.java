package org.nounsys.nounservice.access.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.nounsys.nounservice.base.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:gaoxu
 * @create:2020-03-16 15:38
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private JwtUtils jwtUtils;

    @ApiOperation("用户登陆")
    @ApiImplicitParams({@ApiImplicitParam(name = "userName", value = "用户名", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query")})
    @PostMapping(value = "/login")
    public ResponseEntity Login(@RequestParam String userName, @RequestParam String password) {
        if (userName.equals("admin") && password.equals("admin")) {
            return ResponseEntity.ok("OK");
        } else {
            return ResponseEntity.ok("Fail");
        }
    }

    @ApiOperation("获取用户授权Token码")
    @PostMapping(value = "/token")
    public String getToken() {
       Map<String,String> claims = new HashMap<>();
       claims.put("privateKey","bl");
       claims.put("seractKey","Mp");
       return jwtUtils.sign(claims);
    }
}

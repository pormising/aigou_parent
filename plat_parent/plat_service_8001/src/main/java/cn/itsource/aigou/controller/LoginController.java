package cn.itsource.aigou.controller;

import cn.itsource.aigou.domain.Employee;
import cn.itsource.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee) {
        if("admin".equals(employee.getUsername()) && "0".equals(employee.getPassword())){
            return  AjaxResult.me();
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名或者密码不正确");
    }
}

package com.CMS.controller;

import com.CMS.entity.User;
import com.CMS.pojo.Result;
import com.CMS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public Result test() {
        System.out.println("=== 测试接口被调用 ===");
        Map<String, Object> data = new HashMap<>();
        data.put("message", "这是一个测试");
        data.put("timestamp", System.currentTimeMillis());
        return Result.success(data);
    }
    // 测试1：直接返回 Map
    @GetMapping("/test1")
    public Map<String, Object> test1() {
        System.out.println("=== test1 被调用 ===");
        Map<String, Object> result = new HashMap<>();
        result.put("status", "success");
        result.put("message", "直接返回Map");
        return result;
    }

    // 测试2：直接返回 String
    @GetMapping("/test2")
    public String test2() {
        System.out.println("=== test2 被调用 ===");
        return "直接返回字符串";
    }

    // 测试3：使用 ResponseEntity
    @GetMapping("/test3")
    public org.springframework.http.ResponseEntity<Map<String, Object>> test3() {
        System.out.println("=== test3 被调用 ===");
        Map<String, Object> result = new HashMap<>();
        result.put("status", "success");
        result.put("message", "使用ResponseEntity");
        return org.springframework.http.ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public Result getById(Integer id){
        return Result.success();
    }
    @GetMapping
    public Result getAll(){
        return Result.success();
    }
    @PostMapping
    public Result add(@RequestBody User user){
        userService.add(user);
        return Result.success();
    }
    @PutMapping
    public Result update(User user){
        return Result.success();
    }
    @DeleteMapping
    public Result delete(Integer id){
        return Result.success();
    }
}

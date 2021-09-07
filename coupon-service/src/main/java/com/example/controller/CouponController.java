package com.example.controller;

import com.example.model.Coupon;
import com.example.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/coupons")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @PostMapping
    public Coupon createCoupon(@RequestBody Coupon coupon){
        return couponService.createCoupon(coupon);
    }

    @GetMapping("/{code}")
    public Coupon getCoupon(@PathVariable("code") String code){
        return couponService.getCoupon(code);
    }

}

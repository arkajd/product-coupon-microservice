package com.example.service;

import com.example.model.Coupon;
import com.example.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponService {

    @Autowired
    private CouponRepository couponRepository;

    public Coupon createCoupon(Coupon coupon){
        return couponRepository.save(coupon);
    }

    public Coupon getCoupon(String code){
        return couponRepository.findByCode(code);
    }


}

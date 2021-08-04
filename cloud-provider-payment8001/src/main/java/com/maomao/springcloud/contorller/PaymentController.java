package com.maomao.springcloud.contorller;

import com.maomao.springcloud.entities.CommonResult;
import com.maomao.springcloud.entities.Payment;
import com.maomao.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@Slf4j
public class PaymentController {
    //获取日志对象
    private Logger logger =  LogManager.getLogger(this.getClass().getName());
    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        logger.info("*****插入结果：" + result);
        if (result > 0){
            return new CommonResult(200, "新增成功！", result);
        }else{
            return  new CommonResult(444, "新增失败！");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
   public  CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        logger.info("*****查询结果：" + payment);
         if (payment != null ){
           return new CommonResult(200, "查询成功！", payment);
        }else{
           return  new CommonResult(444, "查询失败！");
        }
   }
}

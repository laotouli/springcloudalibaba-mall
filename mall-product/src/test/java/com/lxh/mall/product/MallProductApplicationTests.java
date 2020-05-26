package com.lxh.mall.product;

import com.lxh.mall.product.entity.BrandEntity;
import com.lxh.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallProductApplicationTests {

    @Resource
    BrandService brandService;

    @Test
    public void contextLoads() {

        BrandEntity brandEntity =new BrandEntity();
        brandEntity.setDescript("华为");
        brandService.save(brandEntity);
        System.out.println("success...............");
    }


}

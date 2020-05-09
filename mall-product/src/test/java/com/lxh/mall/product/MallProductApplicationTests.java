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

//    @Test
//    public void testUpload() throws FileNotFoundException {
//        // Endpoint以杭州为例，其它Region请按实际情况填写。
//        String endpoint = "oss-cn-zhangjiakou.aliyuncs.com";
//// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
//        String accessKeyId = "LTAI4GJJC6jnqCLFX7mnjhjQ";
//        String accessKeySecret = "wv7Z0JZOLNA8Zo0b5jhyY7WbqJiahY";
//
//// 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//// 上传文件流。
//        InputStream inputStream = new FileInputStream("/Users/lixiuhu/Desktop/1587034730.jpg");
//        ossClient.putObject("springcloudalibaba-mall", "1587034730.jpg", inputStream);
//
//// 关闭OSSClient。
//        ossClient.shutdown();
//        System.out.println("success.....");
//    }

}

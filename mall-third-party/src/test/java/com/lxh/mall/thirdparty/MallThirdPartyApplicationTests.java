package com.lxh.mall.thirdparty;

import com.aliyun.oss.OSSClient;



import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class MallThirdPartyApplicationTests {


    @Resource
    OSSClient ossClient;


}

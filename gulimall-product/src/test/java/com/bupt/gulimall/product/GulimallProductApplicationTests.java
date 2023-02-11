package com.bupt.gulimall.product;

import com.bupt.gulimall.product.entity.BrandEntity;
import com.bupt.gulimall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class GulimallProductApplicationTests {

	@Autowired
	BrandService brandService;
	@Test
	void contextLoads() {

		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("huawei");
		brandEntity.setBrandId(7L);
		brandService.removeById(brandEntity);
		System.out.println(brandService.getById(brandEntity));
	}

}

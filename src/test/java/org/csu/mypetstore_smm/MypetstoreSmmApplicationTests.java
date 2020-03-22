package org.csu.mypetstore_smm;

import org.csu.mypetstore_smm.domain.Product;
import org.csu.mypetstore_smm.service.CatelogService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("org.csu.mypetstore_smm.persistence")
class MypetstoreSmmApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    CatelogService catelogService;

    @Test
    void testCategory(){
        String categoryId = "FISH";
        System.out.println( catelogService.getCatgory(categoryId));
    }

    @Test
    void testProduct(){
        List<Product> productList = catelogService.getProductListByCategory("BIRDS");
        System.out.println(productList.size());
    }

}

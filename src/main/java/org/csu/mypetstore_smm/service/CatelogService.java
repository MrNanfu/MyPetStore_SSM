package org.csu.mypetstore_smm.service;

import org.csu.mypetstore_smm.domain.Category;
import org.csu.mypetstore_smm.domain.Product;
import org.csu.mypetstore_smm.persistence.CategoryMapper;
import org.csu.mypetstore_smm.persistence.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatelogService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private ProductMapper productMapper;

    public Category getCatgory(String catgoryId){
        return  categoryMapper.getCategory(catgoryId);
    }

    public Product getProduct(String productId) {
        return productMapper.getProduct(productId);
    }

    public List<Product> getProductListByCategory(String categoryId) {
        return productMapper.getProductListByCategory(categoryId);
    }
}

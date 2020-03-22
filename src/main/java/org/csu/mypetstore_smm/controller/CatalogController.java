package org.csu.mypetstore_smm.controller;

import org.csu.mypetstore_smm.domain.Category;
import org.csu.mypetstore_smm.domain.Product;
import org.csu.mypetstore_smm.service.CatelogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatelogService catelogService;

    @GetMapping("/view")
    public  String view(){
        return "catalog/main.html";
    }

    @GetMapping("/viewCategory")
    public String viewCategory(String categoryId, Model model){
        if(categoryId != null){
            Category category = catelogService.getCatgory(categoryId);
            List<Product> productList = catelogService.getProductListByCategory(categoryId);
            model.addAttribute("category",category);
            model.addAttribute("productList",productList);
            return "catalog/category.html";
        }

            return "catalog/main.html";
    }
}

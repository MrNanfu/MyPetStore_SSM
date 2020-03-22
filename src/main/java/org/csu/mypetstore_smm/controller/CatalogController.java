package org.csu.mypetstore_smm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog")
public class CatalogController {

    @GetMapping("/view")
    public  String view(){
        //默认的根目录是templates
        return "catalog/main.html";
    }
}

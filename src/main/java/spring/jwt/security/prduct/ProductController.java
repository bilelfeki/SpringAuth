package spring.jwt.security.prduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    public ProductService productService ;

    @GetMapping("/product")
    public String getProduct(){
        return this.productService.getProduct() ;
    }


}

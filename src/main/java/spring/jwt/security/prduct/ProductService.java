package spring.jwt.security.prduct;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public String getProduct(){
        return "p1 " ;
    }
}

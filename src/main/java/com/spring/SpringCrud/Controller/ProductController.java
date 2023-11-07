package com.spring.SpringCrud.Controller;

import com.spring.SpringCrud.Entity.Product;
import com.spring.SpringCrud.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;
    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }
    @PostMapping("/allProduct")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }

    @GetMapping
    public List<Product> findProduct(){
        return service.getProduct();
    }

    @GetMapping("/showProductById/{id}")
    public Product findProductById(@PathVariable int id){
        return service.getProductById(id);
    }
    @GetMapping("/showProductByName/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }
    @GetMapping("/showProductByQuantity/{quantity}")
    public Product findProductByQuantity(@PathVariable int quantity){
        return service.getProductByQuantity(quantity);
    }

    @GetMapping("/showProductByPrice/{price}")
    public Product findProductByPrice(@PathVariable int price){
        return service.getProductByPrice(price);
    }
    @DeleteMapping("/DeleteProduct/{id}")
    public String removeProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }

    @PutMapping("/UpdatedProduct")
    public Product updatedProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }
}

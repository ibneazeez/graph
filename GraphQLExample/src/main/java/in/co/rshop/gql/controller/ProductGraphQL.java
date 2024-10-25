package in.co.rshop.gql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import in.co.rshop.gql.entity.Product;
import in.co.rshop.gql.service.ProductService;

@Controller
public class ProductGraphQL {
    @Autowired
    private ProductService productService;

    @QueryMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @QueryMapping
    public List<Product> getProductsByCategory(String category) {
        return productService.getProductsByCategory(category);
    }

    @QueryMapping
    public List<Product> getProducts(String category, Double minPrice, Double maxPrice, String name) {
        return productService.getProducts(category, minPrice, maxPrice, name);
    }
}

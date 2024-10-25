package in.co.rshop.gql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.rshop.gql.entity.Product;
import in.co.rshop.gql.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findAll().stream()
                .filter(product -> product.getCategory().equalsIgnoreCase(category))
                .toList();
    }

    public List<Product> getProducts(String category, Double minPrice, Double maxPrice, String name) {
        return productRepository.findAll().stream()
                .filter(product -> category == null || product.getCategory().equalsIgnoreCase(category))
                .filter(product -> minPrice == null || product.getPrice() >= minPrice)
                .filter(product -> maxPrice == null || product.getPrice() <= maxPrice)
                .filter(product -> name == null || product.getName().contains(name))
                .toList();
    }
}

package in.co.rshop.gql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.rshop.gql.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

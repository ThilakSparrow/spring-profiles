package demo.springprofiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.springprofiles.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

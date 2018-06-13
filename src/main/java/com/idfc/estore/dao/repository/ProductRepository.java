package com.idfc.estore.dao.repository;

import com.idfc.estore.dao.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductDetail, Long > {

}

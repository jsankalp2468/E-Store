package com.idfc.estore.dao.repository;

import com.idfc.estore.dao.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetail, String> {
}

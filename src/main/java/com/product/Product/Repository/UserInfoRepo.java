package com.product.Product.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.product.Product.model.UserInfo;

public interface UserInfoRepo extends MongoRepository<UserInfo, String> {
	
	Optional<UserInfo> findByName(String name);

}

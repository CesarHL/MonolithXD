package com.helo.escom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.helo.escom.entity.UserEntity;

@Repository
public interface IUserRepository extends CrudRepository<UserEntity, Long> {

	public UserEntity findUserByUserName(String userName);

	public UserEntity findByUserName(String email);

}

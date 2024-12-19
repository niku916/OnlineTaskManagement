package com.onlineTaskMgm.onlineTaskMgm.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineTaskMgm.onlineTaskMgm.Entiyt.UsersEntity;

@Repository
public interface UserRepo extends JpaRepository<UsersEntity, Long>{
	List<UsersEntity> findAll();
	
	List<UsersEntity>  findById(long id);
}

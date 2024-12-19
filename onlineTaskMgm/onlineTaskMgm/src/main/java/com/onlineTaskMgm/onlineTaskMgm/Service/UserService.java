package com.onlineTaskMgm.onlineTaskMgm.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineTaskMgm.onlineTaskMgm.Dto.UsersDto;
import com.onlineTaskMgm.onlineTaskMgm.Entiyt.UsersEntity;
import com.onlineTaskMgm.onlineTaskMgm.Repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public List<UsersDto> getinfo() {

		List<UsersEntity> listUsersEntities = userRepo.findAll();
		List<UsersDto> usersDtos = new ArrayList<>();
		UsersDto dto = null;
		for (UsersEntity obj : listUsersEntities) {
			dto = new UsersDto();
			BeanUtils.copyProperties(obj, dto);
			usersDtos.add(dto);

		}

		return usersDtos;

	}

	public List<UsersDto> getUserByName(long id) {
		List<UsersEntity> listUsersEntities = userRepo.findById(id);
		List<UsersDto> usersDtos = new ArrayList<>();
		UsersDto dto = null;

		for (UsersEntity obj : listUsersEntities) {
			dto = new UsersDto();
			BeanUtils.copyProperties(obj, dto);
			usersDtos.add(dto);
		
		}

		return usersDtos;
	}
	
	public UsersDto saveData(UsersDto usersDto) {
		
		UsersEntity usersEntity = new UsersEntity();
		usersEntity.setId(usersDto.getId());
		usersEntity.setCreatedAt(usersDto.getCreatedAt());
		usersEntity.setEmail(usersDto.getEmail());
		usersEntity.setPassword(usersDto.getPassword());
		usersEntity.setUpdatedAt(usersDto.getUpdatedAt());
		usersEntity.setUsername(usersDto.getUsername());
		usersEntity.setRole(usersDto.getRole());
		UsersEntity savedataa = userRepo.save(usersEntity);
		
		UsersDto dto = new UsersDto();
		dto.setId(savedataa.getId());
		dto.setCreatedAt(savedataa.getCreatedAt());
		dto.setEmail(savedataa.getEmail());
		dto.setPassword(savedataa.getPassword());
		dto.setRole(savedataa.getRole());
		dto.setUpdatedAt(savedataa.getUpdatedAt());
		dto.setUsername(savedataa.getUsername());
		
		return dto;
		
	}

}

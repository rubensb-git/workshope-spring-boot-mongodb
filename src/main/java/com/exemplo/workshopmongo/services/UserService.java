package com.exemplo.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemplo.workshopmongo.domain.User;
import com.exemplo.workshopmongo.dto.UserDTO;
import com.exemplo.workshopmongo.repository.UserRepository;
import com.exemplo.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){		
		return repo.findAll();
	}
/*	
	public User findById(String id) {
		User user = repo.findOne(id);
		if(user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado. ");
		}
		return user;
	}
*/	
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {		
		repo.deleteById(id);
	}
	/*
	public User update(User obj) {
		User newObj = repo.findOne(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}
	*/
	private void updateData(User newObj, User obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
		
	}

	public User fromDto(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail()); 
	}		
	
}

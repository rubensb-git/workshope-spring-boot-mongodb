package com.exemplo.workshopmongo.config;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.exemplo.workshopmongo.domain.Post;
import com.exemplo.workshopmongo.repository.PostRepository;
import com.exemplo.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
/*		
		userRepository.deleteAll();		
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
*/		
		
/*		
		Date x1 = new Date();
		
		Post postdamaria = new Post(null, x1, "Presidente Bolsonaro", "Presidente Bolsonaro angaria mais de um milhão de participantes na motociata e São Paulo no dia 12/06/2021");
		postRepository.save(postdamaria);
*/
		
		System.out.println("Iniciando");
		
	}
        
}

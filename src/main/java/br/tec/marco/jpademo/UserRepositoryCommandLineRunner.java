/**
 * 
 */
package br.tec.marco.jpademo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.tec.marco.jpademo.entity.User;
import br.tec.marco.jpademo.service.UserRepository;

/**
 * @author marcoyf
 *
 */
@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory
			.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Yuri", "Admin");
		userRepository.save(user);
		logger.info("New user created=" + user);
		
		Optional<User> findById = userRepository.findById(1L);
		logger.info("User=" + findById);
		
		List<User> findAll = userRepository.findAll();
		logger.info("All users=" + findAll);
	}

}

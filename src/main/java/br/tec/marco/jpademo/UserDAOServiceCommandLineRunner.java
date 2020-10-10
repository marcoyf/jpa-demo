/**
 * 
 */
package br.tec.marco.jpademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.tec.marco.jpademo.entity.User;
import br.tec.marco.jpademo.service.UserDAOService;

/**
 * @author marcoyf
 *
 */
@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory
			.getLogger(UserDAOServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Marco", "Admin");
		long insert = userDaoService.insert(user);
		logger.info("New user created=" + user);
	}

}

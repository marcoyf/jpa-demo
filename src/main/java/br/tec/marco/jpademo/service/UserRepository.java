/**
 * 
 */
package br.tec.marco.jpademo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import br.tec.marco.jpademo.entity.User;

/**
 * @author marcoyf
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}

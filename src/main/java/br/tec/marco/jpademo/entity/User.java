/**
 * 
 */
package br.tec.marco.jpademo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author marcoyf
 *
 */
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String role;
	
	/**
	 * 
	 */
	protected User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param role
	 */
	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
}

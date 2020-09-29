/**
 * 
 */
package com.objis.cache.entity;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author Charlesvictor26
 *
 */
@Entity
@Table(name="emp1012")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Employee {
	/**
	 * Attributs de la classe Employee
	 */
	@Id
	private int id;
	private String name;
	private float salary;
	
	/**
	 * Constructeurs
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, float salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	/**
	 * Génération des getters et setters
	 * @return
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}

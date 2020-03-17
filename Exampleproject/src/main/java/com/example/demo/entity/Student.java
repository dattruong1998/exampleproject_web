/**
 * System name  EEC
 * @version     1.0
 * @since       17/03/2020
 * @author      Team02
 */

package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {
	
	/** The student id. */
	@Id
	private String studentId;
	
	/** The name. */
	private String name;
	
	/** The score. */
	private float score;
	
	/**
	 * Instantiates a new student.
	 *
	 * @param studentId the student id
	 * @param name the name
	 * @param score the score
	 */
	public Student(String studentId, String name, float score) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.score = score;
	}
	
	/**
	 * Instantiates a new student.
	 */
	public Student() {
		super();
	}
	
	/**
	 * Gets the student id.
	 *
	 * @return the student id
	 */
	public String getStudentId() {
		return studentId;
	}
	
	/**
	 * Sets the student id.
	 *
	 * @param studentId the new student id
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the score.
	 *
	 * @return the score
	 */
	public float getScore() {
		return score;
	}
	
	/**
	 * Sets the score.
	 *
	 * @param score the new score
	 */
	public void setScore(float score) {
		this.score = score;
	}
	
	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
		return result;
	}
	
	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		return true;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", score=" + score + "]";
	}
	
    
}
		
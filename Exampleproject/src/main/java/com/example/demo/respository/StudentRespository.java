/**
 * System name  EEC
 * @version     1.0
 * @since       17/03/2020
 * @author      Team02
 */

package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

/**
 * The Interface StudentRespository.
 */
@Repository
public interface StudentRespository extends JpaRepository<Student, Long> {

}

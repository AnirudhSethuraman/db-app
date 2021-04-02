package openshift.mysql.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import openshift.mysql.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>  {

}

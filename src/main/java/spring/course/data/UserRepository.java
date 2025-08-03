package spring.course.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring.course.model.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String> {}
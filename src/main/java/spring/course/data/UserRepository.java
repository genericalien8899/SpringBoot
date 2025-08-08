package spring.course.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring.course.model.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String> {          // Objects and key used to be mentioned hence <UserEntity, String>
    // The key is String because the UserModel has a String id field
    // The UserEntity is the entity that will be stored in the database
    UserEntity findByFirstName(String firstname);
    // This method will be used to find a user by their first name

    void deleteByFirstname(String firstname);


}
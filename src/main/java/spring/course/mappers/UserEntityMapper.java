package spring.course.mappers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import spring.course.data.UserEntity;
import spring.course.model.UserModel;

@Component
@Primary
public class UserEntityMapper implements EntityMapper<UserEntity, UserModel> {
    @Override
    public UserModel map(UserEntity entity)
    {
        return new UserModel(
                entity.getFirstName(),
                entity.getLastName(),
                entity.getMembershipId(),
                entity.getCreationTime()
        );
    }

    @Override
    public UserEntity reverseMap(UserModel model)
    {
        return new UserEntity(
                model.getFirstName(),
                model.getLastName(),
                model.getMembershipId(),
                model.getCreationTime()
        );
    }
}
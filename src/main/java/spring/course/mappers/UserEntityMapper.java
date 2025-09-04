package spring.course.mappers;

import spring.course.data.UserEntity;
import spring.course.model.UserModel;

public class UserEntityMapper implements EntityMapper<UserEntity, UserModel> {
    @Override
    public UserModel map(UserEntity entity)
    {
        return new UserModel(
                entity.getFirstname(),
                entity.getLastname(),
                entity.getMembershipId(),
                entity.getCreationTime()
        );
    }

    @Override
    public UserEntity reverseMap(UserModel model)
    {
        return new UserEntity(
                model.getFirstname(),
                model.getLastname(),
                model.getMembershipId(),
                model.getCreationTime()
        );
    }
}
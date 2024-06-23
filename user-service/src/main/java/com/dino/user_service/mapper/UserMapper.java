package com.dino.user_service.mapper;

import com.dino.user_service.dto.request.UserCreationRequest;
import com.dino.user_service.dto.response.UserResponse;
import com.dino.user_service.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User entity);
}

package com.dino.user_service.service;

import com.dino.user_service.dto.request.UserCreationRequest;
import com.dino.user_service.dto.response.UserResponse;
import com.dino.user_service.entity.User;
import com.dino.user_service.mapper.UserMapper;
import com.dino.user_service.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class UserService {
    UserRepository userRepository;
    UserMapper userMapper;

    public UserResponse createUser(UserCreationRequest request) {
        User user = userMapper.toUser(request);
        user = userRepository.save(user);
        return userMapper.toUserResponse(user);
    }

    public UserResponse getUser(String id) {
        User userProfile =
                userRepository.findById(id).orElseThrow(() -> new RuntimeException("Profile not found"));
        return userMapper.toUserResponse(userProfile);
    }
}

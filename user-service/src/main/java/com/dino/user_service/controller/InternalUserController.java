package com.dino.user_service.controller;

import com.dino.user_service.dto.request.UserCreationRequest;
import com.dino.user_service.dto.response.UserResponse;
import com.dino.user_service.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class InternalUserController {
    UserService userService;

    @PostMapping("/internal")
    UserResponse createProfile(@RequestBody UserCreationRequest request) {
        return userService.createUser(request);
    }
}

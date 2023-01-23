package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(UserRequestDto userRequestDto) {
        User user = User.builder()
                .userName(userRequestDto.getUserName())
                .name(userRequestDto.getName())
                .mobileNo(userRequestDto.getMobileNo())
                .eMail(userRequestDto.getEMail())
                .build();

        userRepository.save(user);
    }

    public User getByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}

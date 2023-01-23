package com.example.services;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserRequestDto {

    private String userName;
    private String name;
    private String eMail;
    private String mobileNo;

}

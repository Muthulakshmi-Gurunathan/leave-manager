package com.paaps.app.dto.response;

import com.paaps.app.constant.AppEnum.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Role role;
}
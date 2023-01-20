package com.order.ecommerce.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class UserDto {
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private boolean enabled;

}

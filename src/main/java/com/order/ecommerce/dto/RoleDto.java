package com.order.ecommerce.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class RoleDto {
    @NotNull
    private String name;

}

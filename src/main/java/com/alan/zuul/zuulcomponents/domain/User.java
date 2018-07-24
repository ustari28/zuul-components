package com.alan.zuul.zuulcomponents.domain;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class User {
    private String name;
    private String state;
}

package com.ileonnard.ecommerce_acai.entities;


import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;


    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;

}

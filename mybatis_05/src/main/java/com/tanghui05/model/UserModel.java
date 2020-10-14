package com.tanghui05.model;

import lombok.*;

/**
 * @author 唐煇
 * @Description
 * @Date 2020-10-12 22:50
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    private int userId;
    private String userName;
    private String password;
}

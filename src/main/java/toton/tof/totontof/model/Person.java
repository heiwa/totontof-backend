package toton.tof.totontof.model;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Person {
    private String name;
    private Integer age;
    private String gender;
}

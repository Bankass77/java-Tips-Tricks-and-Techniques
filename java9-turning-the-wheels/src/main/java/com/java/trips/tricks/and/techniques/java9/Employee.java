package com.java.trips.tricks.and.techniques.java9;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Serializable {

    private int empId;

    private String name;
}

package com.java.trips.tricks.and.techniques.java9.ObjectInputFilter;

import com.java.trips.tricks.and.techniques.java9.collectionsAPiUpdate.Employee;

import java.io.ObjectInputFilter;

public class FilterEmployee  implements ObjectInputFilter {

    @Override
    public Status checkInput(FilterInfo filterInfo) {

        //Generating the class type which object is being serialized

        Class<?> serialClass = filterInfo.serialClass();
        if (serialClass != null) {
            return (Employee.class.isAssignableFrom(serialClass)) ?Status.ALLOWED: Status.REJECTED;
        }else {
            System.out.println("NULL SERIAL CLASS");
        }
        return Status.UNDECIDED;
    }
}

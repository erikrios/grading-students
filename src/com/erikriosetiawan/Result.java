package com.erikriosetiawan;

import java.util.ArrayList;
import java.util.List;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> results = new ArrayList<>();

        for (int grade : grades) {
            int nextGrade = 0;
            if (grade > 37 && grade < 100) {
                int condition = Integer.parseInt(String.valueOf(grade).substring(1, 2));
                if (condition >= 0 && condition <= 4) {
                    nextGrade = ((grade + 5) / 10) * 10 + 5;
                } else {
                    nextGrade = (grade / 10) * 10 + 10;
                }
                if ((nextGrade - grade) < 3) {
                    grade = nextGrade;
                }
                results.add(grade);
            } else {
                results.add(grade);
            }
        }

        return results;
    }
}

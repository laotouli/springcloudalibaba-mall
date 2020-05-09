package com.lxh.common.vaild;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

public class ListValueConstrainValidator implements ConstraintValidator<ListValue,Integer> {

    private Set<Integer> set = new HashSet<>();

    public void initialize(ListValue constraintAnnotation) {
        int[] vals = constraintAnnotation.vals();
        for (int val: vals) {
            set.add(val);
        }
    }

    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {

      return set.contains(value);
    }
}

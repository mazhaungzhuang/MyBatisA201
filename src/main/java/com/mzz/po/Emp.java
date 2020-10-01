package com.mzz.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
   private int emp_id;
   private String  emp_name;
   private String  emp_wage;
   private int dept_id;
}

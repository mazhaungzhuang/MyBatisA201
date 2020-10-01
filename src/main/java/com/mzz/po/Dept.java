package com.mzz.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Alias("Dep")
public class Dept {
    private int dept_id;
    private String dept_name;


}

package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author lsg
 * @Date 2019/11/28
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Student {
    private Integer sid;
    private String sname;
    private Character ssex;
    private Integer sage;
    private Date birthday;
}

package com.example.testone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class picture {


    private Integer id;
    private String name;
    private String type;
    private String createTime;
    private Integer ownerid;
}

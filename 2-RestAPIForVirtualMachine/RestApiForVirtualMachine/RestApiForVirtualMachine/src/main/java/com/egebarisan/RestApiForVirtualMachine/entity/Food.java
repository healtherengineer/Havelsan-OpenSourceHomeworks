package com.egebarisan.RestApiForVirtualMachine.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Food {

    private int id;
    private String name ;
    private String fromWhere;
    private String category;

}

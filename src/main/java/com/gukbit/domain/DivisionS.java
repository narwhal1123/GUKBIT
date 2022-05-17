package com.gukbit.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class DivisionS {

    @Id
    @Column(name = "d_field_s")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String dFieldS;
    @Column
    private String div;

}

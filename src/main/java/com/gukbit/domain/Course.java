package com.gukbit.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@ToString
@Entity
@Table
public class Course {
    @Id
    @Column(name = "cid")
    private String cid;

    @Column(name = "academy_code")
    private String academycode;

    @Column
    private String id;

    @Column
    private Integer session;

    @Column(name = "field_m")
    private String fieldM;

    @Column(name = "field_s")
    private String fields;

    @Column
    private String start;

    @Column
    private String end;

    @Column
    private String dFieldS;

    @Column
    private String name;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "academy_code", referencedColumnName="code", insertable = false, updatable = false)
    private Academy academy;

    @Builder
    public Course(String academy_code, String id, Integer session, String field_m, String field_s, String dFieldS, String start, String end, String name) {
        this.cid = id+session;
        this.academycode = academy_code;
        this.id = id;
        this.session = session;
        this.fieldM = field_m;
        this.fields = field_s;
        this.dFieldS = dFieldS;
        this.name = name;
        this.start = start;
        this.end = end;
    }
}

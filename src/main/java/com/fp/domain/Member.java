package com.fp.domain;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Builder
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email; // 아이디

    @Column(nullable = false)
    private String password; // 비밀번호

    @Column(nullable = false)
    private String userName; // 이름

    @Column(nullable = false)
    @ColumnDefault("소상공인")
    private String job; // 직업(소상공인)

    private String region; //지역

    private String hopeAmount; // 희망하는 지원 금액

    // 1 : N 관계
    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private List<MemberAndProduct> memberAndProducts = new ArrayList<>();
}
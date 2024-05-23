package com.aunaeproj.bitemap.member.DTO;

import com.aunaeproj.bitemap.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class MemberDTO {
    private Long id;
    private String memberId;
    private String password;

    private Member toEntity(){
        return new Member(id, memberId, password);
    }
}

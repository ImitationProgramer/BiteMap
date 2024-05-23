package com.aunaeproj.bitemap.member.repository;


import com.aunaeproj.bitemap.member.entity.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface MemberRepository extends CrudRepository<Member, Long> {
    @Override
    ArrayList<Member> findAll();
}

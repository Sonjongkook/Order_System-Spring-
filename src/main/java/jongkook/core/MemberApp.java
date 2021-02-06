package jongkook.core;

import jongkook.core.member.Grade;
import jongkook.core.member.Member;
import jongkook.core.member.MemberService;
import jongkook.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1l);
        System.out.println("new Member= " + member.getName());
        System.out.println("findMember= " + findMember.getName());

    }
}

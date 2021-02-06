package jongkook.core;

import jongkook.core.discount.DiscountPolicy;
import jongkook.core.discount.FixDiscountPolicy;
import jongkook.core.discount.RateDiscountPolicy;
import jongkook.core.member.MemberService;
import jongkook.core.member.MemberServiceImpl;
import jongkook.core.member.MemoryMemberRepository;
import jongkook.core.order.OrderService;
import jongkook.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();

    }


}

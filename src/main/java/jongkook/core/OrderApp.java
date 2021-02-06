package jongkook.core;

import jdk.swing.interop.SwingInterOpUtils;
import jongkook.core.member.Grade;
import jongkook.core.member.Member;
import jongkook.core.member.MemberService;
import jongkook.core.member.MemberServiceImpl;
import jongkook.core.order.Order;
import jongkook.core.order.OrderService;
import jongkook.core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();


        Long memberId = 1l;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice = " + order.calculatePrice());

    }
}

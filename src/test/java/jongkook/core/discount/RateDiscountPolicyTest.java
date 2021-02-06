package jongkook.core.discount;

import jongkook.core.member.Grade;
import jongkook.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();


    @Test
    @DisplayName("VIP should get 10 percent discount")
    void vip_o() {
        //given
        Member member = new Member(1l, "memberVIP", Grade.VIP);
        //when
        int discount = discountPolicy.discount(member, 10000);
        //then
        assertThat(discount).isEqualTo(1000);

    }

    @Test
    @DisplayName("Non VIP should not get 10 percent discount")
    void vip_x(){
        //given
        Member member = new Member(1L, "memberNormal", Grade.BASIC);
        //when
        int discount = discountPolicy.discount(member, 10000);
        //then
        assertThat(discount).isEqualTo(0);
    }

}
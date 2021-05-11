package com.company;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Academy_1Test {
    @Ignore
        //@Test
    void sumInRangeTest() {
        int result = Academy_1.sumInRange(10000000, 1000000000);
        assertEquals(1, result);
    }

    @Test
    void testTic_TacCheckString_X_OYes() {
        String str = "___XXX_O_";
        String s = Academy.tic_tacCheckString_X_O(str);
        assertEquals(s,"Yes");
    }
    @Test
    void testTic_TacCheckString_X_O_1Yes() {
        String str = "X__XO_XOX";
        String s = Academy.tic_tacCheckString_X_O(str);
        assertEquals(s,"Yes");
    }
    @Test
    void testTic_TacCheckString_X_O_2Yes() {
        String str = "XOO_X_XOX";
        String s = Academy.tic_tacCheckString_X_O(str);
        assertEquals(s,"Yes");
    }
    @Test
    void testTic_TacCheckString_X_O_3Yes() {
        String str = "__XOX_XOX";
        String s = Academy.tic_tacCheckString_X_O(str);
        assertEquals(s,"Yes");
    }
    @Test
    void testTic_TacCheckString_X_O_4Yes() {
        String str = "_X_OX_XX_";
        String s = Academy.tic_tacCheckString_X_O(str);
        assertEquals(s,"Yes");
    }
    @Test
    void testTic_TacCheckString_X_O_5Yes() {
        String str = "_OXOOX_OX";
        String s = Academy.tic_tacCheckString_X_O(str);
        assertEquals(s,"Yes");
    }
    @Test
    void testTic_TacCheckString_X_O_6Yes() {
        String str = "XOOXOXXOX";
        String s = Academy.tic_tacCheckString_X_O(str);
        assertEquals(s,"Yes");
    }
    @Test
    void testTic_TacCheckString_X_O_1No() {
        String str = "_O_OX_XX_";
        String s = Academy.tic_tacCheckString_X_O(str);
        assertEquals(s,"No");
    }
    @Test
    void testTic_TacCheckString_X_O_2No() {
        String str = "_O_OXO_XO";
        String s = Academy.tic_tacCheckString_X_O(str);
        assertEquals(s,"No");
    }
    @Test
    void testTic_TacCheckString_X_O_3No() {
        String str = "OXOXOXXOX";
        String s = Academy.tic_tacCheckString_X_O(str);
        assertEquals(s,"No");
    }
    @Test
    void testTic_TacCheckString_X_O_4No() {
        String str = "___OXX_O_";
        String s = Academy.tic_tacCheckString_X_O(str);
        assertEquals(s,"No");
    }
}

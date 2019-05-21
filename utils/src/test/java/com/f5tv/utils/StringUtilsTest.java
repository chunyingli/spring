package com.f5tv.utils;

import org.junit.jupiter.api.Test;

/**
 * @author SpringLee
 * @title StringUtilsTest
 * @projectName spring
 * @description // 测试StringUtils 类
 * @date 2019-05-21
 */
public class StringUtilsTest {

    @Test
    void isEmptyTest(){
        assert(StringUtils.isEmpty(null));
        assert(StringUtils.isEmpty(""));
        assert(!StringUtils.isEmpty("1585"));
    }

    @Test
    void checkStringLengthTest(){
        assert(!StringUtils.checkStringLength(null,0,0));
        assert(!StringUtils.checkStringLength(null,2,5));
        assert(!StringUtils.checkStringLength(null,3,2));
        assert(!StringUtils.checkStringLength(null,-1,2));
        assert(!StringUtils.checkStringLength("",0,0));
        assert(!StringUtils.checkStringLength("",2,5));
        assert(!StringUtils.checkStringLength("",3,2));
        assert(!StringUtils.checkStringLength("",-1,2));
        assert(!StringUtils.checkStringLength("12548885",0,0));
        assert(!StringUtils.checkStringLength("12548885",2,5));
        assert(StringUtils.checkStringLength("12548885",2,8));
        assert(StringUtils.checkStringLength("12548885",8,8));
        assert(StringUtils.checkStringLength("12548885",8,100));
        assert(!StringUtils.checkStringLength("12548885",3,2));
        assert(!StringUtils.checkStringLength("12548885",-1,2));


    }
}

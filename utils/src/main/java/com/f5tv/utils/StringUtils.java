package com.f5tv.utils;

/**
 * @author SpringLee
 * @title: StringUtils
 * @projectName spring
 * @description // String方面的一些判断工具
 * @date 17:53 2019/5/21
 */

/**
 * @author SpringLee
 * @description //TODO
 * @date 2019/5/21 18:27 
 * @param  * @param null
 * @return 
 **/
public class StringUtils {

    /**
     * @author SpringLee
     * @description // 判断字符串是否为空
     * @date 2019/5/21 18:09
     * @param string 待判断的字符串
     * @return boolean 判断结果，空是true
     **/
    public static boolean isEmpty(String string) {
        return null == string || "".equals(string);
    }


    /**
     * @author SpringLee
     * @description // 判断字符串string的长度是否在范围之内
     * @date 2019/5/21 18:13
     * @param string 待判断的字符串
     * @param min 最小长度
     * @param max 最大长度
     * @return boolean 判断结果,是否在范围之内
     **/
    public static boolean checkStringLength(String string, int min, int max) {
        if (isEmpty(string)) return false;
        if(max<min)return false;
        return !(string.length() < min || string.length() > max);
    }
    



}

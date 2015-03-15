package com.aaa.pinyin;

import lombok.extern.slf4j.Slf4j;

import com.luhuiguo.chinese.ChineseUtils;
import com.luhuiguo.chinese.pinyin.PinyinFormat;
/**
 * 
 * @author Jeff Ye
 *
 */
@Slf4j
public class ChineseUtilTest {
    public static void main(String[] args) {
//        String s = "头发发财";
//        System.out.println(s + " => " + ChineseUtils.toTraditional(s));
//        s = "簡訊資料庫";
//        System.out.println(s + " => " + ChineseUtils.toSimplified(s));
//        s = "长江成长";
//        System.out.println(s + " => " + ChineseUtils.toPinyin(s) + " ("
//                + ChineseUtils.toPinyin(s, PinyinFormat.UNICODE_PINYIN_FORMAT)
//                + ") - "
//                + ChineseUtils.toPinyin(s, PinyinFormat.ABBR_PINYIN_FORMAT));
        log.info(ChineseUtils.toPinyin("一语中的", PinyinFormat.DEFAULT_PINYIN_FORMAT));
    }
}

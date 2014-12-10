package com.aaa.lucene;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.cjk.CJKAnalyzer;
import org.apache.lucene.analysis.cn.ChineseAnalyzer;
import org.apache.lucene.analysis.ngram.NGramTokenizer;
import org.apache.lucene.analysis.standard.StandardTokenizer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.util.Version;

public class Analyzer {
    public static void testStandardTokenStream() throws Exception
    {
        Reader reader = new StringReader("this is not true, 中国ren人民大会堂, 대단히감사합니다");
        StandardTokenizer gramTokenizer = new StandardTokenizer(Version.LUCENE_47, reader);
        CharTermAttribute charTermAttribute = gramTokenizer.addAttribute(CharTermAttribute.class);
        gramTokenizer.reset();
        while (gramTokenizer.incrementToken()) {
        String token = charTermAttribute.toString();
        System.out.println(token);}
        gramTokenizer.close();
    }
    
    public static void testNgramTokenStream() throws Exception
    {
        Reader reader = new StringReader("中国ren人民大会堂");
        NGramTokenizer gramTokenizer = new NGramTokenizer(Version.LUCENE_47, reader, 1, 3);
        CharTermAttribute charTermAttribute = gramTokenizer.addAttribute(CharTermAttribute.class);
        gramTokenizer.reset();
        while (gramTokenizer.incrementToken()) {
        String token = charTermAttribute.toString();
        System.out.println(token);}
        gramTokenizer.close();
    }
    
    public static void testCJKTokenStream() throws Exception
    {
      CJKAnalyzer analyzer = new CJKAnalyzer(Version.LUCENE_47);
      String to_be_parsed = "car window seven中国，人民.";
      List<String> result = new ArrayList<String>();
      TokenStream stream  = analyzer.tokenStream("filed", new StringReader(to_be_parsed));
      stream.reset();
      while (stream.incrementToken()) {
          result.add(stream.getAttribute(CharTermAttribute.class).toString());
        }
      System.out.println(result);
      analyzer.close();
    }
    
    public static void testChineseTokenStream() throws Exception
    {
      ChineseAnalyzer analyzer = new ChineseAnalyzer();
      String to_be_parsed = "car window seven中国人民."
              + "";
      List<String> result = new ArrayList<String>();
      TokenStream stream  = analyzer.tokenStream("filed", new StringReader(to_be_parsed));
      stream.reset();
      while (stream.incrementToken()) {
          result.add(stream.getAttribute(CharTermAttribute.class).toString());
        }
      System.out.println(result);
    }
    
    public static void main(String[] args) throws Exception {
        testStandardTokenStream();
//        testNgramTokenStream();
//        testChineseTokenStream();
//        testCJKTokenStream();
    }
}

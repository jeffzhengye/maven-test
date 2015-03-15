/**
 * 
 */
package com.aaa.character;

/**
 * @author Jeff Ye
 *
 */
public class CharacterType {

    /**
     * @param args
     */
    public static void main(String[] args) {
            System.out.println(Character.getType('中') + " " +  Character.isIdeographic('中'));
            System.out.println(Character.getType('일')+ " " +  Character.isIdeographic('일'));
            System.out.println(Character.getType('す')+ " " +  Character.isIdeographic('す'));
            System.out.println(Character.getType('c')+ " " +  Character.isIdeographic('c'));
            System.out.println(Character.getType('è')+ " " +  Character.isIdeographic('일'));
            System.out.println(Character.getType(',')+ " " +  Character.isIdeographic(','));
            System.out.println(Character.getType('。')+ " " +  Character.isIdeographic('。'));
    }

}

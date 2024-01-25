package org.example;

public class PlayerCharacter {

    static int x = 0;
    static int y = 0;

    public static int getX(){
        return x;
    }

    public static int getY(){
        return y;
    }

    public static int move(String key){
        if(key.equals("w")){
            return getX() + 1;
        }else{
            return getX();
        }
    }

}

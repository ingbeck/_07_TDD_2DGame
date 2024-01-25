package org.example;

public class PlayerCharacter {

    public static int getX(){
        return 0;
    }

    public static int getY(){
        return 0;
    }

    public static int move(String key){
        if(key.equals("w")){
            return getX() + 1;
        }else{
            return getX();
        }
    }

}

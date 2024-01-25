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

    public static int move(char key){

        switch(key){
            case 'w':
                return getY() + 1;
            case 's':
                return getY() - 1;
            case 'a':
                return getX() - 1;
            case 'd':
                return getX() + 1;
            default:
                return 0;
        }
    }

}

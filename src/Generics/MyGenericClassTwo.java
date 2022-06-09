package Generics;

public class MyGenericClassTwo <Thing1, Thing2>{
    Thing1 x;
    Thing2 y;

    MyGenericClassTwo(Thing1 x, Thing2 y){
        this.x = x;
        this.y = y;
    }

    public Thing1 getFirstValue(){
        return x;
    }

    public Thing2 getSecondValue(){
        return y;
    }
}

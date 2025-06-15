package Playground;

import java.util.*;

//                                          Just a small implement of Abstraction ^_^ 
abstract class Car{
    abstract public void Go();
    void fly(){
        System.out.println("Cars don't fly");
    }
}
class suzuki extends Car{
    public boolean sum(){
        return true;
    }
    @Override
    public void Go() {
        System.out.println("cars do run ");
    }

    @Override
    public void fly(){
        super.fly();
    }
}

class Anything{
    public static void main(String args[]){
        Scanner op = new Scanner(System.in);
        Car car = new suzuki();
        car.fly();
        car.Go();
        op.close();
    }
}

public class abstractclass1{
public static void main(String[] args){
Car c1=new kia();
c1.carName("kia");
c1.carSpeed(122,"kia");
}
}

abstract class Car{
abstract void carName(String name);

abstract void carSpeed(int speed,String name);

abstract void Mileage(int fuel,double mileage);

}
class kia extends Car{
void carName(String name){
System.out.println("Your Car name is "+name);
}
void carSpeed(int speed,String name){
System.out.println(name+" can travel at the speed of "+speed+" km/h");
}
void Mileage(int fuel,double mileage){
System.out.println("kia "+"can travel range of "+(fuel*mileage));
}

}
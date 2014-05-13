public class TestAnimal
{
  public static void main(String args[])
  {
    Cat myCat = new Cat("cat", "Woof!", new Position(3,4,6));
    myCat.whatDoesItSayForFood();
    myCat.whatDoesItSay();
  }
}

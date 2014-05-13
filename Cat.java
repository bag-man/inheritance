public class Cat extends Mamal
{
  Cat(String t, String s, Position p)
  {
    super(t,s,p);
  }

  public void whatDoesItSayForFood()
  {
    System.out.println(sound);
  }

  public void whatDoesItSayWhenStroked()
  {
    System.out.println("Meow!");
  }
}

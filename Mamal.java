public abstract class Mamal extends Animal
{
  Mamal(String t, String s, Position p)
  {
    super(t,s,p);
  }

  public void whatDoesItSay()
  {
    System.out.println("moo");
  }
}

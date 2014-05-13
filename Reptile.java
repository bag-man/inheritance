public abstract class Reptile extends Animal
{
  Reptile(String t, String s, Position p)
  {
    super(t,s,p);
  }

  public void whatDoesItSay()
  {
    System.out.println("hisssss");
  }
}

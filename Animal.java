public abstract class Animal
{
  protected String type, sound;
  protected Position position;

  Animal(String t, String s, Position p)
  {
    type = t;
    sound = s;
    position = p;
  }
  
  public abstract void whatDoesItSay();

  //public abstract boolean moveFromAtoB(Position pos);
}

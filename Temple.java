public class Temple{
  String name;
  
  public Temple(String name){
    this.name = name;
  }
}
class Big extends Temple{
  public Big (String name){
    super(name);
  }
}
class Small extends Temple{
  public Small (String name){
    super(name);
  }
}
public class GitHubTest
{
  public static void main(String[] args)
  {
    System.out.println("Hello!");

    for(int i = 0; i < args.length; i++)
      System.out.println(args[i]);
  }

  public class InnerClass
  {
    private int age;

    public InnerClass(int age)
    {
        this.age = age;
    }
  }
}

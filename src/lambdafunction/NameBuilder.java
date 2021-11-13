package lambdafunction;

public class NameBuilder {

  private String firstName = "";
  private String lastName = "";
  private String middleName = "";
  private String title = "";

  public NameBuilder(String firstName, String lastName, String middleName, String title) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleName = middleName;
    this.title = title;
  }

  public NameBuilder() {
  }

  public static NameBuilder builder(){
    NameBuilder name = new NameBuilder();
    return name;
  }

  public NameBuilder withFirstName(String firstName){
    this.firstName = firstName;
    return this;
  }

  public NameBuilder withMiddleName(String middleName){
    this.middleName = middleName;
    return this;
  }

  public NameBuilder withLastName(String lastName){
    this.lastName = lastName;
    return this;
  }

  public NameBuilder withTitle(String title){
    this.title = title;
    return this;
  }

  //terminal function
  public void printName() {
    String fullName = String.format("%s %s %s, %s", firstName, middleName, lastName, title);
    System.out.println(fullName);
  }
}

package lambdafunction;

public class YourName {

  private String firstName;
  private String lastName;
  private String middleName;
  private String title;

  public YourName(String firstName, String lastName, String middleName, String title) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleName = middleName;
    this.title = title;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}

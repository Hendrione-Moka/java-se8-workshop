package lambdafunction;

public class YourNameBuilder {

  private String firstName;
  private String lastName;
  private String middleName;
  private String title;

  public YourNameBuilder setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public YourNameBuilder setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public YourNameBuilder setMiddleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  public YourNameBuilder setTitle(String title) {
    this.title = title;
    return this;
  }

  public YourName createYourName() {
    return new YourName(firstName, lastName, middleName, title);
  }
}
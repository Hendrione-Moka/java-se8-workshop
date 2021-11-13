package lambdafunction;

public class TestNameBuilder {

  public static void main(String[] args) {
    NameBuilder name = new NameBuilder("Hendri", "Antomy", "", "S.ST");
    name.printName();

    NameBuilder nameBuilder = NameBuilder.builder();
    NameBuilder nameBuilder1 = nameBuilder.withFirstName("Hendri");
    NameBuilder nameBuilder2 = nameBuilder1.withMiddleName("Test");
    NameBuilder nameBuilder3 = nameBuilder1.withLastName("Antomy");
    nameBuilder3.printName();

    NameBuilder.builder()
        .withFirstName("Hendri")
        .withLastName("Antomy")
        .withTitle("S.ST")
        .printName();
  }

}

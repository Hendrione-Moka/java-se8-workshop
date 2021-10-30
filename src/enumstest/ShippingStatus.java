package enumstest;

public enum ShippingStatus {
  PICKUP_REQUESTED("Merchant request for pickup"),
  PICKUP_IN_PROGRESS("Driver otw to the merchant location"),
  ON_DELIVERY("Driver otw to the customer address"),
  DELIVERED("Item is delivered");

  private String description;

  ShippingStatus(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void printStatus(){
    System.out.println(description);
  }
}

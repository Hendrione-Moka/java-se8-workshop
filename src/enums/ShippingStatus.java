package enums;

public enum ShippingStatus {
  PICKUP_REQUESTED("Merchant request for pickup"),
  PICKUP_IN_PROGRESS("Driver in progress picking up"),
  ON_DELIVERY("Driver is on the way to the delivery address"),
  DELIVERED("Package is delivered");

  private String description;

  ShippingStatus(String description) {
    this.description = description;
  }

  public void printDescription(){
    System.out.println(description);
  }
}

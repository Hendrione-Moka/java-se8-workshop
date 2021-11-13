package lambdafunction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestMap {

  public static void main(String[] args) {
    Employee hendri = new Employee("Hendri", "QA Engineer", "Technology", 5000000
    , Arrays.asList("Automotive", "Gaming"));
    Employee saarah = new Employee("Saarah", "QA Engineer", "Technology", 6000000,
        Arrays.asList("Reading", "Cooking"));
    Employee hanif = new Employee("Hanif", "Recruitment Consultant", "HR", 7000000,
        Arrays.asList("KPop", "Pokemon"));

    List<Employee> employeeList = Arrays.asList(hendri, saarah, hanif);

//    List<Integer> salaryData = employeeList.stream() //design pattern : builder pattern.
//        .map(employee -> employee.getSalary()) //intermediate
//        .collect(Collectors.toList()); //terminal
//
//    Stream<Employee> data = employeeList.stream();
//
//    for (Integer salary : salaryData) {
//      System.out.println(salary);
//    }

//    Hendri - QA Engineer 0
//    Saarah - QA Engineer 1
//    Hanif - QA Engineer 2

//    List<String> listData = employeeList.stream()
//        .parallel()
//        .peek(employee -> employee.printDataEmployee())
//        .map(employee -> employee.getName() + " - " + employee.getPosition())
//        .peek(dt -> System.out.println("Data After map: " + dt))
//        .collect(Collectors.toList());
//
//    for (String data : listData){
//      System.out.println(data);
//    }

//    //findfirst
//    Optional<Integer> data = employeeList.stream().map(employee -> employee.getSalary())
//        .filter(salary -> salary > 10000000)
//        .findFirst();
//
//    //isPresent & get
//    if (data.isPresent()) {
//      System.out.println("findFirst: " + data.get());
//    }else{
//      System.out.println("Data tidak ketemu");
//    }
//
//    //ifPresent
//    data.ifPresent(dt -> System.out.println(dt));
//
//    //orElse & orElseGet
//    int salary = data.orElse(0);
//    int salary2 = data.orElseGet(() -> {
//      Long gaji =  System.currentTimeMillis();
//      return gaji.intValue();
//    });
//    System.out.println("Salary :" + salary);
//    System.out.println("Salary 2 :" + salary2);
////    data.ifPresentOrElse(dt -> System.out.println(dt), () -> System.out.println("Tidak Ketemu"));
//
//    //allmatch
//    boolean isMatch = employeeList.stream()
//        .allMatch(employee -> employee.getDepartment().equals("Technology"));
//    System.out.println("allmatch: " + isMatch);
//
//    //nonematch
//    boolean isMatch2 = employeeList.stream()
//        .noneMatch(employee -> employee.getDepartment().equals("Finance"));
//    System.out.println("nonematch: " + isMatch2);
//
//    //anymatch
//    boolean isMatch3 = employeeList.stream()
//        .anyMatch(employee -> employee.getDepartment().equals("Technology"));
//    System.out.println("anymatch: " + isMatch3);
//
//    //findAny
//    Optional<String> data2 = employeeList.stream()
//        .parallel()
//        .peek(employee -> employee.printDataEmployee())
//        .map(employee -> employee.getName() + " - " + employee.getPosition())
//        .peek(dt -> System.out.println("Data After map: " + dt))
//        .findAny();
//
//    if (data2.isPresent()) {
//      System.out.println("findAny: " + data2.get());
//    }

    //count
    long size = employeeList.stream()
        .filter(data -> data.getSalary() > 5000000)
        .count();
    System.out.println(size);

    //min & max
    Optional<Employee> dataMin = employeeList.stream().min((emp1, emp2) -> {
      if (emp1.getSalary() < emp2.getSalary()) {
        return -1;
      } else if (emp1.getSalary() > emp2.getSalary()) {
        return 1;
      } else {
        return 0;
      }
    });

    Optional<Employee> dataMax = employeeList.stream().max(new EmployeeSortedBySalary());

    dataMin.ifPresent(data -> data.printDataEmployee());
    dataMax.ifPresent(data -> data.printDataEmployee());

    //average
    OptionalDouble average = employeeList.stream().mapToInt(dt -> dt.getSalary())
        .average();
    average.ifPresent(dt -> System.out.println("average : " + dt));

    //sum
    int sum = employeeList.stream().mapToInt(dt -> dt.getSalary())
        .sum();
    System.out.println(sum);

    //sorted
    employeeList.stream().mapToInt(dt -> dt.getSalary()).sorted()
        .forEach(data -> System.out.println(data));
    employeeList.stream().sorted(new EmployeeSortedBySalary())
        .forEach(employee -> employee.printDataEmployee());

    //collect
    List<Employee> data = employeeList.stream()
        .filter(employee -> employee.getDepartment().equals("Technology"))
        .collect(Collectors.toList());
    data.forEach(employee -> employee.printDataEmployee());

    //Hendri,Saarah,Hanif
    String data2 = employeeList.stream().map(employee -> employee.getName())
        .collect(Collectors.joining(","));
    System.out.println(data2);

    //gaji pegawai
    //key : Hendri , value : 5000000
    //key : Saarah , value : 5000000
    Map<String, Integer> dataSalary = employeeList.stream()
        .collect(
            Collectors.toMap(employee -> employee.getName(), employee -> employee.getSalary()));
    dataSalary.forEach(
        (key, value) -> System.out.println(String.format("%s gajinya Rp %d", key, value)));

    //Stream.of
    Stream.of(hendri, saarah, hanif).filter(employee -> employee.getDepartment().equals("HR"))
        .forEach(employee -> employee.printDataEmployee());
    Stream.of(20, 30, 40, 10).sorted().forEach(dt -> System.out.println(dt));

    //IntStream
    IntStream.of(40,30,20,10).sorted().forEach(dt -> System.out.println(dt));
    IntStream.range(0, 10).forEach(i -> System.out.println(i));

    //map biasa
    // [["automotive", "gaming"], ["KPop", "Pokemon"], ["Reading", "Cooking"]]
    // [automotive,gaming,kPop,Pokemon,Reading,Cooking]
    List<List<String>> dataHobby = employeeList.stream().map(employee -> employee.getHobby())
        .collect(Collectors.toList());

    List<String> dataHobby2 = employeeList.stream()
        .flatMap(employee -> employee.getHobby().stream())
        .collect(Collectors.toList());
    dataHobby2.forEach(hobby -> System.out.println(hobby));
  }

}

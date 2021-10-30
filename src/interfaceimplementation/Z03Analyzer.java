package interfaceimplementation;

import java.util.List;

public class Z03Analyzer {

  public static void analyze(List<String> data, String textToSearch, StringAnalyzer stringAnalyzer){
    for(int i =0; i < data.size(); i++){
      if(stringAnalyzer.analyze(data.get(i), textToSearch)){
        System.out.println(data.get(i));
      }
    }

  }

}

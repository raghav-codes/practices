package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingDemo {
	
	
	
	public static void main(String[] args) {
        List<ListDupeDemo> ListDupeDemoList = new ArrayList<>();
        ListDupeDemoList.add(new ListDupeDemo("A", "2022-01-01", "John", "123", "80"));
        ListDupeDemoList.add(new ListDupeDemo("B", "2022-01-02", "Jane", "456", "90"));
        ListDupeDemoList.add(new ListDupeDemo("C", "2022-01-01", "Mary", "789", "85"));
        ListDupeDemoList.add(new ListDupeDemo("D", "2022-01-01", "Bob", "234", "95"));
        ListDupeDemoList.add(new ListDupeDemo("B", "2022-01-02", "Jack", "567", "75"));
        
      Map<String, List<ListDupeDemo>> collect = ListDupeDemoList.stream().collect(Collectors.groupingBy( ListDupeDemo::getName));
        
        //collect.keySet().stream().forEach(System.out::println);
        
        System.out.println(collect.keySet());
        
        System.out.println(collect.entrySet());
        
	}

}

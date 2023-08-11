package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ListDupeDemo {
	
	private String code;
    private String date;
    private String name;
    private String id;
    private String score;

    public ListDupeDemo(String code, String date, String name, String id, String score) {
        this.code = code;
        this.date = date;
        this.name = name;
        this.id = id;
        this.score = score;
    }

    @Override
	public String toString() {
		return "ListDupeDemo [code=" + code + ", date=" + date + ", name=" + name + ", id=" + id + ", score=" + score
				+ "]";
	}

	public String getCode() {
        return code;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getScore() {
        return score;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(code, date);
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListDupeDemo)) return false;
        ListDupeDemo listDupe = (ListDupeDemo) o;
        return code == listDupe.code && Objects.equals(date, listDupe.date);
    }

    public static void main(String[] args) {
        List<ListDupeDemo> ListDupeDemoList = new ArrayList<>();
        ListDupeDemoList.add(new ListDupeDemo("A", "2022-01-01", "John", "123", "80"));
        ListDupeDemoList.add(new ListDupeDemo("B", "2022-01-02", "Jane", "456", "90"));
        ListDupeDemoList.add(new ListDupeDemo("C", "2022-01-01", "Mary", "789", "85"));
        ListDupeDemoList.add(new ListDupeDemo("D", "2022-01-01", "Bob", "234", "95"));
        ListDupeDemoList.add(new ListDupeDemo("B", "2022-01-02", "Jack", "567", "75"));

        List<ListDupeDemo> uniqueList = new ArrayList<>();
        List<ListDupeDemo> duplicateList = new ArrayList<>();
        Set<String> codeDateSet = new HashSet<>();

        for (ListDupeDemo ListDupeDemo : ListDupeDemoList) {
            String codeDate = ListDupeDemo.getCode() + "_" + ListDupeDemo.getDate();
            if (codeDateSet.contains(codeDate)) {
                duplicateList.add(ListDupeDemo);
            } else {
                uniqueList.add(ListDupeDemo);
                codeDateSet.add(codeDate);
            }
        }

        System.out.println("Unique list:");
        for (ListDupeDemo ListDupeDemo : uniqueList) {
            System.out.println(ListDupeDemo.getCode() + " " + ListDupeDemo.getDate() + " " + ListDupeDemo.getName()
                    + " " + ListDupeDemo.getId() + " " + ListDupeDemo.getScore());
        }

        System.out.println("\nDuplicate list:");
        for (ListDupeDemo ListDupeDemo : duplicateList) {
            System.out.println(ListDupeDemo.getCode() + " " + ListDupeDemo.getDate() + " " + ListDupeDemo.getName()
                    + " " + ListDupeDemo.getId() + " " + ListDupeDemo.getScore());
        }
    }

}

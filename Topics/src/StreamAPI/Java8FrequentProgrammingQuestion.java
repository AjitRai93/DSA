package StreamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8FrequentProgrammingQuestion {

    static List<Student> studentList = Stream.of(
                    new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                    new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                    new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                    new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                    new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                    new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                    new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                    new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                    new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                    new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
            .collect(Collectors.toList());

    static List<Student> studentList1= Stream.of(new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929"),
                    Map.of("maths",56,"chemistry",46,"physics",80)),
            new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929"),
                    Map.of("maths",86,"chemistry",92,"physics",50))).collect(Collectors.toList());

    public static void main(String[] args) {


        int numbers[] = {5,9,11,3,8,22,1,23,27};
        String str_arr[]={"java","python","golang","springboot","microservices"};
        String value = "ilovemyjavatechie";
        Map <String,Integer> salary = new HashMap<>();
        salary.put("hitesh",40000);
        salary.put("rahul",20000);
        salary.put("rajesh",30000);
        salary.put("mohit",40000);
        salary.put("ankit",33000);
        salary.put("jatin",45000);
        salary.put("vaibah",50000);


        countFrequencyOfCharacterInString(value);
        findAllDuplicateElements(value);
        findAllUniqueElements(value);
        findFirstNonRepetativeCharacter(value);
        findNthHighestNumberFromList(numbers, 3);
        findLongestStringFromArray(str_arr);
        findMatchingNumberStartWith(numbers,2);
        getNthHighestSalary(salary,3);
        getAllEmployeesHavingNthHighestSalary(salary,3);
        calculateSubjectAverages(studentList1);

        // 1. Find the list of students whose rank is in between 50 and 100
        List<Student> studentRankList = studentList.stream().filter(ranks -> ranks.getRank() > 50 && ranks.getRank() <100).toList();
        System.out.println("Ranks between 50 to 100 student list are: "+studentRankList);

        //2. Find the Students who stays in Karnataka and sort them by their names
        List<Student> studentOfKarnataka = studentList.stream().filter(stud -> stud.getCity().equalsIgnoreCase("Karnataka")).sorted(Comparator.comparing(Student::getFirstName,Comparator.reverseOrder())).toList();
        System.out.println("Students from karnataka arranged in assesnding order: "+studentOfKarnataka);

        // 3. Find all departments names
        List<String> departmentNames = studentList.stream().map(Student::getDept).distinct().collect(Collectors.toList());
        System.out.println("Department List are: "+departmentNames);

        //4.  Find all the contact numbers
        List<String> contactNumbers = studentList.stream().flatMap(student -> student.getContacts().stream()).distinct().collect(Collectors.toList());
        System.out.println("Contact numbers"+contactNumbers);

        //5.  Group The Student By Department Names
        Map<String, List<Student>> collect = studentList.stream().collect(Collectors.groupingBy(Student::getDept));
        System.out.println("Department Wise student List :"+collect);

        //6. Find the number of students in each department
        Map<String, Long> studentCount = studentList.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.counting()));
        System.out.println("Counting of students by department: "+studentCount);

        //7. Finding Max student from department
        Map.Entry<String, Long> sortedDepartmentwithMaxStudent = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .entrySet()
                .stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Department holding max student: "+sortedDepartmentwithMaxStudent);

        //8. Average age of male and female Students:
        Map<String, Double> averageAge = studentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println("Average age of male and female students: "+averageAge);

        //9. Find the best rank in each department:
        Map<String, Optional<Student>> studentRankMap = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println("Best rank from every department: "+studentRankMap);

        //10. Find the Student who have 2nd Rank:
        Optional<Student> sortedByRank = studentList.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst();
        System.out.println("2nd Highest Rank: "+sortedByRank);
    }

    private static Map<String, Double> calculateSubjectAverages(List<Student> studentList1) {

        System.out.println("Average of all subjects from studentList"+ studentList1.stream()
                .flatMap(student -> student.getMarks().entrySet().stream())
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey, // Group by subject name
                        Collectors.averagingDouble(Map.Entry::getValue)
                )));
        return null;
    }

    private static void getAllEmployeesHavingNthHighestSalary(Map<String, Integer> salary, int nthSalary) {
        Map<Integer, List<String>> collect = salary.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        System.out.println("----->"+collect);
        Map.Entry<Integer, List<String>> salary_result = collect.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(nthSalary-1);
        System.out.println("Nth Highest Salary"+salary_result);
    }

    private static void getNthHighestSalary(Map<String,Integer> empMap, int nthSalary) {
        //this will not return all the employees having same salary
        Map.Entry<String, Integer> stringIntegerEntry = empMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(nthSalary-1);
        System.out.println("Nth Highest Salary is of :" +stringIntegerEntry);
    }

    private static void findMatchingNumberStartWith(int[] numbers,int n) {
        List<String> stringList = Arrays.stream(numbers).boxed()
                .map(s -> s + "")
                .filter(s -> s.startsWith("2"))
                .toList();
        System.out.println("Matching numbers : "+stringList);
    }


    private static void findLongestStringFromArray(String[] strArr) {
        String longestString = Arrays.stream(strArr)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println("LongestString from Array is: "+longestString);
    }

    private static void findNthHighestNumberFromList(int[] numbers,int n) {
        Integer nthHighest = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(n-1)
                .findFirst()
                .get();
        System.out.println(n +"rd Highest Number: "+nthHighest);
    }

    private static void findFirstNonRepetativeCharacter(String value) {
        String fistNonRepetativeElement = Arrays.stream(value.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println("1st non-repetative character: "+fistNonRepetativeElement);
    }

    private static void findAllUniqueElements(String value) {
        List<String> uniqueElements = Arrays.stream(value.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("Unique elements present in string are: "+uniqueElements);
    }

    static Map<String,Long> countFrequencyOfCharacterInString(String value){
        Map<String, Long> collect = Arrays.stream(value.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Count of each character from String: "+value+" is "+collect);
        return collect;
    }
    private static void findAllDuplicateElements(String value) {
        List<String> duplicateElements = Arrays.stream(value.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("Duplicate elements from String is: "+duplicateElements);
    }

}

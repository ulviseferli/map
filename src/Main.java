//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Map<Integer,String> students = new HashMap<>();
    students.put(101,"Ali");
    students.put(102,"Vali");
    students.put(103, "Aysel");
    students.put(104, "Nigar");

    System.out.println(students.put(102,"Elvin")); //Veli
    System.out.println(students);  //Elvin

    System.out.println(students.get(103));
    System.out.println(students.getOrDefault(999,"tapilmadi"));

    System.out.println(students.containsKey(105));

    System.out.println(students.remove(101));

    System.out.println(students.remove(500));

    System.out.println(students.size());
    System.out.println(students);
}

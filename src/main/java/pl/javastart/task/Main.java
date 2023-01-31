package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tadeusz", "Nalepa");

        Task task1 = new Task("Nauka", "Intensywna nauka Javy", 3, person);
        Task task2 = new Task("Sprzątanie", "Posprzątanie domu", 1, person);
        Task task3 = new Task("Zakupy", "Zrobienie zakupów spożywczych", 0);
        Task task4 = new Task("Malowanie", "Malowanie sufitu", -1);
        Task task5 = new Task("Wyjście z psem", "Wyjście na spacer");

        showPriorityForTask(task1);
        showPriorityForTask(task2);
        showPriorityForTask(task3);
        showPriorityForTask(task4);
    }

    private static void showPriorityForTask(Task task) {
        System.out.println("\nZadanie: " + task.getName());
        System.out.println("Czy priorytet niski? " + task.lowPriority());
        System.out.println("Czy priorytet średni? " +  task.mediumPriority());
        System.out.println("Czy priorytet wysoki? " + task.highPriority());
    }
}

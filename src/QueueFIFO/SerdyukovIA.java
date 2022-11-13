package QueueFIFO;

import java.util.Scanner;

public class SerdyukovIA {
    public static void main(String[] args) {
        //Ввод
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();

        //Очередь

        //Начальное добавление
        System.out.println("\tQUEUE");
        System.out.println(">> How much to INSERT: ");
        int size_ins = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size_ins; i++) {
            q.push(i + 10);
        }
        q.printQueue();

        //Удалание
        System.out.println(">> How much to DELETE: ");
        int size_del = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size_del; i++) {
            q.pop();
        }
        q.printQueue();

        //Добавление

        System.out.println(">> How much to INSERT: ");
        int size_ins2 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size_ins2; i++) {
            q.push(i + 100);
        }
        q.printQueue();

        System.out.print("\nSize is: ");
        System.out.println(q.size());

        //Работа со стеком

        System.out.println("\n\tSTACK\t");
        System.out.println(">> Size of QueueFIFO.Stack: ");
        int size_stack = Integer.parseInt(sc.nextLine());
        Stack s = new Stack(size_stack);

        // Заполение стека
        for (int i = 20; i < size_stack + 20; i++) {
            s.push(i);
        }
        s.showStack();

        System.out.println("\n>> How much elements to DELETE: ");
        int total_del = Integer.parseInt(sc.nextLine());
        //Удаление элементов
        for (int j = 0; j < total_del; j++) {
            s.pop();
        }
        s.showStack();

        //Добавление элементов

        System.out.println("\n>> How much elements to INSERT: ");
        int total_insert = Integer.parseInt(sc.nextLine());
        for (int j = 0; j < total_insert; j++) {
            s.push(j);
        }
        s.showStack();
    }
}

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец  очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package Homeworks.JavaHomeworks.Lesson4HW;

public class Task2_4 {
    public static void main(String[] args) {

        MyQueue que = new MyQueue();
        System.out.println("Дана очередь => " + que.createQueue());
        int a = 75;
        que.enqueue(a);
        System.out.println("Помещаем некий элемент a = " + a + " в конец очереди => ");
        que.printQueue();
        // System.out.println("Первый элемент в очереди => " + que.first());
        que.dequeue();
        System.out.print("Наша очередь сейчас => ");
        que.printQueue();
    }
}

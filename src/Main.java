public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.pushFirst(1);
        list.pushEnd(2);
        list.pushEnd(3);
        list.pushEnd(4);
        list.pushEnd(5);
        list.pushEnd(6);

        list.printQueue();


        list.pushFirst(100);
        list.pushEnd(2222);


        System.out.println();
        list.printQueue();
        System.out.println();

        System.out.println(list.popQueue() + " удаление из очереди");
        System.out.println(list.popStack() + " удаление из стека");
        System.out.println(list.peekStack() + " число из очереди");
        System.out.println(list.peekQueue() + " число из стека");


        list.peekQueue();

        list.printQueue();
        System.out.println();
        list.printStek();


    }
}
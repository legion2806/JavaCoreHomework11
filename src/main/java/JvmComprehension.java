public class JvmComprehension {

    public static void main(String[] args) { // В момент вызова метода создается фрейм(кадр) в стеке
        int i = 1;                      // 1 В стек сохраняеться переменая и ее значение
        Object o = new Object();        // 2 В куче вызыаеться класс Object, и переменной "o" присваеваеться этот тип данных.
        Integer ii = 2;                 // 3 В стек сохраняеться переменая и ее значение
        printAll(o, i, ii);             // 4 Создастся новый фрейм в стеке, куда передадим ссылку на o, i, ii
        System.out.println("finished"); // 7 Создастся новый фрейм в стеке, куда передадим это значение
    }

    private static void printAll(Object o, int i, Integer ii) { // В момент вызова метода создается фрейм(кадр) в стеке
        // В куче вызыаеться класс Object, int, Integer и всем переменным присваеваеться их тип данных.
        Integer uselessVar = 700;                   // 5 В стек сохраняеться переменая и ее значение
        System.out.println(o.toString() + i + ii);  // 6 Создастся новый фрейм(или нет) в стеке, куда передадим ссылку на o, i, ii
    }
}

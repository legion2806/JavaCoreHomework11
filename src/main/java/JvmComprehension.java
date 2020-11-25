public class JvmComprehension {

    public static void main(String[] args) { // В момент вызова метода создается фрейм(кадр) в стеке
        int i = 1;                      // 1 В стеке, в фрейме "main" сохраняеться переменая типа int и ее значение - 1
        Object o = new Object();        // 2 * Object отдаеться для загрузки в систему загрузчиков классов,
        // создается в куче, и cсылка "o" на Object сохраняеться в стек.(?)
        Integer ii = 2;                 // 3 * Ссылочная переменная типа Integer будет создана в стеке, но сам Integer храниться в стеке
        printAll(o, i, ii);             // 4 Создастся новый фрейм в стеке, куда передадим ссылки на o, i, ii
        System.out.println("finished"); // 7 * Создастся новый фрейм в стеке,
        // куда передадим cсылку на String - finished
    }

    private static void printAll(Object o, int i, Integer ii) { // В момент вызова метода создается фрейм(кадр) в стеке
        // * Object, int, integer отдаються для загрузки в систему загрузчиков классов, создаються в куче,
        // и cсылки o, i, ii на Object, int, Integer сохраняються в стек.
        Integer uselessVar = 700;                   // 5 * В стеке, в фрейме "printAll" сохраняеться переменая типа Integer и ее значение
        System.out.println(o.toString() + i + ii);  // 6 * Создастся новый фрейм в стеке,
        // куда передадим ссылку на o, i, ii
    }
}

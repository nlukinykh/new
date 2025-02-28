public class Task1 {
    public static int findMaxElement(int elem1, int elem2) {
        return (elem1 >= elem2 ? elem1 : elem2);
    }


    public static int findMaxElementWithMath(int elem1, int elem2) {
        return Math.max(elem1, elem2);
    }

    public static int findMaxElement(int elem1, int elem2, int elem3) {
        System.out.println("three numbers elements");
        int max = elem1;
        if (elem2 > max) {
            max = elem2;
        }
        if (elem3 > max) {
            max = elem3;
        }
        return max;
    }

    public static int findMaxElement(int... elements) {
        System.out.println("unknown numbers elements");
        if (elements.length == 0) {
            throw new IllegalArgumentException("Необходимо передать хотя бы один элемент");
        }
        int max = elements[0];
        for (int element : elements) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }
}

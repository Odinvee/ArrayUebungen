public class ArrayUebungen {
    static int summe = 0;
    static int[] arr = new int[14];
    static int min;
    static int max;

    public static void main(String[] args) {

        arr[0] = 75;
        arr[1] = 70;
        arr[2] = 68;
        arr[3] = 68;
        arr[4] = 70;
        arr[5] = 72;
        arr[6] = 70;
        arr[7] = 63;
        arr[8] = 60;
        arr[9] = 58;
        arr[10] = 60;
        arr[11] = 50;
        arr[12] = 45;
        arr[13] = 42;

        durchschnitt();
        minmax();
    }

    public static void durchschnitt() {
        for (int i = 0; i < arr.length; i++) {
            summe = arr[i] + summe;
        }

        System.out.println("Der Durchschnitt des Arrays beträgt: " + summe/arr.length); //62

    }

    public static void minmax() {
        max = arr[0];
        min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Der größte Wert beträgt: " + max);		//75
        System.out.println("Der kleinste Wert beträgt: " + min);	//42
    }
}
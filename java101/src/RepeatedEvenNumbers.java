public class RepeatedEvenNumbers {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 6, 2, 8, 4, 10, 6, 7, 8};
        int[] repeated = new int[numbers.length];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {

                for (int j = i + 1; j < numbers.length; j++) {

                    if (numbers[i] == numbers[j]) {

                        boolean alreadyExists = false;

                        for (int k = 0; k < index; k++) {
                            if (repeated[k] == numbers[i]) {
                                alreadyExists = true;
                                break;
                            }
                        }

                        if (!alreadyExists) {
                            repeated[index++] = numbers[i];
                        }
                    }
                }
            }
        }

        System.out.print("Repeated even numbers: ");

        for (int i = 0; i < index; i++) {
            System.out.print(repeated[i] + " ");
        }
    }
}
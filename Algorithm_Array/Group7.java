public class Mapping_Array {
    public static void main(String[] args) {
        // Define the three elements
        String[] elements = {"Element 1", "Element 2", "Element 3"};
        int numElements = elements.length;

        // Create a 1D array for the value matrix
        int[] valueMatrix = new int[numElements * (numElements - 1) / 2];

        // Assign values to represent the relationships
        valueMatrix[getIndex(0, 1, numElements)] = 5; // Relationship between Element 1 and Element 2
        valueMatrix[getIndex(0, 2, numElements)] = 3; // Relationship between Element 1 and Element 3
        valueMatrix[getIndex(1, 2, numElements)] = 7; // Relationship between Element 2 and Element 3

        // Print the value matrix
        int index = 0;
        for (int i = 0; i < numElements; i++) {
            for (int j = i + 1; j < numElements; j++) {
                System.out.println("Relationship between " + elements[i] + " and " + elements[j] + ": " +
                        valueMatrix[index]);
                index++;
            }
        }
    }

    // Calculate the flattened index based on row and column indices
    private static int getIndex(int row, int col, int numElements) {
        return col + (row * numElements) - (row * (row + 1) / 2) - row - 1;
    }
}

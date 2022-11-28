package searching;

/*
 * Linear Search is defined as a sequential search algorithm that starts at one end and goes through
 *  each element of a list until the desired element is found, otherwise the search continues till
 *  the end of the data set. It is the easiest searching algorithm
 * */
public class LinearSearch {

    static int[] elements = new int[]{2,1,5,7,3,9,4,5};

    public static void main(String[] args) {
        int key = 4;
        int size = elements.length;
        int index = -1;
        if (size!=0){
            //index = searchingInNonRecursiveWay(elements,size, key);
            index = searchingInRecursiveWay(elements, size, key);
        }

        if (index != -1){
             System.out.println("Element " + key + " is found at index: " + index);
        }else{
            System.out.println("Element " + key + " is not found");
        }
   }

    private static int searchingInRecursiveWay(int[] elements, int size, int key) {
        int lastElementIndex = size-1;
        if (size == 0){
            return -1;
        }else if(elements[lastElementIndex] == key){
            return lastElementIndex;
        }
        return searchingInRecursiveWay(elements, lastElementIndex, key);

    }

    private static int searchingInNonRecursiveWay(int[] elements,int size,  int key) {
        if (size == 0){
            return -1;
        }

        for (int i=0; i<size; i++){
            if (elements[i] == key){
                return i;
            }
        }

        return -1;
    }
}

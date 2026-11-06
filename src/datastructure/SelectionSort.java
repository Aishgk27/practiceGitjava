package datastructure;


	class SelectionSort {

	    public static void main(String[] args) {

	        int[] arr = {5, 4, 6, 2, 1};

	        for (int i = 0; i < arr.length - 1; i++) {

	            int small = i;

	            for (int j = i + 1; j < arr.length; j++) {

	                if (arr[j] < arr[small]) {
	                    small = j;
	                }
	            }

	            int temp = arr[i];
	            arr[i] = arr[small];
	            arr[small] = temp;
	        }

	        System.out.println("Sorted Array:");

	        for (int a : arr) {
	            System.out.print(a + " ");
	        }
	    }
	}



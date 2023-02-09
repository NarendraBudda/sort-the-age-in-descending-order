package com.jap;

public class SortingAge {

    //Write the logic to sort the array containing the age in descending order
    // inside the below method and return the sorted array
    public int[] getSortedAge(int[] ageArray)
    {
        for (int i = 1; i < ageArray.length; i++) {
            int key = ageArray[i];
            int j = i - 1;
            while (j >= 0 && ageArray[j] < key) {
                ageArray[j + 1] = ageArray[j];
                j = j - 1;
            }
            ageArray[j + 1] = key;



        }
        return ageArray;
    }
        public static void main(String[] args){
            int ageArray[]={22,34,33,32,36,27,28};
            SortingAge sortingAge=new SortingAge();
            int descending[]=sortingAge.getSortedAge(ageArray);
            System.out.println("Descending Age ");
            for (int i = 0; i < descending.length; i++){
             System.out.println(descending[i]);
        }
    }
}

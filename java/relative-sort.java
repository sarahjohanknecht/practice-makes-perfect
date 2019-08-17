class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] finalArray = new int[arr1.length];

        HashMap<Integer, Integer> arr1Map = new HashMap<>();

        for(int i=0; i< arr1.length; i++){
            if(arr1Map.get(arr1[i]) == null){
                arr1Map.put(arr1[i], 1);
            }

            else{
                int count = arr1Map.get(arr1[i]);
                arr1Map.remove(arr1[i]);
                arr1Map.put(arr1[i], count + 1);
            }
        }

        int finalIndex = 0;
        for(int i=0; i< arr2.length; i++){
            int element = arr2[i];

            int count = arr1Map.remove(element);
            for(int j = 0; j < count; j++){
                finalArray[finalIndex] = element;
                finalIndex++;
            }
        }

        ArrayList<Integer> leftovers = new ArrayList<>();
        for(int num : arr1Map.keySet()){
            for(int i = 0; i< arr1Map.get(num); i++){
                leftovers.add(num);
            }

        }

        Collections.sort(leftovers);

        for(int num: leftovers){
             finalArray[finalIndex] = num;
             finalIndex++;
        }
      
        return finalArray;
    }
}

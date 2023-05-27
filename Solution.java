import java.util.*;

class Solution{
    public static void mostActive(String a[],int n){
        // Create a HashMap to store the frequency count of each name
        HashMap<String, Integer> freq = new HashMap<>();
        
        // Iterate over the array a and update the frequency count of each name
        for (String name : a) {
            freq.put(name, freq.getOrDefault(name, 0) + 1);
        }
        
        // Sort the names alphabetically
        List<String> names = new ArrayList<>(freq.keySet());
        Collections.sort(names);
        
        // Iterate over the sorted names and print the ones that appear more than 5% of the time
        for (String name : names) {
            int count = freq.get(name);
            if ((count*100.0)/n >= 5.0) {
                System.out.println(name);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next();
        }
        mostActive(a, n);
    }
}
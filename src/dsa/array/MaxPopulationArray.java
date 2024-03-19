package dsa.array;

public class MaxPopulationArray {
    public static void main(String[] args) {
        int[][] logs1 = {{1993, 1999}, {2000, 2010}};
        int output1 = earliestMaxPopulationYear(logs1);
        System.out.println("Example 1: " + output1); // Output: 1993

        // Example 2
        int[][] logs2 = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        int output2 = earliestMaxPopulationYear(logs2);
        System.out.println("Example 2: " + output2); // Output: 1960
    }
    public static int earliestMaxPopulationYear(int[][] logs) {
        // Initialize an array to store population for each year from 1950 to 2050
        int[] population = new int[101]; // 2050 - 1950 + 1 = 101 years

        // Iterate through the logs and update population for each year
        for (int[] log : logs) {
            int birthYear = log[0] - 1950; // Adjust birth year to index in population array
            int deathYear = log[1] - 1950; // Adjust death year to index in population array
            for (int i = birthYear; i < deathYear; i++) {
                population[i]++;
            }
        }

        // Find the maximum population and earliest year with this population
        int maxPopulation = 0;
        int earliestYear = 0;
        for (int i = 0; i < population.length; i++) {
            if (population[i] > maxPopulation) {
                maxPopulation = population[i];
                earliestYear = i + 1950; // Adjust index back to year
            }
        }

        return earliestYear;
    }
}


/*
 public int maximumPopulation(int[][] logs) {
        int[] population=new int[101];
        for(int[] log : logs){
         int birth=log[0]-1950;
         int death=log[1]-1950;
          for(int i=birth;i<death;i++){
            population[i]++;
           }
        }
        int max=0;
        int earliest=0;

        for(int i=0;i<population.length;i++){
            if(population[i]>max){
               max=population[i];
               earliest=i+1950;
            }
        }
        return earliest;
    }
 */

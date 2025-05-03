import java.util.HashSet;
import java.util.Set;

public class CountCoveredBuildings {

        public int countCoveredBuildings(int n, int[][] buildings) {
            Set<String> buildingSet = new HashSet<>();

            // Add all buildings to a set for O(1) lookup
            for (int[] b : buildings) {
                buildingSet.add(b[0] + "," + b[1]);
            }

            int count = 0;

            // Check each building for buildings in all four directions
            for (int[] b : buildings) {
                int x = b[0], y = b[1];
                String left = (x - 1) + "," + y;
                String right = (x + 1) + "," + y;
                String up = x + "," + (y - 1);
                String down = x + "," + (y + 1);

                if (buildingSet.contains(left) &&
                        buildingSet.contains(right) &&
                        buildingSet.contains(up) &&
                        buildingSet.contains(down)) {
                    count++;
                }
            }

            return count;
        }

        // Example usage
        public static void main(String[] args) {
            CountCoveredBuildings cb = new CountCoveredBuildings();
            int n = 5;
            int[][] buildings = {
                    {1, 1}, {1, 2}, {1, 3}, {0, 2}, {2, 2}, {1, 4}
            };

            int result = cb.countCoveredBuildings(n, buildings);
            System.out.println("Number of covered buildings: " + result);  // Output: 1
        }

}
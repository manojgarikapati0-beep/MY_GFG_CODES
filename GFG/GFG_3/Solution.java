import java.util.*;

class Solution {

    // Path compression helper method for Union-Find
    private int find(int[] parent, int i) {
        if (parent[i] == i) {
            return i;
        }
        return parent[i] = find(parent, parent[i]); // Path compression
    }

    public int minEdgesReq(int n, int[][] edges) {
        int m = edges.length;

        // Minimum edges needed to connect n vertices is n - 1
        if (m < n - 1) {
            return -1;
        }

        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int components = n;

        // Process all edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            int rootU = find(parent, u);
            int rootV = find(parent, v);

            // If nodes belong to different components, merge them
            if (rootU != rootV) {
                parent[rootU] = rootV;
                components--; // Reduce total components count
            }
        }

        // Minimum operations to connect k components = k - 1
        return components - 1;
    }

    public static void main(String[] args) {
        Solution solver = new Solution();

        // Example 1
        int n1 = 4;
        int[][] edges1 = {
            {0, 1},
            {0, 2},
            {1, 2}
        };
        System.out.println("Example 1 Output: " + solver.minEdgesReq(n1, edges1)); // Expected: 1

        // Example 2
        int n2 = 6;
        int[][] edges2 = {
            {0, 1},
            {0, 2},
            {0, 3},
            {1, 2},
            {1, 3}
        };
        System.out.println("Example 2 Output: " + solver.minEdgesReq(n2, edges2)); // Expected: 2

        // Example 3: Impossible Case
        int n3 = 6;
        int[][] edges3 = {
            {0, 1},
            {0, 2},
            {0, 3}
        };
        System.out.println("Example 3 Output: " + solver.minEdgesReq(n3, edges3)); // Expected: -1
    }
}
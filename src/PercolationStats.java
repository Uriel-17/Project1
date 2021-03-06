import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

// Estimates percolation threshold for an N-by-N percolation system.
public class PercolationStats {
    //...

    // Perform T independent experiments (Monte Carlo simulations) on an
    // N-by-N grid.
    public PercolationStats(int N, int T) {
       // ...
    }

    // Sample mean of percolation threshold.
    public double mean() {
        //...
        return 0;
    }

    // Sample standard deviation of percolation threshold.
    public double stddev() {
        //...
        return 0;
    }

    // Low endpoint of the 95% confidence interval.
    public double confidenceLow() {
        //...
        return 0;
    }

    // High endpoint of the 95% confidence interval.
    public double confidenceHigh() {
        //...
        return 0;
    }

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int T = Integer.parseInt(args[1]);
        PercolationStats stats = new PercolationStats(N, T);
        StdOut.printf("mean           = %f\n", stats.mean());
        StdOut.printf("stddev         = %f\n", stats.stddev());
        StdOut.printf("confidenceLow  = %f\n", stats.confidenceLow());
        StdOut.printf("confidenceHigh = %f\n", stats.confidenceHigh());
    }
}

public class Duke {
    public static void main(String[] args) {

        int images = 17; // number of images
        int WIDTH = 130, HEIGHT = 80; // images are 130-by-80
        StdDraw.setCanvasSize(WIDTH, HEIGHT);
        StdDraw.setXscale(0, WIDTH);
        StdDraw.setYscale(0, HEIGHT);
        StdDraw.enableDoubleBuffering();
        // main animation loop
        for (int t = 0; true; t++) {
            int i = 1 + (t % images);
            String filename = "T" + i + ".gif"; // name of the ith image
            StdDraw.picture(WIDTH/2.0, HEIGHT/2.0, filename);
            StdDraw.show();
            StdDraw.pause(100);
        }

    }
}
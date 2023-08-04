package example;

import swim.api.plane.AbstractPlane;
import swim.kernel.Kernel;
import swim.server.ServerLoader;

public class ExamplePlane extends AbstractPlane {

    public static void main(String[] args) {
        final Kernel kernel = ServerLoader.loadServer();
        kernel.start();
        System.out.println("Running server...");
        kernel.run();
    }
}

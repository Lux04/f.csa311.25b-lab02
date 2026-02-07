package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

/**
 * Main функц нь Renderer болон дүрсүүдтэй ажиллаж polymorphism-г харуулна.
 */
public class Main {
    public static void main(String[] args) {
        // Rectangle-г ерөнхий Shape интерфэйсээр ашиглаж байна
        Shape rectangle = new Rectangle(2, 3);

        // Renderer объект үүсгэн render method-ыг дуудаж байна
        Renderer renderer = new Renderer();
        renderer.render(rectangle);
    }
}

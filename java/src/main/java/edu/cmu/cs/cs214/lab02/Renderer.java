package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

/**
 * Renderer class нь зөвхөн Shape interface-д хамааралтай.
 * Энэ нь Renderer-ийг тодорхой дүрс (Rectangle, Circle, Square)-ээс
 * тусгаарлаж, polymorphism ашиглах боломжийг олгоно.
 *
 * Ингэснээр шинэ дүрс нэмсэн ч Renderer-ийг өөрчлөх шаардлагагүй.
 */
public class Renderer {

    /**
     * render method нь дүрсийг зурж, талбайг хэвлэнэ.
     * Энэ метод зөвхөн Shape interface-тэй ажиллаж байна,
     * internal fields (width, height, radius гэх мэт) руу шууд хандахгүй.
     */
    public void render(Shape shape) {
        shape.draw();
        System.out.println("Its area is " + shape.area());
    }
}

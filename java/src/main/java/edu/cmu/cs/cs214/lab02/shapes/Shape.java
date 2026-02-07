package edu.cmu.cs.cs214.lab02.shapes;

/**
 * Shape interface нь бүх дүрсүүдийн ерөнхий зан төлөвийг тодорхойлно.
 * Renderer болон бусад классууд нь зөвхөн энэ interface-с хамаарах бөгөөд
 * Rectangle, Circle гэх мэт тодорхой хэрэгжилтээс үл хамаарна.
 *
 * Ингэснээр мэдээлэл нууцлал (encapsulation) сайжирч,
 * шинэ дүрс нэмэхэд одоогийн кодыг өөрчлөх шаардлагагүй болно.
 */
public interface Shape {
    void draw();
    double area();
}

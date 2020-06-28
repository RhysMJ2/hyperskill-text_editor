class Circle {

    double radius;

    double getLength() {
        return Math.PI * radius * 2;
    }
    double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
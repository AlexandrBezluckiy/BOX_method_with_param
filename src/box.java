public class box {
    double width;
    double height;
    double length;

    void setDimens (double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    double volume () {
        return (width * height * length);
    }
}

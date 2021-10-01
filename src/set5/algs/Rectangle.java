package set5.algs;

public class Rectangle {

    public int ulx, uly;
    public int drx, dry;

    public Rectangle(int _ulx, int _uly, int _drx, int _dry) {
        ulx = _ulx;
        uly = _uly;
        drx = _drx;
        dry = _dry;
    }

    public boolean containsRect(Rectangle rect) {
        return ulx <= rect.ulx && uly >= rect.uly && drx >= rect.drx && dry <= rect.dry;
    }

}

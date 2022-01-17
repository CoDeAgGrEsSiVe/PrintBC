package Helper;

import android.graphics.Bitmap;

public class BitmapHelper {
    private Bitmap bitmap = null;
    private String stringMap = null;
    private static final BitmapHelper instance = new BitmapHelper();

    public BitmapHelper() {

    }
    public static BitmapHelper getInstance() {
        return instance;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }
    public String getStringMap() {return stringMap; }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
    public void setStringMap(String stringMap) { this.stringMap = stringMap; }
}

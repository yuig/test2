package net.quikkly.android.render;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Log;
import je.j2;
import net.quikkly.android.Quikkly;

/* loaded from: classes4.dex */
public class RenderSvg {
    public static Bitmap renderSvg(String str, int i13, int i14) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("SVG text must be provided.");
        }
        if (i13 <= 0 || i14 <= 0) {
            throw new IllegalArgumentException("Output pixel size must be positive.");
        }
        try {
            j2 d2 = j2.d(str);
            Bitmap createBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            d2.e(canvas);
            return createBitmap;
        } catch (Exception e13) {
            Log.e(Quikkly.TAG, "Error rendering SVG.", e13);
            return null;
        }
    }
}

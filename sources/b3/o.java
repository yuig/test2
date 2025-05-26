package b3;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class o {
    @NotNull
    public static final c3.d a(@NotNull Bitmap bitmap) {
        c3.d b13;
        ColorSpace colorSpace = bitmap.getColorSpace();
        if (colorSpace != null && (b13 = a0.b(colorSpace)) != null) {
            return b13;
        }
        float[] fArr = c3.f.f25492a;
        return c3.f.f25494c;
    }

    @NotNull
    public static final Bitmap b(int i13, int i14, int i15, boolean z13, @NotNull c3.d dVar) {
        return Bitmap.createBitmap((DisplayMetrics) null, i13, i14, androidx.compose.ui.graphics.a.v(i15), z13, a0.a(dVar));
    }
}

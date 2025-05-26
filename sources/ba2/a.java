package ba2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;

/* loaded from: classes4.dex */
public interface a {
    Bitmap a(Bitmap bitmap, float f13, Shader.TileMode tileMode);

    Bitmap.Config b();

    void c(Canvas canvas, Bitmap bitmap);

    void destroy();
}

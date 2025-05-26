package t62;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import ql2.s;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f116456a = Math.max(1472, 2500);

    public static Bitmap a(Bitmap originalBitmap) {
        Intrinsics.checkNotNullParameter(originalBitmap, "originalBitmap");
        int width = originalBitmap.getWidth();
        int height = originalBitmap.getHeight();
        if (width >= 15 && height >= 15) {
            return originalBitmap;
        }
        int max = Math.max(width, 15);
        int max2 = Math.max(height, 15);
        Bitmap.Config config = originalBitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Intrinsics.f(config);
        Bitmap createBitmap = Bitmap.createBitmap(max, max2, config);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        new Canvas(createBitmap).drawBitmap(originalBitmap, (max - width) / 2, (max2 - height) / 2, new Paint());
        return createBitmap;
    }

    public static Bitmap b(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 4096 && height <= 4096) {
            return bitmap;
        }
        float f13 = width;
        float f14 = height;
        float c13 = s.c(4096.0f / f13, 4096.0f / f14);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (f13 * c13), (int) (f14 * c13), true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        return createScaledBitmap;
    }
}

package f1;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public abstract class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f60770a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f13, float f14, boolean z13) {
        if (!z13) {
            return f13;
        }
        return (float) (((1.0d - f60770a) * f14) + f13);
    }

    public static float b(float f13, float f14, boolean z13) {
        if (!z13) {
            return f13 * 1.5f;
        }
        return (float) (((1.0d - f60770a) * f14) + (f13 * 1.5f));
    }
}

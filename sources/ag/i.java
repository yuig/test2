package ag;

import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a */
    public static DisplayMetrics f15104a = null;

    /* renamed from: b */
    public static int f15105b = 50;

    /* renamed from: c */
    public static int f15106c = 8000;

    /* renamed from: d */
    public static final float f15107d;

    /* renamed from: e */
    public static final Rect f15108e;

    /* renamed from: f */
    public static final Paint.FontMetrics f15109f;

    /* renamed from: g */
    public static final Rect f15110g;

    /* renamed from: h */
    public static final uf.b f15111h;

    /* renamed from: i */
    public static final Rect f15112i;

    /* renamed from: j */
    public static final Paint.FontMetrics f15113j;

    static {
        Double.longBitsToDouble(1L);
        f15107d = Float.intBitsToFloat(1);
        f15108e = new Rect();
        f15109f = new Paint.FontMetrics();
        f15110g = new Rect();
        f15111h = new uf.b(1);
        new Rect();
        f15112i = new Rect();
        f15113j = new Paint.FontMetrics();
    }

    public static int a(Paint paint, String str) {
        Rect rect = f15108e;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static a b(Paint paint, String str) {
        a aVar = (a) a.f15080d.b();
        aVar.f15081b = 0.0f;
        aVar.f15082c = 0.0f;
        Rect rect = f15110g;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        aVar.f15081b = rect.width();
        aVar.f15082c = rect.height();
        return aVar;
    }

    public static float c(float f13) {
        DisplayMetrics displayMetrics = f15104a;
        if (displayMetrics != null) {
            return f13 * displayMetrics.density;
        }
        Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
        return f13;
    }

    public static a d(float f13, float f14) {
        double d2 = 0.0f;
        float abs = Math.abs(((float) Math.sin(d2)) * f14) + Math.abs(((float) Math.cos(d2)) * f13);
        float abs2 = Math.abs(f14 * ((float) Math.cos(d2))) + Math.abs(f13 * ((float) Math.sin(d2)));
        a aVar = (a) a.f15080d.b();
        aVar.f15081b = abs;
        aVar.f15082c = abs2;
        return aVar;
    }

    public static double e(double d2) {
        if (d2 == Double.POSITIVE_INFINITY) {
            return d2;
        }
        double d13 = d2 + 0.0d;
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d13) + (d13 >= 0.0d ? 1L : -1L));
    }

    public static float f(double d2) {
        if (Double.isInfinite(d2) || Double.isNaN(d2) || d2 == 0.0d) {
            return 0.0f;
        }
        return Math.round(d2 * r0) / ((float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d2 < 0.0d ? -d2 : d2)))));
    }
}

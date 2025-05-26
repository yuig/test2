package jc;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.io.Closeable;
import t3.n1;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final n1 f75394a = new n1(1);

    /* renamed from: b, reason: collision with root package name */
    public static final n1 f75395b = new n1(2);

    /* renamed from: c, reason: collision with root package name */
    public static final n1 f75396c = new n1(3);

    /* renamed from: d, reason: collision with root package name */
    public static final n1 f75397d = new n1(4);

    /* renamed from: e, reason: collision with root package name */
    public static final float f75398e = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f13, float f14, float f15) {
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        PathMeasure pathMeasure = (PathMeasure) f75394a.get();
        Path path2 = (Path) f75395b.get();
        Path path3 = (Path) f75396c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f13 == 1.0f && f14 == 0.0f) && length >= 1.0f && Math.abs((f14 - f13) - 1.0f) >= 0.01d) {
            float f16 = f13 * length;
            float f17 = f14 * length;
            float f18 = f15 * length;
            float min = Math.min(f16, f17) + f18;
            float max = Math.max(f16, f17) + f18;
            if (min >= length && max >= length) {
                min = f.c(min, length);
                max = f.c(max, length);
            }
            if (min < 0.0f) {
                min = f.c(min, length);
            }
            if (max < 0.0f) {
                max = f.c(max, length);
            }
            if (min == max) {
                path.reset();
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e13) {
                throw e13;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float d(Matrix matrix) {
        float[] fArr = (float[]) f75397d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f13 = f75398e;
        fArr[2] = f13;
        fArr[3] = f13;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static Bitmap e(Bitmap bitmap, int i13, int i14) {
        if (bitmap.getWidth() == i13 && bitmap.getHeight() == i14) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i13, i14, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static void f(Canvas canvas, RectF rectF, Paint paint) {
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        canvas.saveLayer(rectF, paint);
    }
}

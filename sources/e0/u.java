package e0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final RectF f56755a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(int i13, RectF rectF, RectF rectF2, boolean z13) {
        Matrix matrix = new Matrix();
        RectF rectF3 = f56755a;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i13);
        if (z13) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static boolean b(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean c(int i13) {
        if (i13 == 90 || i13 == 270) {
            return true;
        }
        if (i13 == 0 || i13 == 180) {
            return false;
        }
        throw new IllegalArgumentException(a.a.d("Invalid rotation degrees: ", i13));
    }

    public static boolean d(Size size, boolean z13, Size size2) {
        float width;
        float width2;
        if (z13) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        return width >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= width2;
    }

    public static Size e(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static String f(Rect rect) {
        Locale locale = Locale.US;
        return rect + "(" + rect.width() + "x" + rect.height() + ")";
    }

    public static Size g(int i13, Size size) {
        com.bumptech.glide.d.g("Invalid rotation degrees: " + i13, i13 % 90 == 0);
        return c(h(i13)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static int h(int i13) {
        return ((i13 % 360) + 360) % 360;
    }
}

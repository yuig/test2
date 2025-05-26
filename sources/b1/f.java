package b1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import kh2.m0;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: i, reason: collision with root package name */
    public static final l f20798i = l.FILL_CENTER;

    /* renamed from: a, reason: collision with root package name */
    public Size f20799a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f20800b;

    /* renamed from: c, reason: collision with root package name */
    public int f20801c;

    /* renamed from: d, reason: collision with root package name */
    public Matrix f20802d;

    /* renamed from: e, reason: collision with root package name */
    public int f20803e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20804f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20805g;

    /* renamed from: h, reason: collision with root package name */
    public l f20806h;

    public final void a(Size size, int i13, Rect rect) {
        Matrix matrix;
        if (d()) {
            Matrix matrix2 = new Matrix();
            if (d()) {
                Matrix matrix3 = new Matrix(this.f20802d);
                matrix3.postConcat(c(i13, size));
                matrix = matrix3;
            } else {
                matrix = null;
            }
            matrix.invert(matrix2);
            Matrix matrix4 = new Matrix();
            matrix4.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
            matrix2.postConcat(matrix4);
        }
    }

    public final Size b() {
        return e0.u.c(this.f20801c) ? new Size(this.f20800b.height(), this.f20800b.width()) : new Size(this.f20800b.width(), this.f20800b.height());
    }

    public final Matrix c(int i13, Size size) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        com.bumptech.glide.d.v(null, d());
        if (e0.u.d(size, true, b())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size b13 = b();
            RectF rectF3 = new RectF(0.0f, 0.0f, b13.getWidth(), b13.getHeight());
            Matrix matrix = new Matrix();
            l lVar = this.f20806h;
            switch (e.f20797a[lVar.ordinal()]) {
                case 1:
                case 2:
                    scaleToFit = Matrix.ScaleToFit.CENTER;
                    break;
                case 3:
                case 4:
                    scaleToFit = Matrix.ScaleToFit.END;
                    break;
                case 5:
                case 6:
                    scaleToFit = Matrix.ScaleToFit.START;
                    break;
                default:
                    m0.s("PreviewTransform", "Unexpected crop rect: " + lVar);
                    scaleToFit = Matrix.ScaleToFit.FILL;
                    break;
            }
            if (lVar == l.FIT_CENTER || lVar == l.FIT_START || lVar == l.FIT_END) {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            } else {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            }
            matrix.mapRect(rectF3);
            if (i13 == 1) {
                float width = size.getWidth() / 2.0f;
                float f13 = width + width;
                rectF = new RectF(f13 - rectF3.right, rectF3.top, f13 - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        Matrix a13 = e0.u.a(this.f20801c, new RectF(this.f20800b), rectF, false);
        if (this.f20804f && this.f20805g) {
            if (e0.u.c(this.f20801c)) {
                a13.preScale(1.0f, -1.0f, this.f20800b.centerX(), this.f20800b.centerY());
            } else {
                a13.preScale(-1.0f, 1.0f, this.f20800b.centerX(), this.f20800b.centerY());
            }
        }
        return a13;
    }

    public final boolean d() {
        return (this.f20800b == null || this.f20799a == null || !(!this.f20805g || this.f20803e != -1)) ? false : true;
    }
}

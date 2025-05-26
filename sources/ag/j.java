package ag;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f15114a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f15115b = new RectF();

    /* renamed from: c, reason: collision with root package name */
    public float f15116c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f15117d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public final float f15118e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public final float f15119f = Float.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public final float f15120g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public final float f15121h = Float.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public float f15122i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f15123j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f15124k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f15125l;

    public j() {
        new Matrix();
        this.f15125l = new float[9];
    }

    public final boolean a() {
        float f13 = this.f15122i;
        float f14 = this.f15120g;
        return f13 <= f14 && f14 <= 1.0f;
    }

    public final boolean b() {
        float f13 = this.f15123j;
        float f14 = this.f15118e;
        return f13 <= f14 && f14 <= 1.0f;
    }

    public final boolean c(float f13) {
        return this.f15115b.left <= f13 + 1.0f;
    }

    public final boolean d(float f13) {
        return this.f15115b.right >= (((float) ((int) (f13 * 100.0f))) / 100.0f) - 1.0f;
    }

    public final boolean e(float f13) {
        RectF rectF = this.f15115b;
        if (rectF.top <= f13) {
            if (rectF.bottom >= ((int) (f13 * 100.0f)) / 100.0f) {
                return true;
            }
        }
        return false;
    }

    public final float f() {
        return this.f15117d - this.f15115b.bottom;
    }

    public final void g(Matrix matrix, View view, boolean z13) {
        float f13;
        float f14;
        Matrix matrix2 = this.f15114a;
        matrix2.set(matrix);
        RectF rectF = this.f15115b;
        float[] fArr = this.f15125l;
        matrix2.getValues(fArr);
        float f15 = fArr[2];
        float f16 = fArr[0];
        float f17 = fArr[5];
        float f18 = fArr[4];
        this.f15122i = Math.min(Math.max(this.f15120g, f16), this.f15121h);
        this.f15123j = Math.min(Math.max(this.f15118e, f18), this.f15119f);
        if (rectF != null) {
            f14 = rectF.width();
            f13 = rectF.height();
        } else {
            f13 = 0.0f;
            f14 = 0.0f;
        }
        this.f15124k = Math.min(Math.max(f15, ((this.f15122i - 1.0f) * (-f14)) - 0.0f), 0.0f);
        float max = Math.max(Math.min(f17, ((this.f15123j - 1.0f) * f13) + 0.0f), -0.0f);
        fArr[2] = this.f15124k;
        fArr[0] = this.f15122i;
        fArr[5] = max;
        fArr[4] = this.f15123j;
        matrix2.setValues(fArr);
        if (z13) {
            view.invalidate();
        }
        matrix.set(matrix2);
    }

    public final void h(float f13, float f14, float f15, float f16) {
        this.f15115b.set(f13, f14, this.f15116c - f15, this.f15117d - f16);
    }
}

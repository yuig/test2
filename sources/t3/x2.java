package t3;

import android.graphics.Matrix;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f116261a;

    /* renamed from: b, reason: collision with root package name */
    public Matrix f116262b;

    /* renamed from: c, reason: collision with root package name */
    public Matrix f116263c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f116264d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f116265e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f116266f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f116267g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f116268h = true;

    public x2(Function2 function2) {
        this.f116261a = function2;
    }

    public final float[] a(Object obj) {
        float[] fArr = this.f116265e;
        if (fArr == null) {
            fArr = b3.i0.a();
            this.f116265e = fArr;
        }
        if (this.f116267g) {
            this.f116268h = d7.b.d0(b(obj), fArr);
            this.f116267g = false;
        }
        if (this.f116268h) {
            return fArr;
        }
        return null;
    }

    public final float[] b(Object obj) {
        float[] fArr = this.f116264d;
        if (fArr == null) {
            fArr = b3.i0.a();
            this.f116264d = fArr;
        }
        if (!this.f116266f) {
            return fArr;
        }
        Matrix matrix = this.f116262b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f116262b = matrix;
        }
        this.f116261a.invoke(obj, matrix);
        Matrix matrix2 = this.f116263c;
        if (matrix2 == null || !Intrinsics.d(matrix, matrix2)) {
            androidx.compose.ui.graphics.a.s(matrix, fArr);
            this.f116262b = matrix2;
            this.f116263c = matrix;
        }
        this.f116266f = false;
        return fArr;
    }

    public final void c() {
        this.f116266f = true;
        this.f116267g = true;
    }
}

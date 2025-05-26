package l7;

import android.graphics.Matrix;

/* loaded from: classes3.dex */
public final class o0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f81837a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81838b;

    /* renamed from: c, reason: collision with root package name */
    public float f81839c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public final int f81840d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f81841e = 9729;

    /* renamed from: f, reason: collision with root package name */
    public float f81842f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f81843g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public Matrix f81844h = new Matrix();

    public o0(int i13, int i14) {
        this.f81837a = i13;
        this.f81838b = i14;
    }

    public static o0 f(int i13, int i14) {
        bf.b.h("width " + i13 + " must be positive", i13 > 0);
        bf.b.h("height " + i14 + " must be positive", i14 > 0);
        return new o0(i13, i14);
    }

    @Override // l7.m0
    public final Matrix b() {
        Matrix matrix = this.f81844h;
        bf.b.x(matrix, "configure must be called first");
        return matrix;
    }

    @Override // l7.m0
    public final int d() {
        return this.f81841e;
    }

    @Override // l7.m0
    public final d7.f0 e(int i13, int i14) {
        bf.b.h("inputWidth must be positive", i13 > 0);
        bf.b.h("inputHeight must be positive", i14 > 0);
        Matrix matrix = new Matrix();
        this.f81844h = matrix;
        float f13 = i13;
        this.f81842f = f13;
        float f14 = i14;
        this.f81843g = f14;
        int i15 = this.f81838b;
        int i16 = this.f81837a;
        if (i16 != -1 && i15 != -1) {
            this.f81839c = i16 / i15;
        }
        float f15 = this.f81839c;
        if (f15 != -1.0f) {
            float f16 = f13 / f14;
            int i17 = this.f81840d;
            if (i17 == 0) {
                if (f15 > f16) {
                    matrix.setScale(f16 / f15, 1.0f);
                    this.f81842f = this.f81843g * this.f81839c;
                } else {
                    matrix.setScale(1.0f, f15 / f16);
                    this.f81843g = this.f81842f / this.f81839c;
                }
            } else if (i17 == 1) {
                if (f15 > f16) {
                    matrix.setScale(1.0f, f15 / f16);
                    this.f81843g = this.f81842f / this.f81839c;
                } else {
                    matrix.setScale(f16 / f15, 1.0f);
                    this.f81842f = this.f81843g * this.f81839c;
                }
            } else if (i17 == 2) {
                if (f15 > f16) {
                    this.f81842f = f14 * f15;
                } else {
                    this.f81843g = f13 / f15;
                }
            }
        }
        if (i15 != -1) {
            if (i16 != -1) {
                this.f81842f = i16;
            } else {
                this.f81842f = (i15 * this.f81842f) / this.f81843g;
            }
            this.f81843g = i15;
        }
        return new d7.f0(Math.round(this.f81842f), Math.round(this.f81843g));
    }
}

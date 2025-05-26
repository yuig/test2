package t4;

import kh2.c3;

/* loaded from: classes3.dex */
public final class c extends c3 {

    /* renamed from: a, reason: collision with root package name */
    public double f116345a;

    /* renamed from: b, reason: collision with root package name */
    public double[] f116346b;

    @Override // kh2.c3
    public final double F(double d2) {
        return this.f116346b[0];
    }

    @Override // kh2.c3
    public final void G(double d2, double[] dArr) {
        double[] dArr2 = this.f116346b;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // kh2.c3
    public final void H(double d2, float[] fArr) {
        int i13 = 0;
        while (true) {
            double[] dArr = this.f116346b;
            if (i13 >= dArr.length) {
                return;
            }
            fArr[i13] = (float) dArr[i13];
            i13++;
        }
    }

    @Override // kh2.c3
    public final double I(double d2) {
        return 0.0d;
    }

    @Override // kh2.c3
    public final void J(double d2, double[] dArr) {
        for (int i13 = 0; i13 < this.f116346b.length; i13++) {
            dArr[i13] = 0.0d;
        }
    }

    @Override // kh2.c3
    public final double[] K() {
        return new double[]{this.f116345a};
    }
}

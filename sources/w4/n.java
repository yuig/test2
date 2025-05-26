package w4;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import kh2.c3;
import kh2.k3;

/* loaded from: classes3.dex */
public final class n extends q {

    /* renamed from: g, reason: collision with root package name */
    public String f127941g;

    /* renamed from: h, reason: collision with root package name */
    public SparseArray f127942h;

    /* renamed from: i, reason: collision with root package name */
    public SparseArray f127943i;

    /* renamed from: j, reason: collision with root package name */
    public float[] f127944j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f127945k;

    @Override // t4.p
    public final void a(int i13) {
        SparseArray sparseArray = this.f127942h;
        int size = sparseArray.size();
        int d2 = ((androidx.constraintlayout.widget.c) sparseArray.valueAt(0)).d();
        double[] dArr = new double[size];
        int i14 = d2 + 2;
        this.f127944j = new float[i14];
        this.f127945k = new float[d2];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i14);
        for (int i15 = 0; i15 < size; i15++) {
            int keyAt = sparseArray.keyAt(i15);
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) sparseArray.valueAt(i15);
            float[] fArr = (float[]) this.f127943i.valueAt(i15);
            dArr[i15] = keyAt * 0.01d;
            cVar.c(this.f127944j);
            int i16 = 0;
            while (true) {
                if (i16 < this.f127944j.length) {
                    dArr2[i15][i16] = r8[i16];
                    i16++;
                }
            }
            double[] dArr3 = dArr2[i15];
            dArr3[d2] = fArr[0];
            dArr3[d2 + 1] = fArr[1];
        }
        this.f116400a = c3.x(i13, dArr, dArr2);
    }

    @Override // w4.q
    public final boolean c(float f13, long j13, View view, t4.f fVar) {
        this.f116400a.H(f13, this.f127944j);
        float[] fArr = this.f127944j;
        float f14 = fArr[fArr.length - 2];
        float f15 = fArr[fArr.length - 1];
        long j14 = j13 - this.f116404e;
        if (Float.isNaN(this.f116405f)) {
            float a13 = fVar.a(this.f127941g, view);
            this.f116405f = a13;
            if (Float.isNaN(a13)) {
                this.f116405f = 0.0f;
            }
        }
        this.f116405f = (float) ((((j14 * 1.0E-9d) * f14) + this.f116405f) % 1.0d);
        this.f116404e = j13;
        float sin = (float) Math.sin(r15 * 6.2831855f);
        this.f116403d = false;
        int i13 = 0;
        while (true) {
            float[] fArr2 = this.f127945k;
            if (i13 >= fArr2.length) {
                break;
            }
            boolean z13 = this.f116403d;
            float f16 = this.f127944j[i13];
            this.f116403d = z13 | (((double) f16) != 0.0d);
            fArr2[i13] = (f16 * sin) + f15;
            i13++;
        }
        k3.P1((androidx.constraintlayout.widget.c) this.f127942h.valueAt(0), view, this.f127945k);
        if (f14 != 0.0f) {
            this.f116403d = true;
        }
        return this.f116403d;
    }
}

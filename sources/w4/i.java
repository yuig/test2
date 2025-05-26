package w4;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import kh2.c3;
import kh2.k3;

/* loaded from: classes3.dex */
public final class i extends l {

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f127932f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f127933g;

    @Override // w4.l
    public final void b(int i13, float f13) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    }

    @Override // w4.l
    public final void c(View view, float f13) {
        this.f127935a.H(f13, this.f127933g);
        k3.P1((androidx.constraintlayout.widget.c) this.f127932f.valueAt(0), view, this.f127933g);
    }

    @Override // w4.l
    public final void d(int i13) {
        SparseArray sparseArray = this.f127932f;
        int size = sparseArray.size();
        int d2 = ((androidx.constraintlayout.widget.c) sparseArray.valueAt(0)).d();
        double[] dArr = new double[size];
        this.f127933g = new float[d2];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, d2);
        for (int i14 = 0; i14 < size; i14++) {
            int keyAt = sparseArray.keyAt(i14);
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) sparseArray.valueAt(i14);
            dArr[i14] = keyAt * 0.01d;
            cVar.c(this.f127933g);
            int i15 = 0;
            while (true) {
                if (i15 < this.f127933g.length) {
                    dArr2[i14][i15] = r7[i15];
                    i15++;
                }
            }
        }
        this.f127935a = c3.x(i13, dArr, dArr2);
    }
}

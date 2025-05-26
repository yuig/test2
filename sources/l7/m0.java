package l7;

import android.content.Context;
import android.graphics.Matrix;
import pk.c1;
import pk.v2;

/* loaded from: classes3.dex */
public interface m0 extends e0 {
    @Override // l7.e0
    default i0 a(Context context, boolean z13) {
        return m.i(context, c1.v(this), v2.f100502e, z13);
    }

    Matrix b();

    default float[] c(long j13) {
        float[] fArr = new float[9];
        b().getValues(fArr);
        float[] fArr2 = new float[16];
        fArr2[10] = 1.0f;
        int i13 = 0;
        while (i13 < 3) {
            int i14 = 0;
            while (i14 < 3) {
                fArr2[((i13 == 2 ? 3 : i13) * 4) + (i14 == 2 ? 3 : i14)] = fArr[(i13 * 3) + i14];
                i14++;
            }
            i13++;
        }
        float[] fArr3 = new float[16];
        android.opengl.Matrix.transposeM(fArr3, 0, fArr2, 0);
        return fArr3;
    }

    /* bridge */ /* synthetic */ default int d() {
        return 9729;
    }

    default d7.f0 e(int i13, int i14) {
        return new d7.f0(i13, i14);
    }
}

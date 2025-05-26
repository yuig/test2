package c81;

import android.graphics.Matrix;
import nm.q;
import nm.s;
import nm.w;

/* loaded from: classes5.dex */
public final class a implements w {
    @Override // nm.w
    public final s serialize(Object obj) {
        Matrix matrix = (Matrix) obj;
        q qVar = new q();
        float[] fArr = new float[9];
        for (int i13 = 0; i13 < 9; i13++) {
            fArr[i13] = 0.0f;
        }
        if (matrix != null) {
            matrix.getValues(fArr);
        }
        for (int i14 = 0; i14 < 9; i14++) {
            qVar.r(Float.valueOf(fArr[i14]));
        }
        return qVar;
    }
}

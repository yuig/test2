package ua;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* loaded from: classes3.dex */
public final class w0 implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f121363a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f121364b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f121365c = new Matrix();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f13, Object obj, Object obj2) {
        float[] fArr = this.f121363a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f121364b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i13 = 0; i13 < 9; i13++) {
            float f14 = fArr2[i13];
            float f15 = fArr[i13];
            fArr2[i13] = ep.b.a(f14, f15, f13, f15);
        }
        Matrix matrix = this.f121365c;
        matrix.setValues(fArr2);
        return matrix;
    }
}

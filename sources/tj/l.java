package tj;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* loaded from: classes3.dex */
public final class l implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f117803a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f117804b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f117805c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f117806d;

    public l(q qVar) {
        this.f117806d = qVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f13, Object obj, Object obj2) {
        this.f117806d.f117838o = f13;
        float[] fArr = this.f117803a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f117804b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i13 = 0; i13 < 9; i13++) {
            float f14 = fArr2[i13];
            float f15 = fArr[i13];
            fArr2[i13] = ep.b.a(f14, f15, f13, f15);
        }
        Matrix matrix = this.f117805c;
        matrix.setValues(fArr2);
        return matrix;
    }
}

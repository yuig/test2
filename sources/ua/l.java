package ua;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f121295a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final View f121296b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f121297c;

    /* renamed from: d, reason: collision with root package name */
    public float f121298d;

    /* renamed from: e, reason: collision with root package name */
    public float f121299e;

    public l(View view, float[] fArr) {
        this.f121296b = view;
        float[] fArr2 = (float[]) fArr.clone();
        this.f121297c = fArr2;
        this.f121298d = fArr2[2];
        this.f121299e = fArr2[5];
        a();
    }

    public final void a() {
        float f13 = this.f121298d;
        float[] fArr = this.f121297c;
        fArr[2] = f13;
        fArr[5] = this.f121299e;
        Matrix matrix = this.f121295a;
        matrix.setValues(fArr);
        b1.f121223a.k(this.f121296b, matrix);
    }
}

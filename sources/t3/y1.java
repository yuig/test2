package t3;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes2.dex */
public final class y1 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f116279a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f116280b = new int[2];

    public y1(float[] fArr) {
        this.f116279a = fArr;
    }

    @Override // t3.x1
    public final void a(View view, float[] fArr) {
        b3.i0.d(fArr);
        b(view, fArr);
    }

    public final void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z13 = parent instanceof View;
        float[] fArr2 = this.f116279a;
        if (z13) {
            b((View) parent, fArr);
            b3.i0.d(fArr2);
            b3.i0.h(fArr2, -view.getScrollX(), -view.getScrollY(), 0.0f);
            d1.c(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            b3.i0.d(fArr2);
            b3.i0.h(fArr2, left, top, 0.0f);
            d1.c(fArr, fArr2);
        } else {
            int[] iArr = this.f116280b;
            view.getLocationInWindow(iArr);
            b3.i0.d(fArr2);
            b3.i0.h(fArr2, -view.getScrollX(), -view.getScrollY(), 0.0f);
            d1.c(fArr, fArr2);
            float f13 = iArr[0];
            float f14 = iArr[1];
            b3.i0.d(fArr2);
            b3.i0.h(fArr2, f13, f14, 0.0f);
            d1.c(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        androidx.compose.ui.graphics.a.s(matrix, fArr2);
        d1.c(fArr, fArr2);
    }
}

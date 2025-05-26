package ua;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes3.dex */
public final class k1 extends i1 {
    @Override // ua.k0
    public final float f(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // ua.k0
    public final void h(View view, float f13) {
        view.setTransitionAlpha(f13);
    }

    @Override // ua.i1, ua.k0
    public final void i(View view, int i13) {
        view.setTransitionVisibility(i13);
    }

    @Override // ua.e1
    public final void k(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // ua.e1
    public final void l(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // ua.e1
    public final void m(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // ua.g1
    public final void n(View view, int i13, int i14, int i15, int i16) {
        view.setLeftTopRightBottom(i13, i14, i15, i16);
    }
}

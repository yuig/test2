package t3;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class z1 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f116287a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f116288b = new int[2];

    @Override // t3.x1
    public void a(@NotNull View view, @NotNull float[] fArr) {
        Matrix matrix = this.f116287a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f116288b;
        view.getLocationOnScreen(iArr);
        int i13 = iArr[0];
        int i14 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i13, iArr[1] - i14);
        androidx.compose.ui.graphics.a.s(matrix, fArr);
    }
}

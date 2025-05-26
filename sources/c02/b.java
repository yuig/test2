package c02;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.y2;

/* loaded from: classes4.dex */
public final class b extends q7.s implements p {
    public b(long j13) {
        super(j13, 0L, new LinearInterpolator());
    }

    @Override // c02.p
    public final ViewPropertyAnimator C(ViewPropertyAnimator viewPropertyAnimator, q qVar, boolean z13) {
        return z13 ? viewPropertyAnimator.translationX(qVar.f24453e - qVar.f24451c).translationY(qVar.f24454f - qVar.f24452d).alpha(0.0f) : viewPropertyAnimator.translationX(0.0f).translationY(0.0f).alpha(1.0f);
    }

    @Override // c02.p
    public final void i(y2 y2Var, boolean z13) {
        if (z13) {
            return;
        }
        y2Var.f19717a.setAlpha(0.0f);
    }

    @Override // c02.p
    public final void s(y2 y2Var) {
        View view = y2Var.f19717a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
    }
}

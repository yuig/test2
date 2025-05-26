package c02;

import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.y2;

/* loaded from: classes2.dex */
public final class h extends q7.s implements t {
    public h() {
        super(120L, 0L, i.f24438a);
    }

    @Override // c02.t
    public final void d(y2 y2Var) {
        y2Var.f19717a.setAlpha(1.0f);
    }

    @Override // c02.t
    public final ViewPropertyAnimator e(ViewPropertyAnimator viewPropertyAnimator) {
        return viewPropertyAnimator.alpha(0.0f);
    }
}

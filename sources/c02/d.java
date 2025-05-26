package c02;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.y2;

/* loaded from: classes4.dex */
public final class d extends q7.s implements t {
    public d(long j13) {
        this(j13, 0);
    }

    @Override // c02.t
    public final void d(y2 y2Var) {
        View view = y2Var.f19717a;
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    @Override // c02.t
    public final ViewPropertyAnimator e(ViewPropertyAnimator viewPropertyAnimator) {
        return viewPropertyAnimator.alpha(0.0f).translationY(hf0.b.f69003c);
    }

    public d(long j13, int i13) {
        super(j13, 0L, new AccelerateDecelerateInterpolator());
    }
}

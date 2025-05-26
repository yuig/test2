package c02;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.y2;

/* loaded from: classes2.dex */
public final class f extends q7.s implements p {

    /* renamed from: d, reason: collision with root package name */
    public boolean f24437d;

    public f() {
        super(250L, 0L, i.f24440c);
    }

    @Override // c02.p
    public final ViewPropertyAnimator C(ViewPropertyAnimator viewPropertyAnimator, q qVar, boolean z13) {
        return z13 ? viewPropertyAnimator.translationX(qVar.f24453e - qVar.f24451c).translationY(qVar.f24454f - qVar.f24452d).alpha(0.0f) : viewPropertyAnimator.translationX(0.0f).translationY(0.0f).alpha(1.0f);
    }

    @Override // c02.p
    public final void i(y2 y2Var, boolean z13) {
        View view = y2Var.f19717a;
        this.f24437d = view.isEnabled();
        view.setEnabled(false);
    }

    @Override // c02.p
    public final void s(y2 y2Var) {
        View view = y2Var.f19717a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
        view.setEnabled(this.f24437d);
    }
}

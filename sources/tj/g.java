package tj;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import oi.u6;

/* loaded from: classes3.dex */
public final class g extends a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f117793g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ExtendedFloatingActionButton extendedFloatingActionButton, u6 u6Var) {
        super(extendedFloatingActionButton, u6Var);
        this.f117793g = extendedFloatingActionButton;
    }

    @Override // tj.a
    public final int c() {
        return fj.b.mtrl_extended_fab_show_motion_spec;
    }

    @Override // tj.a
    public final void e() {
        this.f117766d.f95225b = null;
        this.f117793g.f32618u = 0;
    }

    @Override // tj.a
    public final void f(Animator animator) {
        u6 u6Var = this.f117766d;
        Animator animator2 = (Animator) u6Var.f95225b;
        if (animator2 != null) {
            animator2.cancel();
        }
        u6Var.f95225b = animator;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f117793g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.f32618u = 2;
    }

    @Override // tj.a
    public final void g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f117793g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // tj.a
    public final boolean h() {
        int i13 = ExtendedFloatingActionButton.I;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f117793g;
        if (extendedFloatingActionButton.getVisibility() != 0) {
            if (extendedFloatingActionButton.f32618u != 2) {
                return false;
            }
        } else if (extendedFloatingActionButton.f32618u == 1) {
            return false;
        }
        return true;
    }
}

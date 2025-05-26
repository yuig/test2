package tj;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import oi.u6;

/* loaded from: classes3.dex */
public final class f extends a {

    /* renamed from: g, reason: collision with root package name */
    public boolean f117791g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f117792h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ExtendedFloatingActionButton extendedFloatingActionButton, u6 u6Var) {
        super(extendedFloatingActionButton, u6Var);
        this.f117792h = extendedFloatingActionButton;
    }

    @Override // tj.a
    public final int c() {
        return fj.b.mtrl_extended_fab_hide_motion_spec;
    }

    @Override // tj.a
    public final void d() {
        super.d();
        this.f117791g = true;
    }

    @Override // tj.a
    public final void e() {
        this.f117766d.f95225b = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f117792h;
        extendedFloatingActionButton.f32618u = 0;
        if (this.f117791g) {
            return;
        }
        extendedFloatingActionButton.setVisibility(8);
    }

    @Override // tj.a
    public final void f(Animator animator) {
        u6 u6Var = this.f117766d;
        Animator animator2 = (Animator) u6Var.f95225b;
        if (animator2 != null) {
            animator2.cancel();
        }
        u6Var.f95225b = animator;
        this.f117791g = false;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f117792h;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.f32618u = 1;
    }

    @Override // tj.a
    public final void g() {
        this.f117792h.setVisibility(8);
    }

    @Override // tj.a
    public final boolean h() {
        int i13 = ExtendedFloatingActionButton.I;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f117792h;
        if (extendedFloatingActionButton.getVisibility() == 0) {
            if (extendedFloatingActionButton.f32618u != 1) {
                return false;
            }
        } else if (extendedFloatingActionButton.f32618u == 2) {
            return false;
        }
        return true;
    }
}

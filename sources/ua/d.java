package ua;

import android.view.ViewGroup;
import androidx.transition.Transition;

/* loaded from: classes3.dex */
public final class d extends r0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f121240a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f121241b;

    public d(ViewGroup viewGroup) {
        this.f121241b = viewGroup;
    }

    @Override // ua.r0, ua.o0
    public final void a() {
        k0.j(this.f121241b, false);
    }

    @Override // ua.r0, ua.o0
    public final void d() {
        k0.j(this.f121241b, true);
    }

    @Override // ua.o0
    public final void f(Transition transition) {
        if (!this.f121240a) {
            k0.j(this.f121241b, false);
        }
        transition.I(this);
    }

    @Override // ua.r0, ua.o0
    public final void g(Transition transition) {
        k0.j(this.f121241b, false);
        this.f121240a = true;
    }
}

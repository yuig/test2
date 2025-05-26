package ua;

import androidx.transition.Transition;
import androidx.transition.TransitionSet;

/* loaded from: classes3.dex */
public final class u0 extends r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121361a;

    /* renamed from: b, reason: collision with root package name */
    public final TransitionSet f121362b;

    public u0(TransitionSet transitionSet, int i13) {
        this.f121361a = i13;
        if (i13 != 1) {
            this.f121362b = transitionSet;
        } else {
            this.f121362b = transitionSet;
        }
    }

    @Override // ua.r0, ua.o0
    public final void e(Transition transition) {
        switch (this.f121361a) {
            case 1:
                TransitionSet transitionSet = this.f121362b;
                if (!transitionSet.K) {
                    transitionSet.S();
                    this.f121362b.K = true;
                    break;
                }
                break;
        }
    }

    @Override // ua.o0
    public final void f(Transition transition) {
        switch (this.f121361a) {
            case 1:
                TransitionSet transitionSet = this.f121362b;
                int i13 = transitionSet.f19859J - 1;
                transitionSet.f19859J = i13;
                if (i13 == 0) {
                    transitionSet.K = false;
                    transitionSet.s();
                }
                transition.I(this);
                break;
        }
    }

    @Override // ua.r0, ua.o0
    public final void g(Transition transition) {
        switch (this.f121361a) {
            case 0:
                this.f121362b.H.remove(transition);
                if (!this.f121362b.C()) {
                    Transition transition2 = this.f121362b;
                    transition2.G(transition2, p0.Zo);
                    Transition transition3 = this.f121362b;
                    transition3.f19855w = true;
                    transition3.G(transition3, p0.Yo);
                    break;
                }
                break;
        }
    }
}

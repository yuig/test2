package p4;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import s3.a2;
import t3.c0;
import z2.a0;
import z2.z;

/* loaded from: classes.dex */
public final class q extends u2.p implements z2.q, ViewTreeObserver.OnGlobalFocusChangeListener, View.OnAttachStateChangeListener {

    /* renamed from: n, reason: collision with root package name */
    public View f98837n;

    @Override // u2.p
    public final void D0() {
        k.c(this).addOnAttachStateChangeListener(this);
    }

    @Override // u2.p
    public final void E0() {
        k.c(this).removeOnAttachStateChangeListener(this);
        this.f98837n = null;
    }

    public final z M0() {
        u2.p pVar = this.f120042a;
        if (!pVar.f120054m) {
            jk.r.y("visitLocalDescendants called on an unattached node");
            throw null;
        }
        if ((pVar.f120045d & 1024) != 0) {
            boolean z13 = false;
            for (u2.p pVar2 = pVar.f120047f; pVar2 != null; pVar2 = pVar2.f120047f) {
                if ((pVar2.f120044c & 1024) != 0) {
                    u2.p pVar3 = pVar2;
                    k2.e eVar = null;
                    while (pVar3 != null) {
                        if (pVar3 instanceof z) {
                            z zVar = (z) pVar3;
                            if (z13) {
                                return zVar;
                            }
                            z13 = true;
                        } else if ((pVar3.f120044c & 1024) != 0 && (pVar3 instanceof s3.n)) {
                            int i13 = 0;
                            for (u2.p pVar4 = ((s3.n) pVar3).f110843o; pVar4 != null; pVar4 = pVar4.f120047f) {
                                if ((pVar4.f120044c & 1024) != 0) {
                                    i13++;
                                    if (i13 == 1) {
                                        pVar3 = pVar4;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new k2.e(new u2.p[16]);
                                        }
                                        if (pVar3 != null) {
                                            eVar.b(pVar3);
                                            pVar3 = null;
                                        }
                                        eVar.b(pVar4);
                                    }
                                }
                            }
                            if (i13 == 1) {
                            }
                        }
                        pVar3 = com.bumptech.glide.c.g(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper".toString());
    }

    @Override // z2.q
    public final void Z(z2.n nVar) {
        nVar.b(false);
        nVar.d(new p(this, 0));
        nVar.a(new p(this, 1));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (com.bumptech.glide.c.U0(this).f110821i == null) {
            return;
        }
        View c13 = k.c(this);
        c0 c0Var = (c0) com.bumptech.glide.c.V0(this);
        a2 V0 = com.bumptech.glide.c.V0(this);
        boolean z13 = (view == null || Intrinsics.d(view, V0) || !k.a(c13, view)) ? false : true;
        boolean z14 = (view2 == null || Intrinsics.d(view2, V0) || !k.a(c13, view2)) ? false : true;
        if (z13 && z14) {
            this.f98837n = view2;
            return;
        }
        androidx.compose.ui.focus.b bVar = c0Var.f115877e;
        if (!z14) {
            if (!z13) {
                this.f98837n = null;
                return;
            }
            this.f98837n = null;
            if (M0().N0().isFocused()) {
                bVar.b(8, false, false);
                return;
            }
            return;
        }
        this.f98837n = view2;
        z M0 = M0();
        if (M0.N0().getHasFocus()) {
            return;
        }
        a0 a0Var = bVar.f17411h;
        try {
            if (a0Var.f140603c) {
                a0.a(a0Var);
            }
            a0Var.f140603c = true;
            androidx.compose.ui.focus.a.A(M0);
            a0.b(a0Var);
        } catch (Throwable th3) {
            a0.b(a0Var);
            throw th3;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}

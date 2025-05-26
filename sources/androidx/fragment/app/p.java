package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f18393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f18394b;

    public p(q qVar, d0 d0Var) {
        this.f18394b = qVar;
        this.f18393a = d0Var;
    }

    @Override // androidx.fragment.app.d0
    public final View b(int i13) {
        d0 d0Var = this.f18393a;
        if (d0Var.c()) {
            return d0Var.b(i13);
        }
        Dialog dialog = this.f18394b.f18416l;
        if (dialog != null) {
            return dialog.findViewById(i13);
        }
        return null;
    }

    @Override // androidx.fragment.app.d0
    public final boolean c() {
        return this.f18393a.c() || this.f18394b.f18420p;
    }
}

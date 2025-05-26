package androidx.fragment.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: c, reason: collision with root package name */
    public final Object f18337c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18338d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f18339e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z1 operation, j5.d signal, boolean z13, boolean z14) {
        super(operation, signal);
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(signal, "signal");
        x1 x1Var = operation.f18508a;
        x1 x1Var2 = x1.VISIBLE;
        Fragment fragment = operation.f18510c;
        this.f18337c = x1Var == x1Var2 ? z13 ? fragment.getReenterTransition() : fragment.getEnterTransition() : z13 ? fragment.getReturnTransition() : fragment.getExitTransition();
        this.f18338d = operation.f18508a == x1Var2 ? z13 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
        this.f18339e = z14 ? z13 ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
    }

    public final o1 c() {
        Object obj = this.f18337c;
        o1 d2 = d(obj);
        Object obj2 = this.f18339e;
        o1 d13 = d(obj2);
        if (d2 == null || d13 == null || d2 == d13) {
            return d2 == null ? d13 : d2;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f18322a.f18510c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final o1 d(Object obj) {
        if (obj == null) {
            return null;
        }
        m1 m1Var = h1.f18342a;
        if (m1Var.e(obj)) {
            return m1Var;
        }
        o1 o1Var = h1.f18343b;
        if (o1Var != null && o1Var.e(obj)) {
            return o1Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f18322a.f18510c + " is not a valid framework Transition or AndroidX Transition");
    }

    public final boolean e() {
        return this.f18339e != null;
    }
}

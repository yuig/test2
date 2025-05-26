package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121773a;

    /* renamed from: b, reason: collision with root package name */
    public final tc0.y f121774b;

    public e0(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121773a = i13;
        this.f121774b = displayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f121773a == e0Var.f121773a && Intrinsics.d(this.f121774b, e0Var.f121774b);
    }

    public final int hashCode() {
        return this.f121774b.hashCode() + (Integer.hashCode(this.f121773a) * 31);
    }

    public final String toString() {
        return "DividerDisplayState(title=" + this.f121773a + ", displayState=" + this.f121774b + ")";
    }
}

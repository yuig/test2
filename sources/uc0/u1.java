package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121868a;

    /* renamed from: b, reason: collision with root package name */
    public final tc0.y f121869b;

    public u1(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121868a = i13;
        this.f121869b = displayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return this.f121868a == u1Var.f121868a && Intrinsics.d(this.f121869b, u1Var.f121869b);
    }

    public final int hashCode() {
        return this.f121869b.hashCode() + (Integer.hashCode(this.f121868a) * 31);
    }

    public final String toString() {
        return "RadioGroupDisplayState(title=" + this.f121868a + ", displayState=" + this.f121869b + ")";
    }
}

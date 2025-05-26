package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final tc0.y f121777a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121778b;

    public e2(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121777a = displayState;
        this.f121778b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return Intrinsics.d(this.f121777a, e2Var.f121777a) && this.f121778b == e2Var.f121778b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121778b) + (this.f121777a.hashCode() * 31);
    }

    public final String toString() {
        return "TagPageDisplayState(displayState=" + this.f121777a + ", title=" + this.f121778b + ")";
    }
}

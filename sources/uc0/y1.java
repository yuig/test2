package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121885a;

    /* renamed from: b, reason: collision with root package name */
    public final tc0.y f121886b;

    public y1(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121885a = i13;
        this.f121886b = displayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return this.f121885a == y1Var.f121885a && Intrinsics.d(this.f121886b, y1Var.f121886b);
    }

    public final int hashCode() {
        return this.f121886b.hashCode() + (Integer.hashCode(this.f121885a) * 31);
    }

    public final String toString() {
        return "SelectListDisplayState(title=" + this.f121885a + ", displayState=" + this.f121886b + ")";
    }
}

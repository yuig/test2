package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121876a;

    /* renamed from: b, reason: collision with root package name */
    public final tc0.y f121877b;

    public w1(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121876a = i13;
        this.f121877b = displayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return this.f121876a == w1Var.f121876a && Intrinsics.d(this.f121877b, w1Var.f121877b);
    }

    public final int hashCode() {
        return this.f121877b.hashCode() + (Integer.hashCode(this.f121876a) * 31);
    }

    public final String toString() {
        return "SearchFieldPageDisplayState(title=" + this.f121876a + ", displayState=" + this.f121877b + ")";
    }
}

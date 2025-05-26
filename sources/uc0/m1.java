package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121828a;

    /* renamed from: b, reason: collision with root package name */
    public final tc0.y f121829b;

    public m1(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121828a = i13;
        this.f121829b = displayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.f121828a == m1Var.f121828a && Intrinsics.d(this.f121829b, m1Var.f121829b);
    }

    public final int hashCode() {
        return this.f121829b.hashCode() + (Integer.hashCode(this.f121828a) * 31);
    }

    public final String toString() {
        return "IndicatorDisplayState(title=" + this.f121828a + ", displayState=" + this.f121829b + ")";
    }
}

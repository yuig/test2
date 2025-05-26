package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final tc0.y f121850a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121851b;

    public q0(int i13, tc0.y generalDisplayState) {
        Intrinsics.checkNotNullParameter(generalDisplayState, "generalDisplayState");
        this.f121850a = generalDisplayState;
        this.f121851b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.d(this.f121850a, q0Var.f121850a) && this.f121851b == q0Var.f121851b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121851b) + (this.f121850a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderBarPageDisplayState(generalDisplayState=" + this.f121850a + ", titleRes=" + this.f121851b + ")";
    }
}

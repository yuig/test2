package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final tc0.y f121852a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121853b;

    public q1(int i13, tc0.y generalDisplayState) {
        Intrinsics.checkNotNullParameter(generalDisplayState, "generalDisplayState");
        this.f121852a = generalDisplayState;
        this.f121853b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return Intrinsics.d(this.f121852a, q1Var.f121852a) && this.f121853b == q1Var.f121853b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121853b) + (this.f121852a.hashCode() * 31);
    }

    public final String toString() {
        return "ModalAlertPageDisplayState(generalDisplayState=" + this.f121852a + ", titleRes=" + this.f121853b + ")";
    }
}

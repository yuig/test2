package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final tc0.y f121759a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121760b;

    public a2(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121759a = displayState;
        this.f121760b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return Intrinsics.d(this.f121759a, a2Var.f121759a) && this.f121760b == a2Var.f121760b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121760b) + (this.f121759a.hashCode() * 31);
    }

    public final String toString() {
        return "SpinnerPageDisplayState(displayState=" + this.f121759a + ", title=" + this.f121760b + ")";
    }
}

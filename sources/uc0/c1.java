package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121765a;

    /* renamed from: b, reason: collision with root package name */
    public final tc0.y f121766b;

    public c1(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121765a = i13;
        this.f121766b = displayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f121765a == c1Var.f121765a && Intrinsics.d(this.f121766b, c1Var.f121766b);
    }

    public final int hashCode() {
        return this.f121766b.hashCode() + (Integer.hashCode(this.f121765a) * 31);
    }

    public final String toString() {
        return "IconButtonFloatingDisplayState(title=" + this.f121765a + ", displayState=" + this.f121766b + ")";
    }
}

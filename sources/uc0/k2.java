package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121809a;

    /* renamed from: b, reason: collision with root package name */
    public final tc0.y f121810b;

    public k2(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121809a = i13;
        this.f121810b = displayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return this.f121809a == k2Var.f121809a && Intrinsics.d(this.f121810b, k2Var.f121810b);
    }

    public final int hashCode() {
        return this.f121810b.hashCode() + (Integer.hashCode(this.f121809a) * 31);
    }

    public final String toString() {
        return "TextPageDisplayState(title=" + this.f121809a + ", displayState=" + this.f121810b + ")";
    }
}

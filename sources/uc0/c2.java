package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final tc0.y f121767a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121768b;

    public c2(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121767a = displayState;
        this.f121768b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return Intrinsics.d(this.f121767a, c2Var.f121767a) && this.f121768b == c2Var.f121768b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121768b) + (this.f121767a.hashCode() * 31);
    }

    public final String toString() {
        return "SwitchPageDisplayState(displayState=" + this.f121767a + ", title=" + this.f121768b + ")";
    }
}

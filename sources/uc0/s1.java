package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final tc0.y f121860a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121861b;

    public s1(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121860a = displayState;
        this.f121861b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return Intrinsics.d(this.f121860a, s1Var.f121860a) && this.f121861b == s1Var.f121861b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121861b) + (this.f121860a.hashCode() * 31);
    }

    public final String toString() {
        return "PopoverMessagePageDisplayState(displayState=" + this.f121860a + ", title=" + this.f121861b + ")";
    }
}

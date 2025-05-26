package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final tc0.y f121775a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121776b;

    public e1(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121775a = displayState;
        this.f121776b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Intrinsics.d(this.f121775a, e1Var.f121775a) && this.f121776b == e1Var.f121776b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121776b) + (this.f121775a.hashCode() * 31);
    }

    public final String toString() {
        return "IconButtonPageDisplayState(displayState=" + this.f121775a + ", title=" + this.f121776b + ")";
    }
}

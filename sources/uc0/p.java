package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final tc0.y f121843a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121844b;

    public p(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121843a = displayState;
        this.f121844b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f121843a, pVar.f121843a) && this.f121844b == pVar.f121844b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121844b) + (this.f121843a.hashCode() * 31);
    }

    public final String toString() {
        return "ButtonPageDisplayState(displayState=" + this.f121843a + ", title=" + this.f121844b + ")";
    }
}

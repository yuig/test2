package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final tc0.y f121862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121863b;

    public t(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121862a = displayState;
        this.f121863b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f121862a, tVar.f121862a) && this.f121863b == tVar.f121863b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121863b) + (this.f121862a.hashCode() * 31);
    }

    public final String toString() {
        return "CalloutPageDisplayState(displayState=" + this.f121862a + ", title=" + this.f121863b + ")";
    }
}

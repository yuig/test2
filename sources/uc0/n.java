package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final tc0.y f121833a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121834b;

    public n(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121833a = displayState;
        this.f121834b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f121833a, nVar.f121833a) && this.f121834b == nVar.f121834b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121834b) + (this.f121833a.hashCode() * 31);
    }

    public final String toString() {
        return "ButtonGroupPageDisplayState(displayState=" + this.f121833a + ", title=" + this.f121834b + ")";
    }
}

package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final tc0.y f121752a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121753b;

    public a(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121752a = displayState;
        this.f121753b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f121752a, aVar.f121752a) && this.f121753b == aVar.f121753b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121753b) + (this.f121752a.hashCode() * 31);
    }

    public final String toString() {
        return "AttributionPageDisplayState(displayState=" + this.f121752a + ", title=" + this.f121753b + ")";
    }
}

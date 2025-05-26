package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f121763a;

    /* renamed from: b, reason: collision with root package name */
    public final tc0.y f121764b;

    public c(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121763a = i13;
        this.f121764b = displayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f121763a == cVar.f121763a && Intrinsics.d(this.f121764b, cVar.f121764b);
    }

    public final int hashCode() {
        return this.f121764b.hashCode() + (Integer.hashCode(this.f121763a) * 31);
    }

    public final String toString() {
        return "BadgePageDisplayState(title=" + this.f121763a + ", displayState=" + this.f121764b + ")";
    }
}

package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final tc0.y f121870a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121871b;

    public v(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121870a = displayState;
        this.f121871b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f121870a, vVar.f121870a) && this.f121871b == vVar.f121871b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121871b) + (this.f121870a.hashCode() * 31);
    }

    public final String toString() {
        return "CheckBoxPageDisplayState(displayState=" + this.f121870a + ", title=" + this.f121871b + ")";
    }
}

package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final tc0.y f121855a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121856b;

    public r(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121855a = displayState;
        this.f121856b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f121855a, rVar.f121855a) && this.f121856b == rVar.f121856b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121856b) + (this.f121855a.hashCode() * 31);
    }

    public final String toString() {
        return "ButtonSocialPageDisplayState(displayState=" + this.f121855a + ", title=" + this.f121856b + ")";
    }
}

package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121785a;

    /* renamed from: b, reason: collision with root package name */
    public final tc0.y f121786b;

    public g2(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121785a = i13;
        this.f121786b = displayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return this.f121785a == g2Var.f121785a && Intrinsics.d(this.f121786b, g2Var.f121786b);
    }

    public final int hashCode() {
        return this.f121786b.hashCode() + (Integer.hashCode(this.f121785a) * 31);
    }

    public final String toString() {
        return "TextAreaPageDisplayState(title=" + this.f121785a + ", displayState=" + this.f121786b + ")";
    }
}

package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121796a;

    /* renamed from: b, reason: collision with root package name */
    public final tc0.y f121797b;

    public i2(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121796a = i13;
        this.f121797b = displayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return this.f121796a == i2Var.f121796a && Intrinsics.d(this.f121797b, i2Var.f121797b);
    }

    public final int hashCode() {
        return this.f121797b.hashCode() + (Integer.hashCode(this.f121796a) * 31);
    }

    public final String toString() {
        return "TextFieldPageDisplayState(title=" + this.f121796a + ", displayState=" + this.f121797b + ")";
    }
}

package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121839a;

    /* renamed from: b, reason: collision with root package name */
    public final tc0.y f121840b;

    public o1(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121839a = i13;
        this.f121840b = displayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f121839a == o1Var.f121839a && Intrinsics.d(this.f121840b, o1Var.f121840b);
    }

    public final int hashCode() {
        return this.f121840b.hashCode() + (Integer.hashCode(this.f121839a) * 31);
    }

    public final String toString() {
        return "ListActionPageDisplayState(title=" + this.f121839a + ", displayState=" + this.f121840b + ")";
    }
}

package w80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f128273a;

    public d1(g1 g1Var) {
        this.f128273a = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && Intrinsics.d(this.f128273a, ((d1) obj).f128273a);
    }

    public final int hashCode() {
        g1 g1Var = this.f128273a;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.hashCode();
    }

    public final String toString() {
        return "DragBarDisplayState(currentPanel=" + this.f128273a + ")";
    }
}

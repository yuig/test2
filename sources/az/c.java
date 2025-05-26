package az;

import h32.z1;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes.dex */
public final class c implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f20696a;

    public c(z1 z1Var) {
        this.f20696a = z1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f20696a, ((c) obj).f20696a);
    }

    public final int hashCode() {
        z1 z1Var = this.f20696a;
        if (z1Var == null) {
            return 0;
        }
        return z1Var.hashCode();
    }

    public final String toString() {
        return "PinImpressionVmState(startingImpression=" + this.f20696a + ")";
    }
}

package i2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h0 implements z3 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f71123a = m1.f.f85333j;

    @Override // i2.z3
    public final Object a(z1 z1Var) {
        return this.f71123a.invoke(z1Var);
    }

    public final Function1 b() {
        return this.f71123a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.d(this.f71123a, ((h0) obj).f71123a);
    }

    public final int hashCode() {
        return this.f71123a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f71123a + ')';
    }
}

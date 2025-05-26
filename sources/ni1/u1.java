package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u1 implements u50.m, z1 {

    /* renamed from: a, reason: collision with root package name */
    public final bk1.q0 f90828a;

    public u1(bk1.q0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f90828a = wrapped;
    }

    @Override // u50.m
    public final u50.s c() {
        return this.f90828a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1) && Intrinsics.d(this.f90828a, ((u1) obj).f90828a);
    }

    public final int hashCode() {
        return this.f90828a.hashCode();
    }

    public final String toString() {
        return "WrappedClickThroughEvent(wrapped=" + this.f90828a + ")";
    }
}

package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v1 implements u50.m, z1 {

    /* renamed from: a, reason: collision with root package name */
    public final ek1.g0 f90830a;

    public v1(ek1.g0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f90830a = wrapped;
    }

    @Override // u50.m
    public final u50.s c() {
        return this.f90830a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1) && Intrinsics.d(this.f90830a, ((v1) obj).f90830a);
    }

    public final int hashCode() {
        return this.f90830a.hashCode();
    }

    public final String toString() {
        return "WrappedMediaEvent(wrapped=" + this.f90830a + ")";
    }
}

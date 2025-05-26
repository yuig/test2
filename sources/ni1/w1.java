package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w1 implements u50.m, z1 {

    /* renamed from: a, reason: collision with root package name */
    public final fk1.j f90835a;

    public w1(fk1.h wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f90835a = wrapped;
    }

    @Override // u50.m
    public final u50.s c() {
        return this.f90835a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w1) && Intrinsics.d(this.f90835a, ((w1) obj).f90835a);
    }

    public final int hashCode() {
        return this.f90835a.hashCode();
    }

    public final fk1.j j() {
        return this.f90835a;
    }

    public final String toString() {
        return "WrappedMetadataEvent(wrapped=" + this.f90835a + ")";
    }
}

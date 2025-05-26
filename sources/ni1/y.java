package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y implements b0, u50.t {

    /* renamed from: a, reason: collision with root package name */
    public final fk1.m f90894a;

    public y(fk1.m wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f90894a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f90894a, ((y) obj).f90894a);
    }

    public final int hashCode() {
        return this.f90894a.hashCode();
    }

    public final String toString() {
        return "WrappedMetaDataEffect(wrapped=" + this.f90894a + ")";
    }
}

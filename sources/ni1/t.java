package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final y32.f f90800a;

    public t(y32.f source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f90800a = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f90800a == ((t) obj).f90800a;
    }

    public final int hashCode() {
        return this.f90800a.hashCode();
    }

    public final y32.f j() {
        return this.f90800a;
    }

    public final String toString() {
        return "SetShareSourceSideEffect(source=" + this.f90800a + ")";
    }
}

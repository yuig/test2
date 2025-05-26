package ra0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements y {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i f107028a;

    public x(u50.h value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f107028a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f107028a, ((x) obj).f107028a);
    }

    public final int hashCode() {
        return this.f107028a.hashCode();
    }

    public final String toString() {
        return "TopLevelColor(value=" + this.f107028a + ")";
    }
}

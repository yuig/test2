package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final ni1.c0 f96477a;

    public d0(ni1.c0 stateConverter) {
        Intrinsics.checkNotNullParameter(stateConverter, "stateConverter");
        this.f96477a = stateConverter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f96477a, ((d0) obj).f96477a);
    }

    public final int hashCode() {
        return this.f96477a.hashCode();
    }

    public final String toString() {
        return "PinRepBinding(stateConverter=" + this.f96477a + ")";
    }
}

package mt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final pu.r f88113a;

    public j(pu.r inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f88113a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f88113a, ((j) obj).f88113a);
    }

    public final int hashCode() {
        return this.f88113a.hashCode();
    }

    public final String toString() {
        return "WrappedCoreEvent(inner=" + this.f88113a + ")";
    }
}

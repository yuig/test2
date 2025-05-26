package ws;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final pu.r f131059a;

    public i(pu.r inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f131059a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f131059a, ((i) obj).f131059a);
    }

    public final int hashCode() {
        return this.f131059a.hashCode();
    }

    public final String toString() {
        return "WrappedCoreEvent(inner=" + this.f131059a + ")";
    }
}

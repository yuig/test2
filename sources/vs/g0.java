package vs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f126483a;

    public g0(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f126483a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.d(this.f126483a, ((g0) obj).f126483a);
    }

    public final int hashCode() {
        return this.f126483a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("AdsDebuggerVMState(pinId="), this.f126483a, ")");
    }
}

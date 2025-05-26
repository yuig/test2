package vs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f126472a;

    public b0(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f126472a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f126472a, ((b0) obj).f126472a);
    }

    public final int hashCode() {
        return this.f126472a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("CopyPinJson(pinId="), this.f126472a, ")");
    }
}

package vs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f126476a;

    public c0(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f126476a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.f126476a, ((c0) obj).f126476a);
    }

    public final int hashCode() {
        return this.f126476a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadPin(pinId="), this.f126476a, ")");
    }
}

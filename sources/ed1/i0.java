package ed1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f58646a;

    public i0(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f58646a = pinUid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f58646a, ((i0) obj).f58646a);
    }

    public final int hashCode() {
        return this.f58646a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SharesheetPinSentEvent(pinUid="), this.f58646a, ")");
    }
}

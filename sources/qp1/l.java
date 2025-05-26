package qp1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final pp1.u f104802a;

    public l(pp1.u event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f104802a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f104802a, ((l) obj).f104802a);
    }

    public final int hashCode() {
        return this.f104802a.hashCode();
    }

    public final String toString() {
        return "HandshakeBottomSheetEventWrapper(event=" + this.f104802a + ")";
    }
}

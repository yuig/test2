package zr0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f142748a;

    public a(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f142748a = pinUid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f142748a, ((a) obj).f142748a);
    }

    public final int hashCode() {
        return this.f142748a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("HidePinEvent(pinUid="), this.f142748a, ")");
    }
}

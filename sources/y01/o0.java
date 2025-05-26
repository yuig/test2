package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f136467a;

    public o0(String deletedPinUid) {
        Intrinsics.checkNotNullParameter(deletedPinUid, "deletedPinUid");
        this.f136467a = deletedPinUid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && Intrinsics.d(this.f136467a, ((o0) obj).f136467a);
    }

    public final int hashCode() {
        return this.f136467a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OnHandlePinDeleted(deletedPinUid="), this.f136467a, ")");
    }
}

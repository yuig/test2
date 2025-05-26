package gk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f65234a;

    public i0(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f65234a = pinUid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f65234a, ((i0) obj).f65234a);
    }

    public final int hashCode() {
        return this.f65234a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("StoreButtonOverlayVisibility(pinUid="), this.f65234a, ")");
    }
}

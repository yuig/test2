package gk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f65237a;

    public j0(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f65237a = pinUid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Intrinsics.d(this.f65237a, ((j0) obj).f65237a);
    }

    public final int hashCode() {
        return this.f65237a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SyncButtonOverlayVisibilityWithStore(pinUid="), this.f65237a, ")");
    }
}

package gk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f65228a;

    public f0(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f65228a = pinUid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.f65228a, ((f0) obj).f65228a);
    }

    public final int hashCode() {
        return this.f65228a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("CancelButtonOverlayHideTimer(pinUid="), this.f65228a, ")");
    }
}

package ac2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p0 extends ao2.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final o0 f2025e;

    public p0(o0 playerReuseCause) {
        Intrinsics.checkNotNullParameter(playerReuseCause, "playerReuseCause");
        this.f2025e = playerReuseCause;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && this.f2025e == ((p0) obj).f2025e;
    }

    public final int hashCode() {
        return this.f2025e.hashCode();
    }

    public final o0 s0() {
        return this.f2025e;
    }

    public final String toString() {
        return "ReuseAllowed(playerReuseCause=" + this.f2025e + ")";
    }
}

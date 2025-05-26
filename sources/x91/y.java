package x91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f134362a;

    public y(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f134362a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f134362a, ((y) obj).f134362a);
    }

    public final int hashCode() {
        return this.f134362a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ProfileNavigationRequest(uid="), this.f134362a, ")");
    }
}

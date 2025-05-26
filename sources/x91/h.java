package x91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f134320a;

    public h(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f134320a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f134320a, ((h) obj).f134320a);
    }

    public final int hashCode() {
        return this.f134320a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UserListActionClick(uid="), this.f134320a, ")");
    }
}

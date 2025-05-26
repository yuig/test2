package x91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f134309a;

    public b0(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f134309a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f134309a, ((b0) obj).f134309a);
    }

    public final int hashCode() {
        return this.f134309a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UnblockUserRequest(uid="), this.f134309a, ")");
    }
}

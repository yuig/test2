package ma1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements v {

    /* renamed from: a, reason: collision with root package name */
    public final String f86810a;

    public r(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f86810a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f86810a, ((r) obj).f86810a);
    }

    public final int hashCode() {
        return this.f86810a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RevokeSessionRequest(sessionId="), this.f86810a, ")");
    }
}

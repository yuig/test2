package ma1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f86782a;

    public f(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f86782a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f86782a, ((f) obj).f86782a);
    }

    public final int hashCode() {
        return this.f86782a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RevokeSessionButtonClick(sessionId="), this.f86782a, ")");
    }
}

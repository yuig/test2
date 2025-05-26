package ba1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements r {

    /* renamed from: a, reason: collision with root package name */
    public final e82.g f22377a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22378b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22379c;

    public k(e82.g connectionStatus, long j13, long j14) {
        Intrinsics.checkNotNullParameter(connectionStatus, "connectionStatus");
        this.f22377a = connectionStatus;
        this.f22378b = j13;
        this.f22379c = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f22377a, kVar.f22377a) && this.f22378b == kVar.f22378b && this.f22379c == kVar.f22379c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22379c) + a.a.c(this.f22378b, this.f22377a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FeedLoaded(connectionStatus=" + this.f22377a + ", currentDayInMillis=" + this.f22378b + ", apiMigrationHardDeadlineInMillis=" + this.f22379c + ")";
    }
}

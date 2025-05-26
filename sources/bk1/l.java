package bk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final c f23252a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23253b;

    public l(c attemptDeepLink, long j13) {
        Intrinsics.checkNotNullParameter(attemptDeepLink, "attemptDeepLink");
        this.f23252a = attemptDeepLink;
        this.f23253b = j13;
    }

    public final c a() {
        return this.f23252a;
    }

    public final long b() {
        return this.f23253b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f23252a, lVar.f23252a) && zn2.b.d(this.f23253b, lVar.f23253b);
    }

    public final int hashCode() {
        int hashCode = this.f23252a.hashCode() * 31;
        zn2.a aVar = zn2.b.f142311b;
        return Long.hashCode(this.f23253b) + hashCode;
    }

    public final String toString() {
        return "ScheduleAttemptDeepLink(attemptDeepLink=" + this.f23252a + ", delay=" + zn2.b.o(this.f23253b) + ")";
    }
}

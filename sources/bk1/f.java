package bk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements n {

    /* renamed from: a, reason: collision with root package name */
    public final d f23217a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23218b;

    public f(d attemptDeepLink, long j13) {
        Intrinsics.checkNotNullParameter(attemptDeepLink, "attemptDeepLink");
        this.f23217a = attemptDeepLink;
        this.f23218b = j13;
    }

    public final d a() {
        return this.f23217a;
    }

    public final long b() {
        return this.f23218b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f23217a, fVar.f23217a) && zn2.b.d(this.f23218b, fVar.f23218b);
    }

    public final int hashCode() {
        int hashCode = this.f23217a.hashCode() * 31;
        zn2.a aVar = zn2.b.f142311b;
        return Long.hashCode(this.f23218b) + hashCode;
    }

    public final String toString() {
        return "ShowFlickerAndAttemptDeepLink(attemptDeepLink=" + this.f23217a + ", deeplinkDelay=" + zn2.b.o(this.f23218b) + ")";
    }
}

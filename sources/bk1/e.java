package bk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements n {

    /* renamed from: a, reason: collision with root package name */
    public final d f23208a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23209b;

    public e(d attemptDeepLink, long j13) {
        Intrinsics.checkNotNullParameter(attemptDeepLink, "attemptDeepLink");
        this.f23208a = attemptDeepLink;
        this.f23209b = j13;
    }

    public final d a() {
        return this.f23208a;
    }

    public final long b() {
        return this.f23209b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f23208a, eVar.f23208a) && zn2.b.d(this.f23209b, eVar.f23209b);
    }

    public final int hashCode() {
        int hashCode = this.f23208a.hashCode() * 31;
        zn2.a aVar = zn2.b.f142311b;
        return Long.hashCode(this.f23209b) + hashCode;
    }

    public final String toString() {
        return "AttemptDeepLinkAndShowButtonOverlay(attemptDeepLink=" + this.f23208a + ", showOverlayDelay=" + zn2.b.o(this.f23209b) + ")";
    }
}

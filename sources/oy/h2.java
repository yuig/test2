package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f98063a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98064b;

    /* renamed from: c, reason: collision with root package name */
    public final int f98065c;

    /* renamed from: d, reason: collision with root package name */
    public final long f98066d;

    /* renamed from: e, reason: collision with root package name */
    public final long f98067e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98068f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f98069g;

    /* renamed from: h, reason: collision with root package name */
    public final s92.o f98070h;

    public h2(String uniqueIdentifier, int i13, long j13, long j14, String str, Boolean bool, s92.o pwtResult) {
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        this.f98063a = uniqueIdentifier;
        this.f98064b = i13;
        this.f98065c = 0;
        this.f98066d = j13;
        this.f98067e = j14;
        this.f98068f = str;
        this.f98069g = bool;
        this.f98070h = pwtResult;
    }

    public final String a() {
        return this.f98068f;
    }

    public final int b() {
        return this.f98065c;
    }

    public final s92.o c() {
        return this.f98070h;
    }

    public final int d() {
        return this.f98064b;
    }

    public final String e() {
        return this.f98063a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return Intrinsics.d(this.f98063a, h2Var.f98063a) && this.f98064b == h2Var.f98064b && this.f98065c == h2Var.f98065c && this.f98066d == h2Var.f98066d && this.f98067e == h2Var.f98067e && Intrinsics.d(this.f98068f, h2Var.f98068f) && Intrinsics.d(this.f98069g, h2Var.f98069g) && this.f98070h == h2Var.f98070h;
    }

    public final long f() {
        return this.f98067e;
    }

    public final long g() {
        return this.f98066d;
    }

    public final Boolean h() {
        return this.f98069g;
    }

    public final int hashCode() {
        int c13 = a.a.c(this.f98067e, a.a.c(this.f98066d, ep.b.b(this.f98065c, ep.b.b(this.f98064b, this.f98063a.hashCode() * 31, 31), 31), 31), 31);
        String str = this.f98068f;
        int hashCode = (c13 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f98069g;
        return this.f98070h.hashCode() + ((hashCode + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "EndEvent(uniqueIdentifier=" + this.f98063a + ", retryCount=" + this.f98064b + ", maxAllowedRetryAttempts=" + this.f98065c + ", videoSize=" + this.f98066d + ", videoDuration=" + this.f98067e + ", failureMessage=" + this.f98068f + ", isUserCancelled=" + this.f98069g + ", pwtResult=" + this.f98070h + ")";
    }
}

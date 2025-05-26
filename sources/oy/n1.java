package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f98147a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98148b;

    /* renamed from: c, reason: collision with root package name */
    public final int f98149c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f98150d;

    /* renamed from: e, reason: collision with root package name */
    public final String f98151e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98152f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f98153g;

    /* renamed from: h, reason: collision with root package name */
    public final s92.o f98154h;

    public n1(String uniqueIdentifier, int i13, Long l13, String str, String str2, Boolean bool, s92.o pwtResult) {
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        this.f98147a = uniqueIdentifier;
        this.f98148b = i13;
        this.f98149c = 2;
        this.f98150d = l13;
        this.f98151e = str;
        this.f98152f = str2;
        this.f98153g = bool;
        this.f98154h = pwtResult;
    }

    public final String a() {
        return this.f98152f;
    }

    public final int b() {
        return this.f98149c;
    }

    public final s92.o c() {
        return this.f98154h;
    }

    public final int d() {
        return this.f98148b;
    }

    public final String e() {
        return this.f98147a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return Intrinsics.d(this.f98147a, n1Var.f98147a) && this.f98148b == n1Var.f98148b && this.f98149c == n1Var.f98149c && Intrinsics.d(this.f98150d, n1Var.f98150d) && Intrinsics.d(this.f98151e, n1Var.f98151e) && Intrinsics.d(this.f98152f, n1Var.f98152f) && Intrinsics.d(this.f98153g, n1Var.f98153g) && this.f98154h == n1Var.f98154h;
    }

    public final Long f() {
        return this.f98150d;
    }

    public final String g() {
        return this.f98151e;
    }

    public final Boolean h() {
        return this.f98153g;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f98149c, ep.b.b(this.f98148b, this.f98147a.hashCode() * 31, 31), 31);
        Long l13 = this.f98150d;
        int hashCode = (b13 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str = this.f98151e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f98152f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f98153g;
        return this.f98154h.hashCode() + ((hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "EndEvent(uniqueIdentifier=" + this.f98147a + ", retryCount=" + this.f98148b + ", maxAllowedRetryAttempts=" + this.f98149c + ", uploadId=" + this.f98150d + ", uploadUrl=" + this.f98151e + ", failureMessage=" + this.f98152f + ", isUserCancelled=" + this.f98153g + ", pwtResult=" + this.f98154h + ")";
    }
}

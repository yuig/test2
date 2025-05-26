package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f98186a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98187b;

    /* renamed from: c, reason: collision with root package name */
    public final int f98188c;

    /* renamed from: d, reason: collision with root package name */
    public final String f98189d;

    /* renamed from: e, reason: collision with root package name */
    public final String f98190e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f98191f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98192g;

    /* renamed from: h, reason: collision with root package name */
    public final String f98193h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f98194i;

    /* renamed from: j, reason: collision with root package name */
    public final s92.o f98195j;

    public s0(String uniqueIdentifier, int i13, String str, String str2, Long l13, String str3, String str4, Boolean bool, s92.o pwtResult) {
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        this.f98186a = uniqueIdentifier;
        this.f98187b = i13;
        this.f98188c = 2;
        this.f98189d = str;
        this.f98190e = str2;
        this.f98191f = l13;
        this.f98192g = str3;
        this.f98193h = str4;
        this.f98194i = bool;
        this.f98195j = pwtResult;
    }

    public final String a() {
        return this.f98193h;
    }

    public final String b() {
        return this.f98189d;
    }

    public final int c() {
        return this.f98188c;
    }

    public final String d() {
        return this.f98190e;
    }

    public final s92.o e() {
        return this.f98195j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.d(this.f98186a, s0Var.f98186a) && this.f98187b == s0Var.f98187b && this.f98188c == s0Var.f98188c && Intrinsics.d(this.f98189d, s0Var.f98189d) && Intrinsics.d(this.f98190e, s0Var.f98190e) && Intrinsics.d(this.f98191f, s0Var.f98191f) && Intrinsics.d(this.f98192g, s0Var.f98192g) && Intrinsics.d(this.f98193h, s0Var.f98193h) && Intrinsics.d(this.f98194i, s0Var.f98194i) && this.f98195j == s0Var.f98195j;
    }

    public final int f() {
        return this.f98187b;
    }

    public final String g() {
        return this.f98192g;
    }

    public final String h() {
        return this.f98186a;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f98188c, ep.b.b(this.f98187b, this.f98186a.hashCode() * 31, 31), 31);
        String str = this.f98189d;
        int hashCode = (b13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f98190e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l13 = this.f98191f;
        int hashCode3 = (hashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str3 = this.f98192g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f98193h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f98194i;
        return this.f98195j.hashCode() + ((hashCode5 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final Long i() {
        return this.f98191f;
    }

    public final Boolean j() {
        return this.f98194i;
    }

    public final String toString() {
        return "EndEvent(uniqueIdentifier=" + this.f98186a + ", retryCount=" + this.f98187b + ", maxAllowedRetryAttempts=" + this.f98188c + ", imageSignature=" + this.f98189d + ", mediaId=" + this.f98190e + ", uploadDuration=" + this.f98191f + ", supportWorkStatus=" + this.f98192g + ", failureMessage=" + this.f98193h + ", isUserCancelled=" + this.f98194i + ", pwtResult=" + this.f98195j + ")";
    }
}

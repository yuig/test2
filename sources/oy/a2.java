package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f97992a;

    /* renamed from: b, reason: collision with root package name */
    public final int f97993b;

    /* renamed from: c, reason: collision with root package name */
    public final int f97994c;

    /* renamed from: d, reason: collision with root package name */
    public final String f97995d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f97996e;

    /* renamed from: f, reason: collision with root package name */
    public final String f97997f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f97998g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f97999h;

    /* renamed from: i, reason: collision with root package name */
    public final String f98000i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f98001j;

    /* renamed from: k, reason: collision with root package name */
    public final String f98002k;

    /* renamed from: l, reason: collision with root package name */
    public final s92.o f98003l;

    public a2(String uniqueIdentifier, int i13, String str, Long l13, Long l14, String str2, Boolean bool, String str3, s92.o pwtResult) {
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        this.f97992a = uniqueIdentifier;
        this.f97993b = i13;
        this.f97994c = 2;
        this.f97995d = str;
        this.f97996e = null;
        this.f97997f = null;
        this.f97998g = l13;
        this.f97999h = l14;
        this.f98000i = str2;
        this.f98001j = bool;
        this.f98002k = str3;
        this.f98003l = pwtResult;
    }

    public final Long a() {
        return this.f97998g;
    }

    public final String b() {
        return this.f98000i;
    }

    public final int c() {
        return this.f97994c;
    }

    public final String d() {
        return this.f97995d;
    }

    public final s92.o e() {
        return this.f98003l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return Intrinsics.d(this.f97992a, a2Var.f97992a) && this.f97993b == a2Var.f97993b && this.f97994c == a2Var.f97994c && Intrinsics.d(this.f97995d, a2Var.f97995d) && Intrinsics.d(this.f97996e, a2Var.f97996e) && Intrinsics.d(this.f97997f, a2Var.f97997f) && Intrinsics.d(this.f97998g, a2Var.f97998g) && Intrinsics.d(this.f97999h, a2Var.f97999h) && Intrinsics.d(this.f98000i, a2Var.f98000i) && Intrinsics.d(this.f98001j, a2Var.f98001j) && Intrinsics.d(this.f98002k, a2Var.f98002k) && this.f98003l == a2Var.f98003l;
    }

    public final String f() {
        return this.f97997f;
    }

    public final int g() {
        return this.f97993b;
    }

    public final Long h() {
        return this.f97999h;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f97994c, ep.b.b(this.f97993b, this.f97992a.hashCode() * 31, 31), 31);
        String str = this.f97995d;
        int hashCode = (b13 + (str == null ? 0 : str.hashCode())) * 31;
        Long l13 = this.f97996e;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str2 = this.f97997f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l14 = this.f97998g;
        int hashCode4 = (hashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f97999h;
        int hashCode5 = (hashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str3 = this.f98000i;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f98001j;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f98002k;
        return this.f98003l.hashCode() + ((hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.f97992a;
    }

    public final String j() {
        return this.f98002k;
    }

    public final Long k() {
        return this.f97996e;
    }

    public final Boolean l() {
        return this.f98001j;
    }

    public final String toString() {
        return "EndEvent(uniqueIdentifier=" + this.f97992a + ", retryCount=" + this.f97993b + ", maxAllowedRetryAttempts=" + this.f97994c + ", mediaId=" + this.f97995d + ", videoUploadDuration=" + this.f97996e + ", responseHeaders=" + this.f97997f + ", bytesWritten=" + this.f97998g + ", totalBytesToWrite=" + this.f97999h + ", failureMessage=" + this.f98000i + ", isUserCancelled=" + this.f98001j + ", uploadStatus=" + this.f98002k + ", pwtResult=" + this.f98003l + ")";
    }
}

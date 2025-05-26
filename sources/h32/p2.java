package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p2 {

    /* renamed from: f, reason: collision with root package name */
    public static final c50.c1 f67176f = new c50.c1(25);

    /* renamed from: a, reason: collision with root package name */
    public final Long f67177a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f67178b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67179c;

    /* renamed from: d, reason: collision with root package name */
    public final String f67180d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f67181e;

    public p2(Long l13, Long l14, String str, String str2, Long l15) {
        this.f67177a = l13;
        this.f67178b = l14;
        this.f67179c = str;
        this.f67180d = str2;
        this.f67181e = l15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return Intrinsics.d(this.f67177a, p2Var.f67177a) && Intrinsics.d(this.f67178b, p2Var.f67178b) && Intrinsics.d(this.f67179c, p2Var.f67179c) && Intrinsics.d(this.f67180d, p2Var.f67180d) && Intrinsics.d(this.f67181e, p2Var.f67181e);
    }

    public final int hashCode() {
        Long l13 = this.f67177a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        Long l14 = this.f67178b;
        int hashCode2 = (hashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.f67179c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f67180d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l15 = this.f67181e;
        return hashCode4 + (l15 != null ? l15.hashCode() : 0);
    }

    public final String toString() {
        return "ShowcaseEventData(subpagePinId=" + this.f67177a + ", subpinPinId=" + this.f67178b + ", imageSignature=" + this.f67179c + ", pinIdStr=" + this.f67180d + ", pinId=" + this.f67181e + ")";
    }
}

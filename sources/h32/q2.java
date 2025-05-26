package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q2 {

    /* renamed from: i, reason: collision with root package name */
    public static final c50.c1 f67188i = new c50.c1(26);

    /* renamed from: a, reason: collision with root package name */
    public final String f67189a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f67190b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67191c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f67192d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f67193e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f67194f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f67195g;

    /* renamed from: h, reason: collision with root package name */
    public final String f67196h;

    public q2(String str, Long l13, String str2, Long l14, Long l15, Long l16, Long l17, String str3) {
        this.f67189a = str;
        this.f67190b = l13;
        this.f67191c = str2;
        this.f67192d = l14;
        this.f67193e = l15;
        this.f67194f = l16;
        this.f67195g = l17;
        this.f67196h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return Intrinsics.d(this.f67189a, q2Var.f67189a) && Intrinsics.d(this.f67190b, q2Var.f67190b) && Intrinsics.d(this.f67191c, q2Var.f67191c) && Intrinsics.d(this.f67192d, q2Var.f67192d) && Intrinsics.d(this.f67193e, q2Var.f67193e) && Intrinsics.d(this.f67194f, q2Var.f67194f) && Intrinsics.d(this.f67195g, q2Var.f67195g) && Intrinsics.d(this.f67196h, q2Var.f67196h);
    }

    public final int hashCode() {
        String str = this.f67189a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l13 = this.f67190b;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str2 = this.f67191c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l14 = this.f67192d;
        int hashCode4 = (hashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f67193e;
        int hashCode5 = (hashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.f67194f;
        int hashCode6 = (hashCode5 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.f67195g;
        int hashCode7 = (hashCode6 + (l17 == null ? 0 : l17.hashCode())) * 31;
        String str3 = this.f67196h;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "ShowcaseImpression(pinIdStr=" + this.f67189a + ", pinId=" + this.f67190b + ", insertionId=" + this.f67191c + ", time=" + this.f67192d + ", endTime=" + this.f67193e + ", subpagePinId=" + this.f67194f + ", subpinPinId=" + this.f67195g + ", imageSignature=" + this.f67196h + ")";
    }
}

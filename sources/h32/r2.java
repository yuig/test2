package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r2 {

    /* renamed from: k, reason: collision with root package name */
    public static final c50.c1 f67218k = new c50.c1(27);

    /* renamed from: a, reason: collision with root package name */
    public final Long f67219a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67220b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f67221c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f67222d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f67223e;

    /* renamed from: f, reason: collision with root package name */
    public final Short f67224f;

    /* renamed from: g, reason: collision with root package name */
    public final Short f67225g;

    /* renamed from: h, reason: collision with root package name */
    public final String f67226h;

    /* renamed from: i, reason: collision with root package name */
    public final Double f67227i;

    /* renamed from: j, reason: collision with root package name */
    public final String f67228j;

    public r2(Long l13, String str, Long l14, Long l15, Integer num, Short sh3, Short sh4, String str2, Double d2, String str3) {
        this.f67219a = l13;
        this.f67220b = str;
        this.f67221c = l14;
        this.f67222d = l15;
        this.f67223e = num;
        this.f67224f = sh3;
        this.f67225g = sh4;
        this.f67226h = str2;
        this.f67227i = d2;
        this.f67228j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return Intrinsics.d(this.f67219a, r2Var.f67219a) && Intrinsics.d(this.f67220b, r2Var.f67220b) && Intrinsics.d(this.f67221c, r2Var.f67221c) && Intrinsics.d(this.f67222d, r2Var.f67222d) && Intrinsics.d(this.f67223e, r2Var.f67223e) && Intrinsics.d(this.f67224f, r2Var.f67224f) && Intrinsics.d(this.f67225g, r2Var.f67225g) && Intrinsics.d(this.f67226h, r2Var.f67226h) && Intrinsics.d(this.f67227i, r2Var.f67227i) && Intrinsics.d(this.f67228j, r2Var.f67228j);
    }

    public final int hashCode() {
        Long l13 = this.f67219a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        String str = this.f67220b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.f67221c;
        int hashCode3 = (hashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f67222d;
        int hashCode4 = (hashCode3 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num = this.f67223e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Short sh3 = this.f67224f;
        int hashCode6 = (hashCode5 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        Short sh4 = this.f67225g;
        int hashCode7 = (hashCode6 + (sh4 == null ? 0 : sh4.hashCode())) * 31;
        String str2 = this.f67226h;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d2 = this.f67227i;
        int hashCode9 = (hashCode8 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str3 = this.f67228j;
        return hashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "ShuffleImpression(shuffleId=" + this.f67219a + ", shuffleIdStr=" + this.f67220b + ", time=" + this.f67221c + ", endTime=" + this.f67222d + ", yPosition=" + this.f67223e + ", columnIndex=" + this.f67224f + ", slotIndex=" + this.f67225g + ", requestId=" + this.f67226h + ", renderDuration=" + this.f67227i + ", clientTrackingParams=" + this.f67228j + ")";
    }
}

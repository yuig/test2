package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x1 {

    /* renamed from: l, reason: collision with root package name */
    public static final vb0.i f67379l = new vb0.i(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f67380a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f67381b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67382c;

    /* renamed from: d, reason: collision with root package name */
    public final String f67383d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f67384e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f67385f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f67386g;

    /* renamed from: h, reason: collision with root package name */
    public final Short f67387h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f67388i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f67389j;

    /* renamed from: k, reason: collision with root package name */
    public final Long f67390k;

    public x1(String str, Long l13, String str2, String str3, Long l14, Long l15, Integer num, Short sh3, Long l16, Long l17, Long l18) {
        this.f67380a = str;
        this.f67381b = l13;
        this.f67382c = str2;
        this.f67383d = str3;
        this.f67384e = l14;
        this.f67385f = l15;
        this.f67386g = num;
        this.f67387h = sh3;
        this.f67388i = l16;
        this.f67389j = l17;
        this.f67390k = l18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return Intrinsics.d(this.f67380a, x1Var.f67380a) && Intrinsics.d(this.f67381b, x1Var.f67381b) && Intrinsics.d(this.f67382c, x1Var.f67382c) && Intrinsics.d(this.f67383d, x1Var.f67383d) && Intrinsics.d(this.f67384e, x1Var.f67384e) && Intrinsics.d(this.f67385f, x1Var.f67385f) && Intrinsics.d(this.f67386g, x1Var.f67386g) && Intrinsics.d(this.f67387h, x1Var.f67387h) && Intrinsics.d(this.f67388i, x1Var.f67388i) && Intrinsics.d(this.f67389j, x1Var.f67389j) && Intrinsics.d(this.f67390k, x1Var.f67390k);
    }

    public final int hashCode() {
        String str = this.f67380a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l13 = this.f67381b;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str2 = this.f67382c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f67383d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l14 = this.f67384e;
        int hashCode5 = (hashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f67385f;
        int hashCode6 = (hashCode5 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num = this.f67386g;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Short sh3 = this.f67387h;
        int hashCode8 = (hashCode7 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        Long l16 = this.f67388i;
        int hashCode9 = (hashCode8 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.f67389j;
        int hashCode10 = (hashCode9 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Long l18 = this.f67390k;
        return hashCode10 + (l18 != null ? l18.hashCode() : 0);
    }

    public final String toString() {
        return "PinCarouselSlotImpression(pinIdStr=" + this.f67380a + ", pinId=" + this.f67381b + ", insertionId=" + this.f67382c + ", imageSignature=" + this.f67383d + ", time=" + this.f67384e + ", endTime=" + this.f67385f + ", yPosition=" + this.f67386g + ", slotIndex=" + this.f67387h + ", carouselDataId=" + this.f67388i + ", carouselSlotId=" + this.f67389j + ", internalItemId=" + this.f67390k + ")";
    }
}

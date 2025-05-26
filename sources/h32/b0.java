package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: m, reason: collision with root package name */
    public static final kp.n f66836m = new kp.n(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f66837a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f66838b;

    /* renamed from: c, reason: collision with root package name */
    public final String f66839c;

    /* renamed from: d, reason: collision with root package name */
    public final String f66840d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f66841e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f66842f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f66843g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f66844h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f66845i;

    /* renamed from: j, reason: collision with root package name */
    public final String f66846j;

    /* renamed from: k, reason: collision with root package name */
    public final Short f66847k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f66848l;

    public b0(String str, Long l13, String str2, String str3, Long l14, Long l15, Integer num, Long l16, Long l17, String str4, Short sh3, Long l18) {
        this.f66837a = str;
        this.f66838b = l13;
        this.f66839c = str2;
        this.f66840d = str3;
        this.f66841e = l14;
        this.f66842f = l15;
        this.f66843g = num;
        this.f66844h = l16;
        this.f66845i = l17;
        this.f66846j = str4;
        this.f66847k = sh3;
        this.f66848l = l18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f66837a, b0Var.f66837a) && Intrinsics.d(this.f66838b, b0Var.f66838b) && Intrinsics.d(this.f66839c, b0Var.f66839c) && Intrinsics.d(this.f66840d, b0Var.f66840d) && Intrinsics.d(this.f66841e, b0Var.f66841e) && Intrinsics.d(this.f66842f, b0Var.f66842f) && Intrinsics.d(this.f66843g, b0Var.f66843g) && Intrinsics.d(this.f66844h, b0Var.f66844h) && Intrinsics.d(this.f66845i, b0Var.f66845i) && Intrinsics.d(this.f66846j, b0Var.f66846j) && Intrinsics.d(this.f66847k, b0Var.f66847k) && Intrinsics.d(this.f66848l, b0Var.f66848l);
    }

    public final int hashCode() {
        String str = this.f66837a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l13 = this.f66838b;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str2 = this.f66839c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f66840d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l14 = this.f66841e;
        int hashCode5 = (hashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f66842f;
        int hashCode6 = (hashCode5 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num = this.f66843g;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Long l16 = this.f66844h;
        int hashCode8 = (hashCode7 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.f66845i;
        int hashCode9 = (hashCode8 + (l17 == null ? 0 : l17.hashCode())) * 31;
        String str4 = this.f66846j;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Short sh3 = this.f66847k;
        int hashCode11 = (hashCode10 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        Long l18 = this.f66848l;
        return hashCode11 + (l18 != null ? l18.hashCode() : 0);
    }

    public final String toString() {
        return "CollectionItemImpression(pinIdStr=" + this.f66837a + ", pinId=" + this.f66838b + ", insertionId=" + this.f66839c + ", imageSignature=" + this.f66840d + ", time=" + this.f66841e + ", endTime=" + this.f66842f + ", yPosition=" + this.f66843g + ", collectionDataId=" + this.f66844h + ", itemPinId=" + this.f66845i + ", itemImageSignature=" + this.f66846j + ", itemSlotIndex=" + this.f66847k + ", internalItemId=" + this.f66848l + ")";
    }
}

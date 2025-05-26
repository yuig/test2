package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: g, reason: collision with root package name */
    public static final kp.n f66821g = new kp.n(6);

    /* renamed from: a, reason: collision with root package name */
    public final Long f66822a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66823b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f66824c;

    /* renamed from: d, reason: collision with root package name */
    public final Short f66825d;

    /* renamed from: e, reason: collision with root package name */
    public final String f66826e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f66827f;

    public a0(Long l13, String str, Long l14, Short sh3, String str2, Long l15) {
        this.f66822a = l13;
        this.f66823b = str;
        this.f66824c = l14;
        this.f66825d = sh3;
        this.f66826e = str2;
        this.f66827f = l15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        a0Var.getClass();
        return Intrinsics.d(null, null) && Intrinsics.d(this.f66822a, a0Var.f66822a) && Intrinsics.d(this.f66823b, a0Var.f66823b) && Intrinsics.d(this.f66824c, a0Var.f66824c) && Intrinsics.d(this.f66825d, a0Var.f66825d) && Intrinsics.d(this.f66826e, a0Var.f66826e) && Intrinsics.d(null, null) && Intrinsics.d(this.f66827f, a0Var.f66827f);
    }

    public final int hashCode() {
        Long l13 = this.f66822a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        String str = this.f66823b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.f66824c;
        int hashCode3 = (hashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Short sh3 = this.f66825d;
        int hashCode4 = (hashCode3 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        String str2 = this.f66826e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 961;
        Long l15 = this.f66827f;
        return hashCode5 + (l15 != null ? l15.hashCode() : 0);
    }

    public final String toString() {
        return "CollectionItemEventData(collectionDataId=null, itemPinId=" + this.f66822a + ", itemImageSignature=" + this.f66823b + ", gItemPinPromotionId=" + this.f66824c + ", itemSlotIndex=" + this.f66825d + ", pinIdStr=" + this.f66826e + ", pinId=null, internalItemId=" + this.f66827f + ")";
    }
}

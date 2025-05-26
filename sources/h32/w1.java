package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w1 {

    /* renamed from: g, reason: collision with root package name */
    public static final c50.c1 f67349g = new c50.c1(13);

    /* renamed from: a, reason: collision with root package name */
    public final Long f67350a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f67351b;

    /* renamed from: c, reason: collision with root package name */
    public final Short f67352c;

    /* renamed from: d, reason: collision with root package name */
    public final String f67353d;

    /* renamed from: e, reason: collision with root package name */
    public final Short f67354e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f67355f;

    public w1(Long l13, Long l14, Short sh3, String str, Short sh4, Long l15) {
        this.f67350a = l13;
        this.f67351b = l14;
        this.f67352c = sh3;
        this.f67353d = str;
        this.f67354e = sh4;
        this.f67355f = l15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return Intrinsics.d(this.f67350a, w1Var.f67350a) && Intrinsics.d(this.f67351b, w1Var.f67351b) && Intrinsics.d(this.f67352c, w1Var.f67352c) && Intrinsics.d(this.f67353d, w1Var.f67353d) && Intrinsics.d(null, null) && Intrinsics.d(this.f67354e, w1Var.f67354e) && Intrinsics.d(this.f67355f, w1Var.f67355f) && Intrinsics.d(null, null);
    }

    public final int hashCode() {
        Long l13 = this.f67350a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        Long l14 = this.f67351b;
        int hashCode2 = (hashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Short sh3 = this.f67352c;
        int hashCode3 = (hashCode2 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        String str = this.f67353d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 961;
        Short sh4 = this.f67354e;
        int hashCode5 = (hashCode4 + (sh4 == null ? 0 : sh4.hashCode())) * 31;
        Long l15 = this.f67355f;
        return (hashCode5 + (l15 != null ? l15.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "PinCarouselSlotEventData(carouselDataId=" + this.f67350a + ", carouselSlotId=" + this.f67351b + ", carouselSlotIndex=" + this.f67352c + ", carouselImageSignature=" + this.f67353d + ", gCarouselSlotPromotionId=null, toCarouselSlotIndex=" + this.f67354e + ", internalItemId=" + this.f67355f + ", slotDetails=null)";
    }
}

package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m2 {

    /* renamed from: i, reason: collision with root package name */
    public static final c50.c1 f67142i = new c50.c1(21);

    /* renamed from: a, reason: collision with root package name */
    public final String f67143a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67144b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67145c;

    /* renamed from: d, reason: collision with root package name */
    public final Short f67146d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f67147e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f67148f;

    /* renamed from: g, reason: collision with root package name */
    public final Short f67149g;

    /* renamed from: h, reason: collision with root package name */
    public final Short f67150h;

    public m2(String str, String str2, String str3, Short sh3, Long l13, Long l14, Short sh4, Short sh5) {
        this.f67143a = str;
        this.f67144b = str2;
        this.f67145c = str3;
        this.f67146d = sh3;
        this.f67147e = l13;
        this.f67148f = l14;
        this.f67149g = sh4;
        this.f67150h = sh5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return Intrinsics.d(this.f67143a, m2Var.f67143a) && Intrinsics.d(this.f67144b, m2Var.f67144b) && Intrinsics.d(this.f67145c, m2Var.f67145c) && Intrinsics.d(this.f67146d, m2Var.f67146d) && Intrinsics.d(this.f67147e, m2Var.f67147e) && Intrinsics.d(this.f67148f, m2Var.f67148f) && Intrinsics.d(this.f67149g, m2Var.f67149g) && Intrinsics.d(this.f67150h, m2Var.f67150h);
    }

    public final int hashCode() {
        String str = this.f67143a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f67144b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f67145c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Short sh3 = this.f67146d;
        int hashCode4 = (hashCode3 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        Long l13 = this.f67147e;
        int hashCode5 = (hashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f67148f;
        int hashCode6 = (hashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Short sh4 = this.f67149g;
        int hashCode7 = (hashCode6 + (sh4 == null ? 0 : sh4.hashCode())) * 31;
        Short sh5 = this.f67150h;
        return hashCode7 + (sh5 != null ? sh5.hashCode() : 0);
    }

    public final String toString() {
        return "RelatedPinsFilterImpression(filterTabIdStr=" + this.f67143a + ", queryPinIdStr=" + this.f67144b + ", name=" + this.f67145c + ", filterTabType=" + this.f67146d + ", time=" + this.f67147e + ", endTime=" + this.f67148f + ", totalObjectCount=" + this.f67149g + ", carouselSlotIndex=" + this.f67150h + ")";
    }
}

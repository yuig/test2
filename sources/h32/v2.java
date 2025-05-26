package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v2 {

    /* renamed from: k */
    public static final c50.w2 f67310k = new c50.w2(1);

    /* renamed from: a */
    public final Long f67311a;

    /* renamed from: b */
    public final Long f67312b;

    /* renamed from: c */
    public final String f67313c;

    /* renamed from: d */
    public final Long f67314d;

    /* renamed from: e */
    public final Short f67315e;

    /* renamed from: f */
    public final Short f67316f;

    /* renamed from: g */
    public final Short f67317g;

    /* renamed from: h */
    public final Short f67318h;

    /* renamed from: i */
    public final Integer f67319i;

    /* renamed from: j */
    public final String f67320j;

    public v2(Long l13, Long l14, String str, Long l15, Short sh3, Short sh4, Short sh5, Short sh6, Integer num, String str2) {
        this.f67311a = l13;
        this.f67312b = l14;
        this.f67313c = str;
        this.f67314d = l15;
        this.f67315e = sh3;
        this.f67316f = sh4;
        this.f67317g = sh5;
        this.f67318h = sh6;
        this.f67319i = num;
        this.f67320j = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return Intrinsics.d(this.f67311a, v2Var.f67311a) && Intrinsics.d(this.f67312b, v2Var.f67312b) && Intrinsics.d(this.f67313c, v2Var.f67313c) && Intrinsics.d(this.f67314d, v2Var.f67314d) && Intrinsics.d(this.f67315e, v2Var.f67315e) && Intrinsics.d(this.f67316f, v2Var.f67316f) && Intrinsics.d(this.f67317g, v2Var.f67317g) && Intrinsics.d(this.f67318h, v2Var.f67318h) && Intrinsics.d(this.f67319i, v2Var.f67319i) && Intrinsics.d(this.f67320j, v2Var.f67320j);
    }

    public final int hashCode() {
        Long l13 = this.f67311a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        Long l14 = this.f67312b;
        int hashCode2 = (hashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.f67313c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l15 = this.f67314d;
        int hashCode4 = (hashCode3 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Short sh3 = this.f67315e;
        int hashCode5 = (hashCode4 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        Short sh4 = this.f67316f;
        int hashCode6 = (hashCode5 + (sh4 == null ? 0 : sh4.hashCode())) * 31;
        Short sh5 = this.f67317g;
        int hashCode7 = (hashCode6 + (sh5 == null ? 0 : sh5.hashCode())) * 31;
        Short sh6 = this.f67318h;
        int hashCode8 = (hashCode7 + (sh6 == null ? 0 : sh6.hashCode())) * 31;
        Integer num = this.f67319i;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f67320j;
        return hashCode9 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "StoryImpression(id=" + this.f67311a + ", time=" + this.f67312b + ", idStr=" + this.f67313c + ", endTime=" + this.f67314d + ", slotIndex=" + this.f67315e + ", itemCount=" + this.f67316f + ", visibleCount=" + this.f67317g + ", clickCount=" + this.f67318h + ", yPosition=" + this.f67319i + ", clientTrackingParams=" + this.f67320j + ")";
    }
}

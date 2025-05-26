package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d3 {

    /* renamed from: l, reason: collision with root package name */
    public static final c50.w2 f66945l = new c50.w2(10);

    /* renamed from: a, reason: collision with root package name */
    public final String f66946a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f66947b;

    /* renamed from: c, reason: collision with root package name */
    public final String f66948c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f66949d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f66950e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f66951f;

    /* renamed from: g, reason: collision with root package name */
    public final Short f66952g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f66953h;

    /* renamed from: i, reason: collision with root package name */
    public final Short f66954i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f66955j;

    /* renamed from: k, reason: collision with root package name */
    public final Short f66956k;

    public d3(String str, Long l13, String str2, Long l14, Long l15, Integer num, Short sh3, Long l16, Short sh4, Long l17, Short sh5) {
        this.f66946a = str;
        this.f66947b = l13;
        this.f66948c = str2;
        this.f66949d = l14;
        this.f66950e = l15;
        this.f66951f = num;
        this.f66952g = sh3;
        this.f66953h = l16;
        this.f66954i = sh4;
        this.f66955j = l17;
        this.f66956k = sh5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return Intrinsics.d(this.f66946a, d3Var.f66946a) && Intrinsics.d(this.f66947b, d3Var.f66947b) && Intrinsics.d(this.f66948c, d3Var.f66948c) && Intrinsics.d(this.f66949d, d3Var.f66949d) && Intrinsics.d(this.f66950e, d3Var.f66950e) && Intrinsics.d(this.f66951f, d3Var.f66951f) && Intrinsics.d(this.f66952g, d3Var.f66952g) && Intrinsics.d(this.f66953h, d3Var.f66953h) && Intrinsics.d(this.f66954i, d3Var.f66954i) && Intrinsics.d(this.f66955j, d3Var.f66955j) && Intrinsics.d(this.f66956k, d3Var.f66956k);
    }

    public final int hashCode() {
        String str = this.f66946a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l13 = this.f66947b;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str2 = this.f66948c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l14 = this.f66949d;
        int hashCode4 = (hashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f66950e;
        int hashCode5 = (hashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num = this.f66951f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Short sh3 = this.f66952g;
        int hashCode7 = (hashCode6 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        Long l16 = this.f66953h;
        int hashCode8 = (hashCode7 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Short sh4 = this.f66954i;
        int hashCode9 = (hashCode8 + (sh4 == null ? 0 : sh4.hashCode())) * 31;
        Long l17 = this.f66955j;
        int hashCode10 = (hashCode9 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Short sh5 = this.f66956k;
        return hashCode10 + (sh5 != null ? sh5.hashCode() : 0);
    }

    public final String toString() {
        return "TopicImpression(topicIdStr=" + this.f66946a + ", topicId=" + this.f66947b + ", insertionId=" + this.f66948c + ", time=" + this.f66949d + ", endTime=" + this.f66950e + ", yPosition=" + this.f66951f + ", slotIndex=" + this.f66952g + ", storyId=" + this.f66953h + ", storyIndex=" + this.f66954i + ", l1TopicId=" + this.f66955j + ", l1SlotIndex=" + this.f66956k + ")";
    }
}

package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e3 {

    /* renamed from: n, reason: collision with root package name */
    public static final c50.w2 f66963n = new c50.w2(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f66964a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f66965b;

    /* renamed from: c, reason: collision with root package name */
    public final String f66966c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f66967d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f66968e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f66969f;

    /* renamed from: g, reason: collision with root package name */
    public final Short f66970g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f66971h;

    /* renamed from: i, reason: collision with root package name */
    public final Short f66972i;

    /* renamed from: j, reason: collision with root package name */
    public final String f66973j;

    /* renamed from: k, reason: collision with root package name */
    public final Short f66974k;

    /* renamed from: l, reason: collision with root package name */
    public final String f66975l;

    /* renamed from: m, reason: collision with root package name */
    public final String f66976m;

    public e3(String str, Long l13, String str2, Long l14, Long l15, Integer num, Short sh3, Long l16, Short sh4, String str3, Short sh5, String str4, String str5) {
        this.f66964a = str;
        this.f66965b = l13;
        this.f66966c = str2;
        this.f66967d = l14;
        this.f66968e = l15;
        this.f66969f = num;
        this.f66970g = sh3;
        this.f66971h = l16;
        this.f66972i = sh4;
        this.f66973j = str3;
        this.f66974k = sh5;
        this.f66975l = str4;
        this.f66976m = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return Intrinsics.d(this.f66964a, e3Var.f66964a) && Intrinsics.d(this.f66965b, e3Var.f66965b) && Intrinsics.d(this.f66966c, e3Var.f66966c) && Intrinsics.d(this.f66967d, e3Var.f66967d) && Intrinsics.d(this.f66968e, e3Var.f66968e) && Intrinsics.d(this.f66969f, e3Var.f66969f) && Intrinsics.d(this.f66970g, e3Var.f66970g) && Intrinsics.d(this.f66971h, e3Var.f66971h) && Intrinsics.d(this.f66972i, e3Var.f66972i) && Intrinsics.d(this.f66973j, e3Var.f66973j) && Intrinsics.d(this.f66974k, e3Var.f66974k) && Intrinsics.d(this.f66975l, e3Var.f66975l) && Intrinsics.d(this.f66976m, e3Var.f66976m);
    }

    public final int hashCode() {
        String str = this.f66964a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l13 = this.f66965b;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str2 = this.f66966c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l14 = this.f66967d;
        int hashCode4 = (hashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f66968e;
        int hashCode5 = (hashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num = this.f66969f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Short sh3 = this.f66970g;
        int hashCode7 = (hashCode6 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        Long l16 = this.f66971h;
        int hashCode8 = (hashCode7 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Short sh4 = this.f66972i;
        int hashCode9 = (hashCode8 + (sh4 == null ? 0 : sh4.hashCode())) * 31;
        String str3 = this.f66973j;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Short sh5 = this.f66974k;
        int hashCode11 = (hashCode10 + (sh5 == null ? 0 : sh5.hashCode())) * 31;
        String str4 = this.f66975l;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f66976m;
        return hashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserImpression(userIdStr=");
        sb3.append(this.f66964a);
        sb3.append(", userId=");
        sb3.append(this.f66965b);
        sb3.append(", insertionId=");
        sb3.append(this.f66966c);
        sb3.append(", time=");
        sb3.append(this.f66967d);
        sb3.append(", endTime=");
        sb3.append(this.f66968e);
        sb3.append(", yPosition=");
        sb3.append(this.f66969f);
        sb3.append(", slotIndex=");
        sb3.append(this.f66970g);
        sb3.append(", storyId=");
        sb3.append(this.f66971h);
        sb3.append(", storyIndex=");
        sb3.append(this.f66972i);
        sb3.append(", storyIdStr=");
        sb3.append(this.f66973j);
        sb3.append(", recommendationReasonType=");
        sb3.append(this.f66974k);
        sb3.append(", recommendationReasonDescription=");
        sb3.append(this.f66975l);
        sb3.append(", recommendationReasonDetails=");
        return a.a.p(sb3, this.f66976m, ")");
    }
}

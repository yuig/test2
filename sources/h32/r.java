package h32;

import c50.t4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: o, reason: collision with root package name */
    public static final t4 f67198o = new t4(23);

    /* renamed from: a, reason: collision with root package name */
    public final String f67199a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f67200b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67201c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f67202d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f67203e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f67204f;

    /* renamed from: g, reason: collision with root package name */
    public final Short f67205g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f67206h;

    /* renamed from: i, reason: collision with root package name */
    public final Short f67207i;

    /* renamed from: j, reason: collision with root package name */
    public final String f67208j;

    /* renamed from: k, reason: collision with root package name */
    public final Short f67209k;

    /* renamed from: l, reason: collision with root package name */
    public final String f67210l;

    /* renamed from: m, reason: collision with root package name */
    public final wo2.m f67211m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f67212n;

    public r(String str, Long l13, String str2, Long l14, Long l15, Integer num, Short sh3, Long l16, Short sh4, String str3, Short sh5, String str4, wo2.m mVar, Integer num2) {
        this.f67199a = str;
        this.f67200b = l13;
        this.f67201c = str2;
        this.f67202d = l14;
        this.f67203e = l15;
        this.f67204f = num;
        this.f67205g = sh3;
        this.f67206h = l16;
        this.f67207i = sh4;
        this.f67208j = str3;
        this.f67209k = sh5;
        this.f67210l = str4;
        this.f67211m = mVar;
        this.f67212n = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f67199a, rVar.f67199a) && Intrinsics.d(this.f67200b, rVar.f67200b) && Intrinsics.d(this.f67201c, rVar.f67201c) && Intrinsics.d(this.f67202d, rVar.f67202d) && Intrinsics.d(this.f67203e, rVar.f67203e) && Intrinsics.d(this.f67204f, rVar.f67204f) && Intrinsics.d(this.f67205g, rVar.f67205g) && Intrinsics.d(this.f67206h, rVar.f67206h) && Intrinsics.d(this.f67207i, rVar.f67207i) && Intrinsics.d(this.f67208j, rVar.f67208j) && Intrinsics.d(this.f67209k, rVar.f67209k) && Intrinsics.d(this.f67210l, rVar.f67210l) && Intrinsics.d(this.f67211m, rVar.f67211m) && Intrinsics.d(this.f67212n, rVar.f67212n);
    }

    public final int hashCode() {
        String str = this.f67199a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l13 = this.f67200b;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str2 = this.f67201c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l14 = this.f67202d;
        int hashCode4 = (hashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f67203e;
        int hashCode5 = (hashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num = this.f67204f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Short sh3 = this.f67205g;
        int hashCode7 = (hashCode6 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        Long l16 = this.f67206h;
        int hashCode8 = (hashCode7 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Short sh4 = this.f67207i;
        int hashCode9 = (hashCode8 + (sh4 == null ? 0 : sh4.hashCode())) * 31;
        String str3 = this.f67208j;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Short sh5 = this.f67209k;
        int hashCode11 = (hashCode10 + (sh5 == null ? 0 : sh5.hashCode())) * 31;
        String str4 = this.f67210l;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        wo2.m mVar = this.f67211m;
        int hashCode13 = (hashCode12 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        Integer num2 = this.f67212n;
        return hashCode13 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ArticleImpression(articleIdStr=" + this.f67199a + ", articleId=" + this.f67200b + ", insertionId=" + this.f67201c + ", time=" + this.f67202d + ", endTime=" + this.f67203e + ", yPosition=" + this.f67204f + ", slotIndex=" + this.f67205g + ", storyId=" + this.f67206h + ", storyIndex=" + this.f67207i + ", storyIdStr=" + this.f67208j + ", sectionId=" + this.f67209k + ", sectionIdStr=" + this.f67210l + ", requestId=" + this.f67211m + ", storyCategory=" + this.f67212n + ")";
    }
}

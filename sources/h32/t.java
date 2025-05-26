package h32;

import c50.t4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: n, reason: collision with root package name */
    public static final t4 f67243n = new t4(27);

    /* renamed from: a, reason: collision with root package name */
    public final String f67244a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f67245b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67246c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f67247d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f67248e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f67249f;

    /* renamed from: g, reason: collision with root package name */
    public final Short f67250g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f67251h;

    /* renamed from: i, reason: collision with root package name */
    public final Short f67252i;

    /* renamed from: j, reason: collision with root package name */
    public final String f67253j;

    /* renamed from: k, reason: collision with root package name */
    public final Short f67254k;

    /* renamed from: l, reason: collision with root package name */
    public final String f67255l;

    /* renamed from: m, reason: collision with root package name */
    public final String f67256m;

    public t(String str, Long l13, String str2, Long l14, Long l15, Integer num, Short sh3, Long l16, Short sh4, String str3, Short sh5, String str4, String str5) {
        this.f67244a = str;
        this.f67245b = l13;
        this.f67246c = str2;
        this.f67247d = l14;
        this.f67248e = l15;
        this.f67249f = num;
        this.f67250g = sh3;
        this.f67251h = l16;
        this.f67252i = sh4;
        this.f67253j = str3;
        this.f67254k = sh5;
        this.f67255l = str4;
        this.f67256m = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f67244a, tVar.f67244a) && Intrinsics.d(this.f67245b, tVar.f67245b) && Intrinsics.d(this.f67246c, tVar.f67246c) && Intrinsics.d(this.f67247d, tVar.f67247d) && Intrinsics.d(this.f67248e, tVar.f67248e) && Intrinsics.d(this.f67249f, tVar.f67249f) && Intrinsics.d(this.f67250g, tVar.f67250g) && Intrinsics.d(this.f67251h, tVar.f67251h) && Intrinsics.d(this.f67252i, tVar.f67252i) && Intrinsics.d(this.f67253j, tVar.f67253j) && Intrinsics.d(this.f67254k, tVar.f67254k) && Intrinsics.d(this.f67255l, tVar.f67255l) && Intrinsics.d(this.f67256m, tVar.f67256m);
    }

    public final int hashCode() {
        String str = this.f67244a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l13 = this.f67245b;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str2 = this.f67246c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l14 = this.f67247d;
        int hashCode4 = (hashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f67248e;
        int hashCode5 = (hashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num = this.f67249f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Short sh3 = this.f67250g;
        int hashCode7 = (hashCode6 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        Long l16 = this.f67251h;
        int hashCode8 = (hashCode7 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Short sh4 = this.f67252i;
        int hashCode9 = (hashCode8 + (sh4 == null ? 0 : sh4.hashCode())) * 31;
        String str3 = this.f67253j;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Short sh5 = this.f67254k;
        int hashCode11 = (hashCode10 + (sh5 == null ? 0 : sh5.hashCode())) * 31;
        String str4 = this.f67255l;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f67256m;
        return hashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardImpression(boardIdStr=");
        sb3.append(this.f67244a);
        sb3.append(", boardId=");
        sb3.append(this.f67245b);
        sb3.append(", insertionId=");
        sb3.append(this.f67246c);
        sb3.append(", time=");
        sb3.append(this.f67247d);
        sb3.append(", endTime=");
        sb3.append(this.f67248e);
        sb3.append(", yPosition=");
        sb3.append(this.f67249f);
        sb3.append(", slotIndex=");
        sb3.append(this.f67250g);
        sb3.append(", storyId=");
        sb3.append(this.f67251h);
        sb3.append(", storyIndex=");
        sb3.append(this.f67252i);
        sb3.append(", storyIdStr=");
        sb3.append(this.f67253j);
        sb3.append(", sectionId=");
        sb3.append(this.f67254k);
        sb3.append(", sectionIdStr=");
        sb3.append(this.f67255l);
        sb3.append(", clientTrackingParams=");
        return a.a.p(sb3, this.f67256m, ")");
    }
}

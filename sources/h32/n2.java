package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n2 {

    /* renamed from: k, reason: collision with root package name */
    public static final c50.c1 f67156k = new c50.c1(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f67157a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67158b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67159c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f67160d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f67161e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f67162f;

    /* renamed from: g, reason: collision with root package name */
    public final Short f67163g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f67164h;

    /* renamed from: i, reason: collision with root package name */
    public final Short f67165i;

    /* renamed from: j, reason: collision with root package name */
    public final String f67166j;

    public n2(String str, String str2, String str3, Long l13, Long l14, Integer num, Short sh3, Long l15, Short sh4, String str4) {
        this.f67157a = str;
        this.f67158b = str2;
        this.f67159c = str3;
        this.f67160d = l13;
        this.f67161e = l14;
        this.f67162f = num;
        this.f67163g = sh3;
        this.f67164h = l15;
        this.f67165i = sh4;
        this.f67166j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return Intrinsics.d(this.f67157a, n2Var.f67157a) && Intrinsics.d(this.f67158b, n2Var.f67158b) && Intrinsics.d(this.f67159c, n2Var.f67159c) && Intrinsics.d(this.f67160d, n2Var.f67160d) && Intrinsics.d(this.f67161e, n2Var.f67161e) && Intrinsics.d(this.f67162f, n2Var.f67162f) && Intrinsics.d(this.f67163g, n2Var.f67163g) && Intrinsics.d(this.f67164h, n2Var.f67164h) && Intrinsics.d(this.f67165i, n2Var.f67165i) && Intrinsics.d(this.f67166j, n2Var.f67166j);
    }

    public final int hashCode() {
        String str = this.f67157a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f67158b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f67159c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l13 = this.f67160d;
        int hashCode4 = (hashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f67161e;
        int hashCode5 = (hashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Integer num = this.f67162f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Short sh3 = this.f67163g;
        int hashCode7 = (hashCode6 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        Long l15 = this.f67164h;
        int hashCode8 = (hashCode7 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Short sh4 = this.f67165i;
        int hashCode9 = (hashCode8 + (sh4 == null ? 0 : sh4.hashCode())) * 31;
        String str4 = this.f67166j;
        return hashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SearchImpression(term=");
        sb3.append(this.f67157a);
        sb3.append(", imageSignature=");
        sb3.append(this.f67158b);
        sb3.append(", insertionId=");
        sb3.append(this.f67159c);
        sb3.append(", time=");
        sb3.append(this.f67160d);
        sb3.append(", endTime=");
        sb3.append(this.f67161e);
        sb3.append(", yPosition=");
        sb3.append(this.f67162f);
        sb3.append(", slotIndex=");
        sb3.append(this.f67163g);
        sb3.append(", storyId=");
        sb3.append(this.f67164h);
        sb3.append(", storyIndex=");
        sb3.append(this.f67165i);
        sb3.append(", storyIdStr=");
        return a.a.p(sb3, this.f67166j, ")");
    }
}

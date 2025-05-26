package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c3 {

    /* renamed from: f, reason: collision with root package name */
    public static final c50.w2 f66931f = new c50.w2(9);

    /* renamed from: a, reason: collision with root package name */
    public final Long f66932a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f66933b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f66934c;

    /* renamed from: d, reason: collision with root package name */
    public final Short f66935d;

    /* renamed from: e, reason: collision with root package name */
    public final String f66936e;

    public c3(Long l13, Long l14, Long l15, Short sh3, String str) {
        this.f66932a = l13;
        this.f66933b = l14;
        this.f66934c = l15;
        this.f66935d = sh3;
        this.f66936e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return Intrinsics.d(this.f66932a, c3Var.f66932a) && Intrinsics.d(this.f66933b, c3Var.f66933b) && Intrinsics.d(this.f66934c, c3Var.f66934c) && Intrinsics.d(this.f66935d, c3Var.f66935d) && Intrinsics.d(this.f66936e, c3Var.f66936e);
    }

    public final int hashCode() {
        Long l13 = this.f66932a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        Long l14 = this.f66933b;
        int hashCode2 = (hashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f66934c;
        int hashCode3 = (hashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Short sh3 = this.f66935d;
        int hashCode4 = (hashCode3 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        String str = this.f66936e;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TodayArticleImpression(todayArticleId=");
        sb3.append(this.f66932a);
        sb3.append(", time=");
        sb3.append(this.f66933b);
        sb3.append(", endTime=");
        sb3.append(this.f66934c);
        sb3.append(", slotIndex=");
        sb3.append(this.f66935d);
        sb3.append(", todayArticleIdStr=");
        return a.a.p(sb3, this.f66936e, ")");
    }
}

package th2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f117659a;

    /* renamed from: b, reason: collision with root package name */
    public final String f117660b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f117661c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f117662d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f117663e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f117664f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f117665g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f117666h;

    /* renamed from: i, reason: collision with root package name */
    public final String f117667i;

    /* renamed from: j, reason: collision with root package name */
    public final String f117668j;

    /* renamed from: k, reason: collision with root package name */
    public final String f117669k;

    public e(String str, String str2, Integer num, Long l13, Integer num2, Long l14, Integer num3, Long l15, String str3, String str4, String str5) {
        this.f117659a = str;
        this.f117660b = str2;
        this.f117661c = num;
        this.f117662d = l13;
        this.f117663e = num2;
        this.f117664f = l14;
        this.f117665g = num3;
        this.f117666h = l15;
        this.f117667i = str3;
        this.f117668j = str4;
        this.f117669k = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f117659a, eVar.f117659a) && Intrinsics.d(this.f117660b, eVar.f117660b) && Intrinsics.d(this.f117661c, eVar.f117661c) && Intrinsics.d(this.f117662d, eVar.f117662d) && Intrinsics.d(this.f117663e, eVar.f117663e) && Intrinsics.d(this.f117664f, eVar.f117664f) && Intrinsics.d(this.f117665g, eVar.f117665g) && Intrinsics.d(this.f117666h, eVar.f117666h) && Intrinsics.d(this.f117667i, eVar.f117667i) && Intrinsics.d(this.f117668j, eVar.f117668j) && Intrinsics.d(this.f117669k, eVar.f117669k);
    }

    public final int hashCode() {
        String str = this.f117659a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f117660b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f117661c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l13 = this.f117662d;
        int hashCode4 = (hashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Integer num2 = this.f117663e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l14 = this.f117664f;
        int hashCode6 = (hashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Integer num3 = this.f117665g;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l15 = this.f117666h;
        int hashCode8 = (hashCode7 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str3 = this.f117667i;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f117668j;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f117669k;
        return hashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AppExitInfoData(sessionId=");
        sb3.append(this.f117659a);
        sb3.append(", sessionIdError=");
        sb3.append(this.f117660b);
        sb3.append(", importance=");
        sb3.append(this.f117661c);
        sb3.append(", pss=");
        sb3.append(this.f117662d);
        sb3.append(", reason=");
        sb3.append(this.f117663e);
        sb3.append(", rss=");
        sb3.append(this.f117664f);
        sb3.append(", status=");
        sb3.append(this.f117665g);
        sb3.append(", timestamp=");
        sb3.append(this.f117666h);
        sb3.append(", trace=");
        sb3.append(this.f117667i);
        sb3.append(", description=");
        sb3.append(this.f117668j);
        sb3.append(", traceStatus=");
        return ep.b.k(sb3, this.f117669k, ')');
    }
}

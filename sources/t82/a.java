package t82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Long f116752a;

    /* renamed from: b, reason: collision with root package name */
    public final String f116753b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f116754c;

    /* renamed from: d, reason: collision with root package name */
    public final String f116755d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f116756e;

    /* renamed from: f, reason: collision with root package name */
    public final String f116757f;

    /* renamed from: g, reason: collision with root package name */
    public final String f116758g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f116759h;

    /* renamed from: i, reason: collision with root package name */
    public final String f116760i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f116761j;

    public a(Long l13, String str, Long l14, String str2, Long l15, String str3, String str4, Boolean bool, String str5, Boolean bool2) {
        this.f116752a = l13;
        this.f116753b = str;
        this.f116754c = l14;
        this.f116755d = str2;
        this.f116756e = l15;
        this.f116757f = str3;
        this.f116758g = str4;
        this.f116759h = bool;
        this.f116760i = str5;
        this.f116761j = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f116752a, aVar.f116752a) && Intrinsics.d(this.f116753b, aVar.f116753b) && Intrinsics.d(this.f116754c, aVar.f116754c) && Intrinsics.d(this.f116755d, aVar.f116755d) && Intrinsics.d(this.f116756e, aVar.f116756e) && Intrinsics.d(this.f116757f, aVar.f116757f) && Intrinsics.d(this.f116758g, aVar.f116758g) && Intrinsics.d(this.f116759h, aVar.f116759h) && Intrinsics.d(this.f116760i, aVar.f116760i) && Intrinsics.d(this.f116761j, aVar.f116761j) && Intrinsics.d(null, null);
    }

    public final int hashCode() {
        Long l13 = this.f116752a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        String str = this.f116753b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.f116754c;
        int hashCode3 = (hashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str2 = this.f116755d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l15 = this.f116756e;
        int hashCode5 = (hashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str3 = this.f116757f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f116758g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f116759h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f116760i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.f116761j;
        return (hashCode9 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SurveyInvite(surveyId=");
        sb3.append(this.f116752a);
        sb3.append(", surveySegmentId=");
        sb3.append(this.f116753b);
        sb3.append(", creationTimestamp=");
        sb3.append(this.f116754c);
        sb3.append(", algorithmVersion=");
        sb3.append(this.f116755d);
        sb3.append(", expirationTimestamp=");
        sb3.append(this.f116756e);
        sb3.append(", experiment=");
        sb3.append(this.f116757f);
        sb3.append(", experimentGroup=");
        sb3.append(this.f116758g);
        sb3.append(", isHoldout=");
        sb3.append(this.f116759h);
        sb3.append(", experimentCell=");
        sb3.append(this.f116760i);
        sb3.append(", isTestRequest=");
        return a.c.h(sb3, this.f116761j, ", tags=null)");
    }
}

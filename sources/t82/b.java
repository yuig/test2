package t82;

import h32.m;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Long f116762a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f116763b;

    /* renamed from: c, reason: collision with root package name */
    public final e f116764c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f116765d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f116766e;

    /* renamed from: f, reason: collision with root package name */
    public final m f116767f;

    /* renamed from: g, reason: collision with root package name */
    public final String f116768g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f116769h;

    /* renamed from: i, reason: collision with root package name */
    public final String f116770i;

    /* renamed from: j, reason: collision with root package name */
    public final a f116771j;

    /* renamed from: k, reason: collision with root package name */
    public final Map f116772k;

    public b(Long l13, Long l14, e eVar, Map map, Map map2, m mVar, String str, Boolean bool, String str2, a aVar, Map map3) {
        this.f116762a = l13;
        this.f116763b = l14;
        this.f116764c = eVar;
        this.f116765d = map;
        this.f116766e = map2;
        this.f116767f = mVar;
        this.f116768g = str;
        this.f116769h = bool;
        this.f116770i = str2;
        this.f116771j = aVar;
        this.f116772k = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return Intrinsics.d(null, null) && Intrinsics.d(this.f116762a, bVar.f116762a) && Intrinsics.d(this.f116763b, bVar.f116763b) && this.f116764c == bVar.f116764c && Intrinsics.d(this.f116765d, bVar.f116765d) && Intrinsics.d(this.f116766e, bVar.f116766e) && this.f116767f == bVar.f116767f && Intrinsics.d(this.f116768g, bVar.f116768g) && Intrinsics.d(this.f116769h, bVar.f116769h) && Intrinsics.d(this.f116770i, bVar.f116770i) && Intrinsics.d(this.f116771j, bVar.f116771j) && Intrinsics.d(this.f116772k, bVar.f116772k);
    }

    public final int hashCode() {
        Long l13 = this.f116762a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        Long l14 = this.f116763b;
        int hashCode2 = (hashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        e eVar = this.f116764c;
        int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Map map = this.f116765d;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f116766e;
        int hashCode5 = (hashCode4 + (map2 == null ? 0 : map2.hashCode())) * 31;
        m mVar = this.f116767f;
        int hashCode6 = (hashCode5 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        String str = this.f116768g;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f116769h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f116770i;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.f116771j;
        int hashCode10 = (hashCode9 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Map map3 = this.f116772k;
        return hashCode10 + (map3 != null ? map3.hashCode() : 0);
    }

    public final String toString() {
        return "SurveyResult(timestamp=null, userId=" + this.f116762a + ", surveyId=" + this.f116763b + ", surveySource=" + this.f116764c + ", questionAndAnswers=" + this.f116765d + ", questionAndChosenAnswers=" + this.f116766e + ", appType=" + this.f116767f + ", appVersion=" + this.f116768g + ", isPartial=" + this.f116769h + ", surveyMethod=" + this.f116770i + ", surveyInvite=" + this.f116771j + ", questionAndElapsedTimingsMs=" + this.f116772k + ")";
    }
}

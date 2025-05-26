package gd0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f64796a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64797b;

    /* renamed from: c, reason: collision with root package name */
    public final String f64798c;

    /* renamed from: d, reason: collision with root package name */
    public final String f64799d;

    /* renamed from: e, reason: collision with root package name */
    public final String f64800e;

    /* renamed from: f, reason: collision with root package name */
    public final String f64801f;

    public a(String userId, String startDate, String endDate, String str, String str2) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter("IMPRESSION,TOTAL_AUDIENCE,ENGAGERS", "metricsTypes");
        Intrinsics.checkNotNullParameter("", "pinFormat");
        Intrinsics.checkNotNullParameter("0", "includeCurated");
        this.f64796a = userId;
        this.f64797b = startDate;
        this.f64798c = endDate;
        this.f64799d = "";
        this.f64800e = str;
        this.f64801f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!Intrinsics.d(this.f64796a, aVar.f64796a) || !Intrinsics.d(this.f64797b, aVar.f64797b) || !Intrinsics.d(this.f64798c, aVar.f64798c) || !Intrinsics.d("IMPRESSION,TOTAL_AUDIENCE,ENGAGERS", "IMPRESSION,TOTAL_AUDIENCE,ENGAGERS") || !Intrinsics.d(this.f64799d, aVar.f64799d) || !Intrinsics.d("0", "0")) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.d(bool, bool) || !Intrinsics.d(bool, bool) || !Intrinsics.d(this.f64800e, aVar.f64800e) || !Intrinsics.d(this.f64801f, aVar.f64801f)) {
            return false;
        }
        Boolean bool2 = Boolean.FALSE;
        return Intrinsics.d(bool2, bool2) && Intrinsics.d(null, null) && Intrinsics.d(null, null) && Intrinsics.d(null, null) && Intrinsics.d(null, null) && Intrinsics.d(null, null) && Intrinsics.d(null, null) && Intrinsics.d(null, null);
    }

    public final int hashCode() {
        int e13 = ep.b.e(true, (((this.f64799d.hashCode() + ((((this.f64798c.hashCode() + cb.d(this.f64797b, this.f64796a.hashCode() * 31, 31)) * 31) - 1356312308) * 31)) * 31) + 48) * 31, 31);
        Boolean bool = Boolean.TRUE;
        int hashCode = (bool.hashCode() + ((bool.hashCode() + e13) * 31)) * 31;
        String str = this.f64800e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64801f;
        return (Boolean.FALSE.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 1742810335;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AnalyticsMetricsRequestParams(userId=");
        sb3.append(this.f64796a);
        sb3.append(", startDate=");
        sb3.append(this.f64797b);
        sb3.append(", endDate=");
        sb3.append(this.f64798c);
        sb3.append(", metricsTypes=IMPRESSION,TOTAL_AUDIENCE,ENGAGERS, pinFormat=");
        sb3.append(this.f64799d);
        sb3.append(", includeCurated=0, useDailyBuckets=true, includeRealtime=");
        Boolean bool = Boolean.TRUE;
        sb3.append(bool);
        sb3.append(", includeOffline=");
        sb3.append(bool);
        sb3.append(", startTimestamp=");
        sb3.append(this.f64800e);
        sb3.append(", endTimestamp=");
        sb3.append(this.f64801f);
        sb3.append(", useHourlyBuckets=");
        return a.c.h(sb3, Boolean.FALSE, ", splitType=null, paid=null, appTypes=null, inProfile=null, claimedAccountType=null, ownedContentList=null, fromOwnedContent=null)");
    }
}

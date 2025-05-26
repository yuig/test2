package rx;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f110158a;

    /* renamed from: b, reason: collision with root package name */
    public final String f110159b;

    /* renamed from: c, reason: collision with root package name */
    public final String f110160c;

    /* renamed from: d, reason: collision with root package name */
    public final String f110161d;

    /* renamed from: e, reason: collision with root package name */
    public final String f110162e;

    /* renamed from: f, reason: collision with root package name */
    public final String f110163f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f110164g;

    /* renamed from: h, reason: collision with root package name */
    public final int f110165h;

    /* renamed from: i, reason: collision with root package name */
    public String f110166i;

    /* renamed from: j, reason: collision with root package name */
    public String f110167j;

    /* renamed from: k, reason: collision with root package name */
    public final String f110168k;

    /* renamed from: l, reason: collision with root package name */
    public final String f110169l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f110170m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f110171n;

    /* renamed from: o, reason: collision with root package name */
    public final String f110172o;

    /* renamed from: p, reason: collision with root package name */
    public final String f110173p;

    /* renamed from: q, reason: collision with root package name */
    public final String f110174q;

    /* renamed from: r, reason: collision with root package name */
    public final String f110175r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f110176s;

    static {
        e.ALL.getValue();
    }

    public f(String userId, String startDate, String endDate, String includeCurated, String str, String str2, Boolean bool, int i13, String pinFormat, Integer num, boolean z13, String str3, String str4, String str5, String str6, Integer num2) {
        String fields = n00.b.a(n00.c.PIN_STATS_PIN_FEED);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(includeCurated, "includeCurated");
        Intrinsics.checkNotNullParameter("IMPRESSION", "sortBy");
        Intrinsics.checkNotNullParameter("IMPRESSION", "metricTypes");
        Intrinsics.checkNotNullParameter(pinFormat, "pinFormat");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f110158a = userId;
        this.f110159b = startDate;
        this.f110160c = endDate;
        this.f110161d = includeCurated;
        this.f110162e = str;
        this.f110163f = str2;
        this.f110164g = bool;
        this.f110165h = i13;
        this.f110166i = "IMPRESSION";
        this.f110167j = "IMPRESSION";
        this.f110168k = pinFormat;
        this.f110169l = fields;
        this.f110170m = num;
        this.f110171n = z13;
        this.f110172o = str3;
        this.f110173p = str4;
        this.f110174q = str5;
        this.f110175r = str6;
        this.f110176s = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f110158a, fVar.f110158a) && Intrinsics.d(this.f110159b, fVar.f110159b) && Intrinsics.d(this.f110160c, fVar.f110160c) && Intrinsics.d(this.f110161d, fVar.f110161d) && Intrinsics.d(this.f110162e, fVar.f110162e) && Intrinsics.d(this.f110163f, fVar.f110163f) && Intrinsics.d(this.f110164g, fVar.f110164g) && this.f110165h == fVar.f110165h && Intrinsics.d(this.f110166i, fVar.f110166i) && Intrinsics.d(this.f110167j, fVar.f110167j) && Intrinsics.d(this.f110168k, fVar.f110168k) && Intrinsics.d(this.f110169l, fVar.f110169l) && Intrinsics.d(this.f110170m, fVar.f110170m) && this.f110171n == fVar.f110171n && Intrinsics.d(this.f110172o, fVar.f110172o) && Intrinsics.d(this.f110173p, fVar.f110173p) && Intrinsics.d(this.f110174q, fVar.f110174q) && Intrinsics.d(this.f110175r, fVar.f110175r) && Intrinsics.d(this.f110176s, fVar.f110176s);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f110161d, cb.d(this.f110160c, cb.d(this.f110159b, this.f110158a.hashCode() * 31, 31), 31), 31);
        String str = this.f110162e;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f110163f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f110164g;
        int d13 = cb.d(this.f110169l, cb.d(this.f110168k, cb.d(this.f110167j, cb.d(this.f110166i, ep.b.b(this.f110165h, (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31), 31), 31), 31);
        Integer num = this.f110170m;
        int e13 = ep.b.e(this.f110171n, (d13 + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str3 = this.f110172o;
        int hashCode3 = (e13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f110173p;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f110174q;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f110175r;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.f110176s;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f110166i;
        String str2 = this.f110167j;
        Integer num = this.f110170m;
        StringBuilder sb3 = new StringBuilder("TopPinFeedRequestParameters(userId=");
        sb3.append(this.f110158a);
        sb3.append(", startDate=");
        sb3.append(this.f110159b);
        sb3.append(", endDate=");
        sb3.append(this.f110160c);
        sb3.append(", includeCurated=");
        sb3.append(this.f110161d);
        sb3.append(", startTimestamp=");
        sb3.append(this.f110162e);
        sb3.append(", endTimestamp=");
        sb3.append(this.f110163f);
        sb3.append(", includeRealtime=");
        sb3.append(this.f110164g);
        sb3.append(", numOfPins=");
        a.a.A(sb3, this.f110165h, ", sortBy=", str, ", metricTypes=");
        sb3.append(str2);
        sb3.append(", pinFormat=");
        sb3.append(this.f110168k);
        sb3.append(", fields=");
        sb3.append(this.f110169l);
        sb3.append(", createdInLastNDays=");
        sb3.append(num);
        sb3.append(", includeOffline=");
        sb3.append(this.f110171n);
        sb3.append(", paid=");
        sb3.append(this.f110172o);
        sb3.append(", appTypes=");
        sb3.append(this.f110173p);
        sb3.append(", inProfile=");
        sb3.append(this.f110174q);
        sb3.append(", ownedContentList=");
        sb3.append(this.f110175r);
        sb3.append(", fromOwnedContent=");
        return a.c.i(sb3, this.f110176s, ")");
    }
}

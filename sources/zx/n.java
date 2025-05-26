package zx;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f142983a;

    /* renamed from: b, reason: collision with root package name */
    public final String f142984b;

    /* renamed from: c, reason: collision with root package name */
    public final String f142985c;

    /* renamed from: d, reason: collision with root package name */
    public final String f142986d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f142987e;

    /* renamed from: f, reason: collision with root package name */
    public final String f142988f;

    /* renamed from: g, reason: collision with root package name */
    public final String f142989g;

    /* renamed from: h, reason: collision with root package name */
    public final String f142990h;

    /* renamed from: i, reason: collision with root package name */
    public final String f142991i;

    /* renamed from: j, reason: collision with root package name */
    public final String f142992j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f142993k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f142994l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f142995m;

    /* renamed from: n, reason: collision with root package name */
    public final String f142996n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f142997o;

    public n(String startDate, String endDate, String startTimestamp, String endTimestamp, boolean z13, String includeCurated, String paid, String appTypes, String inProfile, String pinFormat, boolean z14, boolean z15, boolean z16, String str, Integer num) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
        Intrinsics.checkNotNullParameter(endTimestamp, "endTimestamp");
        Intrinsics.checkNotNullParameter(includeCurated, "includeCurated");
        Intrinsics.checkNotNullParameter(paid, "paid");
        Intrinsics.checkNotNullParameter(appTypes, "appTypes");
        Intrinsics.checkNotNullParameter(inProfile, "inProfile");
        Intrinsics.checkNotNullParameter(pinFormat, "pinFormat");
        this.f142983a = startDate;
        this.f142984b = endDate;
        this.f142985c = startTimestamp;
        this.f142986d = endTimestamp;
        this.f142987e = z13;
        this.f142988f = includeCurated;
        this.f142989g = paid;
        this.f142990h = appTypes;
        this.f142991i = inProfile;
        this.f142992j = pinFormat;
        this.f142993k = z14;
        this.f142994l = z15;
        this.f142995m = z16;
        this.f142996n = str;
        this.f142997o = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f142983a, nVar.f142983a) && Intrinsics.d(this.f142984b, nVar.f142984b) && Intrinsics.d(this.f142985c, nVar.f142985c) && Intrinsics.d(this.f142986d, nVar.f142986d) && this.f142987e == nVar.f142987e && Intrinsics.d(this.f142988f, nVar.f142988f) && Intrinsics.d(this.f142989g, nVar.f142989g) && Intrinsics.d(this.f142990h, nVar.f142990h) && Intrinsics.d(this.f142991i, nVar.f142991i) && Intrinsics.d(this.f142992j, nVar.f142992j) && this.f142993k == nVar.f142993k && this.f142994l == nVar.f142994l && this.f142995m == nVar.f142995m && Intrinsics.d(this.f142996n, nVar.f142996n) && Intrinsics.d(this.f142997o, nVar.f142997o);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f142995m, ep.b.e(this.f142994l, ep.b.e(this.f142993k, cb.d(this.f142992j, cb.d(this.f142991i, cb.d(this.f142990h, cb.d(this.f142989g, cb.d(this.f142988f, ep.b.e(this.f142987e, cb.d(this.f142986d, cb.d(this.f142985c, cb.d(this.f142984b, this.f142983a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.f142996n;
        int hashCode = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f142997o;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FilterRequestParams(startDate=");
        sb3.append(this.f142983a);
        sb3.append(", endDate=");
        sb3.append(this.f142984b);
        sb3.append(", startTimestamp=");
        sb3.append(this.f142985c);
        sb3.append(", endTimestamp=");
        sb3.append(this.f142986d);
        sb3.append(", includeRealTime=");
        sb3.append(this.f142987e);
        sb3.append(", includeCurated=");
        sb3.append(this.f142988f);
        sb3.append(", paid=");
        sb3.append(this.f142989g);
        sb3.append(", appTypes=");
        sb3.append(this.f142990h);
        sb3.append(", inProfile=");
        sb3.append(this.f142991i);
        sb3.append(", pinFormat=");
        sb3.append(this.f142992j);
        sb3.append(", includeOffline=");
        sb3.append(this.f142993k);
        sb3.append(", useDailyBucket=");
        sb3.append(this.f142994l);
        sb3.append(", useHourlyBucket=");
        sb3.append(this.f142995m);
        sb3.append(", ownedContantList=");
        sb3.append(this.f142996n);
        sb3.append(", fromOwnedContent=");
        return a.c.i(sb3, this.f142997o, ")");
    }
}

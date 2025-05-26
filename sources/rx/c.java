package rx;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f110142a;

    /* renamed from: b, reason: collision with root package name */
    public final String f110143b;

    /* renamed from: c, reason: collision with root package name */
    public final String f110144c;

    /* renamed from: d, reason: collision with root package name */
    public final String f110145d;

    /* renamed from: e, reason: collision with root package name */
    public final String f110146e;

    /* renamed from: f, reason: collision with root package name */
    public final String f110147f;

    /* renamed from: g, reason: collision with root package name */
    public final String f110148g;

    /* renamed from: h, reason: collision with root package name */
    public final String f110149h;

    /* renamed from: i, reason: collision with root package name */
    public final String f110150i;

    public c(String pinId, String startDate, String endDate, String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f110142a = pinId;
        this.f110143b = startDate;
        this.f110144c = endDate;
        this.f110145d = str;
        this.f110146e = str2;
        this.f110147f = str3;
        this.f110148g = str4;
        this.f110149h = str5;
        this.f110150i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f110142a, cVar.f110142a) && Intrinsics.d(this.f110143b, cVar.f110143b) && Intrinsics.d(this.f110144c, cVar.f110144c) && Intrinsics.d(this.f110145d, cVar.f110145d) && Intrinsics.d(this.f110146e, cVar.f110146e) && Intrinsics.d(this.f110147f, cVar.f110147f) && Intrinsics.d(this.f110148g, cVar.f110148g) && Intrinsics.d(this.f110149h, cVar.f110149h) && Intrinsics.d(this.f110150i, cVar.f110150i);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f110144c, cb.d(this.f110143b, this.f110142a.hashCode() * 31, 31), 31);
        String str = this.f110145d;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f110146e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f110147f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f110148g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f110149h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f110150i;
        return Boolean.hashCode(true) + ep.b.e(true, ep.b.e(false, (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinMetricsRequestParameters(pinId=");
        sb3.append(this.f110142a);
        sb3.append(", startDate=");
        sb3.append(this.f110143b);
        sb3.append(", endDate=");
        sb3.append(this.f110144c);
        sb3.append(", metricTypes=");
        sb3.append(this.f110145d);
        sb3.append(", splitType=");
        sb3.append(this.f110146e);
        sb3.append(", paid=");
        sb3.append(this.f110147f);
        sb3.append(", inProfile=");
        sb3.append(this.f110148g);
        sb3.append(", appTypes=");
        sb3.append(this.f110149h);
        sb3.append(", videoMetricTypes=");
        return a.a.p(sb3, this.f110150i, ", includeHourly=false, includeDaily=true, includeRealtimeData=true)");
    }
}

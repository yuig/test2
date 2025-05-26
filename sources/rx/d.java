package rx;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f110151a;

    /* renamed from: b, reason: collision with root package name */
    public final String f110152b;

    /* renamed from: c, reason: collision with root package name */
    public final String f110153c;

    /* renamed from: d, reason: collision with root package name */
    public final px.f f110154d;

    /* renamed from: e, reason: collision with root package name */
    public final List f110155e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f110156f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f110157g;

    public d(String pinId, String startDate, String endDate, px.f metricTypes, ArrayList pinIdList, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(metricTypes, "metricTypes");
        Intrinsics.checkNotNullParameter(pinIdList, "pinIdList");
        this.f110151a = pinId;
        this.f110152b = startDate;
        this.f110153c = endDate;
        this.f110154d = metricTypes;
        this.f110155e = pinIdList;
        this.f110156f = z13;
        this.f110157g = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f110151a, dVar.f110151a) && Intrinsics.d(this.f110152b, dVar.f110152b) && Intrinsics.d(this.f110153c, dVar.f110153c) && this.f110154d == dVar.f110154d && Intrinsics.d("PRODUCT_TAG", "PRODUCT_TAG") && Intrinsics.d(this.f110155e, dVar.f110155e) && this.f110156f == dVar.f110156f && this.f110157g == dVar.f110157g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110157g) + ep.b.e(this.f110156f, ep.b.c(this.f110155e, (((this.f110154d.hashCode() + cb.d(this.f110153c, cb.d(this.f110152b, this.f110151a.hashCode() * 31, 31), 31)) * 31) + 662621194) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProductTagsRequestParameters(pinId=");
        sb3.append(this.f110151a);
        sb3.append(", startDate=");
        sb3.append(this.f110152b);
        sb3.append(", endDate=");
        sb3.append(this.f110153c);
        sb3.append(", metricTypes=");
        sb3.append(this.f110154d);
        sb3.append(", splitType=PRODUCT_TAG, pinIdList=");
        sb3.append(this.f110155e);
        sb3.append(", includeDaily=");
        sb3.append(this.f110156f);
        sb3.append(", includeRealtime=");
        return a.a.r(sb3, this.f110157g, ")");
    }
}

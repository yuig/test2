package jw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ww1.c f77663a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f77664b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f77665c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f77666d;

    public /* synthetic */ a(ww1.c cVar, Integer num) {
        this(cVar, num, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f77663a == aVar.f77663a && Intrinsics.d(this.f77664b, aVar.f77664b) && Intrinsics.d(this.f77665c, aVar.f77665c) && this.f77666d == aVar.f77666d;
    }

    public final int hashCode() {
        int hashCode = this.f77663a.hashCode() * 31;
        Integer num = this.f77664b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d2 = this.f77665c;
        return Boolean.hashCode(this.f77666d) + ((hashCode2 + (d2 != null ? d2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MetricItem(metricType=" + this.f77663a + ", value=" + this.f77664b + ", percentage=" + this.f77665c + ", isClickable=" + this.f77666d + ")";
    }

    public a(ww1.c metricType, Integer num, Double d2, boolean z13) {
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        this.f77663a = metricType;
        this.f77664b = num;
        this.f77665c = d2;
        this.f77666d = z13;
    }
}

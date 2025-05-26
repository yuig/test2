package we1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final uk1.d f129551a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f129552b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f129553c;

    /* renamed from: d, reason: collision with root package name */
    public final nx.d1 f129554d;

    /* renamed from: e, reason: collision with root package name */
    public final int f129555e;

    /* renamed from: f, reason: collision with root package name */
    public final String f129556f;

    public p2(uk1.d presenterPinalytics, i2 carouselConfig, m60.w eventManager, nx.d1 trackingParamAttacher, int i13, String trafficSource) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(carouselConfig, "carouselConfig");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        this.f129551a = presenterPinalytics;
        this.f129552b = carouselConfig;
        this.f129553c = eventManager;
        this.f129554d = trackingParamAttacher;
        this.f129555e = i13;
        this.f129556f = trafficSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return Intrinsics.d(this.f129551a, p2Var.f129551a) && Intrinsics.d(this.f129552b, p2Var.f129552b) && Intrinsics.d(this.f129553c, p2Var.f129553c) && Intrinsics.d(this.f129554d, p2Var.f129554d) && this.f129555e == p2Var.f129555e && Intrinsics.d(this.f129556f, p2Var.f129556f);
    }

    public final int hashCode() {
        return this.f129556f.hashCode() + ep.b.b(this.f129555e, (this.f129554d.hashCode() + ((this.f129553c.hashCode() + ((this.f129552b.hashCode() + (this.f129551a.hashCode() * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "UniversalCarouselParams(presenterPinalytics=" + this.f129551a + ", carouselConfig=" + this.f129552b + ", eventManager=" + this.f129553c + ", trackingParamAttacher=" + this.f129554d + ", itemRepWidth=" + this.f129555e + ", trafficSource=" + this.f129556f + ")";
    }
}

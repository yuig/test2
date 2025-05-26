package ur;

import es.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final es.a f123058a;

    /* renamed from: b, reason: collision with root package name */
    public final vr.a f123059b;

    /* renamed from: c, reason: collision with root package name */
    public final h f123060c;

    public b(es.a adFormats, vr.a adsCommonAnalytics, h adsCommonDisplay) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonAnalytics, "adsCommonAnalytics");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f123058a = adFormats;
        this.f123059b = adsCommonAnalytics;
        this.f123060c = adsCommonDisplay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f123058a, bVar.f123058a) && Intrinsics.d(this.f123059b, bVar.f123059b) && Intrinsics.d(this.f123060c, bVar.f123060c);
    }

    public final int hashCode() {
        return this.f123060c.hashCode() + ((this.f123059b.hashCode() + (this.f123058a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AdsCoreDependenciesImpl(adFormats=" + this.f123058a + ", adsCommonAnalytics=" + this.f123059b + ", adsCommonDisplay=" + this.f123060c + ")";
    }
}

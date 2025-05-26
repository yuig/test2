package lt;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.o;

/* loaded from: classes3.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f84725a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f84726b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f84727c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f84728d;

    /* renamed from: e, reason: collision with root package name */
    public final bj.f f84729e;

    public a(i0 title, i0 subtitle, i0 promotedAttribution, i0 ctaText, bj.f fVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(promotedAttribution, "promotedAttribution");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        this.f84725a = title;
        this.f84726b = subtitle;
        this.f84727c = promotedAttribution;
        this.f84728d = ctaText;
        this.f84729e = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f84725a, aVar.f84725a) && Intrinsics.d(this.f84726b, aVar.f84726b) && Intrinsics.d(this.f84727c, aVar.f84727c) && Intrinsics.d(this.f84728d, aVar.f84728d) && Intrinsics.d(this.f84729e, aVar.f84729e);
    }

    public final int hashCode() {
        int d2 = ep.b.d(this.f84728d, ep.b.d(this.f84727c, ep.b.d(this.f84726b, this.f84725a.hashCode() * 31, 31), 31), 31);
        bj.f fVar = this.f84729e;
        return d2 + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        return "AdsGmaCloseupDisplayState(title=" + this.f84725a + ", subtitle=" + this.f84726b + ", promotedAttribution=" + this.f84727c + ", ctaText=" + this.f84728d + ", nativeAd=" + this.f84729e + ")";
    }
}

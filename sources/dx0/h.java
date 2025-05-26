package dx0;

import h32.i0;
import h32.v2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f56439a;

    /* renamed from: b, reason: collision with root package name */
    public final v2 f56440b;

    public h(i0 pinalyticsContext, v2 storyImpression) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Intrinsics.checkNotNullParameter(storyImpression, "storyImpression");
        this.f56439a = pinalyticsContext;
        this.f56440b = storyImpression;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f56439a, hVar.f56439a) && Intrinsics.d(this.f56440b, hVar.f56440b);
    }

    public final int hashCode() {
        return this.f56440b.hashCode() + (this.f56439a.hashCode() * 31);
    }

    public final String toString() {
        return "ShopTheLookCarouselImpressionEnd(pinalyticsContext=" + this.f56439a + ", storyImpression=" + this.f56440b + ")";
    }
}

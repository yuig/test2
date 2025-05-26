package bx0;

import h32.i0;
import h32.v2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements s {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f24081a;

    /* renamed from: b, reason: collision with root package name */
    public final v2 f24082b;

    public o(i0 pinalyticsContext, v2 storyImpression) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Intrinsics.checkNotNullParameter(storyImpression, "storyImpression");
        this.f24081a = pinalyticsContext;
        this.f24082b = storyImpression;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f24081a, oVar.f24081a) && Intrinsics.d(this.f24082b, oVar.f24082b);
    }

    public final int hashCode() {
        return this.f24082b.hashCode() + (this.f24081a.hashCode() * 31);
    }

    public final String toString() {
        return "STLFocusCarouselImpressionEnd(pinalyticsContext=" + this.f24081a + ", storyImpression=" + this.f24082b + ")";
    }
}

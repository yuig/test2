package yw0;

import h32.i0;
import h32.v2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f140301a;

    /* renamed from: b, reason: collision with root package name */
    public final v2 f140302b;

    public h(i0 pinalyticsContext, v2 storyImpression) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Intrinsics.checkNotNullParameter(storyImpression, "storyImpression");
        this.f140301a = pinalyticsContext;
        this.f140302b = storyImpression;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f140301a, hVar.f140301a) && Intrinsics.d(this.f140302b, hVar.f140302b);
    }

    public final int hashCode() {
        return this.f140302b.hashCode() + (this.f140301a.hashCode() * 31);
    }

    public final String toString() {
        return "SeeItStyledCarouselImpressionEnd(pinalyticsContext=" + this.f140301a + ", storyImpression=" + this.f140302b + ")";
    }
}

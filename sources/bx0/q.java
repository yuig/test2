package bx0;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements s {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f24084a;

    public q(i0 pinalyticsContext) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f24084a = pinalyticsContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f24084a, ((q) obj).f24084a);
    }

    public final int hashCode() {
        return this.f24084a.hashCode();
    }

    public final String toString() {
        return "ShopTheLookCarouselRefreshed(pinalyticsContext=" + this.f24084a + ")";
    }
}

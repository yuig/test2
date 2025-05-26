package h60;

import h32.i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.s;

/* loaded from: classes5.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final List f67782a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f67783b;

    public b(ArrayList clusterIds, i0 pinalyticsContext) {
        Intrinsics.checkNotNullParameter(clusterIds, "clusterIds");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f67782a = clusterIds;
        this.f67783b = pinalyticsContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f67782a, bVar.f67782a) && Intrinsics.d(this.f67783b, bVar.f67783b);
    }

    public final int hashCode() {
        return this.f67783b.hashCode() + (this.f67782a.hashCode() * 31);
    }

    public final String toString() {
        return "FirstBindToView(clusterIds=" + this.f67782a + ", pinalyticsContext=" + this.f67783b + ")";
    }
}

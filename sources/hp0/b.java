package hp0;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f69821a;

    /* renamed from: b, reason: collision with root package name */
    public final List f69822b;

    /* renamed from: c, reason: collision with root package name */
    public final zy.a0 f69823c;

    public b(int i13, List carouselItems, zy.a0 pinalyticsState) {
        Intrinsics.checkNotNullParameter(carouselItems, "carouselItems");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f69821a = i13;
        this.f69822b = carouselItems;
        this.f69823c = pinalyticsState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f69821a == bVar.f69821a && Intrinsics.d(this.f69822b, bVar.f69822b) && Intrinsics.d(this.f69823c, bVar.f69823c);
    }

    public final int hashCode() {
        return this.f69823c.hashCode() + ep.b.c(this.f69822b, Integer.hashCode(this.f69821a) * 31, 31);
    }

    public final String toString() {
        return "QcmDrawerDisplayState(initialPosition=" + this.f69821a + ", carouselItems=" + this.f69822b + ", pinalyticsState=" + this.f69823c + ")";
    }

    public b() {
        this(0, q0.f80391a, new zy.a0());
    }
}

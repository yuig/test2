package u21;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f120071a;

    /* renamed from: b, reason: collision with root package name */
    public final List f120072b;

    /* renamed from: c, reason: collision with root package name */
    public final zy.a0 f120073c;

    public b(String title, List pinImageUrls, zy.a0 pinalyticsDisplayState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pinImageUrls, "pinImageUrls");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        this.f120071a = title;
        this.f120072b = pinImageUrls;
        this.f120073c = pinalyticsDisplayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f120071a, bVar.f120071a) && Intrinsics.d(this.f120072b, bVar.f120072b) && Intrinsics.d(this.f120073c, bVar.f120073c);
    }

    public final int hashCode() {
        return this.f120073c.hashCode() + ep.b.c(this.f120072b, this.f120071a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PinOrSpinRewardDisplayState(title=" + this.f120071a + ", pinImageUrls=" + this.f120072b + ", pinalyticsDisplayState=" + this.f120073c + ")";
    }
}

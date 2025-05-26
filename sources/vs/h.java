package vs;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final g f126484a;

    /* renamed from: b, reason: collision with root package name */
    public final List f126485b;

    public h(g pin, List fullAdsData) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(fullAdsData, "fullAdsData");
        this.f126484a = pin;
        this.f126485b = fullAdsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f126484a, hVar.f126484a) && Intrinsics.d(this.f126485b, hVar.f126485b);
    }

    public final int hashCode() {
        return this.f126485b.hashCode() + (this.f126484a.hashCode() * 31);
    }

    public final String toString() {
        return "AdsDebuggerDisplayState(pin=" + this.f126484a + ", fullAdsData=" + this.f126485b + ")";
    }
}

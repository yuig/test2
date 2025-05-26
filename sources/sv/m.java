package sv;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m implements o {

    /* renamed from: a, reason: collision with root package name */
    public final List f115307a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f115308b;

    public m(List cutouts, boolean z13) {
        Intrinsics.checkNotNullParameter(cutouts, "cutouts");
        this.f115307a = cutouts;
        this.f115308b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f115307a, mVar.f115307a) && this.f115308b == mVar.f115308b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115308b) + (this.f115307a.hashCode() * 31);
    }

    public final String toString() {
        return "CutoutsLoaded(cutouts=" + this.f115307a + ", hasError=" + this.f115308b + ")";
    }
}

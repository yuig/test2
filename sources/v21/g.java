package v21;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final List f123879a;

    /* renamed from: b, reason: collision with root package name */
    public final List f123880b;

    public g(List imageUrls, List pinIds) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        this.f123879a = imageUrls;
        this.f123880b = pinIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f123879a, gVar.f123879a) && Intrinsics.d(this.f123880b, gVar.f123880b);
    }

    public final int hashCode() {
        return this.f123880b.hashCode() + (this.f123879a.hashCode() * 31);
    }

    public final String toString() {
        return "RevealClicked(imageUrls=" + this.f123879a + ", pinIds=" + this.f123880b + ")";
    }
}

package v21;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements z {

    /* renamed from: a, reason: collision with root package name */
    public final List f123905a;

    /* renamed from: b, reason: collision with root package name */
    public final List f123906b;

    public x(List imageUrls, List pinIds) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        this.f123905a = imageUrls;
        this.f123906b = pinIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f123905a, xVar.f123905a) && Intrinsics.d(this.f123906b, xVar.f123906b);
    }

    public final int hashCode() {
        return this.f123906b.hashCode() + (this.f123905a.hashCode() * 31);
    }

    public final String toString() {
        return "RevealClicked(imageUrls=" + this.f123905a + ", pinIds=" + this.f123906b + ")";
    }
}

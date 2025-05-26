package li1;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements p {

    /* renamed from: a, reason: collision with root package name */
    public final String f83576a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f83577b;

    public o(i0 pinalyticsContext, String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f83576a = pinUid;
        this.f83577b = pinalyticsContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f83576a, oVar.f83576a) && Intrinsics.d(this.f83577b, oVar.f83577b);
    }

    public final int hashCode() {
        return this.f83577b.hashCode() + (this.f83576a.hashCode() * 31);
    }

    public final String toString() {
        return "OptOutRequest(pinUid=" + this.f83576a + ", pinalyticsContext=" + this.f83577b + ")";
    }
}

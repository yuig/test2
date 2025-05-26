package rm0;

import kotlin.jvm.internal.Intrinsics;
import om0.h;
import om0.m;
import om0.r;
import u50.h0;
import u50.i0;
import u50.o;

/* loaded from: classes5.dex */
public final class a implements o {

    /* renamed from: c, reason: collision with root package name */
    public static final a f108681c = new a(h0.f120562a, new r(h.f96502a, m.f96537a, new om0.o(null, null, 7)));

    /* renamed from: a, reason: collision with root package name */
    public final i0 f108682a;

    /* renamed from: b, reason: collision with root package name */
    public final r f108683b;

    public a(i0 title, r metadataState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(metadataState, "metadataState");
        this.f108682a = title;
        this.f108683b = metadataState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f108682a, aVar.f108682a) && Intrinsics.d(this.f108683b, aVar.f108683b);
    }

    public final int hashCode() {
        return this.f108683b.hashCode() + (this.f108682a.hashCode() * 31);
    }

    public final String toString() {
        return "BoardLandingHeaderState(title=" + this.f108682a + ", metadataState=" + this.f108683b + ")";
    }
}

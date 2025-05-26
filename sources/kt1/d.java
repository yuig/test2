package kt1;

import kotlin.jvm.internal.Intrinsics;
import nt1.f;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final f f80875a;

    /* renamed from: b, reason: collision with root package name */
    public long f80876b;

    public d(f durationEstimator, long j13) {
        Intrinsics.checkNotNullParameter(durationEstimator, "durationEstimator");
        this.f80875a = durationEstimator;
        this.f80876b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f80875a, dVar.f80875a) && this.f80876b == dVar.f80876b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f80876b) + (this.f80875a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackInfo(durationEstimator=" + this.f80875a + ", lastTimeStampUs=" + this.f80876b + ")";
    }
}

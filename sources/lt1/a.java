package lt1;

import et1.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f84791a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f84792b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84793c;

    public a(long j13, j0 sampleType, int i13) {
        Intrinsics.checkNotNullParameter(sampleType, "sampleType");
        this.f84791a = j13;
        this.f84792b = sampleType;
        this.f84793c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f84791a == aVar.f84791a && this.f84792b == aVar.f84792b && this.f84793c == aVar.f84793c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f84793c) + ((this.f84792b.hashCode() + (Long.hashCode(this.f84791a) * 31)) * 31);
    }

    public final String toString() {
        return "DemuxedInfo(presentationTimeUs=" + this.f84791a + ", sampleType=" + this.f84792b + ", trackIndexForSampleType=" + this.f84793c + ")";
    }
}

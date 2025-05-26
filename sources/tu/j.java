package tu;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j implements t {

    /* renamed from: a, reason: collision with root package name */
    public final long f119291a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f119292b;

    public j(long j13, i0 loggingContext) {
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        this.f119291a = j13;
        this.f119292b = loggingContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f119291a == jVar.f119291a && Intrinsics.d(this.f119292b, jVar.f119292b);
    }

    public final int hashCode() {
        return this.f119292b.hashCode() + (Long.hashCode(this.f119291a) * 31);
    }

    public final String toString() {
        return "MatchingClickthroughEndEventReceived(timestamp=" + this.f119291a + ", loggingContext=" + this.f119292b + ")";
    }
}

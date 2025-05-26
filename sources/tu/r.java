package tu;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r implements t {

    /* renamed from: a, reason: collision with root package name */
    public final long f119306a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f119307b;

    public r(long j13, i0 loggingContext) {
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        this.f119306a = j13;
        this.f119307b = loggingContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f119306a == rVar.f119306a && Intrinsics.d(this.f119307b, rVar.f119307b);
    }

    public final int hashCode() {
        return this.f119307b.hashCode() + (Long.hashCode(this.f119306a) * 31);
    }

    public final String toString() {
        return "PinClickthroughStartEventReceived(timestamp=" + this.f119306a + ", loggingContext=" + this.f119307b + ")";
    }
}

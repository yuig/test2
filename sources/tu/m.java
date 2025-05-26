package tu;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m implements t {

    /* renamed from: a, reason: collision with root package name */
    public final long f119295a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f119296b;

    public m(long j13, i0 loggingContext) {
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        this.f119295a = j13;
        this.f119296b = loggingContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f119295a == mVar.f119295a && Intrinsics.d(this.f119296b, mVar.f119296b);
    }

    public final int hashCode() {
        return this.f119296b.hashCode() + (Long.hashCode(this.f119295a) * 31);
    }

    public final String toString() {
        return "OnBrowserClosed(timestamp=" + this.f119295a + ", loggingContext=" + this.f119296b + ")";
    }
}

package tu;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k implements t {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f119293a;

    public k(i0 loggingContext) {
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        this.f119293a = loggingContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f119293a, ((k) obj).f119293a);
    }

    public final int hashCode() {
        return this.f119293a.hashCode();
    }

    public final String toString() {
        return "NonMatchingClickthroughEndEventReceived(loggingContext=" + this.f119293a + ")";
    }
}

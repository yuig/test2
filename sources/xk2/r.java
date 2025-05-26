package xk2;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f135224a;

    public r(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f135224a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            if (Intrinsics.d(this.f135224a, ((r) obj).f135224a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f135224a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f135224a + ')';
    }
}

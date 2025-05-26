package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f58113a;

    public q(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f58113a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f58113a, ((q) obj).f58113a);
    }

    public final int hashCode() {
        return this.f58113a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("ErrorEvent(error="), this.f58113a, ")");
    }
}

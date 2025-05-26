package yy0;

import kotlin.jvm.internal.Intrinsics;
import zy.k0;

/* loaded from: classes5.dex */
public final class s implements t {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f140472a;

    public s(k0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f140472a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f140472a, ((s) obj).f140472a);
    }

    public final int hashCode() {
        return this.f140472a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingRequest(wrapped="), this.f140472a, ")");
    }
}

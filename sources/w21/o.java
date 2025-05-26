package w21;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements v {

    /* renamed from: a, reason: collision with root package name */
    public final String f127758a;

    public o(String errorMsg) {
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        this.f127758a = errorMsg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f127758a, ((o) obj).f127758a);
    }

    public final int hashCode() {
        return this.f127758a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ErrorExit(errorMsg="), this.f127758a, ")");
    }
}

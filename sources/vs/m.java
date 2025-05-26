package vs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m implements o {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f126494a;

    public m(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f126494a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f126494a, ((m) obj).f126494a);
    }

    public final int hashCode() {
        return this.f126494a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("PinLoadError(error="), this.f126494a, ")");
    }
}

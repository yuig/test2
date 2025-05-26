package bx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f24105a;

    public g(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f24105a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f24105a, ((g) obj).f24105a);
    }

    public final int hashCode() {
        return this.f24105a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("Error(error="), this.f24105a, ")");
    }
}

package iu1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f73702a;

    public g(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f73702a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f73702a, ((g) obj).f73702a);
    }

    public final int hashCode() {
        return this.f73702a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("NavUserLoadError(error="), this.f73702a, ")");
    }
}

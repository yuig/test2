package n91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f90043a;

    public g(Exception throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f90043a = throwable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f90043a, ((g) obj).f90043a);
    }

    public final int hashCode() {
        return this.f90043a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("OnVerificationCodeFailure(throwable="), this.f90043a, ")");
    }
}

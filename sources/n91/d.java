package n91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f90038a;

    public d(Exception throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f90038a = throwable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f90038a, ((d) obj).f90038a);
    }

    public final int hashCode() {
        return this.f90038a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("OnResendVerificationCodeFailure(throwable="), this.f90038a, ")");
    }
}

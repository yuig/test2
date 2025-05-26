package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f130977a;

    public k0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f130977a = throwable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && Intrinsics.d(this.f130977a, ((k0) obj).f130977a);
    }

    public final int hashCode() {
        return this.f130977a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("SignInInfoError(throwable="), this.f130977a, ")");
    }
}

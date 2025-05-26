package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f130979a;

    public l0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f130979a = throwable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f130979a, ((l0) obj).f130979a);
    }

    public final int hashCode() {
        return this.f130979a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("UserSearchSignInInfoError(throwable="), this.f130979a, ")");
    }
}

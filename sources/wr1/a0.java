package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f130937a;

    public a0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f130937a = throwable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f130937a, ((a0) obj).f130937a);
    }

    public final int hashCode() {
        return this.f130937a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("PasswordAuthError(throwable="), this.f130937a, ")");
    }
}

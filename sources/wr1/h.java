package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f130971a;

    public h(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f130971a = throwable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f130971a, ((h) obj).f130971a);
    }

    public final int hashCode() {
        return this.f130971a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("PasswordError(throwable="), this.f130971a, ")");
    }
}

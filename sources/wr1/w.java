package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f131024a;

    public w(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f131024a = throwable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f131024a, ((w) obj).f131024a);
    }

    public final int hashCode() {
        return this.f131024a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("GoogleAuthError(throwable="), this.f131024a, ")");
    }
}

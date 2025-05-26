package ww;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f131161a;

    public d(Exception throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f131161a = throwable;
    }

    public final Throwable a() {
        return this.f131161a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f131161a, ((d) obj).f131161a);
    }

    public final int hashCode() {
        return this.f131161a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("Failure(throwable="), this.f131161a, ")");
    }
}

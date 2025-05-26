package pm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f100682a;

    public m(Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f100682a = cause;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f100682a, ((m) obj).f100682a);
    }

    public final int hashCode() {
        return this.f100682a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("BoardLoadFailed(cause="), this.f100682a, ")");
    }
}

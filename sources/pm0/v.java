package pm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f100704a;

    public v(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f100704a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f100704a, ((v) obj).f100704a);
    }

    public final int hashCode() {
        return this.f100704a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("CollaboratorsLoadFailed(error="), this.f100704a, ")");
    }
}

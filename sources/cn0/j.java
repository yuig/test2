package cn0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends m {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f28080a;

    public j(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f28080a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f28080a, ((j) obj).f28080a);
    }

    public final int hashCode() {
        return this.f28080a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("Fail(error="), this.f28080a, ")");
    }
}

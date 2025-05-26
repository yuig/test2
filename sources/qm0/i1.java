package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f104283a;

    public i1(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f104283a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && Intrinsics.d(this.f104283a, ((i1) obj).f104283a);
    }

    public final int hashCode() {
        return this.f104283a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("LogHandledException(error="), this.f104283a, ")");
    }
}

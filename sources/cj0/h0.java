package cj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f27830a;

    public h0(Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f27830a = cause;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.d(this.f27830a, ((h0) obj).f27830a);
    }

    public final int hashCode() {
        return this.f27830a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("BoardLoadError(cause="), this.f27830a, ")");
    }
}

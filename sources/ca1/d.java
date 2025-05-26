package ca1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f27197a;

    public d(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f27197a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f27197a, ((d) obj).f27197a);
    }

    public final int hashCode() {
        return this.f27197a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("ErrorEvent(error="), this.f27197a, ")");
    }
}

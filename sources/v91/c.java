package v91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f124978a;

    public c(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f124978a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f124978a, ((c) obj).f124978a);
    }

    public final int hashCode() {
        return this.f124978a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("ErrorEvent(error="), this.f124978a, ")");
    }
}

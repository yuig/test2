package v72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n implements p {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f124445a;

    public n(RuntimeException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f124445a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f124445a, ((n) obj).f124445a);
    }

    public final int hashCode() {
        return this.f124445a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("LoadShuffleDataFailed(error="), this.f124445a, ")");
    }
}

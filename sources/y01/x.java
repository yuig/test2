package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f136501a;

    public x(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f136501a = exception;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f136501a, ((x) obj).f136501a);
    }

    public final int hashCode() {
        return this.f136501a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("OnFailedToLoadFeed(exception="), this.f136501a, ")");
    }
}

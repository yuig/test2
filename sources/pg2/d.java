package pg2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends i {

    /* renamed from: a */
    public final Throwable f100123a;

    public d(IllegalStateException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f100123a = exception;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f100123a, ((d) obj).f100123a);
    }

    public final int hashCode() {
        return this.f100123a.hashCode();
    }

    public final String toString() {
        return "Incomplete(exception=" + this.f100123a + ')';
    }
}

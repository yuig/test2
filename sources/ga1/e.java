package ga1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f64620a;

    public e(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f64620a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f64620a, ((e) obj).f64620a);
    }

    public final int hashCode() {
        return this.f64620a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("ErrorEvent(error="), this.f64620a, ")");
    }
}

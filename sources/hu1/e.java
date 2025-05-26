package hu1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f70418a;

    public e(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f70418a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f70418a, ((e) obj).f70418a);
    }

    public final int hashCode() {
        return this.f70418a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("NavUserLoadError(error="), this.f70418a, ")");
    }
}

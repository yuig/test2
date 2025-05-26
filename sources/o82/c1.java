package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f93548a;

    public c1(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f93548a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && Intrinsics.d(this.f93548a, ((c1) obj).f93548a);
    }

    public final int hashCode() {
        return this.f93548a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("Error(error="), this.f93548a, ")");
    }
}

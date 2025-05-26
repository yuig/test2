package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u1 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f93725a;

    public u1(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f93725a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1) && Intrinsics.d(this.f93725a, ((u1) obj).f93725a);
    }

    public final int hashCode() {
        return this.f93725a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("Error(error="), this.f93725a, ")");
    }
}

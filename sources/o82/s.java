package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s extends kg.q {

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f93705e;

    public s(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f93705e = error;
    }

    public final Throwable d() {
        return this.f93705e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f93705e, ((s) obj).f93705e);
    }

    public final int hashCode() {
        return this.f93705e.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("Error(error="), this.f93705e, ")");
    }
}

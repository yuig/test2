package u52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f120705a;

    public j0(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f120705a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Intrinsics.d(this.f120705a, ((j0) obj).f120705a);
    }

    public final int hashCode() {
        return this.f120705a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadingError(message="), this.f120705a, ")");
    }
}

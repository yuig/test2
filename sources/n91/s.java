package n91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements y {

    /* renamed from: a, reason: collision with root package name */
    public final String f90068a;

    public s(String newEmailAddress) {
        Intrinsics.checkNotNullParameter(newEmailAddress, "newEmailAddress");
        this.f90068a = newEmailAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f90068a, ((s) obj).f90068a);
    }

    public final int hashCode() {
        return this.f90068a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("NotifyEmailUpdatedRequest(newEmailAddress="), this.f90068a, ")");
    }
}

package ma1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f86783a;

    public g(String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f86783a = errorMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f86783a, ((g) obj).f86783a);
    }

    public final int hashCode() {
        return this.f86783a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SessionRevokedFailure(errorMessage="), this.f86783a, ")");
    }
}

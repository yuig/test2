package i90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f71779a;

    public f(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f71779a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f71779a, ((f) obj).f71779a);
    }

    public final int hashCode() {
        return this.f71779a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinCloseupRequestArgs(pinId="), this.f71779a, ")");
    }
}

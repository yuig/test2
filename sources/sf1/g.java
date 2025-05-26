package sf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f112572a;

    public g(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f112572a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f112572a, ((g) obj).f112572a);
    }

    public final int hashCode() {
        return this.f112572a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("IdeaPinPWTFinishEvent(pinId="), this.f112572a, ")");
    }
}

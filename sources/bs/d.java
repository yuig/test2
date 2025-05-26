package bs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends f {

    /* renamed from: a, reason: collision with root package name */
    public final c f23843a;

    public d(c failure) {
        Intrinsics.checkNotNullParameter(failure, "failure");
        this.f23843a = failure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f23843a == ((d) obj).f23843a;
    }

    public final int hashCode() {
        return this.f23843a.hashCode();
    }

    public final String toString() {
        return "NotQuarantined(failure=" + this.f23843a + ")";
    }
}

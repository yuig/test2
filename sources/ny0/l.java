package ny0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements p {

    /* renamed from: a, reason: collision with root package name */
    public final a1 f92601a;

    public l(a1 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f92601a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f92601a, ((l) obj).f92601a);
    }

    public final int hashCode() {
        return this.f92601a.hashCode();
    }

    public final String toString() {
        return "PinClicked(pin=" + this.f92601a + ")";
    }
}

package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class je implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6766a;

    public je(boolean z13) {
        this.f6766a = z13;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.appSwitched = Boolean.valueOf(this.f6766a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof je) && this.f6766a == ((je) obj).f6766a;
    }

    public final int hashCode() {
        boolean z13 = this.f6766a;
        if (z13) {
            return 1;
        }
        return z13 ? 1 : 0;
    }

    public final String toString() {
        return "AppOpenSignal(hasBeenForegrounded=" + this.f6766a + ")";
    }
}

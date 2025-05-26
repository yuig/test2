package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xh2 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13669a;

    public xh2(String str) {
        this.f13669a = str;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.adResponseEncryptionKey = this.f13669a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xh2) && Intrinsics.d(this.f13669a, ((xh2) obj).f13669a);
    }

    public final int hashCode() {
        String str = this.f13669a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.k("SignalGenerationResponseKeySignal(encryptionKey=", this.f13669a, ")");
    }
}

package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class et1 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4942a;

    public et1(String str) {
        this.f4942a = str;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.omidVersion = this.f4942a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof et1) && Intrinsics.d(this.f4942a, ((et1) obj).f4942a);
    }

    public final int hashCode() {
        String str = this.f4942a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.k("OmidSignal(omidVersion=", this.f4942a, ")");
    }
}

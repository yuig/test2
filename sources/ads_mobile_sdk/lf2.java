package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class lf2 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7819a;

    public lf2(String str) {
        this.f7819a = str;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.sessionId = this.f7819a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lf2) && Intrinsics.d(this.f7819a, ((lf2) obj).f7819a);
    }

    public final int hashCode() {
        String str = this.f7819a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.k("SessionIdSignal(sessionId=", this.f7819a, ")");
    }
}

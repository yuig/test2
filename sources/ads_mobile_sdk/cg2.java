package ads_mobile_sdk;

import a.j9;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class cg2 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f3907a;

    public cg2(Bundle sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f3907a = sharedPreferences;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.sharedPreferenceSignals = this.f3907a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cg2) && Intrinsics.d(this.f3907a, ((cg2) obj).f3907a);
    }

    public final int hashCode() {
        return this.f3907a.hashCode();
    }

    public final String toString() {
        return "SharedPreferenceSignal(sharedPreferences=" + this.f3907a + ")";
    }
}

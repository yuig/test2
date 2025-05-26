package ads_mobile_sdk;

import a.j9;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j5 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final List f6680a;

    public j5(ArrayList adTypes) {
        Intrinsics.checkNotNullParameter(adTypes, "adTypes");
        this.f6680a = adTypes;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.adTypes.addAll(this.f6680a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5) && Intrinsics.d(this.f6680a, ((j5) obj).f6680a);
    }

    public final int hashCode() {
        return this.f6680a.hashCode();
    }

    public final String toString() {
        return "AdTypeSignal(adTypes=" + this.f6680a + ")";
    }
}

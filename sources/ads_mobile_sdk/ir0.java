package ads_mobile_sdk;

import a.j9;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ir0 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f6526a;

    public ir0(Map inMemorySdkCoreData) {
        Intrinsics.checkNotNullParameter(inMemorySdkCoreData, "inMemorySdkCoreData");
        this.f6526a = inMemorySdkCoreData;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        if (!this.f6526a.isEmpty()) {
            signals.inMemorySdkCoreData = this.f6526a;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir0) && Intrinsics.d(this.f6526a, ((ir0) obj).f6526a);
    }

    public final int hashCode() {
        return this.f6526a.hashCode();
    }

    public final String toString() {
        return "InMemorySdkCoreDataSignal(inMemorySdkCoreData=" + this.f6526a + ")";
    }
}

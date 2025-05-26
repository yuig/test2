package ads_mobile_sdk;

import a.j9;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g7 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f5465a;

    public g7(Map adapterNameToVersionsMap) {
        Intrinsics.checkNotNullParameter(adapterNameToVersionsMap, "adapterNameToVersionsMap");
        this.f5465a = adapterNameToVersionsMap;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.adapterVersionData.putAll(this.f5465a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7) && Intrinsics.d(this.f5465a, ((g7) obj).f5465a);
    }

    public final int hashCode() {
        return this.f5465a.hashCode();
    }

    public final String toString() {
        return "AdapterVersionsSignal(adapterNameToVersionsMap=" + this.f5465a + ")";
    }
}

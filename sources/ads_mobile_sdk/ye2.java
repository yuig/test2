package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ye2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f14211a;

    /* renamed from: b, reason: collision with root package name */
    public final vo f14212b;

    /* renamed from: c, reason: collision with root package name */
    public final List f14213c;

    public ye2(ArrayList adConfigurations, vo commonConfiguration, ArrayList actions) {
        Intrinsics.checkNotNullParameter(adConfigurations, "adConfigurations");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f14211a = adConfigurations;
        this.f14212b = commonConfiguration;
        this.f14213c = actions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye2)) {
            return false;
        }
        ye2 ye2Var = (ye2) obj;
        return Intrinsics.d(this.f14211a, ye2Var.f14211a) && Intrinsics.d(this.f14212b, ye2Var.f14212b) && Intrinsics.d(this.f14213c, ye2Var.f14213c);
    }

    public final int hashCode() {
        return this.f14213c.hashCode() + ((this.f14212b.hashCode() + (this.f14211a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        List list = this.f14211a;
        vo voVar = this.f14212b;
        List list2 = this.f14213c;
        StringBuilder sb3 = new StringBuilder("ServerResponse(adConfigurations=");
        sb3.append(list);
        sb3.append(", commonConfiguration=");
        sb3.append(voVar);
        sb3.append(", actions=");
        return a.c.j(sb3, list2, ")");
    }
}

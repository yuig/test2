package ds;

import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import xu1.y;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final lh0.d f56216a;

    /* renamed from: b, reason: collision with root package name */
    public final y f56217b;

    public d(lh0.d experiments, y networkTypeMonitor) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(networkTypeMonitor, "networkTypeMonitor");
        this.f56216a = experiments;
        this.f56217b = networkTypeMonitor;
    }

    public final int a() {
        lh0.d dVar = this.f56216a;
        dVar.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) dVar.f83323a;
        if (!g1Var.o("android_ad_connection_type", "enabled", z3Var) && !g1Var.l("android_ad_connection_type")) {
            return b.UNKNOWN.getValue();
        }
        this.f56217b.getClass();
        int i13 = c.f56215a[y.b().ordinal()];
        if (i13 != 1 && i13 != 2) {
            return i13 != 3 ? i13 != 4 ? b.UNKNOWN.getValue() : b.UNKNOWN.getValue() : b.CELLULAR_UNKNOWN.getValue();
        }
        return b.WIFI.getValue();
    }
}

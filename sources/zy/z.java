package zy;

import h32.e4;
import h32.h4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final int f143121c = h4.V_100.value();

    /* renamed from: d, reason: collision with root package name */
    public static final int f143122d = h4.V_80.value();

    /* renamed from: e, reason: collision with root package name */
    public static final int f143123e = h4.V_50.value();

    /* renamed from: a, reason: collision with root package name */
    public final qc2.a f143124a;

    /* renamed from: b, reason: collision with root package name */
    public final zs1.a f143125b;

    public z(qc2.d viewabilityCalculator, zs1.a impressionDebugUtils) {
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(viewabilityCalculator, "viewabilityCalculator");
        Intrinsics.checkNotNullParameter(impressionDebugUtils, "impressionDebugUtils");
        this.f143124a = viewabilityCalculator;
        this.f143125b = impressionDebugUtils;
    }

    public static boolean b(int i13, int i14, int i15) {
        if (i14 != i15) {
            return (i14 < i13 && i15 >= i13) || (i14 >= i13 && i15 < i13);
        }
        return false;
    }

    public final void a(qa2.h0 h0Var, h4 h4Var, long j13, boolean z13) {
        e4 visibleEvent = new e4(h4Var, Boolean.valueOf(z13), Long.valueOf(j13));
        h0Var.addVisibilityEvent(visibleEvent);
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        h0Var.getE0();
        this.f143125b.getClass();
        Intrinsics.checkNotNullParameter(visibleEvent, "visibleEvent");
    }
}

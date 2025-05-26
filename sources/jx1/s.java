package jx1;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes4.dex */
public final class s implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f77696a;

    public s() {
        l0 pinalyticsVMState = new l0((h32.i0) null, 3);
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f77696a = pinalyticsVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f77696a, ((s) obj).f77696a);
    }

    public final int hashCode() {
        return this.f77696a.hashCode();
    }

    public final String toString() {
        return "AudienceInsightsVMState(pinalyticsVMState=" + this.f77696a + ")";
    }
}

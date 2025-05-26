package hp0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class e0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f69829a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69830b;

    /* renamed from: c, reason: collision with root package name */
    public final String f69831c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f69832d;

    public e0(l0 pinalyticsState, String tappedPinItemId, String str, boolean z13) {
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(tappedPinItemId, "tappedPinItemId");
        this.f69829a = pinalyticsState;
        this.f69830b = tappedPinItemId;
        this.f69831c = str;
        this.f69832d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.f69829a, e0Var.f69829a) && Intrinsics.d(this.f69830b, e0Var.f69830b) && Intrinsics.d(this.f69831c, e0Var.f69831c) && this.f69832d == e0Var.f69832d;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f69830b, this.f69829a.hashCode() * 31, 31);
        String str = this.f69831c;
        return Boolean.hashCode(this.f69832d) + ((d2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "QcmDrawerVMState(pinalyticsState=" + this.f69829a + ", tappedPinItemId=" + this.f69830b + ", rootPinUid=" + this.f69831c + ", isFirstClick=" + this.f69832d + ")";
    }
}

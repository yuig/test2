package pu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final mu.x f101373a;

    /* renamed from: b, reason: collision with root package name */
    public final tu.c0 f101374b;

    /* renamed from: c, reason: collision with root package name */
    public final z f101375c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f101376d;

    public /* synthetic */ x(mu.x xVar, tu.c0 c0Var, int i13) {
        this(xVar, (i13 & 2) != 0 ? new tu.c0() : c0Var, y.f101377a, y.f101380d);
    }

    public static x b(x xVar, mu.x baseVmState, tu.c0 adsWebBrowserVMState, z bottomSheetWebViewStatus, b0 cctStatus, int i13) {
        if ((i13 & 1) != 0) {
            baseVmState = xVar.f101373a;
        }
        if ((i13 & 2) != 0) {
            adsWebBrowserVMState = xVar.f101374b;
        }
        if ((i13 & 4) != 0) {
            bottomSheetWebViewStatus = xVar.f101375c;
        }
        if ((i13 & 8) != 0) {
            cctStatus = xVar.f101376d;
        }
        xVar.getClass();
        Intrinsics.checkNotNullParameter(baseVmState, "baseVmState");
        Intrinsics.checkNotNullParameter(adsWebBrowserVMState, "adsWebBrowserVMState");
        Intrinsics.checkNotNullParameter(bottomSheetWebViewStatus, "bottomSheetWebViewStatus");
        Intrinsics.checkNotNullParameter(cctStatus, "cctStatus");
        return new x(baseVmState, adsWebBrowserVMState, bottomSheetWebViewStatus, cctStatus);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f101373a, xVar.f101373a) && Intrinsics.d(this.f101374b, xVar.f101374b) && Intrinsics.d(this.f101375c, xVar.f101375c) && Intrinsics.d(this.f101376d, xVar.f101376d);
    }

    public final int hashCode() {
        return this.f101376d.hashCode() + ((this.f101375c.hashCode() + ((this.f101374b.hashCode() + (this.f101373a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdsCoreVMState(baseVmState=" + this.f101373a + ", adsWebBrowserVMState=" + this.f101374b + ", bottomSheetWebViewStatus=" + this.f101375c + ", cctStatus=" + this.f101376d + ")";
    }

    public x(mu.x baseVmState, tu.c0 adsWebBrowserVMState, z bottomSheetWebViewStatus, b0 cctStatus) {
        Intrinsics.checkNotNullParameter(baseVmState, "baseVmState");
        Intrinsics.checkNotNullParameter(adsWebBrowserVMState, "adsWebBrowserVMState");
        Intrinsics.checkNotNullParameter(bottomSheetWebViewStatus, "bottomSheetWebViewStatus");
        Intrinsics.checkNotNullParameter(cctStatus, "cctStatus");
        this.f101373a = baseVmState;
        this.f101374b = adsWebBrowserVMState;
        this.f101375c = bottomSheetWebViewStatus;
        this.f101376d = cctStatus;
    }
}

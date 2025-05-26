package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qh1 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.u f10086a;

    /* renamed from: b, reason: collision with root package name */
    public final nm.u f10087b;

    /* renamed from: c, reason: collision with root package name */
    public final nm.u f10088c;

    /* renamed from: d, reason: collision with root package name */
    public final nm.u f10089d;

    /* renamed from: e, reason: collision with root package name */
    public final nm.u f10090e;

    public qh1(nm.u assetViewsSignal, nm.u nativeAdViewSignal, nm.u scrollViewSignal, nm.u lockScreenSignal, nm.u adScreenSignal) {
        Intrinsics.checkNotNullParameter(assetViewsSignal, "assetViewsSignal");
        Intrinsics.checkNotNullParameter(nativeAdViewSignal, "nativeAdViewSignal");
        Intrinsics.checkNotNullParameter(scrollViewSignal, "scrollViewSignal");
        Intrinsics.checkNotNullParameter(lockScreenSignal, "lockScreenSignal");
        Intrinsics.checkNotNullParameter(adScreenSignal, "adScreenSignal");
        this.f10086a = assetViewsSignal;
        this.f10087b = nativeAdViewSignal;
        this.f10088c = scrollViewSignal;
        this.f10089d = lockScreenSignal;
        this.f10090e = adScreenSignal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh1)) {
            return false;
        }
        qh1 qh1Var = (qh1) obj;
        return Intrinsics.d(this.f10086a, qh1Var.f10086a) && Intrinsics.d(this.f10087b, qh1Var.f10087b) && Intrinsics.d(this.f10088c, qh1Var.f10088c) && Intrinsics.d(this.f10089d, qh1Var.f10089d) && Intrinsics.d(this.f10090e, qh1Var.f10090e);
    }

    public final int hashCode() {
        return this.f10090e.f91366a.hashCode() + ((this.f10089d.f91366a.hashCode() + ((this.f10088c.f91366a.hashCode() + ((this.f10087b.f91366a.hashCode() + (this.f10086a.f91366a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdSignals(assetViewsSignal=" + this.f10086a + ", nativeAdViewSignal=" + this.f10087b + ", scrollViewSignal=" + this.f10088c + ", lockScreenSignal=" + this.f10089d + ", adScreenSignal=" + this.f10090e + ")";
    }
}

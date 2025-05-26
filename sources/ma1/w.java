package ma1;

import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import o82.j0;
import zy.l0;

/* loaded from: classes5.dex */
public final class w implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f86814a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f86815b;

    public w(l0 pinalyticsVMState, j0 multiSectionVMState) {
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f86814a = multiSectionVMState;
        this.f86815b = pinalyticsVMState;
    }

    public static w b(w wVar, j0 multiSectionVMState) {
        l0 pinalyticsVMState = wVar.f86815b;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new w(pinalyticsVMState, multiSectionVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f86814a, wVar.f86814a) && Intrinsics.d(this.f86815b, wVar.f86815b);
    }

    public final int hashCode() {
        return this.f86815b.hashCode() + (this.f86814a.f93634a.hashCode() * 31);
    }

    public final String toString() {
        return "ConnectedDevicesVMState(multiSectionVMState=" + this.f86814a + ", pinalyticsVMState=" + this.f86815b + ")";
    }

    public w() {
        this(new l0(new h32.i0(d4.SETTINGS, a4.CONNECTED_DEVICES, null, null, null, null), 2), new j0());
    }
}

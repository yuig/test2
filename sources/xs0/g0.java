package xs0;

import a.cb;
import android.os.SystemClock;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import ni1.y2;
import zy.l0;

/* loaded from: classes5.dex */
public final class g0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f135807a;

    /* renamed from: b, reason: collision with root package name */
    public final int f135808b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f135809c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f135810d;

    /* renamed from: e, reason: collision with root package name */
    public final String f135811e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f135812f;

    /* renamed from: g, reason: collision with root package name */
    public final y2 f135813g;

    public g0(f30 pin, int i13, boolean z13, boolean z14, String myUserId, l0 pinalyticsVMState, y2 pinRepVmState) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(myUserId, "myUserId");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(pinRepVmState, "pinRepVmState");
        this.f135807a = pin;
        this.f135808b = i13;
        this.f135809c = z13;
        this.f135810d = z14;
        this.f135811e = myUserId;
        this.f135812f = pinalyticsVMState;
        this.f135813g = pinRepVmState;
    }

    public static g0 b(g0 g0Var, l0 l0Var, y2 y2Var, int i13) {
        f30 pin = g0Var.f135807a;
        int i14 = g0Var.f135808b;
        boolean z13 = g0Var.f135809c;
        boolean z14 = g0Var.f135810d;
        String myUserId = g0Var.f135811e;
        if ((i13 & 32) != 0) {
            l0Var = g0Var.f135812f;
        }
        l0 pinalyticsVMState = l0Var;
        if ((i13 & 64) != 0) {
            y2Var = g0Var.f135813g;
        }
        y2 pinRepVmState = y2Var;
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(myUserId, "myUserId");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(pinRepVmState, "pinRepVmState");
        return new g0(pin, i14, z13, z14, myUserId, pinalyticsVMState, pinRepVmState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.f135807a, g0Var.f135807a) && this.f135808b == g0Var.f135808b && this.f135809c == g0Var.f135809c && this.f135810d == g0Var.f135810d && Intrinsics.d(this.f135811e, g0Var.f135811e) && Intrinsics.d(this.f135812f, g0Var.f135812f) && Intrinsics.d(this.f135813g, g0Var.f135813g);
    }

    public final int hashCode() {
        return this.f135813g.hashCode() + jq.b.a(this.f135812f, cb.d(this.f135811e, ep.b.e(this.f135810d, ep.b.e(this.f135809c, ep.b.b(this.f135808b, this.f135807a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "SbaHfTunerPinActivityCellVMState(pin=" + this.f135807a + ", position=" + this.f135808b + ", isUupDsaLaunchAndroidEnabled=" + this.f135809c + ", dsaOptedOut=" + this.f135810d + ", myUserId=" + this.f135811e + ", pinalyticsVMState=" + this.f135812f + ", pinRepVmState=" + this.f135813g + ")";
    }

    public g0(f30 f30Var, boolean z13, boolean z14, String str, y2 y2Var, int i13) {
        this(f30Var, 0, (i13 & 4) != 0 ? true : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? "" : str, new l0((h32.i0) null, 3), (i13 & 64) != 0 ? new y2(f30Var, 0, new wa2.m(-1048577, -1, 1023, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false), null, null, null, null, false, false, false, false, false, false, 0.0f, SystemClock.elapsedRealtime(), 0, null, bs1.c.B0(f30Var), bs1.c.y0(f30Var), hf0.b.f69004d, null, 0, 0, null, null, null, false, null, false, null, -369115142, 4194303) : y2Var);
    }
}

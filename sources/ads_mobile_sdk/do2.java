package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class do2 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4389a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4390b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4391c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4392d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4393e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4394f;

    public do2(String carrierCode, int i13, int i14, int i15, boolean z13, int i16) {
        Intrinsics.checkNotNullParameter(carrierCode, "carrierCode");
        this.f4389a = carrierCode;
        this.f4390b = i13;
        this.f4391c = i14;
        this.f4392d = i15;
        this.f4393e = z13;
        this.f4394f = i16;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.carrierCode = this.f4389a;
        signals.networkTypeCoarse = Integer.valueOf(this.f4390b);
        signals.networkTypeFine = Integer.valueOf(this.f4391c);
        signals.phoneType = Integer.valueOf(this.f4392d);
        aj.h hVar = signals.deviceSignals;
        hVar.networkSignals.isActiveNetworkMetered = Boolean.valueOf(this.f4393e);
        hVar.networkSignals.activeNetworkState = Integer.valueOf(this.f4394f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do2)) {
            return false;
        }
        do2 do2Var = (do2) obj;
        return Intrinsics.d(this.f4389a, do2Var.f4389a) && this.f4390b == do2Var.f4390b && this.f4391c == do2Var.f4391c && this.f4392d == do2Var.f4392d && this.f4393e == do2Var.f4393e && this.f4394f == do2Var.f4394f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int f13 = kh2.n3.f(this.f4392d, kh2.n3.f(this.f4391c, kh2.n3.f(this.f4390b, this.f4389a.hashCode() * 31)));
        boolean z13 = this.f4393e;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        return Integer.hashCode(this.f4394f) + ((f13 + i13) * 31);
    }

    public final String toString() {
        String str = this.f4389a;
        int i13 = this.f4390b;
        int i14 = this.f4391c;
        int i15 = this.f4392d;
        boolean z13 = this.f4393e;
        int i16 = this.f4394f;
        StringBuilder v13 = a.a.v("TelephonySignal(carrierCode=", str, ", networkTypeCoarse=", i13, ", networkTypeFine=");
        a.a.z(v13, i14, ", phoneType=", i15, ", isActiveNetworkMetered=");
        v13.append(z13);
        v13.append(", activeNetworkState=");
        v13.append(i16);
        v13.append(")");
        return v13.toString();
    }
}

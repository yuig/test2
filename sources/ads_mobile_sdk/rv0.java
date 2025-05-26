package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rv0 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10813a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10814b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10815c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10816d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10817e;

    public rv0(String str, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f10813a = str;
        this.f10814b = z13;
        this.f10815c = z14;
        this.f10816d = z15;
        this.f10817e = z16;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        String str = this.f10813a;
        if (str != null) {
            signals.inspectorExtras = str;
        }
        boolean z13 = this.f10814b;
        signals.testMode = z13 ? 1 : 0;
        boolean z14 = this.f10815c;
        signals.linkedDevice = z14 ? 1 : 0;
        if (z13 || z14) {
            signals.requestServerData = Integer.valueOf(this.f10816d ? 0 : 1);
            signals.shouldCollectAdResponseLogs = Boolean.valueOf(this.f10817e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv0)) {
            return false;
        }
        rv0 rv0Var = (rv0) obj;
        return Intrinsics.d(this.f10813a, rv0Var.f10813a) && this.f10814b == rv0Var.f10814b && this.f10815c == rv0Var.f10815c && this.f10816d == rv0Var.f10816d && this.f10817e == rv0Var.f10817e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.f10813a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z13 = this.f10814b;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int i14 = (hashCode + i13) * 31;
        boolean z14 = this.f10815c;
        int i15 = z14;
        if (z14 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z15 = this.f10816d;
        int i17 = z15;
        if (z15 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        boolean z16 = this.f10817e;
        return i18 + (z16 ? 1 : z16 ? 1 : 0);
    }

    public final String toString() {
        String str = this.f10813a;
        boolean z13 = this.f10814b;
        boolean z14 = this.f10815c;
        boolean z15 = this.f10816d;
        boolean z16 = this.f10817e;
        StringBuilder sb3 = new StringBuilder("InspectorSignal(requestExtras=");
        sb3.append(str);
        sb3.append(", isTestMode=");
        sb3.append(z13);
        sb3.append(", isLinkedDevice=");
        a.c.v(sb3, z14, ", hasServerData=", z15, ", shouldCollectAdResponseLogs=");
        return a.a.r(sb3, z16, ")");
    }
}

package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ie2 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6358a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6359b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6360c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6361d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6362e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6363f;

    public ie2(String afmaVersion, String additionalCapabilities, int i13, String externalVersion, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(additionalCapabilities, "additionalCapabilities");
        Intrinsics.checkNotNullParameter(externalVersion, "externalVersion");
        this.f6358a = afmaVersion;
        this.f6359b = additionalCapabilities;
        this.f6360c = i13;
        this.f6361d = externalVersion;
        this.f6362e = z13;
        this.f6363f = z14;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.afmaVersion = this.f6358a;
        signals.isDecagon = true;
        signals.additionalCapabilities = this.f6359b;
        signals.targetApi = Integer.valueOf(this.f6360c);
        signals.granularVersion = this.f6361d;
        signals.sdkEnvironment.isInstantApp = Boolean.valueOf(this.f6362e);
        signals.sdkEnvironment.isPrivilegedProcess = this.f6363f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie2)) {
            return false;
        }
        ie2 ie2Var = (ie2) obj;
        return Intrinsics.d(this.f6358a, ie2Var.f6358a) && Intrinsics.d(this.f6359b, ie2Var.f6359b) && this.f6360c == ie2Var.f6360c && Intrinsics.d(this.f6361d, ie2Var.f6361d) && this.f6362e == ie2Var.f6362e && this.f6363f == ie2Var.f6363f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int t13 = kh2.j1.t(kh2.n3.f(this.f6360c, kh2.j1.t(this.f6358a.hashCode() * 31, this.f6359b)), this.f6361d);
        boolean z13 = this.f6362e;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int i14 = (t13 + i13) * 31;
        boolean z14 = this.f6363f;
        return i14 + (z14 ? 1 : z14 ? 1 : 0);
    }

    public final String toString() {
        String str = this.f6358a;
        String str2 = this.f6359b;
        int i13 = this.f6360c;
        String str3 = this.f6361d;
        boolean z13 = this.f6362e;
        boolean z14 = this.f6363f;
        StringBuilder w13 = a.a.w("SdkEnvironmentSignal(afmaVersion=", str, ", additionalCapabilities=", str2, ", targetApi=");
        a.a.A(w13, i13, ", externalVersion=", str3, ", isInstantApp=");
        w13.append(z13);
        w13.append(", isPrivilegedProcess=");
        w13.append(z14);
        w13.append(")");
        return w13.toString();
    }
}

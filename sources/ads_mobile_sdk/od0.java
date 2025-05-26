package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class od0 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9228a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9229b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9230c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9231d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9232e;

    public od0(String str, String str2, String str3, String str4, boolean z13) {
        this.f9228a = str;
        this.f9229b = str2;
        this.f9230c = str3;
        this.f9231d = str4;
        this.f9232e = z13;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        if (this.f9232e) {
            String str = this.f9228a;
            if (str == null) {
                str = "";
            }
            signals.gmpAppId = str;
            String str2 = this.f9229b;
            if (str2 == null) {
                str2 = "";
            }
            signals.appInstanceId = str2;
            String str3 = this.f9230c;
            signals.adEventId = str3 != null ? str3 : "";
            signals.appIdOrigin = this.f9231d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od0)) {
            return false;
        }
        od0 od0Var = (od0) obj;
        return Intrinsics.d(this.f9228a, od0Var.f9228a) && Intrinsics.d(this.f9229b, od0Var.f9229b) && Intrinsics.d(this.f9230c, od0Var.f9230c) && Intrinsics.d(this.f9231d, od0Var.f9231d) && this.f9232e == od0Var.f9232e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.f9228a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9229b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9230c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9231d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z13 = this.f9232e;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        return hashCode4 + i13;
    }

    public final String toString() {
        String str = this.f9228a;
        String str2 = this.f9229b;
        String str3 = this.f9230c;
        String str4 = this.f9231d;
        boolean z13 = this.f9232e;
        StringBuilder w13 = a.a.w("FirebaseAnalyticsSignal(firebaseAppId=", str, ", firebaseAppInstanceId=", str2, ", firebaseAdEventId=");
        a.a.B(w13, str3, ", firebaseAppIdOrigin=", str4, ", isFirebaseIntegrationEnabled=");
        return a.a.r(w13, z13, ")");
    }
}

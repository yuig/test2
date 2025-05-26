package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class mu1 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8390a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8391b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f8392c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8393d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8394e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8395f;

    public mu1(String packageName, String str, Integer num, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.f8390a = packageName;
        this.f8391b = str;
        this.f8392c = num;
        this.f8393d = str2;
        this.f8394e = str3;
        this.f8395f = str4;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.packageName = this.f8390a;
        signals.versionName = this.f8391b;
        signals.versionCode = this.f8392c;
        signals.displayLabel = this.f8393d;
        signals.installerPackage = this.f8394e;
        signals.initiatorPackage = this.f8395f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu1)) {
            return false;
        }
        mu1 mu1Var = (mu1) obj;
        return Intrinsics.d(this.f8390a, mu1Var.f8390a) && Intrinsics.d(this.f8391b, mu1Var.f8391b) && Intrinsics.d(this.f8392c, mu1Var.f8392c) && Intrinsics.d(this.f8393d, mu1Var.f8393d) && Intrinsics.d(this.f8394e, mu1Var.f8394e) && Intrinsics.d(this.f8395f, mu1Var.f8395f);
    }

    public final int hashCode() {
        int hashCode = this.f8390a.hashCode() * 31;
        String str = this.f8391b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f8392c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f8393d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8394e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f8395f;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f8390a;
        String str2 = this.f8391b;
        Integer num = this.f8392c;
        String str3 = this.f8393d;
        String str4 = this.f8394e;
        String str5 = this.f8395f;
        StringBuilder w13 = a.a.w("PackageInfoSignal(packageName=", str, ", versionName=", str2, ", versionCode=");
        w13.append(num);
        w13.append(", displayLabel=");
        w13.append(str3);
        w13.append(", installerPackage=");
        return a.a.q(w13, str4, ", initiatorPackage=", str5, ")");
    }
}

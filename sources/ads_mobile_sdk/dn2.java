package ads_mobile_sdk;

import a.j9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class dn2 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4361a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4362b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4363c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4364d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4365e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4366f;

    /* renamed from: g, reason: collision with root package name */
    public final List f4367g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4368h;

    /* renamed from: i, reason: collision with root package name */
    public final String f4369i;

    /* renamed from: j, reason: collision with root package name */
    public final String f4370j;

    /* renamed from: k, reason: collision with root package name */
    public final long f4371k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4372l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4373m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f4374n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4375o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f4376p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f4377q;

    public dn2(boolean z13, boolean z14, String countryCode, boolean z15, boolean z16, String languageCode, List languageCodeList, String str, String submodel, String buildName, long j13, boolean z17, String str2, boolean z18, int i13, boolean z19, boolean z23) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(languageCodeList, "languageCodeList");
        Intrinsics.checkNotNullParameter(submodel, "submodel");
        Intrinsics.checkNotNullParameter(buildName, "buildName");
        this.f4361a = z13;
        this.f4362b = z14;
        this.f4363c = countryCode;
        this.f4364d = z15;
        this.f4365e = z16;
        this.f4366f = languageCode;
        this.f4367g = languageCodeList;
        this.f4368h = str;
        this.f4369i = submodel;
        this.f4370j = buildName;
        this.f4371k = j13;
        this.f4372l = z17;
        this.f4373m = str2;
        this.f4374n = z18;
        this.f4375o = i13;
        this.f4376p = z19;
        this.f4377q = z23;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.canOpenGeo = Boolean.valueOf(this.f4361a);
        signals.canOpenHttp = Boolean.valueOf(this.f4362b);
        signals.countryCode = this.f4363c;
        signals.isEmulator = Boolean.valueOf(this.f4364d);
        signals.isLatchskyDevice = this.f4365e;
        signals.languageCode = this.f4366f;
        signals.languageCodeList.addAll(this.f4367g);
        signals.marketVersion = this.f4368h;
        signals.submodel = this.f4369i;
        aj.h hVar = signals.deviceSignals;
        hVar.buildName = this.f4370j;
        hVar.remainingDataPartitionSpaceKilobytes = Long.valueOf(this.f4371k);
        signals.deviceSignals.browserSignals.isDefaultBrowserCustomTabsCapable = Boolean.valueOf(this.f4372l);
        signals.deviceSignals.playStoreSignals.playStoreVersion = this.f4373m;
        if (this.f4374n) {
            signals.isBattlestarDevice = Boolean.TRUE;
        }
        signals.buildApiLevel = Integer.valueOf(this.f4375o);
        signals.transparentBackgroundSupported = Boolean.valueOf(this.f4376p);
        signals.isHsdpSupported = Integer.valueOf(this.f4377q ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn2)) {
            return false;
        }
        dn2 dn2Var = (dn2) obj;
        return this.f4361a == dn2Var.f4361a && this.f4362b == dn2Var.f4362b && Intrinsics.d(this.f4363c, dn2Var.f4363c) && this.f4364d == dn2Var.f4364d && this.f4365e == dn2Var.f4365e && Intrinsics.d(this.f4366f, dn2Var.f4366f) && Intrinsics.d(this.f4367g, dn2Var.f4367g) && Intrinsics.d(this.f4368h, dn2Var.f4368h) && Intrinsics.d(this.f4369i, dn2Var.f4369i) && Intrinsics.d(this.f4370j, dn2Var.f4370j) && this.f4371k == dn2Var.f4371k && this.f4372l == dn2Var.f4372l && Intrinsics.d(this.f4373m, dn2Var.f4373m) && this.f4374n == dn2Var.f4374n && this.f4375o == dn2Var.f4375o && this.f4376p == dn2Var.f4376p && this.f4377q == dn2Var.f4377q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    public final int hashCode() {
        boolean z13 = this.f4361a;
        ?? r03 = z13;
        if (z13) {
            r03 = 1;
        }
        int i13 = r03 * 31;
        ?? r33 = this.f4362b;
        int i14 = r33;
        if (r33 != 0) {
            i14 = 1;
        }
        int t13 = kh2.j1.t((i13 + i14) * 31, this.f4363c);
        ?? r34 = this.f4364d;
        int i15 = r34;
        if (r34 != 0) {
            i15 = 1;
        }
        int i16 = (t13 + i15) * 31;
        ?? r35 = this.f4365e;
        int i17 = r35;
        if (r35 != 0) {
            i17 = 1;
        }
        int p13 = gh0.b.p(kh2.j1.t((i16 + i17) * 31, this.f4366f), this.f4367g);
        String str = this.f4368h;
        int c13 = a.a.c(this.f4371k, kh2.j1.t(kh2.j1.t((p13 + (str == null ? 0 : str.hashCode())) * 31, this.f4369i), this.f4370j), 31);
        ?? r36 = this.f4372l;
        int i18 = r36;
        if (r36 != 0) {
            i18 = 1;
        }
        int i19 = (c13 + i18) * 31;
        String str2 = this.f4373m;
        int hashCode = (i19 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ?? r37 = this.f4374n;
        int i23 = r37;
        if (r37 != 0) {
            i23 = 1;
        }
        int f13 = kh2.n3.f(this.f4375o, (hashCode + i23) * 31);
        ?? r38 = this.f4376p;
        int i24 = r38;
        if (r38 != 0) {
            i24 = 1;
        }
        int i25 = (f13 + i24) * 31;
        boolean z14 = this.f4377q;
        return i25 + (z14 ? 1 : z14 ? 1 : 0);
    }

    public final String toString() {
        boolean z13 = this.f4361a;
        boolean z14 = this.f4362b;
        String str = this.f4363c;
        boolean z15 = this.f4364d;
        boolean z16 = this.f4365e;
        String str2 = this.f4366f;
        List list = this.f4367g;
        String str3 = this.f4368h;
        String str4 = this.f4369i;
        String str5 = this.f4370j;
        long j13 = this.f4371k;
        boolean z17 = this.f4372l;
        String str6 = this.f4373m;
        boolean z18 = this.f4374n;
        int i13 = this.f4375o;
        boolean z19 = this.f4376p;
        boolean z23 = this.f4377q;
        StringBuilder sb3 = new StringBuilder("StaticDeviceSignal(canOpenGeo=");
        sb3.append(z13);
        sb3.append(", canOpenHttp=");
        sb3.append(z14);
        sb3.append(", countryCode=");
        sb3.append(str);
        sb3.append(", isEmulator=");
        sb3.append(z15);
        sb3.append(", isLatchskyDevice=");
        sb3.append(z16);
        sb3.append(", languageCode=");
        sb3.append(str2);
        sb3.append(", languageCodeList=");
        sb3.append(list);
        sb3.append(", marketVersion=");
        sb3.append(str3);
        sb3.append(", submodel=");
        a.a.B(sb3, str4, ", buildName=", str5, ", remainingDataPartitionSpaceKilobytes=");
        sb3.append(j13);
        sb3.append(", isDefaultBrowserCustomTabsCapable=");
        sb3.append(z17);
        sb3.append(", playStoreVersion=");
        sb3.append(str6);
        sb3.append(", isBattlestarDevice=");
        sb3.append(z18);
        sb3.append(", buildApiLevel=");
        sb3.append(i13);
        sb3.append(", isTransparentBackgroundSupported=");
        sb3.append(z19);
        sb3.append(", isHsdpSupported=");
        sb3.append(z23);
        sb3.append(")");
        return sb3.toString();
    }
}

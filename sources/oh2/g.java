package oh2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f94626a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94627b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94628c;

    /* renamed from: d, reason: collision with root package name */
    public final int f94629d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f94630e;

    public g(String markerFilePath, String appState, int i13, String reportId, boolean z13) {
        Intrinsics.checkNotNullParameter(markerFilePath, "markerFilePath");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(reportId, "reportId");
        this.f94626a = markerFilePath;
        this.f94627b = appState;
        this.f94628c = reportId;
        this.f94629d = i13;
        this.f94630e = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f94626a, gVar.f94626a) && Intrinsics.d(this.f94627b, gVar.f94627b) && Intrinsics.d(this.f94628c, gVar.f94628c) && this.f94629d == gVar.f94629d && this.f94630e == gVar.f94630e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ep.b.e(this.f94630e, ep.b.b(this.f94629d, cb.d(this.f94628c, cb.d(this.f94627b, this.f94626a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NativeInstallMessage(markerFilePath=");
        sb3.append(this.f94626a);
        sb3.append(", appState=");
        sb3.append(this.f94627b);
        sb3.append(", reportId=");
        sb3.append(this.f94628c);
        sb3.append(", apiLevel=");
        sb3.append(this.f94629d);
        sb3.append(", is32bit=");
        return a.a.r(sb3, this.f94630e, ", devLogging=false)");
    }
}

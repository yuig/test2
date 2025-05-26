package vt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q extends r {

    /* renamed from: a, reason: collision with root package name */
    public final String f126631a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f126632b;

    public q(String str, boolean z13) {
        this.f126631a = str;
        this.f126632b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f126631a, qVar.f126631a) && this.f126632b == qVar.f126632b;
    }

    public final int hashCode() {
        String str = this.f126631a;
        return Boolean.hashCode(false) + ep.b.e(this.f126632b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WebView(url=");
        sb3.append(this.f126631a);
        sb3.append(", userManuallyPaused=");
        return a.a.r(sb3, this.f126632b, ", scrollingModuleInBackground=false)");
    }
}

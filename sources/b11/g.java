package b11;

import a.cb;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final a4 f20988a;

    /* renamed from: b, reason: collision with root package name */
    public final d4 f20989b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20990c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20991d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20992e;

    public g(a4 a4Var, d4 viewType, String navigationSource, String str, boolean z13) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        this.f20988a = a4Var;
        this.f20989b = viewType;
        this.f20990c = navigationSource;
        this.f20991d = str;
        this.f20992e = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f20988a == gVar.f20988a && this.f20989b == gVar.f20989b && Intrinsics.d(this.f20990c, gVar.f20990c) && Intrinsics.d(this.f20991d, gVar.f20991d) && this.f20992e == gVar.f20992e;
    }

    public final int hashCode() {
        a4 a4Var = this.f20988a;
        int d2 = cb.d(this.f20990c, (this.f20989b.hashCode() + ((a4Var == null ? 0 : a4Var.hashCode()) * 31)) * 31, 31);
        String str = this.f20991d;
        return Boolean.hashCode(this.f20992e) + ((d2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MonolithHeaderConfig(viewParameterType=");
        sb3.append(this.f20988a);
        sb3.append(", viewType=");
        sb3.append(this.f20989b);
        sb3.append(", navigationSource=");
        sb3.append(this.f20990c);
        sb3.append(", feedTrackingParameter=");
        sb3.append(this.f20991d);
        sb3.append(", shouldShowTabletLandscapeCloseup=");
        return a.a.r(sb3, this.f20992e, ")");
    }
}

package tu;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f119287a;

    /* renamed from: b, reason: collision with root package name */
    public final List f119288b;

    public g(String browserBarDomain, List adsWebBrowserActions) {
        Intrinsics.checkNotNullParameter(browserBarDomain, "browserBarDomain");
        Intrinsics.checkNotNullParameter(adsWebBrowserActions, "adsWebBrowserActions");
        this.f119287a = browserBarDomain;
        this.f119288b = adsWebBrowserActions;
    }

    public static g e(g gVar, String browserBarDomain, List adsWebBrowserActions, int i13) {
        if ((i13 & 1) != 0) {
            browserBarDomain = gVar.f119287a;
        }
        if ((i13 & 2) != 0) {
            adsWebBrowserActions = gVar.f119288b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(browserBarDomain, "browserBarDomain");
        Intrinsics.checkNotNullParameter(adsWebBrowserActions, "adsWebBrowserActions");
        return new g(browserBarDomain, adsWebBrowserActions);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f119287a, gVar.f119287a) && Intrinsics.d(this.f119288b, gVar.f119288b);
    }

    public final int hashCode() {
        return this.f119288b.hashCode() + (this.f119287a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AdsWebBrowserDisplayState(browserBarDomain=");
        sb3.append(this.f119287a);
        sb3.append(", adsWebBrowserActions=");
        return a.c.j(sb3, this.f119288b, ")");
    }

    public g() {
        this("", q0.f80391a);
    }
}

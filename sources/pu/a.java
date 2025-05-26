package pu;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final mu.a f101328a;

    /* renamed from: b, reason: collision with root package name */
    public final tu.g f101329b;

    /* renamed from: c, reason: collision with root package name */
    public final List f101330c;

    public a(mu.a baseDisplayState, tu.g adsWebBrowserDisplayState, List scrollingModuleActions) {
        Intrinsics.checkNotNullParameter(baseDisplayState, "baseDisplayState");
        Intrinsics.checkNotNullParameter(adsWebBrowserDisplayState, "adsWebBrowserDisplayState");
        Intrinsics.checkNotNullParameter(scrollingModuleActions, "scrollingModuleActions");
        this.f101328a = baseDisplayState;
        this.f101329b = adsWebBrowserDisplayState;
        this.f101330c = scrollingModuleActions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public static a e(a aVar, mu.a baseDisplayState, tu.g adsWebBrowserDisplayState, q0 q0Var, int i13) {
        if ((i13 & 1) != 0) {
            baseDisplayState = aVar.f101328a;
        }
        if ((i13 & 2) != 0) {
            adsWebBrowserDisplayState = aVar.f101329b;
        }
        q0 scrollingModuleActions = q0Var;
        if ((i13 & 4) != 0) {
            scrollingModuleActions = aVar.f101330c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(baseDisplayState, "baseDisplayState");
        Intrinsics.checkNotNullParameter(adsWebBrowserDisplayState, "adsWebBrowserDisplayState");
        Intrinsics.checkNotNullParameter(scrollingModuleActions, "scrollingModuleActions");
        return new a(baseDisplayState, adsWebBrowserDisplayState, scrollingModuleActions);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f101328a, aVar.f101328a) && Intrinsics.d(this.f101329b, aVar.f101329b) && Intrinsics.d(this.f101330c, aVar.f101330c);
    }

    public final int hashCode() {
        return this.f101330c.hashCode() + ((this.f101329b.hashCode() + (this.f101328a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AdsCoreDisplayState(baseDisplayState=");
        sb3.append(this.f101328a);
        sb3.append(", adsWebBrowserDisplayState=");
        sb3.append(this.f101329b);
        sb3.append(", scrollingModuleActions=");
        return a.c.j(sb3, this.f101330c, ")");
    }

    public a() {
        this(new mu.a(null, 255), new tu.g(), q0.f80391a);
    }
}

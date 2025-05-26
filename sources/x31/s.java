package x31;

import a.cb;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class s implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f131644a;

    /* renamed from: b, reason: collision with root package name */
    public final String f131645b;

    /* renamed from: c, reason: collision with root package name */
    public final String f131646c;

    public s(u0 element, int i13) {
        element = (i13 & 1) != 0 ? u0.FILTER : element;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter("profile_filter", "auxDataKeyFilter");
        Intrinsics.checkNotNullParameter("profile_selected_filters", "auxDataKeySelectedFilters");
        this.f131644a = element;
        this.f131645b = "profile_filter";
        this.f131646c = "profile_selected_filters";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f131644a == sVar.f131644a && Intrinsics.d(this.f131645b, sVar.f131645b) && Intrinsics.d(this.f131646c, sVar.f131646c);
    }

    public final int hashCode() {
        return this.f131646c.hashCode() + cb.d(this.f131645b, this.f131644a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FilterLoggingState(element=");
        sb3.append(this.f131644a);
        sb3.append(", auxDataKeyFilter=");
        sb3.append(this.f131645b);
        sb3.append(", auxDataKeySelectedFilters=");
        return a.a.p(sb3, this.f131646c, ")");
    }
}

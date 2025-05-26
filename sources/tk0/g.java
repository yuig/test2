package tk0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements q {

    /* renamed from: a, reason: collision with root package name */
    public final jl0.d f117962a;

    /* renamed from: b, reason: collision with root package name */
    public final List f117963b;

    /* renamed from: c, reason: collision with root package name */
    public final List f117964c;

    /* renamed from: d, reason: collision with root package name */
    public final int f117965d;

    public g(jl0.d viewState, ArrayList selectedPinIds, ArrayList excludedPinIds, int i13) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(selectedPinIds, "selectedPinIds");
        Intrinsics.checkNotNullParameter(excludedPinIds, "excludedPinIds");
        this.f117962a = viewState;
        this.f117963b = selectedPinIds;
        this.f117964c = excludedPinIds;
        this.f117965d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f117962a == gVar.f117962a && Intrinsics.d(this.f117963b, gVar.f117963b) && Intrinsics.d(this.f117964c, gVar.f117964c) && this.f117965d == gVar.f117965d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f117965d) + ep.b.c(this.f117964c, ep.b.c(this.f117963b, this.f117962a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "BulkUpdateOrganizeToolbarState(viewState=" + this.f117962a + ", selectedPinIds=" + this.f117963b + ", excludedPinIds=" + this.f117964c + ", selectedPinCount=" + this.f117965d + ")";
    }
}

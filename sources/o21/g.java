package o21;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.g0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qa2.d0;
import uj2.q;

/* loaded from: classes5.dex */
public final class g extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final String f92832h;

    /* renamed from: i, reason: collision with root package name */
    public final List f92833i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f92834j;

    /* renamed from: k, reason: collision with root package name */
    public final uk1.d f92835k;

    /* renamed from: l, reason: collision with root package name */
    public final q f92836l;

    /* renamed from: m, reason: collision with root package name */
    public final k21.b f92837m;

    /* renamed from: n, reason: collision with root package name */
    public final e f92838n;

    /* renamed from: o, reason: collision with root package name */
    public final g0 f92839o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f92840p;

    public g(String str, List pins, d0 pinActionHandler, uk1.d presenterPinalytics, q networkStateStream, e pinRowDecoration, g0 g0Var, boolean z13, int i13) {
        g0Var = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : g0Var;
        Intrinsics.checkNotNullParameter(pins, "pins");
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinRowDecoration, "pinRowDecoration");
        this.f92832h = str;
        this.f92833i = pins;
        this.f92834j = pinActionHandler;
        this.f92835k = presenterPinalytics;
        this.f92836l = networkStateStream;
        this.f92837m = null;
        this.f92838n = pinRowDecoration;
        this.f92839o = g0Var;
        this.f92840p = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f92832h, gVar.f92832h) && Intrinsics.d(this.f92833i, gVar.f92833i) && Intrinsics.d(this.f92834j, gVar.f92834j) && Intrinsics.d(this.f92835k, gVar.f92835k) && Intrinsics.d(this.f92836l, gVar.f92836l) && Intrinsics.d(this.f92837m, gVar.f92837m) && Intrinsics.d(null, null) && Intrinsics.d(this.f92838n, gVar.f92838n) && this.f92839o == gVar.f92839o && this.f92840p == gVar.f92840p;
    }

    public final int hashCode() {
        String str = this.f92832h;
        int hashCode = (this.f92836l.hashCode() + ((this.f92835k.hashCode() + ((this.f92834j.hashCode() + ep.b.c(this.f92833i, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31)) * 31)) * 31;
        k21.b bVar = this.f92837m;
        int hashCode2 = (this.f92838n.hashCode() + ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 961)) * 31;
        g0 g0Var = this.f92839o;
        return Boolean.hashCode(this.f92840p) + ((hashCode2 + (g0Var != null ? g0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FixedSizePinRowViewModel(originPinId=");
        sb3.append(this.f92832h);
        sb3.append(", pins=");
        sb3.append(this.f92833i);
        sb3.append(", pinActionHandler=");
        sb3.append(this.f92834j);
        sb3.append(", presenterPinalytics=");
        sb3.append(this.f92835k);
        sb3.append(", networkStateStream=");
        sb3.append(this.f92836l);
        sb3.append(", overlayActionListener=");
        sb3.append(this.f92837m);
        sb3.append(", contextMenuListener=null, pinRowDecoration=");
        sb3.append(this.f92838n);
        sb3.append(", componentType=");
        sb3.append(this.f92839o);
        sb3.append(", isProductTag=");
        return a.a.r(sb3, this.f92840p, ")");
    }
}

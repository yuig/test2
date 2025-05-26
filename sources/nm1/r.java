package nm1;

import com.pinterest.gestalt.tabs.GestaltTabLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements u {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltTabLayout f91471a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f91472b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f91473c;

    /* renamed from: d, reason: collision with root package name */
    public final List f91474d;

    /* renamed from: e, reason: collision with root package name */
    public final List f91475e;

    /* renamed from: f, reason: collision with root package name */
    public final List f91476f;

    /* renamed from: g, reason: collision with root package name */
    public final List f91477g;

    public r(GestaltTabLayout tabLayout, LinkedHashMap tabToIndex, LinkedHashMap indexToTab, ArrayList startActionElements, ArrayList startActionConstraints, ArrayList endActionElements, ArrayList endActionConstraints) {
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        Intrinsics.checkNotNullParameter(tabToIndex, "tabToIndex");
        Intrinsics.checkNotNullParameter(indexToTab, "indexToTab");
        Intrinsics.checkNotNullParameter(startActionElements, "startActionElements");
        Intrinsics.checkNotNullParameter(startActionConstraints, "startActionConstraints");
        Intrinsics.checkNotNullParameter(endActionElements, "endActionElements");
        Intrinsics.checkNotNullParameter(endActionConstraints, "endActionConstraints");
        this.f91471a = tabLayout;
        this.f91472b = tabToIndex;
        this.f91473c = indexToTab;
        this.f91474d = startActionElements;
        this.f91475e = startActionConstraints;
        this.f91476f = endActionElements;
        this.f91477g = endActionConstraints;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f91471a, rVar.f91471a) && Intrinsics.d(this.f91472b, rVar.f91472b) && Intrinsics.d(this.f91473c, rVar.f91473c) && Intrinsics.d(this.f91474d, rVar.f91474d) && Intrinsics.d(this.f91475e, rVar.f91475e) && Intrinsics.d(this.f91476f, rVar.f91476f) && Intrinsics.d(this.f91477g, rVar.f91477g);
    }

    public final int hashCode() {
        return this.f91477g.hashCode() + ep.b.c(this.f91476f, ep.b.c(this.f91475e, ep.b.c(this.f91474d, a.c.e(this.f91473c, a.c.e(this.f91472b, this.f91471a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StaticTabs(tabLayout=");
        sb3.append(this.f91471a);
        sb3.append(", tabToIndex=");
        sb3.append(this.f91472b);
        sb3.append(", indexToTab=");
        sb3.append(this.f91473c);
        sb3.append(", startActionElements=");
        sb3.append(this.f91474d);
        sb3.append(", startActionConstraints=");
        sb3.append(this.f91475e);
        sb3.append(", endActionElements=");
        sb3.append(this.f91476f);
        sb3.append(", endActionConstraints=");
        return a.c.j(sb3, this.f91477g, ")");
    }
}

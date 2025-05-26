package in2;

import dm2.u0;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class o implements n {
    @Override // in2.n
    public Collection a(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return q0.f80391a;
    }

    @Override // in2.n
    public Set b() {
        Collection g13 = g(g.f72861o, wn2.b.f130594i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : g13) {
            if (obj instanceof u0) {
                ym2.g name = ((u0) obj).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // in2.n
    public Set c() {
        return null;
    }

    @Override // in2.n
    public Collection d(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return q0.f80391a;
    }

    @Override // in2.p
    public am2.j e(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // in2.n
    public Set f() {
        Collection g13 = g(g.f72862p, wn2.b.f130594i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : g13) {
            if (obj instanceof u0) {
                ym2.g name = ((u0) obj).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // in2.p
    public Collection g(g kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return q0.f80391a;
    }
}

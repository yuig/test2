package dm2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v0 extends in2.o {

    /* renamed from: b, reason: collision with root package name */
    public final am2.d0 f55537b;

    /* renamed from: c, reason: collision with root package name */
    public final ym2.c f55538c;

    public v0(i0 moduleDescriptor, ym2.c fqName) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f55537b = moduleDescriptor;
        this.f55538c = fqName;
    }

    @Override // in2.o, in2.n
    public final Set c() {
        return kotlin.collections.s0.f80394a;
    }

    @Override // in2.o, in2.p
    public final Collection g(in2.g kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        if (!kindFilter.a(in2.g.f72853g)) {
            return kotlin.collections.q0.f80391a;
        }
        ym2.c cVar = this.f55538c;
        if (cVar.d()) {
            if (kindFilter.f72865a.contains(in2.d.f72846a)) {
                return kotlin.collections.q0.f80391a;
            }
        }
        am2.d0 d0Var = this.f55537b;
        Collection i13 = d0Var.i(cVar, nameFilter);
        ArrayList arrayList = new ArrayList(i13.size());
        Iterator it = i13.iterator();
        while (it.hasNext()) {
            ym2.g name = ((ym2.c) it.next()).f();
            Intrinsics.checkNotNullExpressionValue(name, "shortName(...)");
            if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                Intrinsics.checkNotNullParameter(name, "name");
                c0 c0Var = null;
                if (!name.f139479b) {
                    ym2.c c13 = cVar.c(name);
                    Intrinsics.checkNotNullExpressionValue(c13, "child(...)");
                    c0 c0Var2 = (c0) d0Var.H(c13);
                    if (!((Boolean) lb.l0.B0(c0Var2.f55404f, c0.f55400h[1])).booleanValue()) {
                        c0Var = c0Var2;
                    }
                }
                wn2.k.b(c0Var, arrayList);
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "subpackages of " + this.f55538c + " from " + this.f55537b;
    }
}

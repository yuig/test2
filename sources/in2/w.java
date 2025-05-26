package in2;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w extends a {

    /* renamed from: b, reason: collision with root package name */
    public final n f72890b;

    public w(n nVar) {
        this.f72890b = nVar;
    }

    @Override // in2.a, in2.n
    public final Collection a(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return kg.p.X(super.a(name, location), u.f72888i);
    }

    @Override // in2.a, in2.n
    public final Collection d(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return kg.p.X(super.d(name, location), v.f72889i);
    }

    @Override // in2.a, in2.p
    public final Collection g(g kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Collection g13 = super.g(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : g13) {
            if (((am2.m) obj) instanceof am2.b) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.l0(arrayList2, kg.p.X(arrayList, t.f72887i));
    }

    @Override // in2.a
    public final n i() {
        return this.f72890b;
    }
}

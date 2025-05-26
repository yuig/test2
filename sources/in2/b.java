package in2;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kh2.p2;
import kotlin.collections.a0;
import kotlin.collections.k0;
import kotlin.collections.q0;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements n {

    /* renamed from: b, reason: collision with root package name */
    public final String f72842b;

    /* renamed from: c, reason: collision with root package name */
    public final n[] f72843c;

    public b(String str, n[] nVarArr) {
        this.f72842b = str;
        this.f72843c = nVarArr;
    }

    @Override // in2.n
    public final Collection a(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        n[] nVarArr = this.f72843c;
        int length = nVarArr.length;
        if (length == 0) {
            return q0.f80391a;
        }
        if (length == 1) {
            return nVarArr[0].a(name, location);
        }
        Collection collection = null;
        for (n nVar : nVarArr) {
            collection = ue.c.k(collection, nVar.a(name, location));
        }
        return collection == null ? s0.f80394a : collection;
    }

    @Override // in2.n
    public final Set b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : this.f72843c) {
            k0.u(nVar.b(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // in2.n
    public final Set c() {
        n[] nVarArr = this.f72843c;
        Intrinsics.checkNotNullParameter(nVarArr, "<this>");
        return p2.g0(nVarArr.length == 0 ? q0.f80391a : new a0(nVarArr, 0));
    }

    @Override // in2.n
    public final Collection d(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        n[] nVarArr = this.f72843c;
        int length = nVarArr.length;
        if (length == 0) {
            return q0.f80391a;
        }
        if (length == 1) {
            return nVarArr[0].d(name, location);
        }
        Collection collection = null;
        for (n nVar : nVarArr) {
            collection = ue.c.k(collection, nVar.d(name, location));
        }
        return collection == null ? s0.f80394a : collection;
    }

    @Override // in2.p
    public final am2.j e(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        am2.j jVar = null;
        for (n nVar : this.f72843c) {
            am2.j e13 = nVar.e(name, location);
            if (e13 != null) {
                if (!(e13 instanceof am2.k) || !((am2.k) e13).Z()) {
                    return e13;
                }
                if (jVar == null) {
                    jVar = e13;
                }
            }
        }
        return jVar;
    }

    @Override // in2.n
    public final Set f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : this.f72843c) {
            k0.u(nVar.f(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // in2.p
    public final Collection g(g kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        n[] nVarArr = this.f72843c;
        int length = nVarArr.length;
        if (length == 0) {
            return q0.f80391a;
        }
        if (length == 1) {
            return nVarArr[0].g(kindFilter, nameFilter);
        }
        Collection collection = null;
        for (n nVar : nVarArr) {
            collection = ue.c.k(collection, nVar.g(kindFilter, nameFilter));
        }
        return collection == null ? s0.f80394a : collection;
    }

    public final String toString() {
        return this.f72842b;
    }
}

package in2;

import am2.b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends o {

    /* renamed from: b, reason: collision with root package name */
    public final n f72870b;

    public i(n workerScope) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        this.f72870b = workerScope;
    }

    @Override // in2.o, in2.n
    public final Set b() {
        return this.f72870b.b();
    }

    @Override // in2.o, in2.n
    public final Set c() {
        return this.f72870b.c();
    }

    @Override // in2.o, in2.p
    public final am2.j e(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        am2.j e13 = this.f72870b.e(name, location);
        if (e13 == null) {
            return null;
        }
        am2.g gVar = e13 instanceof am2.g ? (am2.g) e13 : null;
        if (gVar != null) {
            return gVar;
        }
        if (e13 instanceof b1) {
            return (b1) e13;
        }
        return null;
    }

    @Override // in2.o, in2.n
    public final Set f() {
        return this.f72870b.f();
    }

    @Override // in2.o, in2.p
    public final Collection g(g kindFilter, Function1 nameFilter) {
        Collection collection;
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        int i13 = g.f72857k & kindFilter.f72866b;
        g gVar = i13 == 0 ? null : new g(i13, kindFilter.f72865a);
        if (gVar == null) {
            collection = q0.f80391a;
        } else {
            Collection g13 = this.f72870b.g(gVar, nameFilter);
            ArrayList arrayList = new ArrayList();
            for (Object obj : g13) {
                if (obj instanceof am2.k) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        }
        return collection;
    }

    public final String toString() {
        return "Classes from " + this.f72870b;
    }
}

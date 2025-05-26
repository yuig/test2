package in2;

import am2.y0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import pn2.l1;
import pn2.q1;

/* loaded from: classes2.dex */
public final class s implements n {

    /* renamed from: b, reason: collision with root package name */
    public final n f72883b;

    /* renamed from: c, reason: collision with root package name */
    public final q1 f72884c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f72885d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f72886e;

    public s(n workerScope, q1 givenSubstitutor) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        Intrinsics.checkNotNullParameter(givenSubstitutor, "givenSubstitutor");
        this.f72883b = workerScope;
        xk2.m.b(new tu1.u(givenSubstitutor, 25));
        l1 h10 = givenSubstitutor.h();
        Intrinsics.checkNotNullExpressionValue(h10, "getSubstitution(...)");
        this.f72884c = l0.E1(h10).c();
        this.f72886e = xk2.m.b(new tu1.u(this, 24));
    }

    @Override // in2.n
    public final Collection a(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i(this.f72883b.a(name, location));
    }

    @Override // in2.n
    public final Set b() {
        return this.f72883b.b();
    }

    @Override // in2.n
    public final Set c() {
        return this.f72883b.c();
    }

    @Override // in2.n
    public final Collection d(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i(this.f72883b.d(name, location));
    }

    @Override // in2.p
    public final am2.j e(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        am2.j e13 = this.f72883b.e(name, location);
        if (e13 != null) {
            return (am2.j) h(e13);
        }
        return null;
    }

    @Override // in2.n
    public final Set f() {
        return this.f72883b.f();
    }

    @Override // in2.p
    public final Collection g(g kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return (Collection) this.f72886e.getValue();
    }

    public final am2.m h(am2.m mVar) {
        q1 q1Var = this.f72884c;
        if (q1Var.f100834a.f()) {
            return mVar;
        }
        if (this.f72885d == null) {
            this.f72885d = new HashMap();
        }
        HashMap hashMap = this.f72885d;
        Intrinsics.f(hashMap);
        Object obj = hashMap.get(mVar);
        if (obj == null) {
            if (!(mVar instanceof y0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + mVar).toString());
            }
            obj = ((y0) mVar).d(q1Var);
            if (obj == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + mVar + " substitution fails");
            }
            hashMap.put(mVar, obj);
        }
        return (am2.m) obj;
    }

    public final Collection i(Collection collection) {
        if (this.f72884c.f100834a.f() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(h((am2.m) it.next()));
        }
        return linkedHashSet;
    }
}

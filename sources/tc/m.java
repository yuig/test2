package tc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.i1;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class m implements g {

    /* renamed from: a, reason: collision with root package name */
    public Object f117206a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f117207b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f117208c = new ArrayList();

    public static Object a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj2 == null) {
            return obj;
        }
        if (obj instanceof List) {
            if (!(obj2 instanceof List)) {
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
            IntRange h10 = f0.h((Collection) obj);
            ArrayList arrayList = new ArrayList(g0.q(h10, 10));
            ql2.k it = h10.iterator();
            while (it.f104109c) {
                int b13 = it.b();
                arrayList.add(a(list.get(b13), list2.get(b13)));
            }
            return arrayList;
        }
        if (!(obj instanceof Map)) {
            if (Intrinsics.d(obj, obj2)) {
                return obj;
            }
            throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
        }
        if (!(obj2 instanceof Map)) {
            throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        LinkedHashSet<String> i13 = i1.i(map.keySet(), map2.keySet());
        ArrayList arrayList2 = new ArrayList(g0.q(i13, 10));
        for (String str : i13) {
            arrayList2.add(new Pair(str, a(map.get(str), map2.get(str))));
        }
        return z0.m(arrayList2);
    }

    @Override // tc.g
    public final g C(long j13) {
        d(Long.valueOf(j13));
        return this;
    }

    @Override // tc.g
    public final g D(int i13) {
        d(Integer.valueOf(i13));
        return this;
    }

    @Override // tc.g
    public final g H(double d2) {
        d(Double.valueOf(d2));
        return this;
    }

    @Override // tc.g
    public final g M0(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        l lVar = (l) CollectionsKt.b0(this.f117208c);
        if (!(lVar instanceof k)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        k kVar = (k) lVar;
        if (kVar.f117205b != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        kVar.f117205b = name;
        return this;
    }

    @Override // tc.g
    public final g a2() {
        d(null);
        return this;
    }

    public final Object c() {
        if (this.f117207b) {
            return this.f117206a;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void d(Object obj) {
        l lVar = (l) CollectionsKt.d0(this.f117208c);
        if (!(lVar instanceof k)) {
            if (lVar instanceof j) {
                ((j) lVar).f117203a.add(obj);
                return;
            } else {
                this.f117206a = obj;
                this.f117207b = true;
                return;
            }
        }
        k kVar = (k) lVar;
        String str = kVar.f117205b;
        if (str == null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Map map = kVar.f117204a;
        if (map.containsKey(str)) {
            map.put(str, a(map.get(str), obj));
        } else {
            map.put(str, obj);
        }
        kVar.f117205b = null;
    }

    @Override // tc.g
    public final g h0(boolean z13) {
        d(Boolean.valueOf(z13));
        return this;
    }

    @Override // tc.g
    public final g n1(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        d(value);
        return this;
    }

    @Override // tc.g
    public final g s() {
        this.f117208c.add(new k(new LinkedHashMap()));
        return this;
    }

    @Override // tc.g
    public final g t() {
        l lVar = (l) this.f117208c.remove(r0.size() - 1);
        if (!(lVar instanceof j)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        d(((j) lVar).f117203a);
        return this;
    }

    @Override // tc.g
    public final g u() {
        this.f117208c.add(new j(new ArrayList()));
        return this;
    }

    @Override // tc.g
    public final g v() {
        l lVar = (l) this.f117208c.remove(r0.size() - 1);
        if (!(lVar instanceof k)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        d(((k) lVar).f117204a);
        return this;
    }

    @Override // tc.g
    public final g y(d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        d(value);
        return this;
    }
}

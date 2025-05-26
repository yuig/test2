package n2;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f extends kotlin.collections.p {

    /* renamed from: a, reason: collision with root package name */
    public p2.b f88936a;

    /* renamed from: b, reason: collision with root package name */
    public r f88937b;

    /* renamed from: c, reason: collision with root package name */
    public Object f88938c;

    /* renamed from: d, reason: collision with root package name */
    public int f88939d;

    /* renamed from: e, reason: collision with root package name */
    public int f88940e;

    @Override // kotlin.collections.p
    public final Set b() {
        return new h(this);
    }

    @Override // kotlin.collections.p
    public final Set c() {
        return new j(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f88937b = r.f88954e;
        g(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f88937b.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.p
    public final int d() {
        return this.f88940e;
    }

    @Override // kotlin.collections.p
    public final Collection e() {
        return new l(this);
    }

    public final void f(Object obj) {
        this.f88938c = obj;
    }

    public final void g(int i13) {
        this.f88940e = i13;
        this.f88939d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f88937b.j(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f88938c = null;
        this.f88937b = this.f88937b.s(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f88938c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [n2.d] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        q2.l lVar = null;
        q2.l lVar2 = map instanceof d ? (d) map : null;
        if (lVar2 == null) {
            f fVar = map instanceof f ? (f) map : null;
            if (fVar != null) {
                lVar = ((q2.k) fVar).h();
            }
        } else {
            lVar = lVar2;
        }
        if (lVar == null) {
            super.putAll(map);
            return;
        }
        p2.a aVar = new p2.a();
        aVar.f98684a = 0;
        int i13 = this.f88940e;
        r rVar = this.f88937b;
        r rVar2 = lVar.f88931d;
        Intrinsics.g(rVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f88937b = rVar.t(rVar2, 0, aVar, this);
        int i14 = (lVar.f88932e + i13) - aVar.f98684a;
        if (i13 != i14) {
            g(i14);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f88938c = null;
        r u13 = this.f88937b.u(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (u13 == null) {
            u13 = r.f88954e;
        }
        this.f88937b = u13;
        return this.f88938c;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int d2 = d();
        r v13 = this.f88937b.v(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (v13 == null) {
            v13 = r.f88954e;
        }
        this.f88937b = v13;
        return d2 != d();
    }
}

package o2;

import java.util.Iterator;
import kotlin.collections.s;
import kotlin.jvm.internal.Intrinsics;
import l2.d;

/* loaded from: classes.dex */
public final class b extends s implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final b f92792e;

    /* renamed from: b, reason: collision with root package name */
    public final Object f92793b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f92794c;

    /* renamed from: d, reason: collision with root package name */
    public final n2.d f92795d;

    static {
        p2.b bVar = p2.b.f98685a;
        n2.d dVar = n2.d.f88930f;
        Intrinsics.g(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        f92792e = new b(bVar, bVar, dVar);
    }

    public b(Object obj, Object obj2, n2.d dVar) {
        this.f92793b = obj;
        this.f92794c = obj2;
        this.f92795d = dVar;
    }

    @Override // kotlin.collections.b
    public final int b() {
        return this.f92795d.e();
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f92795d.containsKey(obj);
    }

    @Override // kotlin.collections.s, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c(this.f92793b, this.f92795d);
    }
}

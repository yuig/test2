package nj2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public final zi2.b f91050b;

    /* renamed from: c, reason: collision with root package name */
    public final c f91051c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f91052d;

    /* renamed from: e, reason: collision with root package name */
    public final mj2.a f91053e;

    /* renamed from: f, reason: collision with root package name */
    public final Supplier f91054f;

    /* renamed from: g, reason: collision with root package name */
    public final rj2.e f91055g;

    /* renamed from: h, reason: collision with root package name */
    public final q f91056h;

    /* renamed from: a, reason: collision with root package name */
    public final Object f91049a = new Object();

    /* renamed from: i, reason: collision with root package name */
    public volatile zi2.c f91057i = null;

    public s(zi2.b bVar, f fVar, mj2.a aVar, Supplier supplier, rj2.d dVar, ArrayList arrayList) {
        this.f91050b = bVar;
        this.f91051c = fVar;
        this.f91052d = fVar instanceof f;
        this.f91053e = aVar;
        this.f91054f = supplier;
        this.f91055g = dVar;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((q) it.next());
        }
        this.f91056h = arrayList2.isEmpty() ? e.f90999a : arrayList2.size() == 1 ? (q) arrayList2.get(0) : new d(new ArrayList(arrayList2));
    }
}

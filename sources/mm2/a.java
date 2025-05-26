package mm2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final pm2.g f87630a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f87631b;

    /* renamed from: c, reason: collision with root package name */
    public final e82.l f87632c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f87633d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f87634e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f87635f;

    public a(pm2.g jClass, Function1 memberFilter) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(memberFilter, "memberFilter");
        this.f87630a = jClass;
        this.f87631b = memberFilter;
        e82.l lVar = new e82.l(this, 18);
        this.f87632c = lVar;
        yn2.i j13 = yn2.c0.j(CollectionsKt.K(((gm2.q) jClass).d()), lVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        yn2.h hVar = new yn2.h(j13);
        while (hVar.hasNext()) {
            Object next = hVar.next();
            ym2.g c13 = ((gm2.z) next).c();
            Object obj = linkedHashMap.get(c13);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c13, obj);
            }
            ((List) obj).add(next);
        }
        this.f87633d = linkedHashMap;
        yn2.i j14 = yn2.c0.j(CollectionsKt.K(((gm2.q) this.f87630a).b()), this.f87631b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        yn2.h hVar2 = new yn2.h(j14);
        while (hVar2.hasNext()) {
            Object next2 = hVar2.next();
            linkedHashMap2.put(((gm2.w) next2).c(), next2);
        }
        this.f87634e = linkedHashMap2;
        ArrayList f13 = ((gm2.q) this.f87630a).f();
        Function1 function1 = this.f87631b;
        ArrayList arrayList = new ArrayList();
        Iterator it = f13.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            if (((Boolean) function1.invoke(next3)).booleanValue()) {
                arrayList.add(next3);
            }
        }
        int a13 = y0.a(kotlin.collections.g0.q(arrayList, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(a13 < 16 ? 16 : a13);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next4 = it2.next();
            linkedHashMap3.put(((gm2.y) ((pm2.o) next4)).c(), next4);
        }
        this.f87635f = linkedHashMap3;
    }

    @Override // mm2.c
    public final Set a() {
        yn2.i j13 = yn2.c0.j(CollectionsKt.K(((gm2.q) this.f87630a).d()), this.f87632c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        yn2.h hVar = new yn2.h(j13);
        while (hVar.hasNext()) {
            linkedHashSet.add(((gm2.z) hVar.next()).c());
        }
        return linkedHashSet;
    }

    @Override // mm2.c
    public final pm2.o b(ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (pm2.o) this.f87635f.get(name);
    }

    @Override // mm2.c
    public final gm2.w c(ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (gm2.w) this.f87634e.get(name);
    }

    @Override // mm2.c
    public final Set d() {
        return this.f87635f.keySet();
    }

    @Override // mm2.c
    public final Set e() {
        yn2.i j13 = yn2.c0.j(CollectionsKt.K(((gm2.q) this.f87630a).b()), this.f87631b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        yn2.h hVar = new yn2.h(j13);
        while (hVar.hasNext()) {
            linkedHashSet.add(((gm2.w) hVar.next()).c());
        }
        return linkedHashSet;
    }

    @Override // mm2.c
    public final Collection f(ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List list = (List) this.f87633d.get(name);
        return list != null ? list : q0.f80391a;
    }
}

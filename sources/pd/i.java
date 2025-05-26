package pd;

import i2.a2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f99672a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f99673b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.f f99674c;

    /* renamed from: d, reason: collision with root package name */
    public Object f99675d;

    /* renamed from: e, reason: collision with root package name */
    public int f99676e;

    /* renamed from: f, reason: collision with root package name */
    public int f99677f;

    /* renamed from: g, reason: collision with root package name */
    public Class f99678g;

    /* renamed from: h, reason: collision with root package name */
    public ih.g f99679h;

    /* renamed from: i, reason: collision with root package name */
    public nd.l f99680i;

    /* renamed from: j, reason: collision with root package name */
    public Map f99681j;

    /* renamed from: k, reason: collision with root package name */
    public Class f99682k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f99683l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f99684m;

    /* renamed from: n, reason: collision with root package name */
    public nd.h f99685n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.h f99686o;

    /* renamed from: p, reason: collision with root package name */
    public r f99687p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f99688q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f99689r;

    public final ArrayList a() {
        boolean z13 = this.f99684m;
        ArrayList arrayList = this.f99673b;
        if (!z13) {
            this.f99684m = true;
            arrayList.clear();
            ArrayList b13 = b();
            int size = b13.size();
            for (int i13 = 0; i13 < size; i13++) {
                td.b0 b0Var = (td.b0) b13.get(i13);
                if (!arrayList.contains(b0Var.f117372a)) {
                    arrayList.add(b0Var.f117372a);
                }
                int i14 = 0;
                while (true) {
                    List list = b0Var.f117373b;
                    if (i14 < list.size()) {
                        if (!arrayList.contains(list.get(i14))) {
                            arrayList.add(list.get(i14));
                        }
                        i14++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z13 = this.f99683l;
        ArrayList arrayList = this.f99672a;
        if (!z13) {
            this.f99683l = true;
            arrayList.clear();
            List e13 = this.f99674c.a().e(this.f99675d);
            int size = e13.size();
            for (int i13 = 0; i13 < size; i13++) {
                td.b0 b13 = ((td.c0) e13.get(i13)).b(this.f99675d, this.f99676e, this.f99677f, this.f99680i);
                if (b13 != null) {
                    arrayList.add(b13);
                }
            }
        }
        return arrayList;
    }

    public final e0 c(Class cls) {
        e0 e0Var;
        ArrayList arrayList;
        zd.a aVar;
        com.bumptech.glide.j a13 = this.f99674c.a();
        Class cls2 = this.f99678g;
        Class cls3 = this.f99682k;
        ce.b bVar = a13.f29788i;
        he.l lVar = (he.l) bVar.f27578b.getAndSet(null);
        if (lVar == null) {
            lVar = new he.l();
        }
        lVar.f68955a = cls;
        lVar.f68956b = cls2;
        lVar.f68957c = cls3;
        synchronized (bVar.f27577a) {
            e0Var = (e0) bVar.f27577a.get(lVar);
        }
        bVar.f27578b.set(lVar);
        a13.f29788i.getClass();
        if (ce.b.f27576c.equals(e0Var)) {
            return null;
        }
        if (e0Var != null) {
            return e0Var;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = a13.f29782c.j(cls, cls2).iterator();
        while (it.hasNext()) {
            Class<?> cls4 = (Class) it.next();
            Iterator it2 = a13.f29785f.h(cls4, cls3).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                qq2.c cVar = a13.f29782c;
                synchronized (cVar) {
                    arrayList = new ArrayList();
                    Iterator it3 = ((List) cVar.f104883b).iterator();
                    while (it3.hasNext()) {
                        List<ce.c> list = (List) ((Map) cVar.f104884c).get((String) it3.next());
                        if (list != null) {
                            for (ce.c cVar2 : list) {
                                if (cVar2.f27579a.isAssignableFrom(cls) && cls4.isAssignableFrom(cVar2.f27580b)) {
                                    arrayList.add(cVar2.f27581c);
                                }
                            }
                        }
                    }
                }
                a2 a2Var = a13.f29785f;
                synchronized (a2Var) {
                    if (!cls5.isAssignableFrom(cls4)) {
                        for (zd.b bVar2 : a2Var.f71073a) {
                            if (bVar2.a(cls4, cls5)) {
                                aVar = bVar2.f141658c;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                    }
                    aVar = zd.c.f141659a;
                }
                arrayList2.add(new p(cls, cls4, cls5, arrayList, aVar, a13.f29789j));
            }
        }
        e0 e0Var2 = arrayList2.isEmpty() ? null : new e0(cls, cls2, cls3, arrayList2, a13.f29789j);
        ce.b bVar3 = a13.f29788i;
        synchronized (bVar3.f27577a) {
            bVar3.f27577a.put(new he.l(cls, cls2, cls3), e0Var2 != null ? e0Var2 : ce.b.f27576c);
        }
        return e0Var2;
    }

    public final Class d() {
        return this.f99675d.getClass();
    }

    public final List e() {
        List list;
        ArrayList e13;
        com.bumptech.glide.j a13 = this.f99674c.a();
        Class<?> cls = this.f99675d.getClass();
        Class cls2 = this.f99678g;
        Class cls3 = this.f99682k;
        tb.l lVar = a13.f29787h;
        he.l lVar2 = (he.l) ((AtomicReference) lVar.f116986b).getAndSet(null);
        if (lVar2 == null) {
            lVar2 = new he.l(cls, cls2, cls3);
        } else {
            lVar2.f68955a = cls;
            lVar2.f68956b = cls2;
            lVar2.f68957c = cls3;
        }
        synchronized (((g1.g) lVar.f116987c)) {
            list = (List) ((g1.g) lVar.f116987c).get(lVar2);
        }
        ((AtomicReference) lVar.f116986b).set(lVar2);
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            tb.l lVar3 = a13.f29780a;
            synchronized (lVar3) {
                e13 = ((td.i0) lVar3.f116986b).e(cls);
            }
            Iterator it = e13.iterator();
            while (it.hasNext()) {
                Iterator it2 = a13.f29782c.j((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!a13.f29785f.h(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            tb.l lVar4 = a13.f29787h;
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((g1.g) lVar4.f116987c)) {
                ((g1.g) lVar4.f116987c).put(new he.l(cls, cls2, cls3), unmodifiableList);
            }
            list2 = arrayList;
        }
        return list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r1 = r3.f27575b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final nd.d f(java.lang.Object r6) {
        /*
            r5 = this;
            com.bumptech.glide.f r0 = r5.f99674c
            com.bumptech.glide.j r0 = r0.a()
            i2.a2 r0 = r0.f29781b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.List r2 = r0.f71073a     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2b
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2b
            ce.a r3 = (ce.a) r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r4 = r3.f27574a     // Catch: java.lang.Throwable -> L2b
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L13
            nd.d r1 = r3.f27575b     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)
            goto L2f
        L2b:
            r6 = move-exception
            goto L3c
        L2d:
            monitor-exit(r0)
            r1 = 0
        L2f:
            if (r1 == 0) goto L32
            return r1
        L32:
            com.bumptech.glide.Registry$NoSourceEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoSourceEncoderAvailableException
            java.lang.Class r6 = r6.getClass()
            r0.<init>(r6)
            throw r0
        L3c:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.i.f(java.lang.Object):nd.d");
    }

    public final Class g() {
        return this.f99682k;
    }

    public final nd.p h(Class cls) {
        nd.p pVar = (nd.p) this.f99681j.get(cls);
        if (pVar == null) {
            Iterator it = this.f99681j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    pVar = (nd.p) entry.getValue();
                    break;
                }
            }
        }
        if (pVar != null) {
            return pVar;
        }
        if (!this.f99681j.isEmpty() || !this.f99688q) {
            return vd.c.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}

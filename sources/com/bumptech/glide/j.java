package com.bumptech.glide;

import i2.a2;
import ja.c0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import td.d0;
import td.e0;
import td.i0;
import td.t;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final tb.l f29780a;

    /* renamed from: b, reason: collision with root package name */
    public final a2 f29781b;

    /* renamed from: c, reason: collision with root package name */
    public final qq2.c f29782c;

    /* renamed from: d, reason: collision with root package name */
    public final a2 f29783d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.i f29784e;

    /* renamed from: f, reason: collision with root package name */
    public final a2 f29785f;

    /* renamed from: g, reason: collision with root package name */
    public final a2 f29786g;

    /* renamed from: h, reason: collision with root package name */
    public final tb.l f29787h = new tb.l(8);

    /* renamed from: i, reason: collision with root package name */
    public final ce.b f29788i = new ce.b();

    /* renamed from: j, reason: collision with root package name */
    public final x92.b f29789j;

    public j() {
        x92.b bVar = new x92.b(new p5.e(20), new wc.j(16), new wc.b(17));
        this.f29789j = bVar;
        this.f29780a = new tb.l(bVar);
        this.f29781b = new a2(6);
        this.f29782c = new qq2.c(8);
        this.f29783d = new a2(8);
        this.f29784e = new com.bumptech.glide.load.data.i();
        this.f29785f = new a2(5);
        this.f29786g = new a2(7);
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        qq2.c cVar = this.f29782c;
        synchronized (cVar) {
            try {
                ArrayList arrayList2 = new ArrayList((List) cVar.f104883b);
                ((List) cVar.f104883b).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((List) cVar.f104883b).add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        ((List) cVar.f104883b).add(str);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void a(Class cls, Class cls2, d0 d0Var) {
        tb.l lVar = this.f29780a;
        synchronized (lVar) {
            ((i0) lVar.f116986b).a(cls, cls2, d0Var);
            ((c0) lVar.f116987c).f75176a.clear();
        }
    }

    public final void b(Class cls, nd.o oVar) {
        a2 a2Var = this.f29783d;
        synchronized (a2Var) {
            a2Var.f71073a.add(new ce.d(cls, oVar));
        }
    }

    public final void c(nd.n nVar, Class cls, Class cls2, String str) {
        qq2.c cVar = this.f29782c;
        synchronized (cVar) {
            cVar.i(str).add(new ce.c(cls, cls2, nVar));
        }
    }

    public final List d() {
        List list;
        a2 a2Var = this.f29786g;
        synchronized (a2Var) {
            list = a2Var.f71073a;
        }
        if (list.isEmpty()) {
            throw new Registry$MissingComponentException() { // from class: com.bumptech.glide.Registry$NoImageHeaderParserException
            };
        }
        return list;
    }

    public final List e(Object obj) {
        List list;
        tb.l lVar = this.f29780a;
        lVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (lVar) {
            e0 e0Var = (e0) ((c0) lVar.f116987c).f75176a.get(cls);
            list = e0Var == null ? null : e0Var.f117378a;
            if (list == null) {
                list = Collections.unmodifiableList(((i0) lVar.f116986b).b(cls));
                c0 c0Var = (c0) lVar.f116987c;
                c0Var.getClass();
                if (((e0) c0Var.f75176a.put(cls, new e0(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (list.isEmpty()) {
            throw new Registry$MissingComponentException("Failed to find any ModelLoaders registered for model class: " + obj.getClass()) { // from class: com.bumptech.glide.Registry$NoModelLoaderAvailableException
                {
                    super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
                }
            };
        }
        int size = list.size();
        List emptyList = Collections.emptyList();
        boolean z13 = true;
        for (int i13 = 0; i13 < size; i13++) {
            td.c0 c0Var2 = (td.c0) list.get(i13);
            if (c0Var2.a(obj)) {
                if (z13) {
                    emptyList = new ArrayList(size - i13);
                    z13 = false;
                }
                emptyList.add(c0Var2);
            }
        }
        if (!emptyList.isEmpty()) {
            return emptyList;
        }
        throw new Registry$MissingComponentException("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj) { // from class: com.bumptech.glide.Registry$NoModelLoaderAvailableException
            {
                super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
            }
        };
    }

    public final com.bumptech.glide.load.data.g f(Object obj) {
        com.bumptech.glide.load.data.g b13;
        com.bumptech.glide.load.data.i iVar = this.f29784e;
        synchronized (iVar) {
            try {
                d7.b.o(obj);
                com.bumptech.glide.load.data.f fVar = (com.bumptech.glide.load.data.f) iVar.f29805a.get(obj.getClass());
                if (fVar == null) {
                    Iterator it = iVar.f29805a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.bumptech.glide.load.data.f fVar2 = (com.bumptech.glide.load.data.f) it.next();
                        if (fVar2.a().isAssignableFrom(obj.getClass())) {
                            fVar = fVar2;
                            break;
                        }
                    }
                }
                if (fVar == null) {
                    fVar = com.bumptech.glide.load.data.i.f29804b;
                }
                b13 = fVar.b(obj);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return b13;
    }

    public final void g(com.bumptech.glide.load.data.f fVar) {
        com.bumptech.glide.load.data.i iVar = this.f29784e;
        synchronized (iVar) {
            iVar.f29805a.put(fVar.a(), fVar);
        }
    }

    public final void h(Class cls, Class cls2, zd.a aVar) {
        a2 a2Var = this.f29785f;
        synchronized (a2Var) {
            a2Var.f71073a.add(new zd.b(cls, cls2, aVar));
        }
    }

    public final void i(md.b bVar) {
        ArrayList f13;
        tb.l lVar = this.f29780a;
        synchronized (lVar) {
            try {
                i0 i0Var = (i0) lVar.f116986b;
                synchronized (i0Var) {
                    f13 = i0Var.f();
                    i0Var.a(t.class, InputStream.class, bVar);
                }
                Iterator it = f13.iterator();
                while (it.hasNext()) {
                    ((d0) it.next()).getClass();
                }
                ((c0) lVar.f116987c).f75176a.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}

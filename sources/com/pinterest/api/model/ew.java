package com.pinterest.api.model;

import android.util.LruCache;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ew {

    /* renamed from: a, reason: collision with root package name */
    public static final LruCache f37357a = new LruCache(100);

    /* renamed from: b, reason: collision with root package name */
    public static final LruCache f37358b = new LruCache(100);

    /* renamed from: c, reason: collision with root package name */
    public static final LruCache f37359c = new LruCache(100);

    /* renamed from: d, reason: collision with root package name */
    public static final LruCache f37360d = new LruCache(100);

    /* renamed from: e, reason: collision with root package name */
    public static final LruCache f37361e = new LruCache(100);

    /* renamed from: f, reason: collision with root package name */
    public static final LruCache f37362f = new LruCache(100);

    /* renamed from: g, reason: collision with root package name */
    public static final LruCache f37363g = new LruCache(100);

    /* renamed from: h, reason: collision with root package name */
    public static final LruCache f37364h = new LruCache(100);

    /* renamed from: i, reason: collision with root package name */
    public static final LruCache f37365i = new LruCache(100);

    /* renamed from: j, reason: collision with root package name */
    public static final LruCache f37366j = new LruCache(100);

    /* renamed from: k, reason: collision with root package name */
    public static final LruCache f37367k = new LruCache(100);

    /* renamed from: l, reason: collision with root package name */
    public static final LruCache f37368l = new LruCache(100);

    /* renamed from: m, reason: collision with root package name */
    public static final LruCache f37369m = new LruCache(100);

    /* renamed from: n, reason: collision with root package name */
    public static final LruCache f37370n = new LruCache(100);

    /* renamed from: o, reason: collision with root package name */
    public static final LruCache f37371o = new LruCache(100);

    /* renamed from: p, reason: collision with root package name */
    public static final LruCache f37372p = new LruCache(100);

    /* renamed from: q, reason: collision with root package name */
    public static final LruCache f37373q;

    /* renamed from: r, reason: collision with root package name */
    public static nw f37374r;

    static {
        new LruCache(100);
        f37373q = new LruCache(100);
    }

    public static v7 a(String str) {
        if (str == null) {
            return null;
        }
        return (v7) f37359c.get(str);
    }

    public static ue b(String str) {
        if (str == null) {
            return null;
        }
        return (ue) f37369m.get(str);
    }

    public static f30 c(String str) {
        if (str == null) {
            return null;
        }
        f30 f30Var = (f30) f37357a.get(str);
        return f30Var == null ? (f30) ((nw) f()).b(str) : f30Var;
    }

    public static kg0 d(String str) {
        if (str == null) {
            return null;
        }
        return (kg0) f37373q.get(str);
    }

    public static wy0 e(String str) {
        if (str == null) {
            return null;
        }
        return (wy0) f37358b.get(str);
    }

    public static hw f() {
        if (f37374r == null) {
            nw.f40514g.getClass();
            f37374r = new nw(nw.f40515h);
        }
        return f37374r;
    }

    public static void g(v7 v7Var) {
        if (v7Var == null) {
            return;
        }
        LruCache lruCache = f37359c;
        synchronized (lruCache) {
            lruCache.put(v7Var.getId(), v7Var);
        }
    }

    public static void h(k8 k8Var) {
        if (k8Var == null || k8Var.getId() == null) {
            return;
        }
        LruCache lruCache = f37371o;
        synchronized (lruCache) {
            lruCache.put(k8Var.getId(), k8Var);
        }
    }

    public static void i(xk xkVar) {
        if (xkVar == null || xkVar.getId() == null) {
            return;
        }
        LruCache lruCache = f37364h;
        synchronized (lruCache) {
            lruCache.put(xkVar.getId(), xkVar);
        }
    }

    public static void j(zs zsVar) {
        if (zsVar == null) {
            return;
        }
        LruCache lruCache = f37361e;
        synchronized (lruCache) {
            lruCache.put(zsVar.getId(), zsVar);
        }
    }

    public static void k(mv mvVar) {
        if (mvVar == null || mvVar.getId() == null) {
            return;
        }
        LruCache lruCache = f37370n;
        synchronized (lruCache) {
            try {
                String id3 = mvVar.getId();
                mv mvVar2 = (mv) lruCache.get(id3);
                if (mvVar2 != null) {
                    if (mvVar2.E().getTime() < mvVar.E().getTime()) {
                    }
                }
                lruCache.put(id3, mvVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        LruCache lruCache2 = f37368l;
        synchronized (lruCache2) {
            lruCache2.put(mvVar.getId(), mvVar);
        }
    }

    public static void l(f30 model) {
        if (model == null) {
            return;
        }
        nw nwVar = (nw) f();
        nwVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        nwVar.c();
        ConcurrentHashMap concurrentHashMap = nwVar.f40520e;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) concurrentHashMap.get(model.getId());
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
            String id3 = model.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
            concurrentHashMap.put(id3, concurrentLinkedQueue);
        }
        concurrentLinkedQueue.add(new kw(model, nwVar.f40519d));
        LruCache lruCache = f37357a;
        synchronized (lruCache) {
            lruCache.put(model.getId(), model);
        }
    }

    public static void m(kg0 kg0Var) {
        if (kg0Var == null) {
            return;
        }
        LruCache lruCache = f37373q;
        synchronized (lruCache) {
            lruCache.put(kg0Var.getId(), kg0Var);
        }
    }

    public static void n(wy0 wy0Var) {
        if (wy0Var == null) {
            return;
        }
        LruCache lruCache = f37358b;
        synchronized (lruCache) {
            lruCache.put(wy0Var.getId(), wy0Var);
        }
    }

    public static void o(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        LruCache lruCache = f37367k;
        synchronized (lruCache) {
            lruCache.put(str, obj);
        }
    }

    public static void p() {
        LruCache lruCache = f37362f;
        synchronized (lruCache) {
            lruCache.evictAll();
        }
    }

    public static void q() {
        LruCache lruCache = f37364h;
        synchronized (lruCache) {
            lruCache.evictAll();
        }
    }

    public static void r() {
        LruCache lruCache = f37361e;
        synchronized (lruCache) {
            lruCache.evictAll();
        }
    }

    public static void s() {
        LruCache lruCache = f37367k;
        synchronized (lruCache) {
            lruCache.evictAll();
        }
    }

    public static void t() {
        LruCache lruCache = f37366j;
        synchronized (lruCache) {
            lruCache.evictAll();
        }
    }

    public static void u() {
        ConcurrentHashMap concurrentHashMap = ((nw) f()).f40520e;
        Collection<ConcurrentLinkedQueue> values = concurrentHashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        for (ConcurrentLinkedQueue concurrentLinkedQueue : values) {
            Intrinsics.f(concurrentLinkedQueue);
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                ((kw) it.next()).clear();
            }
            concurrentLinkedQueue.clear();
        }
        concurrentHashMap.clear();
        LruCache lruCache = f37357a;
        synchronized (lruCache) {
            lruCache.evictAll();
        }
    }

    public static void v() {
        LruCache lruCache = f37372p;
        synchronized (lruCache) {
            lruCache.evictAll();
        }
    }

    public static void w() {
        LruCache lruCache = f37373q;
        synchronized (lruCache) {
            lruCache.evictAll();
        }
    }

    public static void x() {
        LruCache lruCache = f37358b;
        synchronized (lruCache) {
            lruCache.evictAll();
        }
    }
}

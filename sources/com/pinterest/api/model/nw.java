package com.pinterest.api.model;

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class nw implements hw {

    /* renamed from: g, reason: collision with root package name */
    public static final jw f40514g = new jw(null);

    /* renamed from: h, reason: collision with root package name */
    public static final ho2.c f40515h = dl2.b.b(kotlin.coroutines.g.d(ao2.v0.f20219a, ue.c.b()));

    /* renamed from: a, reason: collision with root package name */
    public final ao2.j0 f40516a;

    /* renamed from: b, reason: collision with root package name */
    public long f40517b;

    /* renamed from: c, reason: collision with root package name */
    public final ao2.f0 f40518c;

    /* renamed from: d, reason: collision with root package name */
    public final ReferenceQueue f40519d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f40520e;

    /* renamed from: f, reason: collision with root package name */
    public ao2.o1 f40521f;

    public nw(@NotNull ao2.j0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f40516a = scope;
        this.f40518c = ao2.v0.f20219a.m(1, null);
        this.f40519d = new ReferenceQueue();
        this.f40520e = new ConcurrentHashMap();
    }

    public static final void a(nw nwVar, kw kwVar) {
        ConcurrentHashMap concurrentHashMap = nwVar.f40520e;
        String str = kwVar.f39557a;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) concurrentHashMap.get(str);
        if (concurrentLinkedQueue != null) {
            concurrentLinkedQueue.removeIf(new iw(0, lw.f39930i));
            if (concurrentLinkedQueue.isEmpty()) {
                concurrentHashMap.remove(str);
            }
        }
    }

    public final dl1.s b(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        c();
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.f40520e.get(id3);
        if (concurrentLinkedQueue == null) {
            return null;
        }
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            dl1.s sVar = (dl1.s) ((kw) it.next()).get();
            if (sVar != null) {
                return sVar;
            }
        }
        return null;
    }

    public final void c() {
        ao2.o1 o1Var = this.f40521f;
        if ((o1Var == null || !o1Var.isActive()) && System.currentTimeMillis() - this.f40517b >= 1000) {
            this.f40521f = kotlin.jvm.internal.j.z(this.f40516a, this.f40518c, null, new mw(this, null), 2);
        }
    }
}

package com.bumptech.glide;

import ae.s;
import ae.t;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.app.v;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class o implements ComponentCallbacks2, ae.i {

    /* renamed from: k, reason: collision with root package name */
    public static final de.h f29828k;

    /* renamed from: l, reason: collision with root package name */
    public static final de.h f29829l;

    /* renamed from: a, reason: collision with root package name */
    public final b f29830a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f29831b;

    /* renamed from: c, reason: collision with root package name */
    public final ae.g f29832c;

    /* renamed from: d, reason: collision with root package name */
    public final s f29833d;

    /* renamed from: e, reason: collision with root package name */
    public final ae.n f29834e;

    /* renamed from: f, reason: collision with root package name */
    public final t f29835f;

    /* renamed from: g, reason: collision with root package name */
    public final v f29836g;

    /* renamed from: h, reason: collision with root package name */
    public final ae.b f29837h;

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f29838i;

    /* renamed from: j, reason: collision with root package name */
    public final de.h f29839j;

    static {
        de.h hVar = (de.h) new de.h().g(Bitmap.class);
        hVar.f54494t = true;
        f29828k = hVar;
        de.h hVar2 = (de.h) new de.h().g(yd.c.class);
        hVar2.f54494t = true;
        f29829l = hVar2;
    }

    public o(b bVar, ae.g gVar, ae.n nVar, Context context) {
        de.h hVar;
        s sVar = new s();
        wc.b bVar2 = bVar.f29746g;
        this.f29835f = new t();
        v vVar = new v(this, 6);
        this.f29836g = vVar;
        this.f29830a = bVar;
        this.f29832c = gVar;
        this.f29834e = nVar;
        this.f29833d = sVar;
        this.f29831b = context;
        Context applicationContext = context.getApplicationContext();
        n nVar2 = new n(this, sVar);
        bVar2.getClass();
        boolean z13 = d5.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z13 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        ae.b cVar = z13 ? new ae.c(applicationContext, nVar2) : new ae.l();
        this.f29837h = cVar;
        synchronized (bVar.f29747h) {
            if (bVar.f29747h.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.f29747h.add(this);
        }
        char[] cArr = he.n.f68959a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            he.n.f().post(vVar);
        } else {
            gVar.h(this);
        }
        gVar.h(cVar);
        this.f29838i = new CopyOnWriteArrayList(bVar.f29743d.f29771e);
        f fVar = bVar.f29743d;
        synchronized (fVar) {
            try {
                if (fVar.f29776j == null) {
                    fVar.f29770d.getClass();
                    de.h hVar2 = new de.h();
                    hVar2.f54494t = true;
                    fVar.f29776j = hVar2;
                }
                hVar = fVar.f29776j;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (this) {
            de.h hVar3 = (de.h) hVar.clone();
            if (hVar3.f54494t && !hVar3.f54496v) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            hVar3.f54496v = true;
            hVar3.f54494t = true;
            this.f29839j = hVar3;
        }
    }

    public final l a(Class cls) {
        return new l(this.f29830a, this, cls, this.f29831b);
    }

    @Override // ae.i
    public final synchronized void b() {
        this.f29835f.b();
        f();
    }

    public final l c() {
        return a(Bitmap.class).a(f29828k);
    }

    public final l d() {
        return a(yd.c.class).a(f29829l);
    }

    public final void e(ee.i iVar) {
        if (iVar == null) {
            return;
        }
        boolean h10 = h(iVar);
        de.c e13 = iVar.getE();
        if (h10 || this.f29830a.c(iVar) || e13 == null) {
            return;
        }
        iVar.Z(null);
        e13.clear();
    }

    public final synchronized void f() {
        s sVar = this.f29833d;
        sVar.f15032b = true;
        Iterator it = he.n.e((Set) sVar.f15034d).iterator();
        while (it.hasNext()) {
            de.c cVar = (de.c) it.next();
            if (cVar.isRunning()) {
                cVar.pause();
                ((Set) sVar.f15033c).add(cVar);
            }
        }
    }

    public final synchronized boolean h(ee.i iVar) {
        de.c e13 = iVar.getE();
        if (e13 == null) {
            return true;
        }
        if (!this.f29833d.c(e13)) {
            return false;
        }
        this.f29835f.f15035a.remove(iVar);
        iVar.Z(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // ae.i
    public final synchronized void onDestroy() {
        this.f29835f.onDestroy();
        synchronized (this) {
            try {
                Iterator it = he.n.e(this.f29835f.f15035a).iterator();
                while (it.hasNext()) {
                    e((ee.i) it.next());
                }
                this.f29835f.f15035a.clear();
            } finally {
            }
        }
        s sVar = this.f29833d;
        Iterator it2 = he.n.e((Set) sVar.f15034d).iterator();
        while (it2.hasNext()) {
            sVar.c((de.c) it2.next());
        }
        ((Set) sVar.f15033c).clear();
        this.f29832c.m(this);
        this.f29832c.m(this.f29837h);
        he.n.f().removeCallbacks(this.f29836g);
        this.f29830a.e(this);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i13) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f29833d + ", treeNode=" + this.f29834e + "}";
    }

    @Override // ae.i
    public final synchronized void x() {
        synchronized (this) {
            this.f29833d.l();
        }
        this.f29835f.x();
    }
}

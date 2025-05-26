package com.bugsnag.android;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n2 extends i {

    /* renamed from: c, reason: collision with root package name */
    public final hd.h f29355c;

    /* renamed from: d, reason: collision with root package name */
    public final m f29356d;

    /* renamed from: e, reason: collision with root package name */
    public final o f29357e;

    /* renamed from: f, reason: collision with root package name */
    public final l2 f29358f;

    /* renamed from: h, reason: collision with root package name */
    public final hd.c f29360h;

    /* renamed from: i, reason: collision with root package name */
    public final u1 f29361i;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f29353a = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public volatile j2 f29359g = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f29362j = true;

    /* renamed from: b, reason: collision with root package name */
    public final long f29354b = 30000;

    public n2(hd.h hVar, m mVar, o oVar, l2 l2Var, u1 u1Var, hd.c cVar) {
        this.f29355c = hVar;
        this.f29356d = mVar;
        this.f29357e = oVar;
        this.f29358f = l2Var;
        this.f29360h = cVar;
        this.f29361i = u1Var;
    }

    public final g0 a(j2 j2Var) {
        hd.h hVar = this.f29355c;
        String str = hVar.f68823o.f102692c;
        Map g13 = kotlin.collections.z0.g(new Pair("Bugsnag-Payload-Version", "1.0"), new Pair("Bugsnag-Api-Key", j2Var.f29299n), new Pair("Content-Type", "application/json"), new Pair("Bugsnag-Sent-At", hd.e.b(new Date())));
        b0 b0Var = hVar.f68822n;
        b0Var.getClass();
        g0 b13 = b0Var.b(str, hd.l.c(j2Var), kh2.a1.E(j2Var), g13);
        b0Var.f29159b.c(Intrinsics.n(b13, "Session API request finished with status "));
        return b13;
    }

    public final void b() {
        try {
            this.f29360h.b(hd.n.SESSION_REQUEST, new androidx.appcompat.app.z(this, 19));
        } catch (RejectedExecutionException e13) {
            this.f29361i.a("Failed to flush session reports", e13);
        }
    }

    public final String c() {
        String str;
        synchronized (this.f29353a) {
            str = (String) this.f29353a.peekLast();
        }
        return str;
    }

    public final void d(j2 j2Var) {
        updateState(new c3(j2Var.f29288c, j2Var.f29296k.intValue(), j2Var.f29295j.intValue(), hd.e.b(j2Var.f29289d)));
    }

    public final void e(long j13, boolean z13) {
        if (z13 && j13 - hd.g.f68807k >= this.f29354b && this.f29355c.f68812d) {
            g(new Date(), ((b4) this.f29357e.f29373g.get()).f29171a, true);
        }
        updateState(new e3(c(), z13));
    }

    public final boolean f(boolean z13) {
        hd.h hVar = this.f29357e.f29367a;
        if (hVar.c() || (z13 && !hVar.f68812d)) {
            return true;
        }
        j2 j2Var = this.f29359g;
        if (z13 && j2Var != null && !j2Var.f29294i && this.f29362j) {
            this.f29362j = false;
            return true;
        }
        if (z13) {
            this.f29362j = false;
        }
        return false;
    }

    public final j2 g(Date date, a4 a4Var, boolean z13) {
        if (f(z13)) {
            return null;
        }
        j2 j2Var = new j2(UUID.randomUUID().toString(), date, a4Var, z13, this.f29357e.f29388v, this.f29361i, this.f29355c.f68809a);
        this.f29361i.i("SessionTracker#trackSessionIfNeeded() - session captured by Client");
        o oVar = this.f29357e;
        g gVar = oVar.f29377k;
        String str = gVar.f29227h;
        hd.h hVar = gVar.f29221b;
        id.c cVar = hVar.f68819k;
        j2Var.f29292g = new e(str, gVar.f29225f, gVar.f29230k, gVar.f29231l, null, cVar, hVar.f68821m, hVar.f68820l);
        j2Var.f29293h = oVar.f29376j.a();
        m mVar = this.f29356d;
        u1 u1Var = this.f29361i;
        Collection collection = mVar.f29335c;
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                try {
                    throw null;
                } catch (Throwable th3) {
                    u1Var.a("OnSessionCallback threw an Exception", th3);
                }
            }
        }
        if (!j2Var.f29297l.compareAndSet(false, true)) {
            return null;
        }
        this.f29359g = j2Var;
        d(j2Var);
        try {
            this.f29360h.b(hd.n.SESSION_REQUEST, new androidx.appcompat.widget.j(14, this, j2Var));
        } catch (RejectedExecutionException unused) {
            this.f29358f.h(j2Var);
        }
        b();
        return j2Var;
    }

    public final void h(String str, boolean z13) {
        if (z13) {
            synchronized (this.f29353a) {
                this.f29353a.add(str);
            }
        } else {
            synchronized (this.f29353a) {
                this.f29353a.removeLastOccurrence(str);
            }
        }
        v vVar = this.f29357e.f29371e;
        String c13 = c();
        if (vVar.f29662b != "__BUGSNAG_MANUAL_CONTEXT__") {
            vVar.f29662b = c13;
            vVar.a();
        }
    }
}

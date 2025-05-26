package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.tasks.TaskCompletionSource;
import df.j1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import kh2.m2;

/* loaded from: classes.dex */
public final class z implements com.google.android.gms.common.api.g, com.google.android.gms.common.api.h {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.c f30902b;

    /* renamed from: c, reason: collision with root package name */
    public final a f30903c;

    /* renamed from: d, reason: collision with root package name */
    public final tb.l f30904d;

    /* renamed from: g, reason: collision with root package name */
    public final int f30907g;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f30908h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30909i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f30913m;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f30901a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f30905e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f30906f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f30910j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public ConnectionResult f30911k = null;

    /* renamed from: l, reason: collision with root package name */
    public int f30912l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public z(f fVar, com.google.android.gms.common.api.f fVar2) {
        this.f30913m = fVar;
        Looper looper = fVar.f30819n.getLooper();
        jh.g a13 = fVar2.b().a();
        j1 j1Var = (j1) fVar2.f30763c.f134365b;
        com.bumptech.glide.d.t(j1Var);
        com.google.android.gms.common.api.c s13 = j1Var.s(fVar2.f30761a, looper, a13, fVar2.f30764d, this, this);
        String str = fVar2.f30762b;
        if (str != null && (s13 instanceof jh.f)) {
            ((jh.f) s13).setAttributionTag(str);
        }
        if (str != null && (s13 instanceof m)) {
            throw null;
        }
        this.f30902b = s13;
        this.f30903c = fVar2.f30765e;
        this.f30904d = new tb.l(10);
        this.f30907g = fVar2.f30767g;
        if (!s13.requiresSignIn()) {
            this.f30908h = null;
        } else {
            this.f30908h = fVar2.c(fVar.f30810e, fVar.f30819n);
        }
    }

    public static /* bridge */ /* synthetic */ void p(z zVar, a0 a0Var) {
        if (zVar.f30910j.contains(a0Var) && !zVar.f30909i) {
            if (zVar.f30902b.isConnected()) {
                zVar.e();
            } else {
                zVar.r();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void q(z zVar, a0 a0Var) {
        Feature feature;
        Feature[] g13;
        if (zVar.f30910j.remove(a0Var)) {
            f fVar = zVar.f30913m;
            fVar.f30819n.removeMessages(15, a0Var);
            fVar.f30819n.removeMessages(16, a0Var);
            feature = a0Var.f30787b;
            LinkedList<r0> linkedList = zVar.f30901a;
            ArrayList arrayList = new ArrayList(linkedList.size());
            for (r0 r0Var : linkedList) {
                if ((r0Var instanceof f0) && (g13 = ((f0) r0Var).g(zVar)) != null && m2.u0(g13, feature)) {
                    arrayList.add(r0Var);
                }
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                r0 r0Var2 = (r0) arrayList.get(i13);
                linkedList.remove(r0Var2);
                r0Var2.b(new UnsupportedApiCallException(feature));
            }
        }
    }

    public final Feature a(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.f30902b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            g1.g gVar = new g1.g(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                gVar.put(feature.f30735f, Long.valueOf(feature.e()));
            }
            for (Feature feature2 : featureArr) {
                Long l13 = (Long) gVar.get(feature2.f30735f);
                if (l13 == null || l13.longValue() < feature2.e()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    public final void b(ConnectionResult connectionResult) {
        HashSet hashSet = this.f30905e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        ep.b.A(it.next());
        if (com.bumptech.glide.c.x(connectionResult, ConnectionResult.f30730j)) {
            this.f30902b.getEndpointPackageName();
        }
        throw null;
    }

    public final void c(Status status) {
        com.bumptech.glide.d.m(this.f30913m.f30819n);
        d(status, null, false);
    }

    public final void d(Status status, RuntimeException runtimeException, boolean z13) {
        com.bumptech.glide.d.m(this.f30913m.f30819n);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f30901a.iterator();
        while (it.hasNext()) {
            r0 r0Var = (r0) it.next();
            if (!z13 || r0Var.f30867a == 2) {
                if (status != null) {
                    r0Var.a(status);
                } else {
                    r0Var.b(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void e() {
        LinkedList linkedList = this.f30901a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            r0 r0Var = (r0) arrayList.get(i13);
            if (!this.f30902b.isConnected()) {
                return;
            }
            if (i(r0Var)) {
                linkedList.remove(r0Var);
            }
        }
    }

    public final void f() {
        com.google.android.gms.common.api.c cVar = this.f30902b;
        f fVar = this.f30913m;
        com.bumptech.glide.d.m(fVar.f30819n);
        this.f30911k = null;
        b(ConnectionResult.f30730j);
        if (this.f30909i) {
            bi.f fVar2 = fVar.f30819n;
            a aVar = this.f30903c;
            fVar2.removeMessages(11, aVar);
            fVar.f30819n.removeMessages(9, aVar);
            this.f30909i = false;
        }
        Iterator it = this.f30906f.values().iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (a((Feature[]) j0Var.f30836a.f16961e) != null) {
                it.remove();
            } else {
                try {
                    j0Var.f30836a.h(cVar, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    cVar.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        e();
        h();
    }

    public final void g(int i13) {
        f fVar = this.f30913m;
        com.bumptech.glide.d.m(fVar.f30819n);
        this.f30911k = null;
        this.f30909i = true;
        String lastDisconnectMessage = this.f30902b.getLastDisconnectMessage();
        tb.l lVar = this.f30904d;
        lVar.getClass();
        StringBuilder sb3 = new StringBuilder("The connection to Google Play services was lost");
        if (i13 == 1) {
            sb3.append(" due to service disconnection.");
        } else if (i13 == 3) {
            sb3.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb3.append(" Last reason for disconnect: ");
            sb3.append(lastDisconnectMessage);
        }
        lVar.F(new Status(20, sb3.toString(), null, null), true);
        bi.f fVar2 = fVar.f30819n;
        a aVar = this.f30903c;
        fVar2.sendMessageDelayed(Message.obtain(fVar2, 9, aVar), 5000L);
        bi.f fVar3 = fVar.f30819n;
        fVar3.sendMessageDelayed(Message.obtain(fVar3, 11, aVar), 120000L);
        fVar.f30812g.u();
        Iterator it = this.f30906f.values().iterator();
        while (it.hasNext()) {
            ((j0) it.next()).f30838c.run();
        }
    }

    public final void h() {
        f fVar = this.f30913m;
        bi.f fVar2 = fVar.f30819n;
        a aVar = this.f30903c;
        fVar2.removeMessages(12, aVar);
        bi.f fVar3 = fVar.f30819n;
        fVar3.sendMessageDelayed(fVar3.obtainMessage(12, aVar), fVar.f30806a);
    }

    public final boolean i(r0 r0Var) {
        boolean z13 = r0Var instanceof f0;
        tb.l lVar = this.f30904d;
        com.google.android.gms.common.api.c cVar = this.f30902b;
        if (!z13) {
            r0Var.d(lVar, cVar.requiresSignIn());
            try {
                r0Var.c(this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                cVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        f0 f0Var = (f0) r0Var;
        Feature a13 = a(f0Var.g(this));
        if (a13 == null) {
            r0Var.d(lVar, cVar.requiresSignIn());
            try {
                r0Var.c(this);
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                cVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        String name = cVar.getClass().getName();
        long e13 = a13.e();
        StringBuilder D = ep.b.D(name, " could not execute call because it requires feature (");
        D.append(a13.f30735f);
        D.append(", ");
        D.append(e13);
        D.append(").");
        Log.w("GoogleApiManager", D.toString());
        f fVar = this.f30913m;
        if (!fVar.f30820o || !f0Var.f(this)) {
            f0Var.b(new UnsupportedApiCallException(a13));
            return true;
        }
        a0 a0Var = new a0(this.f30903c, a13);
        ArrayList arrayList = this.f30910j;
        int indexOf = arrayList.indexOf(a0Var);
        bi.f fVar2 = fVar.f30819n;
        if (indexOf >= 0) {
            a0 a0Var2 = (a0) arrayList.get(indexOf);
            fVar2.removeMessages(15, a0Var2);
            fVar2.sendMessageDelayed(Message.obtain(fVar2, 15, a0Var2), 5000L);
            return false;
        }
        arrayList.add(a0Var);
        fVar2.sendMessageDelayed(Message.obtain(fVar2, 15, a0Var), 5000L);
        fVar2.sendMessageDelayed(Message.obtain(fVar2, 16, a0Var), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (k(connectionResult)) {
            return false;
        }
        fVar.e(connectionResult, this.f30907g);
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void j() {
        Looper myLooper = Looper.myLooper();
        f fVar = this.f30913m;
        if (myLooper == fVar.f30819n.getLooper()) {
            f();
        } else {
            fVar.f30819n.post(new k0(this, 1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r6.get() == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(com.google.android.gms.common.ConnectionResult r6) {
        /*
            r5 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.f.f30804r
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.f r1 = r5.f30913m     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.u r2 = r1.f30816k     // Catch: java.lang.Throwable -> L45
            r3 = 0
            if (r2 == 0) goto L47
            g1.h r1 = r1.f30817l     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.a r2 = r5.f30903c     // Catch: java.lang.Throwable -> L45
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            com.google.android.gms.common.api.internal.f r1 = r5.f30913m     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.u r1 = r1.f30816k     // Catch: java.lang.Throwable -> L45
            int r2 = r5.f30907g     // Catch: java.lang.Throwable -> L45
            r1.getClass()     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.s0 r4 = new com.google.android.gms.common.api.internal.s0     // Catch: java.lang.Throwable -> L45
            r4.<init>(r6, r2)     // Catch: java.lang.Throwable -> L45
        L22:
            java.util.concurrent.atomic.AtomicReference r6 = r1.f30878b     // Catch: java.lang.Throwable -> L45
        L24:
            r2 = 0
            boolean r2 = r6.compareAndSet(r2, r4)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L36
            bi.f r6 = r1.f30879c     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.u0 r2 = new com.google.android.gms.common.api.internal.u0     // Catch: java.lang.Throwable -> L45
            r2.<init>(r3, r1, r4)     // Catch: java.lang.Throwable -> L45
            r6.post(r2)     // Catch: java.lang.Throwable -> L45
            goto L42
        L36:
            java.lang.Object r2 = r6.get()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L24
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L22
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            r6 = 1
            return r6
        L45:
            r6 = move-exception
            goto L49
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return r3
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.z.k(com.google.android.gms.common.ConnectionResult):boolean");
    }

    public final boolean l(boolean z13) {
        com.bumptech.glide.d.m(this.f30913m.f30819n);
        com.google.android.gms.common.api.c cVar = this.f30902b;
        if (!cVar.isConnected() || !this.f30906f.isEmpty()) {
            return false;
        }
        tb.l lVar = this.f30904d;
        if (((Map) lVar.f116986b).isEmpty() && ((Map) lVar.f116987c).isEmpty()) {
            cVar.disconnect("Timing out service connection.");
            return true;
        }
        if (!z13) {
            return false;
        }
        h();
        return false;
    }

    public final int m() {
        return this.f30907g;
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        u(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void onConnectionSuspended(int i13) {
        Looper myLooper = Looper.myLooper();
        f fVar = this.f30913m;
        if (myLooper == fVar.f30819n.getLooper()) {
            g(i13);
        } else {
            fVar.f30819n.post(new x(this, i13, 0));
        }
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.common.api.c, ri.c] */
    public final void r() {
        f fVar = this.f30913m;
        com.bumptech.glide.d.m(fVar.f30819n);
        com.google.android.gms.common.api.c cVar = this.f30902b;
        if (cVar.isConnected() || cVar.isConnecting()) {
            return;
        }
        try {
            int t13 = fVar.f30812g.t(fVar.f30810e, cVar);
            if (t13 != 0) {
                ConnectionResult connectionResult = new ConnectionResult(t13, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + connectionResult.toString());
                u(connectionResult, null);
                return;
            }
            b0 b0Var = new b0(fVar, cVar, this.f30903c);
            if (cVar.requiresSignIn()) {
                l0 l0Var = this.f30908h;
                com.bumptech.glide.d.t(l0Var);
                ri.c cVar2 = l0Var.f30850g;
                if (cVar2 != null) {
                    cVar2.disconnect();
                }
                Integer valueOf = Integer.valueOf(System.identityHashCode(l0Var));
                jh.g gVar = l0Var.f30849f;
                gVar.f76151h = valueOf;
                Handler handler = l0Var.f30846c;
                l0Var.f30850g = l0Var.f30847d.s(l0Var.f30845b, handler.getLooper(), gVar, gVar.f76150g, l0Var, l0Var);
                l0Var.f30851h = b0Var;
                Set set = l0Var.f30848e;
                if (set == null || set.isEmpty()) {
                    handler.post(new k0(l0Var, 0));
                } else {
                    l0Var.f30850g.a();
                }
            }
            try {
                cVar.connect(b0Var);
            } catch (SecurityException e13) {
                u(new ConnectionResult(10), e13);
            }
        } catch (IllegalStateException e14) {
            u(new ConnectionResult(10), e14);
        }
    }

    public final void s(r0 r0Var) {
        com.bumptech.glide.d.m(this.f30913m.f30819n);
        boolean isConnected = this.f30902b.isConnected();
        LinkedList linkedList = this.f30901a;
        if (isConnected) {
            if (i(r0Var)) {
                h();
                return;
            } else {
                linkedList.add(r0Var);
                return;
            }
        }
        linkedList.add(r0Var);
        ConnectionResult connectionResult = this.f30911k;
        if (connectionResult == null || !connectionResult.k1()) {
            r();
        } else {
            u(this.f30911k, null);
        }
    }

    public final void t() {
        this.f30912l++;
    }

    public final void u(ConnectionResult connectionResult, RuntimeException runtimeException) {
        com.bumptech.glide.d.m(this.f30913m.f30819n);
        l0 l0Var = this.f30908h;
        if (l0Var != null) {
            l0Var.D();
        }
        com.bumptech.glide.d.m(this.f30913m.f30819n);
        this.f30911k = null;
        this.f30913m.f30812g.u();
        b(connectionResult);
        if ((this.f30902b instanceof kh.c) && connectionResult.f30732g != 24) {
            f fVar = this.f30913m;
            fVar.f30807b = true;
            bi.f fVar2 = fVar.f30819n;
            fVar2.sendMessageDelayed(fVar2.obtainMessage(19), 300000L);
        }
        if (connectionResult.f30732g == 4) {
            c(f.f30803q);
            return;
        }
        if (this.f30901a.isEmpty()) {
            this.f30911k = connectionResult;
            return;
        }
        if (runtimeException != null) {
            com.bumptech.glide.d.m(this.f30913m.f30819n);
            d(null, runtimeException, false);
            return;
        }
        if (!this.f30913m.f30820o) {
            c(f.f(this.f30903c, connectionResult));
            return;
        }
        d(f.f(this.f30903c, connectionResult), null, true);
        if (this.f30901a.isEmpty() || k(connectionResult) || this.f30913m.e(connectionResult, this.f30907g)) {
            return;
        }
        if (connectionResult.f30732g == 18) {
            this.f30909i = true;
        }
        if (!this.f30909i) {
            c(f.f(this.f30903c, connectionResult));
            return;
        }
        f fVar3 = this.f30913m;
        a aVar = this.f30903c;
        bi.f fVar4 = fVar3.f30819n;
        fVar4.sendMessageDelayed(Message.obtain(fVar4, 9, aVar), 5000L);
    }

    public final void v(ConnectionResult connectionResult) {
        com.bumptech.glide.d.m(this.f30913m.f30819n);
        com.google.android.gms.common.api.c cVar = this.f30902b;
        cVar.disconnect("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        u(connectionResult, null);
    }

    public final void w() {
        com.bumptech.glide.d.m(this.f30913m.f30819n);
        if (this.f30909i) {
            r();
        }
    }

    public final void x() {
        com.bumptech.glide.d.m(this.f30913m.f30819n);
        Status status = f.f30802p;
        c(status);
        tb.l lVar = this.f30904d;
        lVar.getClass();
        lVar.F(status, false);
        for (j jVar : (j[]) this.f30906f.keySet().toArray(new j[0])) {
            s(new p0(jVar, new TaskCompletionSource()));
        }
        b(new ConnectionResult(4));
        com.google.android.gms.common.api.c cVar = this.f30902b;
        if (cVar.isConnected()) {
            cVar.onUserSignOut(new y(this));
        }
    }

    public final void y() {
        f fVar = this.f30913m;
        com.bumptech.glide.d.m(fVar.f30819n);
        boolean z13 = this.f30909i;
        if (z13) {
            if (z13) {
                bi.f fVar2 = fVar.f30819n;
                a aVar = this.f30903c;
                fVar2.removeMessages(11, aVar);
                fVar.f30819n.removeMessages(9, aVar);
                this.f30909i = false;
            }
            c(fVar.f30811f.c(fVar.f30810e, ih.d.f72258a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
            this.f30902b.disconnect("Timing out connection while resuming.");
        }
    }
}

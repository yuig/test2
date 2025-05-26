package androidx.camera.core.impl;

import a.cb;
import a.ig;
import a.sc;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16874a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16875b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16876c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16877d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16878e;

    /* renamed from: f, reason: collision with root package name */
    public Object f16879f;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        this.f16874a = i13;
        this.f16875b = obj;
        this.f16876c = obj2;
        this.f16877d = obj3;
        this.f16878e = obj4;
        this.f16879f = obj5;
    }

    public static gp1.k i(jo1.a aVar) {
        return (aVar == jo1.a.MORE_IDEAS || aVar == jo1.a.BOARD || aVar == jo1.a.BOARD_SECTION) ? gp1.k.BOARD_FEED : aVar == jo1.a.HOMEFEED ? gp1.k.HOME_FEED : aVar == jo1.a.SEARCH ? gp1.k.SEARCH_RESULTS : aVar == jo1.a.RELATED_PINS ? gp1.k.RELATED_PINS : aVar == jo1.a.NEWS_HUB ? gp1.k.NEWS_HUB_DETAIL : gp1.k.UNKNOWN;
    }

    public final void a(q0.b bVar, kotlin.collections.q0 q0Var, Collection collection, a0.a aVar) {
        androidx.lifecycle.z zVar;
        synchronized (this.f16875b) {
            try {
                com.bumptech.glide.d.h(!collection.isEmpty());
                this.f16879f = aVar;
                synchronized (bVar.f101747a) {
                    zVar = bVar.f101748b;
                }
                q0.c h10 = h(zVar);
                if (h10 == null) {
                    return;
                }
                Set set = (Set) ((Map) this.f16877d).get(h10);
                Object obj = this.f16879f;
                if (((a0.a) obj) == null || ((a0.a) obj).f202a != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        q0.b bVar2 = (q0.b) ((Map) this.f16876c).get((q0.a) it.next());
                        bVar2.getClass();
                        if (!bVar2.equals(bVar) && !bVar2.b().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    h0.f fVar = bVar.f101749c;
                    synchronized (fVar.f66391k) {
                        fVar.getClass();
                    }
                    h0.f fVar2 = bVar.f101749c;
                    synchronized (fVar2.f66391k) {
                        fVar2.f66389i = q0Var;
                    }
                    synchronized (bVar.f101747a) {
                        bVar.f101749c.b(collection);
                    }
                    if (((androidx.lifecycle.b0) zVar.getLifecycle()).f18588d.isAtLeast(androidx.lifecycle.r.STARTED)) {
                        n(zVar);
                    }
                } catch (CameraUseCaseAdapter$CameraException e13) {
                    throw new IllegalArgumentException(e13);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final k b() {
        String str = ((Size) this.f16875b) == null ? " resolution" : "";
        if (((c0.z) this.f16876c) == null) {
            str = str.concat(" dynamicRange");
        }
        if (((Range) this.f16877d) == null) {
            str = a.a.C(str, " expectedFrameRateRange");
        }
        if (((Boolean) this.f16879f) == null) {
            str = a.a.C(str, " zslDisabled");
        }
        if (str.isEmpty()) {
            return new k((Size) this.f16875b, (c0.z) this.f16876c, (Range) this.f16877d, (v0) this.f16878e, ((Boolean) this.f16879f).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final r0.a c() {
        String str = ((Range) this.f16877d) == null ? " bitrate" : "";
        if (((Integer) this.f16875b) == null) {
            str = str.concat(" sourceFormat");
        }
        if (((Integer) this.f16876c) == null) {
            str = a.a.C(str, " source");
        }
        if (((Range) this.f16878e) == null) {
            str = a.a.C(str, " sampleRate");
        }
        if (((Integer) this.f16879f) == null) {
            str = a.a.C(str, " channelCount");
        }
        if (str.isEmpty()) {
            return new r0.a((Range) this.f16877d, ((Integer) this.f16875b).intValue(), ((Integer) this.f16876c).intValue(), (Range) this.f16878e, ((Integer) this.f16879f).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final void d(j0 j0Var, j0 j0Var2, l0.s sVar, l0.s sVar2, Map.Entry entry) {
        l0.s sVar3 = (l0.s) entry.getValue();
        c0.h hVar = new c0.h(sVar.f81273g.f16893a, ((m0.a) entry.getKey()).f85248a.f88736d, sVar.f81269c ? j0Var : null, ((m0.a) entry.getKey()).f85248a.f88738f, ((m0.a) entry.getKey()).f85248a.f88739g);
        c0.h hVar2 = new c0.h(sVar2.f81273g.f16893a, ((m0.a) entry.getKey()).f85249b.f88736d, sVar2.f81269c ? j0Var2 : null, ((m0.a) entry.getKey()).f85249b.f88738f, ((m0.a) entry.getKey()).f85249b.f88739g);
        int i13 = ((m0.a) entry.getKey()).f85248a.f88735c;
        sVar3.getClass();
        f0.h.s();
        sVar3.b();
        com.bumptech.glide.d.v("Consumer can only be linked once.", !sVar3.f81276j);
        sVar3.f81276j = true;
        l0.r rVar = sVar3.f81278l;
        g0.m.a(g0.m.j(rVar.c(), new l0.q(sVar3, rVar, i13, hVar, hVar2), l3.c.H0()), new c0.m1(5, this, sVar3), l3.c.H0());
    }

    public final q0.b e(nl1.d dVar, h0.f fVar) {
        synchronized (this.f16875b) {
            try {
                com.bumptech.glide.d.g("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", ((Map) this.f16876c).get(new q0.a(dVar, fVar.f66385e)) == null);
                q0.b bVar = new q0.b(dVar, fVar);
                if (((ArrayList) fVar.v()).isEmpty()) {
                    bVar.h();
                }
                if (((androidx.lifecycle.b0) dVar.getLifecycle()).f18588d == androidx.lifecycle.r.DESTROYED) {
                    return bVar;
                }
                k(bVar);
                return bVar;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final c5.l0 f() {
        if (((z9.b0) this.f16877d) == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        }
        if (!(!((List) this.f16878e).isEmpty())) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        Iterator it = ((List) this.f16878e).iterator();
        z9.z zVar = null;
        while (true) {
            int i13 = 0;
            if (!it.hasNext()) {
                ((Intent) this.f16876c).putExtra("android-support-nav:controller:deepLinkIds", CollectionsKt.E0(arrayList));
                ((Intent) this.f16876c).putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
                c5.l0 l0Var = new c5.l0((Context) this.f16875b);
                Intent intent = new Intent((Intent) this.f16876c);
                ComponentName component = intent.getComponent();
                if (component == null) {
                    component = intent.resolveActivity(l0Var.f25820b.getPackageManager());
                }
                if (component != null) {
                    l0Var.c(component);
                }
                ArrayList arrayList3 = l0Var.f25819a;
                arrayList3.add(intent);
                Intrinsics.checkNotNullExpressionValue(l0Var, "create(context)\n        …rentStack(Intent(intent))");
                int size = arrayList3.size();
                while (i13 < size) {
                    Intent intent2 = (Intent) arrayList3.get(i13);
                    if (intent2 != null) {
                        intent2.putExtra("android-support-nav:controller:deepLinkIntent", (Intent) this.f16876c);
                    }
                    i13++;
                }
                return l0Var;
            }
            z9.x xVar = (z9.x) it.next();
            int i14 = xVar.f141313a;
            z9.z g13 = g(i14);
            if (g13 == null) {
                int i15 = z9.z.f141321j;
                StringBuilder o13 = cb.o("Navigation destination ", g4.u.k0((Context) this.f16875b, i14), " cannot be found in the navigation graph ");
                o13.append((z9.b0) this.f16877d);
                throw new IllegalArgumentException(o13.toString());
            }
            int[] d2 = g13.d(zVar);
            int length = d2.length;
            while (i13 < length) {
                arrayList.add(Integer.valueOf(d2[i13]));
                arrayList2.add(xVar.f141314b);
                i13++;
            }
            zVar = g13;
        }
    }

    public final z9.z g(int i13) {
        kotlin.collections.v vVar = new kotlin.collections.v();
        z9.b0 b0Var = (z9.b0) this.f16877d;
        Intrinsics.f(b0Var);
        vVar.addLast(b0Var);
        while (!vVar.isEmpty()) {
            z9.z zVar = (z9.z) vVar.removeFirst();
            if (zVar.f141329h == i13) {
                return zVar;
            }
            if (zVar instanceof z9.b0) {
                z9.a0 a0Var = new z9.a0((z9.b0) zVar);
                while (a0Var.hasNext()) {
                    vVar.addLast((z9.z) a0Var.next());
                }
            }
        }
        return null;
    }

    public final q0.c h(androidx.lifecycle.z zVar) {
        synchronized (this.f16875b) {
            try {
                for (q0.c cVar : ((Map) this.f16877d).keySet()) {
                    if (zVar.equals(cVar.f101752b)) {
                        return cVar;
                    }
                }
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean j(androidx.lifecycle.z zVar) {
        synchronized (this.f16875b) {
            try {
                q0.c h10 = h(zVar);
                if (h10 == null) {
                    return false;
                }
                Iterator it = ((Set) ((Map) this.f16877d).get(h10)).iterator();
                while (it.hasNext()) {
                    q0.b bVar = (q0.b) ((Map) this.f16876c).get((q0.a) it.next());
                    bVar.getClass();
                    if (!bVar.b().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void k(q0.b bVar) {
        androidx.lifecycle.z zVar;
        synchronized (this.f16875b) {
            try {
                synchronized (bVar.f101747a) {
                    zVar = bVar.f101748b;
                }
                h0.f fVar = bVar.f101749c;
                q0.a aVar = new q0.a(zVar, h0.f.s(fVar.f66397q, fVar.f66398r));
                q0.c h10 = h(zVar);
                Set hashSet = h10 != null ? (Set) ((Map) this.f16877d).get(h10) : new HashSet();
                hashSet.add(aVar);
                ((Map) this.f16876c).put(aVar, bVar);
                if (h10 == null) {
                    q0.c cVar = new q0.c(zVar, this);
                    ((Map) this.f16877d).put(cVar, hashSet);
                    zVar.getLifecycle().a(cVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void l() {
        int i13 = 2;
        switch (this.f16874a) {
            case 1:
                ((l0.u) this.f16875b).a();
                f0.h.m0(new ig(this, 24));
                return;
            case 13:
                he2.f fVar = (he2.f) this.f16879f;
                if (fVar.f54676b) {
                    yd2.j jVar = fVar.f68977e;
                    if (jVar == null) {
                        Intrinsics.r("frameBuffer");
                        throw null;
                    }
                    pe.i.J(new yd2.a(jVar, i13), "");
                    ae2.d dVar = fVar.f68978f;
                    if (dVar == null) {
                        Intrinsics.r("colorTexture");
                        throw null;
                    }
                    dVar.b();
                    ae2.d dVar2 = fVar.f68979g;
                    if (dVar2 == null) {
                        Intrinsics.r("indexTexture");
                        throw null;
                    }
                    dVar2.b();
                    ae2.d dVar3 = fVar.f68980h;
                    if (dVar3 == null) {
                        Intrinsics.r("postProcessingTexture");
                        throw null;
                    }
                    dVar3.b();
                    ce2.b bVar = fVar.f68982j;
                    if (bVar == null) {
                        Intrinsics.r("postProcessing");
                        throw null;
                    }
                    bn0.a aVar = bVar.f27629i;
                    if (aVar != null) {
                        aVar.g();
                    }
                    ae2.d dVar4 = bVar.f27621a;
                    if (dVar4 != null) {
                        dVar4.b();
                    }
                    ae2.d dVar5 = bVar.f27622b;
                    if (dVar5 != null) {
                        dVar5.b();
                    }
                    Iterator it = bVar.f27623c.iterator();
                    while (it.hasNext()) {
                        ud2.a aVar2 = (ud2.a) it.next();
                        aVar2.getClass();
                        l3.c.N0(aVar2);
                    }
                    ud2.c cVar = (ud2.c) bVar.f27624d.c(bVar, ce2.b.f27620m[0]);
                    if (cVar != null) {
                        l3.c.N0(cVar);
                    }
                    bVar.f27627g.c();
                    bVar.f27628h.c();
                    bVar.f27625e = false;
                    fVar.f54676b = false;
                }
                ((g01.a) this.f16878e).h();
                ((mc2.k) this.f16877d).d();
                return;
            default:
                ae2.d dVar6 = (ae2.d) this.f16879f;
                if (dVar6 != null) {
                    dVar6.b();
                }
                this.f16878e = null;
                android.support.v4.media.a aVar3 = (android.support.v4.media.a) this.f16877d;
                yd2.j jVar2 = (yd2.j) aVar3.f15842f;
                jVar2.getClass();
                pe.i.J(new yd2.a(jVar2, i13), "");
                yd2.j jVar3 = (yd2.j) aVar3.f15843g;
                jVar3.getClass();
                pe.i.J(new yd2.a(jVar3, i13), "");
                ((he.b) aVar3.f15840d).c();
                ((he.b) aVar3.f15841e).c();
                Iterator it2 = ((List) aVar3.f15844h).iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((com.pinterest.xrenderer.legacy.multipass_processing.a) it2.next()).f52866b.iterator();
                    while (it3.hasNext()) {
                        ((com.pinterest.xrenderer.legacy.multipass_processing.e) it3.next()).f52878c.g();
                    }
                }
                return;
        }
    }

    public final void m(ig.a aVar) {
        long elapsedRealtime;
        long elapsedRealtime2;
        a.e eVar = new a.e(26);
        lg.j jVar = (lg.j) this.f16879f;
        j jVar2 = new j(6);
        lg.b bVar = (lg.b) this.f16875b;
        if (bVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        jVar2.f16875b = bVar;
        jVar2.f16877d = aVar;
        String str = (String) this.f16876c;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        jVar2.f16876c = str;
        sc scVar = (sc) this.f16878e;
        if (scVar == null) {
            throw new NullPointerException("Null transformer");
        }
        jVar2.f16878e = scVar;
        ig.b bVar2 = (ig.b) this.f16877d;
        if (bVar2 == null) {
            throw new NullPointerException("Null encoding");
        }
        jVar2.f16879f = bVar2;
        lg.b bVar3 = (lg.b) jVar2.f16875b;
        String str2 = (String) jVar2.f16876c;
        ig.a aVar2 = (ig.a) jVar2.f16877d;
        sc scVar2 = (sc) jVar2.f16878e;
        ig.b bVar4 = (ig.b) jVar2.f16879f;
        lg.k kVar = (lg.k) jVar;
        kVar.getClass();
        ig.c cVar = aVar2.f72239b;
        bVar3.getClass();
        if (ig.c.DEFAULT == null) {
            throw new NullPointerException("Null priority");
        }
        String str3 = bVar3.f83178a;
        if (str3 == null) {
            throw new NullPointerException("Null backendName");
        }
        if (cVar == null) {
            throw new NullPointerException("Null priority");
        }
        lg.b bVar5 = new lg.b(str3, bVar3.f83179b, cVar);
        androidx.appcompat.widget.c2 c2Var = new androidx.appcompat.widget.c2(7);
        c2Var.f16536g = new HashMap();
        switch (((tg.c) kVar.f83197a).f117572a) {
            case 0:
                elapsedRealtime = SystemClock.elapsedRealtime();
                break;
            default:
                elapsedRealtime = System.currentTimeMillis();
                break;
        }
        c2Var.f16534e = Long.valueOf(elapsedRealtime);
        switch (((tg.c) kVar.f83198b).f117572a) {
            case 0:
                elapsedRealtime2 = SystemClock.elapsedRealtime();
                break;
            default:
                elapsedRealtime2 = System.currentTimeMillis();
                break;
        }
        c2Var.f16535f = Long.valueOf(elapsedRealtime2);
        if (str2 == null) {
            throw new NullPointerException("Null transportName");
        }
        c2Var.f16531b = str2;
        c2Var.f16533d = new lg.e(bVar4, (byte[]) scVar2.f(aVar2.f72238a));
        c2Var.f16532c = null;
        lg.a e13 = c2Var.e();
        pg.a aVar3 = (pg.a) kVar.f83199c;
        aVar3.getClass();
        aVar3.f100037b.execute(new w.b(aVar3, bVar5, eVar, e13, 11));
    }

    public final void n(androidx.lifecycle.z zVar) {
        synchronized (this.f16875b) {
            try {
                if (j(zVar)) {
                    if (((ArrayDeque) this.f16878e).isEmpty()) {
                        ((ArrayDeque) this.f16878e).push(zVar);
                    } else {
                        Object obj = this.f16879f;
                        if (((a0.a) obj) == null || ((a0.a) obj).f202a != 2) {
                            androidx.lifecycle.z zVar2 = (androidx.lifecycle.z) ((ArrayDeque) this.f16878e).peek();
                            if (!zVar.equals(zVar2)) {
                                p(zVar2);
                                ((ArrayDeque) this.f16878e).remove(zVar);
                                ((ArrayDeque) this.f16878e).push(zVar);
                            }
                        }
                    }
                    r(zVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void o(androidx.lifecycle.z zVar) {
        synchronized (this.f16875b) {
            try {
                ((ArrayDeque) this.f16878e).remove(zVar);
                p(zVar);
                if (!((ArrayDeque) this.f16878e).isEmpty()) {
                    r((androidx.lifecycle.z) ((ArrayDeque) this.f16878e).peek());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void p(androidx.lifecycle.z zVar) {
        synchronized (this.f16875b) {
            try {
                q0.c h10 = h(zVar);
                if (h10 == null) {
                    return;
                }
                Iterator it = ((Set) ((Map) this.f16877d).get(h10)).iterator();
                while (it.hasNext()) {
                    q0.b bVar = (q0.b) ((Map) this.f16876c).get((q0.a) it.next());
                    bVar.getClass();
                    bVar.h();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void q() {
        androidx.lifecycle.z zVar;
        synchronized (this.f16875b) {
            Iterator it = ((Map) this.f16876c).keySet().iterator();
            while (it.hasNext()) {
                q0.b bVar = (q0.b) ((Map) this.f16876c).get((q0.a) it.next());
                synchronized (bVar.f101747a) {
                    h0.f fVar = bVar.f101749c;
                    fVar.y((ArrayList) fVar.v());
                }
                synchronized (bVar.f101747a) {
                    zVar = bVar.f101748b;
                }
                o(zVar);
            }
        }
    }

    public final void r(androidx.lifecycle.z zVar) {
        synchronized (this.f16875b) {
            try {
                Iterator it = ((Set) ((Map) this.f16877d).get(h(zVar))).iterator();
                while (it.hasNext()) {
                    q0.b bVar = (q0.b) ((Map) this.f16876c).get((q0.a) it.next());
                    bVar.getClass();
                    if (!bVar.b().isEmpty()) {
                        bVar.o();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void s() {
        Iterator it = ((List) this.f16878e).iterator();
        while (it.hasNext()) {
            int i13 = ((z9.x) it.next()).f141313a;
            if (g(i13) == null) {
                int i14 = z9.z.f141321j;
                StringBuilder o13 = cb.o("Navigation destination ", g4.u.k0((Context) this.f16875b, i13), " cannot be found in the navigation graph ");
                o13.append((z9.b0) this.f16877d);
                throw new IllegalArgumentException(o13.toString());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(z9.e0 navController) {
        this(navController.f141254a);
        this.f16874a = 4;
        Intrinsics.checkNotNullParameter(navController, "navController");
        this.f16877d = navController.i();
    }

    public j(b60.b activeUserManager, d20.a analyticsService, lh0.r0 experiments, rg0.s experiences, yk1.v resources) {
        this.f16874a = 11;
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(analyticsService, "analyticsService");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f16875b = activeUserManager;
        this.f16876c = analyticsService;
        this.f16877d = experiments;
        this.f16878e = experiences;
        this.f16879f = resources;
    }

    public j(t72.j context, gd2.c filters) {
        this.f16874a = 14;
        Intrinsics.checkNotNullParameter(context, "gl");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f16875b = context;
        this.f16876c = filters;
        Intrinsics.checkNotNullParameter(context, "context");
        android.support.v4.media.a aVar = new android.support.v4.media.a();
        aVar.f15837a = context;
        aVar.f15838b = new gd2.c(null, new nd2.a(aVar, 7), 3);
        q8.d dVar = new q8.d(1, 1);
        aVar.f15839c = dVar;
        aVar.f15840d = new he.b(3, dVar.b());
        aVar.f15841e = new he.b(2, ((q8.d) aVar.f15839c).a());
        aVar.f15842f = new yd2.j();
        aVar.f15843g = new yd2.j();
        aVar.f15844h = new ArrayList();
        kotlin.collections.k0.u((List) this.f16876c, (List) aVar.f15838b);
        this.f16877d = aVar;
    }

    public j(Context context, gh0.b target, ke2.c scene) {
        g01.a aVar;
        this.f16874a = 13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(scene, "scene");
        this.f16875b = target;
        this.f16876c = scene;
        mc2.k kVar = new mc2.k(0);
        this.f16877d = kVar;
        gh0.b bVar = (gh0.b) this.f16875b;
        boolean z13 = bVar instanceof ie2.e;
        Object obj = kVar.f86944a;
        if (z13) {
            EGLDisplay eGLDisplay = xd2.b.f134641a;
            aVar = xd2.b.b(((ie2.e) bVar).f72217b, (xd2.a) obj);
        } else if ((bVar instanceof ie2.d) || (bVar instanceof ie2.c)) {
            EGLDisplay eGLDisplay2 = xd2.b.f134641a;
            xd2.a config = (xd2.a) obj;
            Intrinsics.checkNotNullParameter(config, "config");
            EGLSurface eGLSurface = (EGLSurface) e0.t.n(new et1.r0(23, xd2.b.a(config), new int[]{12375, 1, 12374, 1, 12344}), "eglCreatePbufferSurface");
            Intrinsics.f(eGLSurface);
            aVar = new g01.a(xd2.b.f134641a, eGLSurface);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f16878e = aVar;
        this.f16879f = new he2.f(context, (ke2.c) this.f16876c, true);
        ((mc2.k) this.f16877d).a((g01.a) this.f16878e);
        ((he2.f) this.f16879f).c(ph.a.b0((gh0.b) this.f16875b));
    }

    public j(b60.b activeUserManager, nx.d1 trackingParamAttacher, com.pinterest.feature.pin.j pinAction, lh0.d experiments, es.h adsCommonDisplay) {
        this.f16874a = 12;
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinAction, "pinAction");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f16875b = activeUserManager;
        this.f16876c = trackingParamAttacher;
        this.f16877d = pinAction;
        this.f16878e = experiments;
        this.f16879f = adsCommonDisplay;
    }

    public j(Context context) {
        Intent launchIntentForPackage;
        this.f16874a = 4;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16875b = context;
        if (context instanceof Activity) {
            Context context2 = (Context) this.f16875b;
            launchIntentForPackage = new Intent(context2, context2.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(((Context) this.f16875b).getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f16876c = launchIntentForPackage;
        this.f16878e = new ArrayList();
    }

    public j(j0 j0Var, j0 j0Var2, l0.u uVar) {
        this.f16874a = 1;
        this.f16876c = j0Var;
        this.f16877d = j0Var2;
        this.f16875b = uVar;
    }

    public j(int i13) {
        this.f16874a = i13;
        int i14 = 2;
        if (i13 == 2) {
            this.f16875b = new Object();
            this.f16876c = new HashMap();
            this.f16877d = new HashMap();
            this.f16878e = new ArrayDeque();
            return;
        }
        if (i13 == 8) {
            this.f16875b = wi.y.TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED;
            this.f16876c = wi.z.TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED;
            this.f16877d = wi.w.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            this.f16878e = kotlin.collections.f0.d("B3EEABB8EE11C2BE770B684D95219ECB");
            this.f16879f = wi.x.DEFAULT;
            return;
        }
        if (i13 != 15) {
            return;
        }
        this.f16875b = new ArrayList();
        this.f16876c = mj2.a.f87281e;
        this.f16877d = new bg.b(i14);
        this.f16878e = zi2.d.f142042a;
        this.f16879f = aj2.h.q();
    }

    public j(k kVar) {
        this.f16874a = 0;
        this.f16875b = kVar.f16893a;
        this.f16876c = kVar.f16894b;
        this.f16877d = kVar.f16895c;
        this.f16878e = kVar.f16896d;
        this.f16879f = Boolean.valueOf(kVar.f16897e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i13) {
        this(kVar);
        this.f16874a = 0;
    }
}

package androidx.activity;

import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h1;
import androidx.lifecycle.s0;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import ao2.o1;
import com.google.android.material.textfield.TextInputLayout;
import com.pinterest.activity.webhook.WebhookActivity;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import t3.p3;
import t3.q3;
import t3.v0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15880b;

    public /* synthetic */ d(Object obj, int i13) {
        this.f15879a = i13;
        this.f15880b = obj;
    }

    private final void a() {
        h6.z zVar = (h6.z) this.f15880b;
        synchronized (zVar.f67770d) {
            try {
                if (zVar.f67774h == null) {
                    return;
                }
                try {
                    m5.g d2 = zVar.d();
                    int i13 = d2.f85859e;
                    if (i13 == 2) {
                        synchronized (zVar.f67770d) {
                        }
                    }
                    if (i13 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i13 + ")");
                    }
                    try {
                        int i14 = j5.k.f74682a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        e3.b bVar = zVar.f67769c;
                        Context context = zVar.f67767a;
                        bVar.getClass();
                        m5.g[] gVarArr = {d2};
                        f5.o oVar = f5.j.f61091a;
                        Trace.beginSection(tb.f.k0("TypefaceCompat.createFromFontInfo"));
                        try {
                            Typeface b13 = f5.j.f61091a.b(context, gVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer I = b7.c.I(zVar.f67767a, d2.f85855a);
                            if (I == null || b13 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q(b13, d7.b.n0(I));
                                Trace.endSection();
                                synchronized (zVar.f67770d) {
                                    try {
                                        com.bumptech.glide.d dVar = zVar.f67774h;
                                        if (dVar != null) {
                                            dVar.n0(qVar);
                                        }
                                    } finally {
                                    }
                                }
                                zVar.b();
                            } finally {
                                int i15 = j5.k.f74682a;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                } catch (Throwable th4) {
                    synchronized (zVar.f67770d) {
                        try {
                            com.bumptech.glide.d dVar2 = zVar.f67774h;
                            if (dVar2 != null) {
                                dVar2.m0(th4);
                            }
                            zVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        g1.u uVar;
        int[] iArr;
        g1.u uVar2;
        int[] iArr2;
        int i13;
        int[] iArr3;
        b4.g gVar;
        z3.q qVar = null;
        int i14 = 0;
        switch (this.f15879a) {
            case 0:
                ((o) this.f15880b).invalidateMenu();
                return;
            case 1:
            default:
                oh0.g this$0 = (oh0.g) this.f15880b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.b().i(new oh0.d(this$0, i14), new ug0.d(12, new oh0.f(this$0, i14)));
                this$0.f94475f.set(true);
                return;
            case 2:
                w2.f fVar = (w2.f) this.f15880b;
                if (fVar.f()) {
                    t3.c0 c0Var = fVar.f127612a;
                    c0Var.u(true);
                    fVar.k(c0Var.f115889k.a(), fVar.f127626o);
                    z3.r rVar = c0Var.f115889k;
                    fVar.i(rVar.a(), fVar.f127626o);
                    g1.u e13 = fVar.e();
                    int[] iArr4 = e13.f63326b;
                    long[] jArr = e13.f63325a;
                    int length = jArr.length - 2;
                    g1.u uVar3 = fVar.f127625n;
                    long j13 = 255;
                    int i15 = 8;
                    if (length >= 0) {
                        while (true) {
                            long j14 = jArr[i14];
                            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i16 = 8 - ((~(i14 - length)) >>> 31);
                                int i17 = 0;
                                while (i17 < i16) {
                                    if ((j14 & j13) < 128) {
                                        int i18 = iArr4[(i14 << 3) + i17];
                                        p3 p3Var = (p3) uVar3.h(i18);
                                        q3 q3Var = (q3) e13.h(i18);
                                        z3.q qVar2 = q3Var != null ? q3Var.f116173a : qVar;
                                        if (qVar2 == null) {
                                            jk.r.z("no value for specified key");
                                            throw null;
                                        }
                                        int i19 = qVar2.f140717g;
                                        z3.j jVar = qVar2.f140714d;
                                        if (p3Var == null) {
                                            Iterator it = jVar.iterator();
                                            while (it.hasNext()) {
                                                Object key = ((Map.Entry) it.next()).getKey();
                                                g1.u uVar4 = e13;
                                                z3.x xVar = z3.t.f140753v;
                                                if (Intrinsics.d(key, xVar)) {
                                                    Object obj = jVar.f140700a.get(xVar);
                                                    if (obj == null) {
                                                        obj = null;
                                                    }
                                                    List list = (List) obj;
                                                    fVar.j(i19, String.valueOf(list != null ? (b4.g) CollectionsKt.firstOrNull(list) : null));
                                                }
                                                e13 = uVar4;
                                            }
                                            uVar2 = e13;
                                        } else {
                                            uVar2 = e13;
                                            Iterator it2 = jVar.iterator();
                                            while (it2.hasNext()) {
                                                z3.x xVar2 = (z3.x) ((Map.Entry) it2.next()).getKey();
                                                Iterator it3 = it2;
                                                z3.x xVar3 = z3.t.f140753v;
                                                if (Intrinsics.d(xVar2, xVar3)) {
                                                    List list2 = (List) bs1.c.M0(p3Var.f116159a, xVar3);
                                                    if (list2 != null) {
                                                        gVar = (b4.g) CollectionsKt.firstOrNull(list2);
                                                        iArr3 = iArr4;
                                                    } else {
                                                        iArr3 = iArr4;
                                                        gVar = null;
                                                    }
                                                    Object obj2 = jVar.f140700a.get(xVar3);
                                                    if (obj2 == null) {
                                                        obj2 = null;
                                                    }
                                                    List list3 = (List) obj2;
                                                    b4.g gVar2 = list3 != null ? (b4.g) CollectionsKt.firstOrNull(list3) : null;
                                                    if (!Intrinsics.d(gVar, gVar2)) {
                                                        fVar.j(i19, String.valueOf(gVar2));
                                                    }
                                                    it2 = it3;
                                                    iArr4 = iArr3;
                                                } else {
                                                    it2 = it3;
                                                }
                                            }
                                        }
                                        iArr2 = iArr4;
                                        qVar = null;
                                        i13 = 8;
                                    } else {
                                        uVar2 = e13;
                                        iArr2 = iArr4;
                                        i13 = i15;
                                    }
                                    j14 >>= i13;
                                    i17++;
                                    i15 = i13;
                                    e13 = uVar2;
                                    iArr4 = iArr2;
                                    j13 = 255;
                                }
                                uVar = e13;
                                iArr = iArr4;
                                if (i16 != i15) {
                                }
                            } else {
                                uVar = e13;
                                iArr = iArr4;
                            }
                            if (i14 != length) {
                                i14++;
                                e13 = uVar;
                                iArr4 = iArr;
                                j13 = 255;
                                i15 = 8;
                            }
                        }
                    }
                    uVar3.a();
                    g1.u e14 = fVar.e();
                    int[] iArr5 = e14.f63326b;
                    Object[] objArr = e14.f63327c;
                    long[] jArr2 = e14.f63325a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i23 = 0;
                        while (true) {
                            long j15 = jArr2[i23];
                            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                for (int i25 = 0; i25 < i24; i25++) {
                                    if ((j15 & 255) < 128) {
                                        int i26 = (i23 << 3) + i25;
                                        uVar3.l(iArr5[i26], new p3(((q3) objArr[i26]).f116173a, fVar.e()));
                                    }
                                    j15 >>= 8;
                                }
                                if (i24 != 8) {
                                }
                            }
                            if (i23 != length2) {
                                i23++;
                            }
                        }
                    }
                    fVar.f127626o = new p3(rVar.a(), fVar.e());
                    fVar.f127627p = false;
                    return;
                }
                return;
            case 3:
                t3.c0 c0Var2 = (t3.c0) this.f15880b;
                c0Var2.f115906s0 = false;
                MotionEvent motionEvent = c0Var2.f115894m0;
                Intrinsics.f(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
                }
                c0Var2.H(motionEvent);
                return;
            case 4:
                v0 v0Var = (v0) this.f15880b;
                g1.t tVar = v0.N;
                Trace.beginSection("measureAndLayout");
                try {
                    v0Var.f116211d.u(true);
                    Unit unit = Unit.f80348a;
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        v0Var.p();
                        Trace.endSection();
                        v0Var.f116210J = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 5:
                a();
                return;
            case 6:
                ArrayList transitioningViews = (ArrayList) this.f15880b;
                Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
                h1.c(4, transitioningViews);
                return;
            case 7:
                ((Fragment) this.f15880b).lambda$performCreateView$0();
                return;
            case 8:
                s0 this$02 = (s0) this.f15880b;
                s0 s0Var = s0.f18675i;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (this$02.f18677b == 0) {
                    this$02.f18678c = true;
                    this$02.f18681f.e(androidx.lifecycle.q.ON_PAUSE);
                }
                if (this$02.f18676a == 0 && this$02.f18678c) {
                    this$02.f18681f.e(androidx.lifecycle.q.ON_STOP);
                    this$02.f18679d = true;
                    return;
                }
                return;
            case 9:
                d7.z zVar = (d7.z) this.f15880b;
                d7.y yVar = (d7.y) zVar.f53899a.get();
                if (yVar != null) {
                    yVar.a(zVar.f53901c.d());
                    return;
                }
                return;
            case 10:
                m7.l0 l0Var = (m7.l0) this.f15880b;
                int i27 = m7.l0.f86250p0;
                l0Var.getClass();
                int i28 = d7.n0.f53866a;
                l0Var.G.b(Integer.valueOf(b7.c.s(l0Var.f86261f).generateAudioSessionId()));
                return;
            case 11:
                x7.f fVar2 = (x7.f) this.f15880b;
                synchronized (fVar2.f134024a) {
                    try {
                        if (fVar2.f134036m) {
                            return;
                        }
                        long j16 = fVar2.f134035l - 1;
                        fVar2.f134035l = j16;
                        if (j16 > 0) {
                            return;
                        }
                        if (j16 < 0) {
                            fVar2.b(new IllegalStateException());
                            return;
                        } else {
                            fVar2.a();
                            return;
                        }
                    } finally {
                    }
                }
            case 12:
                PinterestStaggeredGridLayoutManagerImpl this$03 = (PinterestStaggeredGridLayoutManagerImpl) this.f15880b;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.i1();
                return;
            case 13:
                o1 o1Var = (o1) this.f15880b;
                if (o1Var != null) {
                    o1Var.cancel((CancellationException) null);
                    return;
                }
                return;
            case 14:
                ((xj2.c) this.f15880b).dispose();
                return;
            case 15:
                ((AtomicBoolean) this.f15880b).set(true);
                return;
            case 16:
                com.airbnb.lottie.v vVar = (com.airbnb.lottie.v) this.f15880b;
                Semaphore semaphore = vVar.K;
                fc.e eVar = vVar.f28461p;
                if (eVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    eVar.u(vVar.f28447b.h());
                } catch (InterruptedException unused) {
                } catch (Throwable th3) {
                    semaphore.release();
                    throw th3;
                }
                semaphore.release();
                return;
            case 17:
                com.airbnb.lottie.b0 b0Var = (com.airbnb.lottie.b0) this.f15880b;
                ExecutorService executorService = com.airbnb.lottie.b0.f28384e;
                b0Var.d();
                return;
            case 18:
                me.p reason = (me.p) this.f15880b;
                String str = me.i.f86987a;
                if (p001if.a.b(me.i.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(reason, "$reason");
                    me.i.d(reason);
                    return;
                } catch (Throwable th4) {
                    p001if.a.a(me.i.class, th4);
                    return;
                }
            case 19:
                df.x xVar4 = (df.x) this.f15880b;
                AtomicBoolean atomicBoolean = df.a0.f54697a;
                xVar4.getClass();
                df.y yVar2 = df.y.f54881a;
                xVar4.f54878a.j(df.y.b(xVar4.f54879b));
                return;
            case 20:
                me.n nVar = (me.n) this.f15880b;
                df.e0 e0Var = df.e0.f54743a;
                nVar.getClass();
                return;
            case 21:
                qg.h hVar = (qg.h) this.f15880b;
                hVar.getClass();
                ((rg.g) hVar.f103823d).f(new a8.v(hVar, 12));
                return;
            case 22:
                ((TextInputLayout) this.f15880b).f33167d.requestLayout();
                return;
            case 23:
                dm.e eVar2 = (dm.e) this.f15880b;
                Object obj3 = dm.e.f55311m;
                eVar2.a(false);
                return;
            case 24:
                com.google.firebase.messaging.d0 d0Var = (com.google.firebase.messaging.d0) this.f15880b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + d0Var.f33769a.getAction() + " Releasing WakeLock.");
                d0Var.f33770b.trySetResult(null);
                return;
            case 25:
                WebhookActivity this$04 = (WebhookActivity) this.f15880b;
                int i29 = WebhookActivity.f35241v;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                se2.a aVar = this$04.f35258r;
                if (aVar == null) {
                    Intrinsics.r("engineProviderUnified");
                    throw null;
                }
                if (((tu1.g0) ((bf2.b) aVar).get()).c()) {
                    se2.a aVar2 = this$04.f35258r;
                    if (aVar2 == null) {
                        Intrinsics.r("engineProviderUnified");
                        throw null;
                    }
                    Object obj4 = ((bf2.b) aVar2).get();
                    Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                    tu1.g0 engineProviderUnified = (tu1.g0) obj4;
                    Intrinsics.checkNotNullParameter(engineProviderUnified, "engineProviderUnified");
                    try {
                        Intrinsics.checkNotNullParameter(engineProviderUnified, "engineProviderUnified");
                        vb0.j.f125469d = SystemClock.elapsedRealtime();
                        engineProviderUnified.a("https://api.pinterest.com/_/_/warm/");
                        Intrinsics.checkNotNullParameter(engineProviderUnified, "engineProviderUnified");
                        vb0.j.f125475j = SystemClock.elapsedRealtime();
                        engineProviderUnified.a("https://i.pinimg.com/_/_/warm/");
                        return;
                    } catch (Throwable th5) {
                        HashSet hashSet = tb0.h.f117076w;
                        tb0.g.f117075a.q(th5, "Failed to warm up network connections on api/image", tb0.p.PERFORMANCE);
                        return;
                    }
                }
                return;
            case 26:
                dy.d this$05 = (dy.d) this.f15880b;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                kk2.t r13 = (this$05.f56530c.l() ? this$05.f56528a : this$05.f56529b).m().r(tk2.e.f118017c);
                Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
                nl.b.t(r13, new dy.b(this$05, i14), null, 2);
                return;
            case 27:
                ey.c0 task = (ey.c0) this.f15880b;
                LinkedHashSet linkedHashSet = ey.d0.f60468a;
                Intrinsics.checkNotNullParameter(task, "$task");
                ey.d0.a(task, true);
                return;
            case 28:
                ey.b0 taskTag = (ey.b0) this.f15880b;
                LinkedHashSet linkedHashSet2 = ey.d0.f60468a;
                Intrinsics.checkNotNullParameter(taskTag, "$taskTag");
                ey.d0.d(taskTag);
                return;
        }
    }
}

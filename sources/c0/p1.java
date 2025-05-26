package c0;

import a.o3;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceUnavailableException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import v.k2;

/* loaded from: classes2.dex */
public final class p1 {

    /* renamed from: p, reason: collision with root package name */
    public static final Range f24298p = androidx.camera.core.impl.k.f16892f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f24299a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Size f24300b;

    /* renamed from: c, reason: collision with root package name */
    public final z f24301c;

    /* renamed from: d, reason: collision with root package name */
    public final Range f24302d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.camera.core.impl.j0 f24303e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24304f;

    /* renamed from: g, reason: collision with root package name */
    public final r4.l f24305g;

    /* renamed from: h, reason: collision with root package name */
    public final r4.i f24306h;

    /* renamed from: i, reason: collision with root package name */
    public final r4.l f24307i;

    /* renamed from: j, reason: collision with root package name */
    public final r4.i f24308j;

    /* renamed from: k, reason: collision with root package name */
    public final r4.i f24309k;

    /* renamed from: l, reason: collision with root package name */
    public final k1 f24310l;

    /* renamed from: m, reason: collision with root package name */
    public k f24311m;

    /* renamed from: n, reason: collision with root package name */
    public o1 f24312n;

    /* renamed from: o, reason: collision with root package name */
    public Executor f24313o;

    public p1(Size size, androidx.camera.core.impl.j0 j0Var, boolean z13, z zVar, Range range, l0.n nVar) {
        this.f24300b = size;
        this.f24303e = j0Var;
        this.f24304f = z13;
        this.f24301c = zVar;
        this.f24302d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        final int i13 = 0;
        r4.l L = com.bumptech.glide.d.L(new r4.j() { // from class: c0.h1
            @Override // r4.j
            public final Object C(r4.i iVar) {
                int i14 = i13;
                String str2 = str;
                AtomicReference atomicReference2 = atomicReference;
                switch (i14) {
                    case 0:
                        atomicReference2.set(iVar);
                        return str2 + "-cancellation";
                    case 1:
                        atomicReference2.set(iVar);
                        return str2 + "-status";
                    default:
                        atomicReference2.set(iVar);
                        return str2 + "-Surface";
                }
            }
        });
        r4.i iVar = (r4.i) atomicReference.get();
        iVar.getClass();
        this.f24309k = iVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        final int i14 = 1;
        r4.l L2 = com.bumptech.glide.d.L(new r4.j() { // from class: c0.h1
            @Override // r4.j
            public final Object C(r4.i iVar2) {
                int i142 = i14;
                String str2 = str;
                AtomicReference atomicReference22 = atomicReference2;
                switch (i142) {
                    case 0:
                        atomicReference22.set(iVar2);
                        return str2 + "-cancellation";
                    case 1:
                        atomicReference22.set(iVar2);
                        return str2 + "-status";
                    default:
                        atomicReference22.set(iVar2);
                        return str2 + "-Surface";
                }
            }
        });
        this.f24307i = L2;
        g0.m.a(L2, new k2(this, iVar, L, i14), l3.c.s());
        r4.i iVar2 = (r4.i) atomicReference2.get();
        iVar2.getClass();
        final AtomicReference atomicReference3 = new AtomicReference(null);
        final int i15 = 2;
        r4.l L3 = com.bumptech.glide.d.L(new r4.j() { // from class: c0.h1
            @Override // r4.j
            public final Object C(r4.i iVar22) {
                int i142 = i15;
                String str2 = str;
                AtomicReference atomicReference22 = atomicReference3;
                switch (i142) {
                    case 0:
                        atomicReference22.set(iVar22);
                        return str2 + "-cancellation";
                    case 1:
                        atomicReference22.set(iVar22);
                        return str2 + "-status";
                    default:
                        atomicReference22.set(iVar22);
                        return str2 + "-Surface";
                }
            }
        });
        this.f24305g = L3;
        r4.i iVar3 = (r4.i) atomicReference3.get();
        iVar3.getClass();
        this.f24306h = iVar3;
        k1 k1Var = new k1(this, size);
        this.f24310l = k1Var;
        com.google.common.util.concurrent.c0 f13 = g0.m.f(k1Var.f17009e);
        g0.m.a(L3, new l1(f13, iVar2, str), l3.c.s());
        f13.d(new i1(this, 0), l3.c.s());
        f0.d s13 = l3.c.s();
        AtomicReference atomicReference4 = new AtomicReference(null);
        g0.m.a(com.bumptech.glide.d.L(new o3(8, this, atomicReference4)), new m1(i13, this, nVar), s13);
        r4.i iVar4 = (r4.i) atomicReference4.get();
        iVar4.getClass();
        this.f24308j = iVar4;
    }

    public final boolean a() {
        return this.f24305g.f106128b.isDone();
    }

    public final void b(final Surface surface, Executor executor, final p5.a aVar) {
        if (!this.f24306h.b(surface)) {
            r4.l lVar = this.f24305g;
            if (!lVar.isCancelled()) {
                com.bumptech.glide.d.v(null, lVar.f106128b.isDone());
                try {
                    lVar.get();
                    final int i13 = 0;
                    executor.execute(new Runnable() { // from class: c0.j1
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i14 = i13;
                            p5.a aVar2 = aVar;
                            Surface surface2 = surface;
                            switch (i14) {
                                case 0:
                                    aVar2.accept(new j(3, surface2));
                                    break;
                                default:
                                    aVar2.accept(new j(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i14 = 1;
                    executor.execute(new Runnable() { // from class: c0.j1
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i142 = i14;
                            p5.a aVar2 = aVar;
                            Surface surface2 = surface;
                            switch (i142) {
                                case 0:
                                    aVar2.accept(new j(3, surface2));
                                    break;
                                default:
                                    aVar2.accept(new j(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        g0.m.a(this.f24307i, new k2(this, aVar, surface), executor);
    }

    public final void c(Executor executor, o1 o1Var) {
        k kVar;
        synchronized (this.f24299a) {
            this.f24312n = o1Var;
            this.f24313o = executor;
            kVar = this.f24311m;
        }
        if (kVar != null) {
            executor.execute(new g1(o1Var, kVar, 1));
        }
    }

    public final void d() {
        this.f24306h.d(new DeferrableSurface$SurfaceUnavailableException("Surface request will not complete."));
    }
}

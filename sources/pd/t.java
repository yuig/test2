package pd;

import android.os.SystemClock;
import android.util.Log;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class t implements x, rd.h, z {

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f99754i = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final d0 f99755a;

    /* renamed from: b, reason: collision with root package name */
    public final wc.b f99756b;

    /* renamed from: c, reason: collision with root package name */
    public final rd.g f99757c;

    /* renamed from: d, reason: collision with root package name */
    public final s f99758d;

    /* renamed from: e, reason: collision with root package name */
    public final a7.o f99759e;

    /* renamed from: f, reason: collision with root package name */
    public final ih.g f99760f;

    /* renamed from: g, reason: collision with root package name */
    public final e5.d f99761g;

    /* renamed from: h, reason: collision with root package name */
    public final c f99762h;

    public t(rd.g gVar, rd.a aVar, sd.d dVar, sd.d dVar2, sd.d dVar3, sd.d dVar4) {
        this.f99757c = gVar;
        ih.g gVar2 = new ih.g(aVar);
        this.f99760f = gVar2;
        c cVar = new c();
        this.f99762h = cVar;
        synchronized (this) {
            synchronized (cVar) {
                cVar.f99640d = this;
            }
        }
        this.f99756b = new wc.b(4);
        this.f99755a = new d0();
        s sVar = new s();
        sVar.f99753g = ie.d.a(RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY, new h1.b(sVar, 29));
        sVar.f99747a = dVar;
        sVar.f99748b = dVar2;
        sVar.f99749c = dVar3;
        sVar.f99750d = dVar4;
        sVar.f99751e = this;
        sVar.f99752f = this;
        this.f99758d = sVar;
        this.f99761g = new e5.d(gVar2);
        this.f99759e = new a7.o(3);
        gVar.f107500e = this;
    }

    public static void c(String str, long j13, nd.h hVar) {
        StringBuilder D = ep.b.D(str, " in ");
        D.append(he.i.a(j13));
        D.append("ms, key: ");
        D.append(hVar);
        Log.v("Engine", D.toString());
    }

    public static void f(g0 g0Var) {
        if (!(g0Var instanceof a0)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((a0) g0Var).f();
    }

    public final l a(com.bumptech.glide.f fVar, Object obj, nd.h hVar, int i13, int i14, Class cls, Class cls2, com.bumptech.glide.h hVar2, r rVar, he.d dVar, boolean z13, boolean z14, nd.l lVar, boolean z15, boolean z16, boolean z17, boolean z18, de.i iVar, Executor executor) {
        long j13;
        if (f99754i) {
            int i15 = he.i.f68949b;
            j13 = SystemClock.elapsedRealtimeNanos();
        } else {
            j13 = 0;
        }
        long j14 = j13;
        this.f99756b.getClass();
        y yVar = new y(obj, hVar, i13, i14, dVar, cls, cls2, lVar);
        synchronized (this) {
            try {
                a0 b13 = b(yVar, z15, j14);
                if (b13 == null) {
                    return g(fVar, obj, hVar, i13, i14, cls, cls2, hVar2, rVar, dVar, z13, z14, lVar, z15, z16, z17, z18, iVar, executor, yVar, j14);
                }
                ((de.k) iVar).o(b13, nd.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a0 b(y yVar, boolean z13, long j13) {
        a0 a0Var;
        Object obj;
        if (!z13) {
            return null;
        }
        c cVar = this.f99762h;
        synchronized (cVar) {
            b bVar = (b) cVar.f99638b.get(yVar);
            if (bVar == null) {
                a0Var = null;
            } else {
                a0Var = (a0) bVar.get();
                if (a0Var == null) {
                    cVar.b(bVar);
                }
            }
        }
        if (a0Var != null) {
            a0Var.b();
        }
        if (a0Var != null) {
            if (f99754i) {
                c("Loaded resource from active resources", j13, yVar);
            }
            return a0Var;
        }
        rd.g gVar = this.f99757c;
        synchronized (gVar) {
            he.j jVar = (he.j) gVar.f68952a.remove(yVar);
            if (jVar == null) {
                obj = null;
            } else {
                gVar.f68954c -= jVar.f68951b;
                obj = jVar.f68950a;
            }
        }
        g0 g0Var = (g0) obj;
        a0 a0Var2 = g0Var == null ? null : g0Var instanceof a0 ? (a0) g0Var : new a0(g0Var, true, true, yVar, this);
        if (a0Var2 != null) {
            a0Var2.b();
            this.f99762h.a(yVar, a0Var2);
        }
        if (a0Var2 == null) {
            return null;
        }
        if (f99754i) {
            c("Loaded resource from cache", j13, yVar);
        }
        return a0Var2;
    }

    public final synchronized void d(w wVar, nd.h hVar, a0 a0Var) {
        if (a0Var != null) {
            try {
                if (a0Var.f99625a) {
                    this.f99762h.a(hVar, a0Var);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        d0 d0Var = this.f99755a;
        d0Var.getClass();
        Map map = wVar.f99782p ? d0Var.f99642b : d0Var.f99641a;
        if (wVar.equals(map.get(hVar))) {
            map.remove(hVar);
        }
    }

    public final void e(nd.h hVar, a0 a0Var) {
        c cVar = this.f99762h;
        synchronized (cVar) {
            b bVar = (b) cVar.f99638b.remove(hVar);
            if (bVar != null) {
                bVar.a();
            }
        }
        if (a0Var.f99625a) {
        } else {
            this.f99759e.i(a0Var, false);
        }
    }

    public final l g(com.bumptech.glide.f fVar, Object obj, nd.h hVar, int i13, int i14, Class cls, Class cls2, com.bumptech.glide.h hVar2, r rVar, he.d dVar, boolean z13, boolean z14, nd.l lVar, boolean z15, boolean z16, boolean z17, boolean z18, de.i iVar, Executor executor, y yVar, long j13) {
        sd.d dVar2;
        d0 d0Var = this.f99755a;
        w wVar = (w) (z18 ? d0Var.f99642b : d0Var.f99641a).get(yVar);
        if (wVar != null) {
            wVar.a(iVar, executor);
            if (f99754i) {
                c("Added to existing load", j13, yVar);
            }
            return new l(this, iVar, wVar);
        }
        w wVar2 = (w) ((p5.d) this.f99758d.f99753g).b();
        d7.b.p(wVar2, "Argument must not be null");
        synchronized (wVar2) {
            wVar2.f99778l = yVar;
            wVar2.f99779m = z15;
            wVar2.f99780n = z16;
            wVar2.f99781o = z17;
            wVar2.f99782p = z18;
        }
        e5.d dVar3 = this.f99761g;
        o oVar = (o) ((p5.d) dVar3.f57217d).b();
        d7.b.p(oVar, "Argument must not be null");
        int i15 = dVar3.f57215b;
        dVar3.f57215b = i15 + 1;
        i iVar2 = oVar.f99712a;
        iVar2.f99674c = fVar;
        iVar2.f99675d = obj;
        iVar2.f99685n = hVar;
        iVar2.f99676e = i13;
        iVar2.f99677f = i14;
        iVar2.f99687p = rVar;
        iVar2.f99678g = cls;
        iVar2.f99679h = oVar.f99715d;
        iVar2.f99682k = cls2;
        iVar2.f99686o = hVar2;
        iVar2.f99680i = lVar;
        iVar2.f99681j = dVar;
        iVar2.f99688q = z13;
        iVar2.f99689r = z14;
        oVar.f99719h = fVar;
        oVar.f99720i = hVar;
        oVar.f99721j = hVar2;
        oVar.f99722k = yVar;
        oVar.f99723l = i13;
        oVar.f99724m = i14;
        oVar.f99725n = rVar;
        oVar.f99732u = z18;
        oVar.f99726o = lVar;
        oVar.f99727p = wVar2;
        oVar.f99728q = i15;
        oVar.f99730s = m.INITIALIZE;
        oVar.f99733v = obj;
        d0 d0Var2 = this.f99755a;
        d0Var2.getClass();
        (wVar2.f99782p ? d0Var2.f99642b : d0Var2.f99641a).put(yVar, wVar2);
        wVar2.a(iVar, executor);
        synchronized (wVar2) {
            wVar2.f99789w = oVar;
            n i16 = oVar.i(n.INITIALIZE);
            if (i16 != n.RESOURCE_CACHE && i16 != n.DATA_CACHE) {
                dVar2 = wVar2.f99780n ? wVar2.f99775i : wVar2.f99781o ? wVar2.f99776j : wVar2.f99774h;
                dVar2.execute(oVar);
            }
            dVar2 = wVar2.f99773g;
            dVar2.execute(oVar);
        }
        if (f99754i) {
            c("Started new load", j13, yVar);
        }
        return new l(this, iVar, wVar2);
    }
}

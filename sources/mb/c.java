package mb;

import android.content.Context;
import android.text.TextUtils;
import ao2.o1;
import i2.a2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kb.b0;
import kb.g;
import kb.s0;
import kotlin.jvm.internal.Intrinsics;
import lb.i0;
import lb.o;
import lb.q;
import lb.t;
import lb.v;
import lb.w;
import lb.x;
import pb.i;
import pb.m;
import rb.l;
import tb.j;
import tb.s;

/* loaded from: classes.dex */
public final class c implements q, i, lb.c {

    /* renamed from: o, reason: collision with root package name */
    public static final String f86841o = b0.h("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f86842a;

    /* renamed from: c, reason: collision with root package name */
    public final a f86844c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f86845d;

    /* renamed from: g, reason: collision with root package name */
    public final o f86848g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f86849h;

    /* renamed from: i, reason: collision with root package name */
    public final kb.d f86850i;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f86852k;

    /* renamed from: l, reason: collision with root package name */
    public final a2 f86853l;

    /* renamed from: m, reason: collision with root package name */
    public final vb.b f86854m;

    /* renamed from: n, reason: collision with root package name */
    public final d f86855n;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f86843b = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Object f86846e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final w f86847f = new w(new v());

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f86851j = new HashMap();

    public c(Context context, kb.d dVar, l lVar, o oVar, i0 i0Var, vb.b bVar) {
        this.f86842a = context;
        lb.b bVar2 = dVar.f78976g;
        this.f86844c = new a(this, bVar2, dVar.f78973d);
        this.f86855n = new d(bVar2, i0Var);
        this.f86854m = bVar;
        this.f86853l = new a2(lVar);
        this.f86850i = dVar;
        this.f86848g = oVar;
        this.f86849h = i0Var;
    }

    @Override // lb.q
    public final void a(String str) {
        Runnable runnable;
        if (this.f86852k == null) {
            this.f86852k = Boolean.valueOf(ub.i.a(this.f86842a, this.f86850i));
        }
        boolean booleanValue = this.f86852k.booleanValue();
        String str2 = f86841o;
        if (!booleanValue) {
            b0.e().f(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f86845d) {
            this.f86848g.a(this);
            this.f86845d = true;
        }
        b0.e().a(str2, "Cancelling work ID " + str);
        a aVar = this.f86844c;
        if (aVar != null && (runnable = (Runnable) aVar.f86838d.remove(str)) != null) {
            aVar.f86836b.f82572a.removeCallbacks(runnable);
        }
        for (t workSpecId : this.f86847f.remove(str)) {
            this.f86855n.a(workSpecId);
            i0 i0Var = this.f86849h;
            i0Var.getClass();
            Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
            i0Var.a(workSpecId, -512);
        }
    }

    @Override // lb.c
    public final void b(j jVar, boolean z13) {
        o1 o1Var;
        t d2 = this.f86847f.d(jVar);
        if (d2 != null) {
            this.f86855n.a(d2);
        }
        synchronized (this.f86846e) {
            o1Var = (o1) this.f86843b.remove(jVar);
        }
        if (o1Var != null) {
            b0.e().a(f86841o, "Stopping tracking for " + jVar);
            o1Var.cancel((CancellationException) null);
        }
        if (z13) {
            return;
        }
        synchronized (this.f86846e) {
            this.f86851j.remove(jVar);
        }
    }

    @Override // lb.q
    public final void c(s... sVarArr) {
        long max;
        if (this.f86852k == null) {
            this.f86852k = Boolean.valueOf(ub.i.a(this.f86842a, this.f86850i));
        }
        if (!this.f86852k.booleanValue()) {
            b0.e().f(f86841o, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f86845d) {
            this.f86848g.a(this);
            this.f86845d = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (s sVar : sVarArr) {
            if (!this.f86847f.a(b7.c.q(sVar))) {
                synchronized (this.f86846e) {
                    try {
                        j q13 = b7.c.q(sVar);
                        b bVar = (b) this.f86851j.get(q13);
                        if (bVar == null) {
                            int i13 = sVar.f117026k;
                            this.f86850i.f78973d.getClass();
                            bVar = new b(i13, System.currentTimeMillis());
                            this.f86851j.put(q13, bVar);
                        }
                        max = (Math.max((sVar.f117026k - bVar.f86839a) - 5, 0) * 30000) + bVar.f86840b;
                    } finally {
                    }
                }
                long max2 = Math.max(sVar.a(), max);
                this.f86850i.f78973d.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (sVar.f117017b == s0.ENQUEUED) {
                    if (currentTimeMillis < max2) {
                        a aVar = this.f86844c;
                        if (aVar != null) {
                            HashMap hashMap = aVar.f86838d;
                            Runnable runnable = (Runnable) hashMap.remove(sVar.f117016a);
                            lb.b bVar2 = aVar.f86836b;
                            if (runnable != null) {
                                bVar2.f82572a.removeCallbacks(runnable);
                            }
                            x xVar = new x(1, aVar, sVar);
                            hashMap.put(sVar.f117016a, xVar);
                            aVar.f86837c.getClass();
                            bVar2.f82572a.postDelayed(xVar, max2 - System.currentTimeMillis());
                        }
                    } else if (sVar.e()) {
                        g gVar = sVar.f117025j;
                        if (gVar.f78992d) {
                            b0.e().a(f86841o, "Ignoring " + sVar + ". Requires device idle.");
                        } else if (gVar.f()) {
                            b0.e().a(f86841o, "Ignoring " + sVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(sVar);
                            hashSet2.add(sVar.f117016a);
                        }
                    } else if (!this.f86847f.a(b7.c.q(sVar))) {
                        b0.e().a(f86841o, "Starting work for " + sVar.f117016a);
                        t workSpecId = this.f86847f.c(sVar);
                        this.f86855n.c(workSpecId);
                        i0 i0Var = this.f86849h;
                        i0Var.getClass();
                        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
                        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
                        i0Var.f82600b.a(new h6.o(i0Var, workSpecId, null, 9));
                    }
                }
            }
        }
        synchronized (this.f86846e) {
            try {
                if (!hashSet.isEmpty()) {
                    b0.e().a(f86841o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        s sVar2 = (s) it.next();
                        j q14 = b7.c.q(sVar2);
                        if (!this.f86843b.containsKey(q14)) {
                            this.f86843b.put(q14, m.a(this.f86853l, sVar2, this.f86854m.f125445b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // lb.q
    public final boolean d() {
        return false;
    }

    @Override // pb.i
    public final void e(s sVar, pb.c cVar) {
        j q13 = b7.c.q(sVar);
        boolean z13 = cVar instanceof pb.a;
        i0 i0Var = this.f86849h;
        d dVar = this.f86855n;
        String str = f86841o;
        w wVar = this.f86847f;
        if (!z13) {
            b0.e().a(str, "Constraints not met: Cancelling work ID " + q13);
            t workSpecId = wVar.d(q13);
            if (workSpecId != null) {
                dVar.a(workSpecId);
                int a13 = ((pb.b) cVar).a();
                i0Var.getClass();
                Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
                i0Var.a(workSpecId, a13);
                return;
            }
            return;
        }
        if (wVar.a(q13)) {
            return;
        }
        b0.e().a(str, "Constraints met: Scheduling work ID " + q13);
        t workSpecId2 = wVar.b(q13);
        dVar.c(workSpecId2);
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(workSpecId2, "workSpecId");
        Intrinsics.checkNotNullParameter(workSpecId2, "workSpecId");
        i0Var.f82600b.a(new h6.o(i0Var, workSpecId2, null, 9));
    }
}

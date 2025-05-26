package m;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q5.d1;
import q5.e1;

/* loaded from: classes2.dex */
public final class n implements jk.n {

    /* renamed from: a, reason: collision with root package name */
    public long f85242a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f85243b;

    /* renamed from: c, reason: collision with root package name */
    public final List f85244c;

    /* renamed from: d, reason: collision with root package name */
    public Object f85245d;

    /* renamed from: e, reason: collision with root package name */
    public Object f85246e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f85247f;

    public n(long j13, mk.a aVar, List list, List list2, List list3, boolean z13) {
        this.f85247f = aVar;
        this.f85244c = list;
        this.f85245d = list2;
        this.f85242a = j13;
        this.f85243b = z13;
        this.f85246e = list3;
    }

    public final void a() {
        if (this.f85243b) {
            Iterator it = ((ArrayList) this.f85244c).iterator();
            while (it.hasNext()) {
                ((d1) it.next()).b();
            }
            this.f85243b = false;
        }
    }

    public final void b(d1 d1Var) {
        if (this.f85243b) {
            return;
        }
        ((ArrayList) this.f85244c).add(d1Var);
    }

    public final void c() {
        if (this.f85243b) {
            return;
        }
        Iterator it = ((ArrayList) this.f85244c).iterator();
        while (it.hasNext()) {
            d1 d1Var = (d1) it.next();
            long j13 = this.f85242a;
            if (j13 >= 0) {
                d1Var.c(j13);
            }
            Interpolator interpolator = (Interpolator) this.f85245d;
            if (interpolator != null) {
                d1Var.d(interpolator);
            }
            if (((e1) this.f85246e) != null) {
                d1Var.e((l3.c) this.f85247f);
            }
            d1Var.g();
        }
        this.f85243b = true;
    }

    @Override // jk.n
    public final void o(int i13) {
        mk.a aVar = (mk.a) this.f85247f;
        int i14 = mk.a.f87285p;
        aVar.j(6, i13, null, null, null, null, null);
    }

    @Override // jk.n
    public final void zza() {
        mk.a aVar = (mk.a) this.f85247f;
        List list = (List) this.f85245d;
        long j13 = this.f85242a;
        int i13 = mk.a.f87285p;
        aVar.f87297l.addAll(this.f85244c);
        aVar.f87298m.addAll(list);
        Long valueOf = Long.valueOf(j13);
        aVar.j(5, 0, null, valueOf, valueOf, null, null);
    }

    @Override // jk.n
    public final void zzc() {
        if (this.f85243b) {
            return;
        }
        mk.a aVar = (mk.a) this.f85247f;
        List list = (List) this.f85246e;
        List list2 = (List) this.f85245d;
        long j13 = this.f85242a;
        int i13 = mk.a.f87285p;
        jk.p zza = aVar.f87294i.zza();
        n nVar = new n(j13, aVar, this.f85244c, list2, list, true);
        kk.d dVar = (kk.d) zza;
        dVar.getClass();
        if (ik.a.f72383e.get() == null) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        dVar.f79881d.execute(new s.f(dVar, list, nVar, 19));
    }

    public n() {
        this.f85242a = -1L;
        this.f85247f = new m(this);
        this.f85244c = new ArrayList();
    }
}

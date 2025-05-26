package g8;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class j extends a {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f64300h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f64301i;

    /* renamed from: j, reason: collision with root package name */
    public g7.a0 f64302j;

    public abstract void A(Object obj, a aVar, a7.b1 b1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [g8.f0, g8.g] */
    public final void B(final Object obj, a aVar) {
        HashMap hashMap = this.f64300h;
        bf.b.i(!hashMap.containsKey(obj));
        ?? r13 = new f0() { // from class: g8.g
            @Override // g8.f0
            public final void a(a aVar2, a7.b1 b1Var) {
                j.this.A(obj, aVar2, b1Var);
            }
        };
        h hVar = new h(this, obj);
        hashMap.put(obj, new i(aVar, r13, hVar));
        Handler handler = this.f64301i;
        handler.getClass();
        h0 h0Var = aVar.f64174c;
        h0Var.getClass();
        g0 g0Var = new g0();
        g0Var.f64267a = handler;
        g0Var.f64268b = hVar;
        h0Var.f64278c.add(g0Var);
        Handler handler2 = this.f64301i;
        handler2.getClass();
        s7.m mVar = aVar.f64175d;
        mVar.getClass();
        s7.l lVar = new s7.l();
        lVar.f111325a = handler2;
        lVar.f111326b = hVar;
        mVar.f111329c.add(lVar);
        g7.a0 a0Var = this.f64302j;
        n7.q0 q0Var = this.f64178g;
        bf.b.w(q0Var);
        aVar.m(r13, a0Var, q0Var);
        if (!this.f64173b.isEmpty()) {
            return;
        }
        aVar.c(r13);
    }

    @Override // g8.a
    public final void f() {
        for (i iVar : this.f64300h.values()) {
            iVar.f64283a.c(iVar.f64284b);
        }
    }

    @Override // g8.a
    public final void h() {
        for (i iVar : this.f64300h.values()) {
            iVar.f64283a.g(iVar.f64284b);
        }
    }

    @Override // g8.a
    public void l() {
        Iterator it = this.f64300h.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).f64283a.l();
        }
    }

    @Override // g8.a
    public void t() {
        HashMap hashMap = this.f64300h;
        for (i iVar : hashMap.values()) {
            iVar.f64283a.r(iVar.f64284b);
            a aVar = iVar.f64283a;
            h hVar = iVar.f64285c;
            aVar.v(hVar);
            aVar.u(hVar);
        }
        hashMap.clear();
    }

    public abstract e0 x(Object obj, e0 e0Var);

    public long y(Object obj, long j13) {
        return j13;
    }

    public int z(int i13, Object obj) {
        return i13;
    }
}

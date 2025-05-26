package xk1;

import a.cb;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.w;
import ck2.i;
import com.pinterest.framework.multisection.datasource.pagedlist.r0;
import dl1.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import jk2.a1;
import jk2.x;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import sq0.p;
import sq0.r;
import sq0.t;
import uj2.q;
import uk2.f;
import vq0.h;
import wk1.l;
import wt1.b0;
import wt1.c0;
import wt1.f0;
import wt1.j;
import wt1.k;
import wt1.u;
import wt1.v;
import wt1.y;
import wt1.z;
import yk1.m;
import yk1.n;

/* loaded from: classes5.dex */
public abstract class c implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final wt1.a f135184a;

    /* renamed from: b, reason: collision with root package name */
    public final xj2.b f135185b = new xj2.b();

    /* renamed from: c, reason: collision with root package name */
    public AtomicReference f135186c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f135187d;

    /* renamed from: e, reason: collision with root package name */
    public c0 f135188e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f135189f;

    /* renamed from: g, reason: collision with root package name */
    public final f f135190g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f135191h;

    /* renamed from: i, reason: collision with root package name */
    public final f0 f135192i;

    /* renamed from: j, reason: collision with root package name */
    public final f f135193j;

    public c(wt1.a aVar) {
        this.f135184a = aVar;
        xj2.e eVar = new xj2.e(i.f27922b);
        Intrinsics.checkNotNullExpressionValue(eVar, "empty(...)");
        this.f135186c = eVar;
        this.f135187d = true;
        this.f135188e = new k();
        this.f135190g = cb.r("create(...)");
        this.f135191h = new ArrayList();
        this.f135192i = new f0(this);
        this.f135193j = cb.r("create(...)");
    }

    public s B2(int i13) {
        return (s) getItem(i13);
    }

    public final void I0(int i13, nx.r0 provide) {
        Intrinsics.checkNotNullParameter(provide, "provide");
        this.f135192i.I0(i13, provide);
    }

    @Override // sq0.e0
    public final q K1() {
        int i13 = 2;
        d51.a aVar = new d51.a(27, new b(this, i13));
        f fVar = this.f135193j;
        fVar.getClass();
        x xVar = new x(fVar, aVar, i13);
        Intrinsics.checkNotNullExpressionValue(xVar, "filter(...)");
        return xVar;
    }

    @Override // yq0.a0
    public final m S(int i13) {
        return this.f135192i.S(i13);
    }

    @Override // vq0.f
    public final Set X1() {
        return this.f135192i.f131112c;
    }

    @Override // sq0.e0
    public final int a() {
        return d().size();
    }

    public void clear() {
        u(q0.f80391a);
        this.f135190g.c(new v());
        this.f135188e = new k();
        this.f135185b.d();
        this.f135187d = true;
    }

    @Override // vq0.e, qr0.d
    public List d() {
        return CollectionsKt.F0(this.f135191h);
    }

    public final void g(xj2.c disposable) {
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        this.f135185b.a(disposable);
    }

    @Override // vq0.e, nr0.a
    public final Object getItem(int i13) {
        if (i13 < 0 || i13 >= a()) {
            return null;
        }
        return this.f135191h.get(i13);
    }

    @Override // vq0.f
    public final void i2() {
        this.f135188e = new wt1.s();
        n();
    }

    @Override // vq0.f
    public final void j1() {
        n();
    }

    @Override // vq0.e
    public final void j2(Object obj) {
        this.f135191h.add(obj);
        this.f135193j.c(new r(d().size() - 1, 1));
        this.f135190g.c(new wt1.m(null, e0.b(obj), a()));
    }

    public abstract q k();

    @Override // wt1.d0
    public final q m() {
        f fVar = this.f135190g;
        fVar.getClass();
        a1 a1Var = new a1(fVar);
        Intrinsics.checkNotNullExpressionValue(a1Var, "hide(...)");
        return a1Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    @Override // wt1.b
    public final void n() {
        if (i()) {
            this.f135190g.c(this.f135188e);
            int i13 = 0;
            this.f135187d = false;
            if (!this.f135186c.isDisposed()) {
                this.f135186c.dispose();
            }
            Object F = k().A(wj2.c.a()).F(new l(4, new b(this, i13)), new l(5, new b(this, 1)), i.f27923c, i.f27924d);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            this.f135186c = (AtomicReference) F;
        }
    }

    @Override // vq0.e
    public final void n3(int i13, int i14) {
        ArrayList arrayList = this.f135191h;
        arrayList.add(i14, arrayList.remove(i13));
        this.f135193j.c(new sq0.s(i13, i14));
        Object item = getItem(i13);
        if (item != null) {
            this.f135190g.c(new wt1.r(null, item, i13, i14));
        }
    }

    @Override // vq0.f
    public final void o(int i13, h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        this.f135192i.o(i13, viewBinderInstance);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    public void onUnbind() {
        this.f135185b.d();
        this.f135186c.dispose();
    }

    @Override // yq0.a0
    public final void p(int i13, n view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f135192i.p(i13, view);
    }

    public final void r(int i13, Object obj) {
        this.f135191h.add(i13, obj);
        this.f135193j.c(new r(i13, 1));
        this.f135190g.c(new wt1.m(null, e0.b(obj), i13));
    }

    public void removeItem(int i13) {
        this.f135191h.remove(i13);
        this.f135193j.c(new t(i13, 1));
        this.f135190g.c(new u(null, i13, i13 + 1));
    }

    @Override // wk1.e
    public final boolean s() {
        return this.f135189f;
    }

    @Override // wk1.e
    public final void t() {
        if (this.f135189f) {
            this.f135189f = false;
            this.f135193j.c(new r(0, a()));
            this.f135190g.c(new z());
        }
    }

    @Override // vq0.f
    public final boolean t0() {
        return i() && this.f135187d && !this.f135189f;
    }

    public void u(List itemsToSet) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        ArrayList arrayList = this.f135191h;
        int size = arrayList.size();
        int size2 = itemsToSet.size();
        wt1.a aVar = this.f135184a;
        w e13 = aVar != null ? a0.e(new a(aVar, this, itemsToSet, 0)) : null;
        arrayList.clear();
        arrayList.addAll(itemsToSet);
        f fVar = this.f135193j;
        if (e13 != null) {
            this.f135190g.c(new y(e13, itemsToSet));
            fVar.c(new sq0.q(e13));
            return;
        }
        int i13 = size - size2;
        if (i13 > 0) {
            fVar.c(new t(size2, Math.abs(i13)));
            if (size2 > 0) {
                fVar.c(new p(0, size2));
                return;
            }
            return;
        }
        if (i13 < 0) {
            fVar.c(new r(size, Math.abs(i13)));
            if (size > 0) {
                fVar.c(new p(0, size));
                return;
            }
            return;
        }
        if (i13 != 0 || size <= 0) {
            return;
        }
        fVar.c(new p(0, size));
    }

    public void u1(int i13, Object obj) {
        this.f135191h.set(i13, obj);
        this.f135193j.c(new p(i13, 1));
        this.f135190g.c(new b0(null, i13, obj));
    }

    @Override // wk1.e
    public final void y() {
        if (this.f135189f) {
            return;
        }
        this.f135193j.c(new t(0, a()));
        this.f135190g.c(new j());
        this.f135189f = true;
    }
}

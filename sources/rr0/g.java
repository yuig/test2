package rr0;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.d40;
import com.pinterest.api.model.f30;
import df.j1;
import is1.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jk2.a0;
import jk2.h0;
import jk2.x;
import m60.w;
import nr0.l;
import nt.c2;
import nx.d0;
import nx.d1;
import nx.o0;
import qa2.n;
import so.n6;
import sq0.m;
import sq0.y;
import uj2.q;
import vb0.j;
import x02.a2;
import yk1.r;
import yk1.v;
import yq0.t;

/* loaded from: classes.dex */
public abstract class g extends vq0.g implements nr0.f, qr0.b, nr0.d, ar0.a, nr0.a {

    /* renamed from: b, reason: collision with root package name */
    public final or0.b f109890b;

    /* renamed from: c, reason: collision with root package name */
    public final v f109891c;

    /* renamed from: d, reason: collision with root package name */
    public final ky.e f109892d;

    /* renamed from: e, reason: collision with root package name */
    public final vr.a f109893e;

    /* renamed from: f, reason: collision with root package name */
    public final o0 f109894f;

    /* renamed from: g, reason: collision with root package name */
    public final d1 f109895g;

    /* renamed from: h, reason: collision with root package name */
    public final w f109896h;

    /* renamed from: i, reason: collision with root package name */
    public HashSet f109897i;

    /* renamed from: j, reason: collision with root package name */
    public final n f109898j;

    /* renamed from: k, reason: collision with root package name */
    public final sq0.f f109899k;

    /* renamed from: l, reason: collision with root package name */
    public final m f109900l;

    /* renamed from: m, reason: collision with root package name */
    public qr0.c f109901m;

    /* renamed from: n, reason: collision with root package name */
    public np0.e f109902n;

    /* renamed from: o, reason: collision with root package name */
    public c f109903o;

    /* renamed from: p, reason: collision with root package name */
    public c f109904p;

    /* renamed from: q, reason: collision with root package name */
    public l f109905q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f109906r;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f109907s;

    /* renamed from: t, reason: collision with root package name */
    public final nr0.m f109908t;

    /* renamed from: u, reason: collision with root package name */
    public final ac2.m f109909u;

    /* renamed from: v, reason: collision with root package name */
    public final s f109910v;

    /* renamed from: w, reason: collision with root package name */
    public int f109911w;

    public g(h hVar) {
        super(hVar.f109912a, hVar.f109921j);
        this.f109907s = new HashMap();
        this.f109911w = 0;
        this.f109890b = hVar.f109913b;
        this.f109898j = hVar.f109914c;
        this.f109891c = hVar.f109922k;
        this.f109896h = hVar.f109917f;
        this.f109892d = hVar.f109919h;
        this.f109893e = hVar.f109920i;
        this.f109894f = hVar.f109915d;
        this.f109895g = hVar.f109916e;
        this.f109899k = hVar.f109923l;
        this.f109900l = hVar.f109924m;
        this.f109906r = new ArrayList();
        this.f109908t = hVar.f109928q;
        this.f109909u = hVar.f109930s;
        this.f109910v = hVar.f109933v;
    }

    @Override // qr0.b
    public final void A1(int i13, dl1.s sVar) {
        U3(i13, sVar);
        new Handler(Looper.getMainLooper()).post(new c2(this, 29));
    }

    public dl1.s B2(int i13) {
        return getItem(i13);
    }

    @Override // vq0.e, nr0.a
    /* renamed from: B3, reason: merged with bridge method [inline-methods] */
    public final dl1.s getItem(int i13) {
        if (d2(i13)) {
            return (dl1.s) this.f109906r.get(i13);
        }
        return null;
    }

    public final l D3() {
        if (this.f109905q == null) {
            uk1.d presenterPinalytics = getPresenterPinalytics();
            n nVar = this.f109898j;
            this.f109905q = ((n6) this.f109908t).a(presenterPinalytics, nVar.f103320a, nVar, this.f109891c);
        }
        return this.f109905q;
    }

    public gb2.l[] E(String str) {
        gb2.l lVar = (gb2.l) this.f109907s.get(str);
        if (lVar != null) {
            return new gb2.l[]{lVar};
        }
        return null;
    }

    public final void F3() {
        q a0Var;
        if (!isBound()) {
            j.f125466a.G("Unexpected and illegal state: DynamicFeedPresenter trying to load data when it is NOT bound to a View", new Object[0]);
        }
        c cVar = this.f109904p;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f109904p = null;
        or0.b bVar = this.f109890b;
        String str = bVar.f97252e;
        ck2.c cVar2 = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        int i13 = 1;
        if (str == null) {
            a0Var = h0.f76488a;
        } else {
            q b13 = bVar.b(str);
            or0.a aVar = new or0.a(bVar, i13);
            b13.getClass();
            a0Var = new a0(b13, aVar, a2Var, cVar2);
        }
        x xVar = new x(new a0(new a0(a0Var.H(tk2.e.f118017c).A(wj2.c.a()), new d(this, 6), a2Var, cVar2), a2Var, a2Var, new e(this, 1)).q(new d(this, 7)).p(new d(this, 8)), new e(this, 2), i13);
        c cVar3 = new c((nr0.h) getView(), this.f109892d, true);
        xVar.d(cVar3);
        this.f109904p = cVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vq0.g
    /* renamed from: G3 */
    public void r3(nr0.h hVar) {
        D3().F(this);
        ((t) hVar).addItemVisibilityChangeListener(new f(this, this.f109899k, this.f109900l, hVar.getZ0()));
        ((sq0.e) hVar).H(this);
        np0.e eVar = this.f109902n;
        if (eVar != null) {
            eVar.f91749b = hVar;
        }
        super.r3(hVar);
        q x33 = x3();
        d dVar = new d(this, 5);
        ir.i iVar = new ir.i(3);
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        addDisposable(x33.F(dVar, iVar, cVar, a2Var));
        gb2.f fVar = gb2.f.f64747a;
        addDisposable(gb2.f.a().F(new d(this, 4), new ir.i(2), cVar, a2Var));
    }

    public void H3(Throwable th3) {
        I3(th3);
    }

    public final void I3(Throwable th3) {
        s3(false);
        ((t) ((nr0.h) getView())).displayError(th3);
    }

    public void J3(Throwable th3) {
        I3(th3);
    }

    public void K3(qr0.d dVar) {
        this.f109911w = 1;
        np0.e eVar = this.f109902n;
        if (eVar != null) {
            if (dVar.k() != null) {
                eVar.f91750c = dVar.k();
            } else {
                eVar.f91750c = dVar.g();
            }
            eVar.f91751d = dVar.r();
        }
        if (T3(dVar)) {
            F3();
        }
        s3(true);
        List d2 = dVar.d();
        if (!d2.isEmpty()) {
            d0 pinalytics = getPinalytics();
            this.f109894f.getClass();
            o0.l(pinalytics, this.f109895g, d2);
        }
        ((sq0.e) ((nr0.h) getView())).X2();
    }

    public void L3(qr0.d dVar) {
        this.f109911w++;
        np0.e eVar = this.f109902n;
        if (eVar != null) {
            if (dVar.k() != null) {
                eVar.f91750c = dVar.k();
            } else {
                eVar.f91750c = dVar.g();
            }
            eVar.f91751d = dVar.r();
        }
        if (T3(dVar)) {
            F3();
        }
        s3(true);
        int size = dVar.d().size();
        sq0.f fVar = this.f109899k;
        if (fVar != null && size > 0) {
            int size2 = this.f109906r.size() - size;
            if (d2(size2)) {
                List d2 = d();
                y yVar = y.DOWN;
                fVar.k(size2, ((nr0.h) getView()).getZ0(), yVar, d2);
                m mVar = this.f109900l;
                if (mVar != null) {
                    mVar.l(this, size2, yVar);
                }
            }
        }
        List d13 = dVar.d();
        if (d13.isEmpty()) {
            return;
        }
        d0 pinalytics = getPinalytics();
        this.f109894f.getClass();
        o0.l(pinalytics, this.f109895g, d13);
    }

    public final void M3(int i13, List list) {
        boolean z13 = isBound() && ((sq0.e) ((nr0.h) getView())).u8();
        vr.a aVar = this.f109893e;
        if (aVar != null) {
            ((vr.b) aVar).h(list);
        }
        ky.e eVar = this.f109892d;
        eVar.g();
        eVar.f(null, i13, null, z13);
    }

    public final void N3(List list) {
        if (qb0.b.p(list)) {
            this.f109906r.addAll(0, list);
            ((b2) getAdapter()).n(0, list.size());
        }
    }

    public final void Q3(Object obj) {
        this.f109896h.i(obj);
    }

    public void R3(List list) {
        S3(list);
    }

    @Override // ar0.a
    public final void S2(int i13, ar0.b bVar) {
        if (bVar.b()) {
            ((b2) getAdapter()).i(i13);
        }
    }

    public void S3(List list) {
        ArrayList arrayList = this.f109906r;
        arrayList.clear();
        arrayList.addAll(list);
        ((b2) getAdapter()).h();
    }

    public boolean T3(qr0.d dVar) {
        return dVar.d().isEmpty() && !pk.a0.x0(dVar.r());
    }

    public final void U3(int i13, dl1.s sVar) {
        if (d2(i13)) {
            this.f109906r.set(i13, sVar);
            ((b2) getAdapter()).i(i13);
        }
    }

    @Override // sq0.e0
    public final int a() {
        return this.f109906r.size();
    }

    @Override // yk1.p
    public final void bindPinalytics(r rVar) {
        nr0.h hVar = (nr0.h) rVar;
        getPresenterPinalytics().c(hVar.getF81081f1(), hVar.getF81080e1(), null);
    }

    @Override // nr0.g
    public final boolean c3(int i13) {
        if (d2(i13)) {
            return q(getItemViewType(i13));
        }
        return false;
    }

    public List d() {
        return Collections.unmodifiableList(this.f109906r);
    }

    @Override // nr0.a
    public final boolean d2(int i13) {
        return i13 >= 0 && i13 < a();
    }

    public boolean e(int i13) {
        return D3().e(i13);
    }

    public boolean f(int i13) {
        return D3().f(i13);
    }

    @Override // nr0.g
    public final boolean f3(int i13) {
        D3().getClass();
        return true;
    }

    public abstract int getItemViewType(int i13);

    public boolean h(int i13) {
        return D3().h(i13);
    }

    @Override // nr0.g
    public final Integer j(int i13) {
        return D3().j(i13);
    }

    @Override // nr0.g
    public final boolean k2(int i13) {
        D3().getClass();
        return true;
    }

    @Override // vq0.g
    public void loadData() {
        super.loadData();
        int i13 = 0;
        this.f109911w = 0;
        Map z33 = z3();
        if (z33 == null || z33.isEmpty()) {
            z33 = new HashMap();
        }
        if (!isBound()) {
            j.f125466a.G("Unexpected and illegal state: DynamicFeedPresenter trying to load data when it is NOT bound to a View", new Object[0]);
        }
        c cVar = this.f109903o;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f109903o = null;
        or0.b bVar = this.f109890b;
        bVar.f97252e = null;
        bVar.f97250c = 0;
        qo1.b bVar2 = bVar.f97251d;
        bVar2.f104530b = "";
        bVar2.f104531c = 0;
        q a13 = bVar.a(z33);
        or0.a aVar = new or0.a(bVar, i13);
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar2 = ck2.i.f27923c;
        a13.getClass();
        a0 a0Var = new a0(new a0(a13, aVar, a2Var, cVar2).H(tk2.e.f118017c).A(wj2.c.a()), new d(this, i13), a2Var, cVar2);
        int i14 = 1;
        x xVar = new x(new x(a0Var, new d(this, i14), i13).q(new d(this, 2)).p(new d(this, 3)), new e(this, 0), i14);
        c cVar3 = new c((nr0.h) getView(), this.f109892d, false);
        xVar.d(cVar3);
        this.f109903o = cVar3;
    }

    @Override // vq0.g, sq0.w
    public void loadMoreData() {
        F3();
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        if (d2(i13)) {
            return f(getItemViewType(i13));
        }
        return false;
    }

    @Override // vq0.e
    public final void n3(int i13, int i14) {
        Object adapter = getAdapter();
        if (i13 == i14 || !d2(i13) || !d2(i14) || adapter == null) {
            return;
        }
        ArrayList arrayList = this.f109906r;
        arrayList.add(i14, (dl1.s) arrayList.remove(i13));
        ((b2) adapter).k(i13, i14);
    }

    @Override // vq0.g, yk1.b
    public void onActivate() {
        q3();
        sq0.f fVar = this.f109899k;
        if (fVar == null || !isBound()) {
            return;
        }
        RecyclerView g83 = ((sq0.e) ((nr0.h) getView())).g8();
        int n03 = g83 != null ? j1.n0(g83) : -1;
        if (n03 == -1) {
            n03 = 0;
        }
        if (d2(n03)) {
            fVar.m(n03, ((nr0.h) getView()).getZ0(), y.DOWN, d());
        }
    }

    @Override // nr0.d
    public final void onPinClicked(f30 f30Var) {
        np0.e eVar = this.f109902n;
        if (eVar != null) {
            ArrayList arrayList = new ArrayList();
            for (dl1.s sVar : d()) {
                if (!(sVar instanceof f30) || b40.x((f30) sVar) == d40.NOT_HIDDEN) {
                    arrayList.add(sVar);
                }
            }
            eVar.a(f30Var, Collections.unmodifiableList(arrayList), null, ((is1.t) this.f109910v).a(f30Var));
        }
    }

    @Override // vq0.g, sq0.a0
    public void onRecyclerRefresh() {
        ((sq0.e) ((nr0.h) getView())).d3();
        j6.b bVar = D3().f91879n;
        ((g1.h) bVar.f74795c).clear();
        bVar.f74794b = -bVar.f74793a;
        loadData();
    }

    @Override // vq0.g, yk1.p, yk1.b
    public void onUnbind() {
        c cVar = this.f109903o;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f109903o = null;
        c cVar2 = this.f109904p;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.f109904p = null;
        if (!qb0.b.o(this.f109897i)) {
            Iterator it = this.f109897i.iterator();
            while (it.hasNext()) {
                m60.t tVar = (m60.t) it.next();
                w wVar = this.f109896h;
                if (wVar.c(tVar)) {
                    wVar.j(tVar);
                }
            }
            this.f109897i.clear();
            this.f109897i = null;
        }
        np0.e eVar = this.f109902n;
        if (eVar != null) {
            eVar.f91749b = null;
        }
        m mVar = this.f109900l;
        if (mVar != null) {
            ek2.j jVar = mVar.f115022q;
            if (jVar != null) {
                bk2.c.dispose(jVar);
            }
            mVar.f115022q = null;
        }
        super.onUnbind();
    }

    @Override // nr0.g
    public boolean q(int i13) {
        return D3().q(i13);
    }

    @Override // vq0.e
    public final void removeItem(int i13) {
        if (d2(i13)) {
            this.f109906r.remove(i13);
            ((b2) getAdapter()).p(i13);
        }
    }

    @Override // vq0.g
    public boolean t3() {
        return qb0.b.o(d());
    }

    public final void u3(m60.t tVar) {
        w wVar = this.f109896h;
        if (!wVar.c(tVar)) {
            wVar.h(tVar);
        }
        if (this.f109897i == null) {
            this.f109897i = new HashSet();
        }
        this.f109897i.add(tVar);
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
        getPresenterPinalytics().k();
    }

    public void v3(List list) {
        if (qb0.b.p(list)) {
            ArrayList arrayList = this.f109906r;
            int size = arrayList.size();
            arrayList.addAll(list);
            ((b2) getAdapter()).n(size, list.size());
        }
    }

    public final boolean w3(String str) {
        dl1.s sVar;
        List d2 = d();
        int size = d2.size();
        int i13 = 0;
        while (true) {
            if (i13 < size) {
                sVar = (dl1.s) d2.get(i13);
                if (sVar != null && str.equals(sVar.getUid())) {
                    break;
                }
                i13++;
            } else {
                sVar = null;
                break;
            }
        }
        return sVar != null;
    }

    public q x3() {
        return h0.f76488a;
    }

    public Map z3() {
        return Collections.emptyMap();
    }
}

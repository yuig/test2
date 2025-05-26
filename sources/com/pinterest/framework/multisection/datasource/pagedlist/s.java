package com.pinterest.framework.multisection.datasource.pagedlist;

import a.cb;
import android.os.Bundle;
import ao2.k2;
import ao2.v0;
import c2.m4;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jk2.a1;
import jk2.e2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import w1.x0;

/* loaded from: classes5.dex */
public final class s implements x {

    /* renamed from: a, reason: collision with root package name */
    public final oc.c f49162a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f49163b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f49164c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f49165d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f49166e;

    /* renamed from: f, reason: collision with root package name */
    public final m60.g0 f49167f;

    /* renamed from: g, reason: collision with root package name */
    public final k f49168g;

    /* renamed from: h, reason: collision with root package name */
    public final wt1.a f49169h;

    /* renamed from: i, reason: collision with root package name */
    public final Function1 f49170i;

    /* renamed from: j, reason: collision with root package name */
    public final ao2.f0 f49171j;

    /* renamed from: k, reason: collision with root package name */
    public final CoroutineContext f49172k;

    /* renamed from: l, reason: collision with root package name */
    public final ao2.j0 f49173l;

    /* renamed from: m, reason: collision with root package name */
    public final wt1.f0 f49174m;

    /* renamed from: n, reason: collision with root package name */
    public final xj2.b f49175n;

    /* renamed from: o, reason: collision with root package name */
    public final ho2.c f49176o;

    /* renamed from: p, reason: collision with root package name */
    public k2 f49177p;

    /* renamed from: q, reason: collision with root package name */
    public final uk2.f f49178q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f49179r;

    /* renamed from: s, reason: collision with root package name */
    public List f49180s;

    /* renamed from: t, reason: collision with root package name */
    public p f49181t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f49182u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f49183v;

    /* renamed from: w, reason: collision with root package name */
    public final String f49184w;

    /* renamed from: x, reason: collision with root package name */
    public final a1 f49185x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f49186y;

    public s(oc.c apolloClient, Function2 getViewType, Function1 getItemId, Function1 nextQuery, Function1 parseResponse, m60.g0 pageSizeProvider, k kVar, kp.n nVar, int i13) {
        pageSizeProvider = (i13 & 32) != 0 ? new m60.h0(hf0.b.q()) : pageSizeProvider;
        kVar = (i13 & 64) != 0 ? null : kVar;
        i shouldLoad = i.f49137j;
        wt1.a diffCalculator = nVar;
        diffCalculator = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? new j(getItemId) : diffCalculator;
        a uiUpdates = a.f49073p;
        ko2.f fVar = v0.f20219a;
        bo2.e defaultDispatcher = ((bo2.e) ho2.q.f69782a).f23612f;
        CoroutineContext coroutineContext = kotlin.coroutines.g.d(defaultDispatcher, ue.c.b());
        ho2.c scope = dl2.b.b(coroutineContext);
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(getViewType, "getViewType");
        Intrinsics.checkNotNullParameter(getItemId, "getItemId");
        Intrinsics.checkNotNullParameter(nextQuery, "nextQuery");
        Intrinsics.checkNotNullParameter(parseResponse, "parseResponse");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(shouldLoad, "shouldLoad");
        Intrinsics.checkNotNullParameter(diffCalculator, "diffCalculator");
        Intrinsics.checkNotNullParameter(uiUpdates, "uiUpdates");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f49162a = apolloClient;
        this.f49163b = getViewType;
        this.f49164c = getItemId;
        this.f49165d = nextQuery;
        this.f49166e = parseResponse;
        this.f49167f = pageSizeProvider;
        this.f49168g = kVar;
        this.f49169h = diffCalculator;
        this.f49170i = uiUpdates;
        this.f49171j = defaultDispatcher;
        this.f49172k = coroutineContext;
        this.f49173l = scope;
        this.f49174m = new wt1.f0(this);
        this.f49175n = new xj2.b();
        this.f49176o = dl2.b.b(coroutineContext);
        uk2.f r13 = cb.r("create(...)");
        this.f49178q = r13;
        this.f49180s = kotlin.collections.q0.f80391a;
        this.f49181t = new m(null, Integer.parseInt(pageSizeProvider.d()));
        this.f49183v = ((Boolean) shouldLoad.invoke()).booleanValue();
        this.f49184w = "not_applicable_in_graphql";
        a1 a1Var = new a1(r13);
        Intrinsics.checkNotNullExpressionValue(a1Var, "hide(...)");
        this.f49185x = a1Var;
        this.f49186y = new LinkedHashMap();
    }

    @Override // nr0.a
    public final gb2.l[] E(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        return (gb2.l[]) this.f49170i.invoke(uid);
    }

    @Override // nr0.a
    public final void I0(int i13, nx.r0 provide) {
        Intrinsics.checkNotNullParameter(provide, "provide");
        this.f49174m.I0(i13, provide);
    }

    @Override // sq0.e0
    public final uj2.q K1() {
        d51.a aVar = new d51.a(28, a.f49074q);
        uk2.f fVar = this.f49178q;
        fVar.getClass();
        uj2.q t13 = new jk2.x(fVar, aVar, 2).t(new h(0, new bi1.a0(this, 20)));
        Intrinsics.checkNotNullExpressionValue(t13, "flatMap(...)");
        return t13;
    }

    @Override // yq0.a0
    public final yk1.m S(int i13) {
        return this.f49174m.S(i13);
    }

    @Override // vq0.f
    public final Set X1() {
        return this.f49174m.f131112c;
    }

    @Override // sq0.e0
    public final int a() {
        return this.f49180s.size();
    }

    @Override // wt1.c
    public final void b(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.x, nr0.a
    public final void c(int[] ids, vq0.h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        super.c(ids, viewBinderInstance);
    }

    @Override // vq0.f
    public final void clear() {
        k2 k2Var = this.f49177p;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
        kotlin.collections.q0 itemsToSet = kotlin.collections.q0.f80391a;
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        f(itemsToSet, new fk1.u(itemsToSet, 3));
        this.f49181t = new m(null, Integer.parseInt(this.f49167f.d()));
        this.f49178q.c(new wt1.v());
        LinkedHashMap linkedHashMap = this.f49186y;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((xj2.c) it.next()).dispose();
        }
        linkedHashMap.clear();
    }

    @Override // qr0.d
    public final List d() {
        return CollectionsKt.F0(this.f49180s);
    }

    @Override // nr0.a
    public final boolean d2(int i13) {
        return i13 >= 0 && i13 < this.f49180s.size();
    }

    public final void e(List itemsToAppend) {
        Intrinsics.checkNotNullParameter(itemsToAppend, "itemsToAppend");
        int size = this.f49180s.size();
        ArrayList H0 = CollectionsKt.H0(this.f49180s);
        H0.addAll(size, itemsToAppend);
        f(H0, new xs0.k(size, 2, itemsToAppend));
    }

    public final void f(List list, Function1 function1) {
        LinkedHashMap linkedHashMap;
        Function1 function12;
        k kVar;
        androidx.recyclerview.widget.w e13 = androidx.recyclerview.widget.a0.e(new xk1.a(this.f49169h, this, list, 1));
        Intrinsics.checkNotNullExpressionValue(e13, "let(...)");
        this.f49180s = list;
        this.f49178q.c(function1.invoke(e13));
        Iterator it = d().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = this.f49186y;
            function12 = this.f49164c;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            if (!linkedHashMap.containsKey(function12.invoke(next)) && (kVar = this.f49168g) != null) {
                oc.a c13 = this.f49162a.c(kVar.q((String) function12.invoke(next)));
                d7.b.E(c13, vc.f.CacheOnly);
                linkedHashMap.put(function12.invoke(next), new e2(kotlin.jvm.internal.j.b(d7.b.H0(c13))).A(wj2.c.a()).F(new wk1.l(14, new oh1.u(21, kVar, this)), new wk1.l(15, a.f49075r), ck2.i.f27923c, ck2.i.f27924d));
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            String str = (String) obj;
            List d2 = d();
            boolean z13 = false;
            if (!(d2 instanceof Collection) || !d2.isEmpty()) {
                Iterator it2 = d2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.d(function12.invoke(it2.next()), str)) {
                            z13 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!z13) {
                arrayList.add(obj);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            xj2.c cVar = (xj2.c) linkedHashMap.remove((String) it3.next());
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }

    @Override // qr0.d
    public final String g() {
        return this.f49184w;
    }

    @Override // nr0.a
    public final Object getItem(int i13) {
        return CollectionsKt.U(i13, this.f49180s);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return ((Number) this.f49163b.invoke(Integer.valueOf(i13), CollectionsKt.U(i13, this.f49180s))).intValue();
    }

    public final void h(boolean z13) {
        Object sVar;
        if (z13 || !this.f49179r) {
            p pVar = this.f49181t;
            this.f49179r = true;
            if (pVar instanceof m) {
                sVar = new wt1.k();
            } else if (pVar instanceof n) {
                sVar = new wt1.n();
            } else {
                if (!(pVar instanceof o)) {
                    throw new NoWhenBranchMatchedException();
                }
                sVar = new wt1.s();
            }
            this.f49178q.c(sVar);
            this.f49177p = kotlin.jvm.internal.j.z(this.f49173l, null, null, new r(this, pVar, null), 3);
        }
    }

    @Override // wt1.b
    public final boolean i() {
        return this.f49183v;
    }

    @Override // vq0.f
    public final void i2() {
        this.f49181t = new o(null, Integer.parseInt(this.f49167f.d()));
        n();
    }

    @Override // vq0.f
    public final void j1() {
        if (t0()) {
            n();
        }
    }

    @Override // vq0.e
    public final void j2(Object obj) {
        e(kotlin.collections.e0.b(obj));
    }

    @Override // qr0.d
    public final String k() {
        return null;
    }

    @Override // wt1.c
    public final void l(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // wt1.d0
    public final uj2.q m() {
        return this.f49185x;
    }

    @Override // wt1.b
    public final void n() {
        if (this.f49183v) {
            h(false);
        }
    }

    @Override // vq0.e
    public final void n3(int i13, int i14) {
        ArrayList H0 = CollectionsKt.H0(this.f49180s);
        Object remove = H0.remove(i13);
        H0.add(i14, remove);
        f(H0, new x0(remove, i13, i14, 3));
    }

    @Override // nr0.a, vq0.f
    public final void o(int i13, vq0.h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        this.f49174m.o(i13, viewBinderInstance);
    }

    @Override // wk1.e
    public final void onUnbind() {
        dl2.b.E(this.f49173l, null);
        dl2.b.E(this.f49176o, null);
        this.f49175n.d();
        LinkedHashMap linkedHashMap = this.f49186y;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((xj2.c) it.next()).dispose();
        }
        linkedHashMap.clear();
    }

    @Override // yq0.a0
    public final void p(int i13, yk1.n view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f49174m.p(i13, view);
    }

    @Override // qr0.d
    public final String r() {
        String str;
        p pVar = this.f49181t;
        return (!(pVar instanceof n) || (str = pVar.f49153b) == null) ? "" : str;
    }

    @Override // vq0.e
    public final void removeItem(int i13) {
        int i14 = i13 + 1;
        ArrayList H0 = CollectionsKt.H0(this.f49180s);
        H0.subList(i13, i14).clear();
        f(H0, new ck0.a(i13, i14, 6));
    }

    @Override // wk1.e
    public final boolean s() {
        return this.f49182u;
    }

    @Override // wk1.e
    public final void t() {
        if (this.f49182u) {
            this.f49182u = false;
            this.f49178q.c(new wt1.z());
        }
    }

    @Override // vq0.f
    public final boolean t0() {
        if (this.f49179r) {
            return true;
        }
        if (!this.f49183v) {
            return false;
        }
        p pVar = this.f49181t;
        if ((pVar instanceof m) || (pVar instanceof o)) {
            return true;
        }
        if (!(pVar instanceof n)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = pVar.f49153b;
        return (str == null || kotlin.text.z.j(str)) ? false : true;
    }

    @Override // vq0.e
    public final void u1(int i13, Object obj) {
        ArrayList H0 = CollectionsKt.H0(this.f49180s);
        H0.set(i13, obj);
        f(H0, new m4(i13, obj, 21));
    }

    @Override // wk1.e
    public final void y() {
        if (this.f49182u) {
            return;
        }
        this.f49178q.c(new wt1.j());
        this.f49182u = true;
    }
}

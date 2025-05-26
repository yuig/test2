package com.pinterest.framework.multisection.datasource.pagedlist;

import android.os.Bundle;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements nr0.j, x, w {

    /* renamed from: a, reason: collision with root package name */
    public final s f49103a;

    /* renamed from: b, reason: collision with root package name */
    public final nr0.p f49104b;

    /* renamed from: c, reason: collision with root package name */
    public final String f49105c;

    /* renamed from: d, reason: collision with root package name */
    public final sq0.f f49106d;

    /* renamed from: e, reason: collision with root package name */
    public AtomicReference f49107e;

    public g(s graphQLPagedList, nr0.p dynamicGridViewBinderDelegate, String theSearchQuery, sq0.f fVar) {
        Intrinsics.checkNotNullParameter(graphQLPagedList, "graphQLPagedList");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegate, "dynamicGridViewBinderDelegate");
        Intrinsics.checkNotNullParameter(theSearchQuery, "theSearchQuery");
        this.f49103a = graphQLPagedList;
        this.f49104b = dynamicGridViewBinderDelegate;
        this.f49105c = theSearchQuery;
        this.f49106d = fVar;
        xj2.e eVar = new xj2.e(ck2.i.f27922b);
        Intrinsics.checkNotNullExpressionValue(eVar, "empty(...)");
        this.f49107e = eVar;
        dynamicGridViewBinderDelegate.F(graphQLPagedList);
    }

    public static final void u(g gVar, sq0.f fVar, int i13) {
        if (i13 <= 0) {
            gVar.getClass();
            return;
        }
        int a13 = gVar.a() - i13;
        s sVar = gVar.f49103a;
        if (sVar.d2(a13)) {
            sq0.f.l(fVar, sVar.d(), a13, sq0.y.DOWN);
        }
    }

    @Override // wk1.e
    public final void C2(boolean z13) {
        this.f49103a.C2(z13);
    }

    @Override // nr0.a
    public final gb2.l[] E(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        return this.f49103a.E(uid);
    }

    @Override // wk1.e
    public final void E2() {
        Object F = this.f49103a.f49185x.F(new wk1.l(12, new bi1.a0(this, 19)), new wk1.l(13, a.f49072o), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        this.f49107e = (AtomicReference) F;
    }

    @Override // nr0.a
    public final void I0(int i13, nx.r0 provide) {
        Intrinsics.checkNotNullParameter(provide, "provide");
        this.f49103a.I0(i13, provide);
    }

    @Override // vq0.f
    public final void J1() {
        this.f49103a.clear();
    }

    @Override // sq0.e0
    public final uj2.q K1() {
        return this.f49103a.K1();
    }

    @Override // yq0.a0
    public final yk1.m S(int i13) {
        return this.f49103a.f49174m.S(i13);
    }

    @Override // vq0.f
    public final Set X1() {
        return this.f49103a.f49174m.f131112c;
    }

    @Override // sq0.e0
    public final int a() {
        return this.f49103a.f49180s.size();
    }

    @Override // wt1.c
    public final void b(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f49103a.b(bundle);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.x, nr0.a
    public final void c(int[] ids, vq0.h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        this.f49103a.c(ids, viewBinderInstance);
    }

    @Override // nr0.g
    public final boolean c3(int i13) {
        if (this.f49103a.d2(i13)) {
            nr0.p pVar = this.f49104b;
            if (pVar.q(pVar.getItemViewType(i13)) || pVar.q(getItemViewType(i13))) {
                return true;
            }
        }
        return false;
    }

    @Override // vq0.f
    public final void clear() {
        this.f49103a.clear();
    }

    @Override // vq0.e, qr0.d
    public final List d() {
        return this.f49103a.d();
    }

    @Override // nr0.a
    public final boolean d2(int i13) {
        return this.f49103a.d2(i13);
    }

    @Override // nr0.g
    public final boolean e(int i13) {
        return this.f49103a.d2(i13) && this.f49104b.e(i13);
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        return this.f49104b.f(i13);
    }

    @Override // nr0.g
    public final boolean f3(int i13) {
        return this.f49103a.d2(i13) && this.f49104b.c();
    }

    @Override // qr0.d
    public final String g() {
        return this.f49103a.f49184w;
    }

    @Override // vq0.e, nr0.a
    public final Object getItem(int i13) {
        return CollectionsKt.U(i13, this.f49103a.f49180s);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        int itemViewType = this.f49103a.getItemViewType(i13);
        return itemViewType >= 0 ? itemViewType : this.f49104b.getItemViewType(i13);
    }

    @Override // nr0.g
    public final boolean h(int i13) {
        return this.f49103a.d2(i13) && this.f49104b.h(i13);
    }

    @Override // wt1.b
    public final boolean i() {
        return this.f49103a.f49183v;
    }

    @Override // vq0.f
    public final void i2() {
        this.f49103a.i2();
    }

    @Override // vq0.f
    public final void j1() {
        this.f49103a.j1();
    }

    @Override // vq0.e
    public final void j2(Object obj) {
        this.f49103a.j2(obj);
    }

    @Override // qr0.d
    public final String k() {
        this.f49103a.getClass();
        return null;
    }

    @Override // nr0.g
    public final boolean k2(int i13) {
        return this.f49103a.d2(i13) && this.f49104b.m();
    }

    @Override // wt1.c
    public final void l(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f49103a.l(bundle);
    }

    @Override // wt1.d0
    public final uj2.q m() {
        return this.f49103a.f49185x;
    }

    @Override // wt1.b
    public final void n() {
        this.f49103a.n();
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        if (this.f49103a.d2(i13)) {
            nr0.p pVar = this.f49104b;
            if (pVar.f(pVar.getItemViewType(i13)) || pVar.f(getItemViewType(i13))) {
                return true;
            }
        }
        return false;
    }

    @Override // vq0.e
    public final void n3(int i13, int i14) {
        this.f49103a.n3(i13, i14);
    }

    @Override // nr0.a, vq0.f
    public final void o(int i13, vq0.h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        this.f49103a.o(i13, viewBinderInstance);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    @Override // wk1.e
    public final void onUnbind() {
        this.f49103a.onUnbind();
        this.f49107e.dispose();
    }

    @Override // yq0.a0
    public final void p(int i13, yk1.n view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f49103a.p(i13, view);
    }

    @Override // nr0.g
    public final boolean q(int i13) {
        return this.f49104b.q(i13);
    }

    @Override // qr0.d
    public final String r() {
        return this.f49103a.r();
    }

    @Override // vq0.e
    public final void removeItem(int i13) {
        this.f49103a.removeItem(i13);
    }

    @Override // wk1.e
    public final boolean s() {
        return this.f49103a.f49182u;
    }

    @Override // wk1.e
    public final void t() {
        this.f49103a.t();
    }

    @Override // vq0.f
    public final boolean t0() {
        return this.f49103a.t0();
    }

    @Override // vq0.e
    public final void u1(int i13, Object obj) {
        this.f49103a.u1(i13, obj);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.w
    public final String w2() {
        return this.f49105c;
    }

    @Override // wk1.e
    public final void y() {
        this.f49103a.y();
    }
}

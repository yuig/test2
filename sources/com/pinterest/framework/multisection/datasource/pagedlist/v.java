package com.pinterest.framework.multisection.datasource.pagedlist;

import a.cb;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class v implements wk1.e, xj2.c, nr0.j {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f49190a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f49191b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f49192c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f49193d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f49194e;

    /* renamed from: f, reason: collision with root package name */
    public final uk2.f f49195f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f49196g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f49197h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f49198i;

    /* renamed from: j, reason: collision with root package name */
    public AtomicReference f49199j;

    public v(r0 wrappedList, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(wrappedList, "wrappedList");
        this.f49190a = wrappedList;
        this.f49191b = z13;
        this.f49192c = z14;
        this.f49193d = new ArrayList();
        this.f49194e = new ArrayList();
        this.f49195f = cb.r("create(...)");
        xj2.e eVar = new xj2.e(ck2.i.f27922b);
        Intrinsics.checkNotNullExpressionValue(eVar, "empty(...)");
        this.f49199j = eVar;
    }

    @Override // wk1.e
    public final void E2() {
        this.f49190a.E2();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    @Override // sq0.e0
    public final uj2.q K1() {
        if (!this.f49199j.isDisposed()) {
            this.f49199j.dispose();
        }
        Object F = this.f49190a.K1().F(new wk1.l(16, new bi1.a0(this, 21)), new wk1.l(17, a.f49076s), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        this.f49199j = (AtomicReference) F;
        return this.f49195f;
    }

    @Override // yq0.a0
    public final yk1.m S(int i13) {
        return this.f49190a.S(i13);
    }

    @Override // vq0.f
    public final Set X1() {
        LinkedHashSet I0 = CollectionsKt.I0(this.f49193d);
        I0.addAll(CollectionsKt.J0(this.f49194e));
        I0.addAll(this.f49190a.X1());
        return I0;
    }

    @Override // sq0.e0
    public final int a() {
        int a13 = this.f49190a.a();
        if (this.f49196g) {
            a13 += this.f49193d.size();
        }
        return this.f49197h ? a13 + this.f49194e.size() : a13;
    }

    @Override // vq0.f, nr0.a
    public final void c(int[] ids, vq0.h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        this.f49190a.c(ids, viewBinderInstance);
    }

    @Override // vq0.f
    public final void clear() {
        this.f49190a.clear();
    }

    @Override // vq0.e, qr0.d
    public final List d() {
        return this.f49190a.d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    @Override // xj2.c
    public final void dispose() {
        if (!this.f49199j.isDisposed()) {
            this.f49199j.dispose();
        }
        r0 r0Var = this.f49190a;
        if (r0Var instanceof xj2.c) {
            xj2.c cVar = (xj2.c) r0Var;
            if (cVar.isDisposed()) {
                return;
            }
            cVar.dispose();
        }
    }

    public final void g(int i13) {
        ArrayList arrayList = this.f49194e;
        int size = arrayList.size();
        arrayList.add(Integer.valueOf(i13));
        if (this.f49197h) {
            this.f49195f.c(new sq0.r(this.f49190a.a() + (this.f49196g ? this.f49193d.size() : 0) + size, 1));
        }
    }

    @Override // vq0.e, nr0.a
    public final Object getItem(int i13) {
        return this.f49190a.getItem(i13);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        if (this.f49196g) {
            ArrayList arrayList = this.f49193d;
            if (i13 < arrayList.size()) {
                return ((Number) arrayList.get(i13)).intValue();
            }
            i13 -= arrayList.size();
        }
        boolean z13 = this.f49197h;
        r0 r0Var = this.f49190a;
        return (!z13 || i13 < r0Var.a()) ? r0Var.getItemViewType(i13) : ((Number) this.f49194e.get(i13 - r0Var.a())).intValue();
    }

    @Override // wt1.b
    public final boolean i() {
        return this.f49190a.i();
    }

    @Override // vq0.f
    public final void i2() {
        this.f49190a.i2();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f49199j.isDisposed();
    }

    @Override // vq0.f
    public final void j1() {
        this.f49190a.j1();
    }

    @Override // vq0.e
    public final void j2(Object obj) {
        this.f49190a.j2(obj);
    }

    public final void k(int i13) {
        ArrayList arrayList = this.f49193d;
        arrayList.add(Integer.valueOf(i13));
        if (this.f49196g) {
            this.f49195f.c(new sq0.r(arrayList.size() - 1, 1));
        }
    }

    @Override // wt1.d0
    public final uj2.q m() {
        return this.f49190a.m();
    }

    @Override // wt1.b
    public final void n() {
        this.f49190a.n();
    }

    @Override // vq0.e
    public final void n3(int i13, int i14) {
        this.f49190a.n3(i13, i14);
    }

    @Override // vq0.f
    public final void o(int i13, vq0.h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        this.f49190a.o(i13, viewBinderInstance);
    }

    @Override // wk1.e
    public final void onUnbind() {
        this.f49190a.onUnbind();
    }

    @Override // yq0.a0
    public final void p(int i13, yk1.n view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f49196g) {
            i13 -= this.f49193d.size();
        }
        if (i13 >= 0) {
            r0 r0Var = this.f49190a;
            if (i13 < r0Var.a()) {
                r0Var.p(i13, view);
            }
        }
    }

    @Override // vq0.e
    public final void removeItem(int i13) {
        this.f49190a.removeItem(i13);
    }

    @Override // wk1.e
    public final boolean s() {
        return this.f49190a.s();
    }

    @Override // wk1.e
    public final void t() {
        r0 r0Var = this.f49190a;
        if (r0Var.s()) {
            this.f49198i = false;
            r0Var.t();
        }
    }

    @Override // vq0.f
    public final boolean t0() {
        return this.f49190a.t0();
    }

    @Override // vq0.e
    public final void u1(int i13, Object obj) {
        this.f49190a.u1(i13, obj);
    }

    @Override // wk1.e
    public final void y() {
        r0 r0Var = this.f49190a;
        if (r0Var.s()) {
            return;
        }
        this.f49198i = true;
        r0Var.y();
    }

    public /* synthetic */ v(r0 r0Var, boolean z13, int i13) {
        this(r0Var, (i13 & 2) != 0 ? true : z13, false);
    }
}

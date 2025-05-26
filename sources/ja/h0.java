package ja;

import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h0 extends androidx.lifecycle.h0 {

    /* renamed from: l, reason: collision with root package name */
    public final d0 f75232l;

    /* renamed from: m, reason: collision with root package name */
    public final tb.l f75233m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f75234n;

    /* renamed from: o, reason: collision with root package name */
    public final Callable f75235o;

    /* renamed from: p, reason: collision with root package name */
    public final t f75236p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f75237q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f75238r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f75239s;

    /* renamed from: t, reason: collision with root package name */
    public final g0 f75240t;

    /* renamed from: u, reason: collision with root package name */
    public final g0 f75241u;

    public h0(d0 database, tb.l container, tb.v computeFunction, String[] tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f75232l = database;
        this.f75233m = container;
        this.f75234n = true;
        this.f75235o = computeFunction;
        this.f75236p = new t(tableNames, this);
        this.f75237q = new AtomicBoolean(true);
        this.f75238r = new AtomicBoolean(false);
        this.f75239s = new AtomicBoolean(false);
        this.f75240t = new g0(this, 0);
        this.f75241u = new g0(this, 1);
    }

    @Override // androidx.lifecycle.h0
    public final void g() {
        tb.l lVar = this.f75233m;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(this, "liveData");
        ((Set) lVar.f116987c).add(this);
        boolean z13 = this.f75234n;
        d0 d0Var = this.f75232l;
        (z13 ? d0Var.k() : d0Var.h()).execute(this.f75240t);
    }

    @Override // androidx.lifecycle.h0
    public final void h() {
        tb.l lVar = this.f75233m;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(this, "liveData");
        ((Set) lVar.f116987c).remove(this);
    }
}

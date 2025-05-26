package pj0;

import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import jk2.x;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import nx.d0;
import x02.i2;
import x02.x0;

/* loaded from: classes5.dex */
public final class i extends xk1.c implements nr0.j {

    /* renamed from: k, reason: collision with root package name */
    public final String f100235k;

    /* renamed from: l, reason: collision with root package name */
    public final x0 f100236l;

    /* renamed from: m, reason: collision with root package name */
    public final i2 f100237m;

    /* renamed from: n, reason: collision with root package name */
    public final d0 f100238n;

    /* renamed from: o, reason: collision with root package name */
    public final n1 f100239o;

    /* renamed from: p, reason: collision with root package name */
    public final g70.h f100240p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f100241q;

    /* renamed from: r, reason: collision with root package name */
    public int f100242r;

    /* renamed from: s, reason: collision with root package name */
    public fm1.c f100243s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String boardId, x0 boardRepository, i2 pinRepository, d0 pinalytics, n1 experiments, g70.h boardNavigator) {
        super(null);
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f100235k = boardId;
        this.f100236l = boardRepository;
        this.f100237m = pinRepository;
        this.f100238n = pinalytics;
        this.f100239o = experiments;
        this.f100240p = boardNavigator;
        this.f100242r = pinRepository.t();
        this.f100243s = fm1.c.VISIBLE;
        o(241213245, new h90.m(this, 2));
    }

    public static final void v(i iVar, int i13) {
        v7 v7Var = (v7) iVar.getItem(0);
        if (v7Var == null) {
            return;
        }
        u7 G1 = v7Var.G1();
        G1.E(Integer.valueOf(v7Var.l1().intValue() + i13));
        v7 a13 = G1.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        iVar.u1(0, a13);
    }

    @Override // wk1.e
    public final void E2() {
        xj2.c F = new x(this.f100237m.E(this.f100242r), new com.pinterest.framework.multisection.datasource.pagedlist.h(27, new g(this, 0)), 2).F(new f(0, new g(this, 1)), new f(1, a.f100224t), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        g(F);
    }

    @Override // nr0.g
    public final boolean c3(int i13) {
        return true;
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        return true;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 241213245;
    }

    @Override // xk1.c
    public final uj2.q k() {
        uj2.q t13 = this.f100236l.L(this.f100235k).t(new lb0.c(27, a.f100223s));
        Intrinsics.checkNotNullExpressionValue(t13, "flatMap(...)");
        return t13;
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return true;
    }

    @Override // xk1.c, wk1.e
    public final void onUnbind() {
        this.f100242r = this.f100237m.t();
        super.onUnbind();
    }
}

package x02;

import com.pinterest.api.model.v7;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d0 implements dl1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final e12.d f131314a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f131315b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f131316c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f131317d;

    public d0(e12.d boardService, x2 userRepository, b60.b activeUserManager, b0 mode) {
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f131314a = boardService;
        this.f131315b = userRepository;
        this.f131316c = activeUserManager;
        this.f131317d = mode;
    }

    @Override // dl1.a0
    public final uj2.b a(dl1.m mVar) {
        dl1.u params = (dl1.u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        boolean z13 = params instanceof g0;
        e12.d dVar = this.f131314a;
        if (z13) {
            String a13 = params.a();
            g0 g0Var = (g0) params;
            List list = g0Var.f131385f;
            return dVar.e(a13, g0Var.f131384e, list != null ? CollectionsKt.Z(list, ",", null, null, 0, null, null, 62) : null);
        }
        if (params instanceof h0) {
            return dVar.m(params.a()).e(new qb1.a(6, this, params));
        }
        if (!(params instanceof i0)) {
            fk2.h hVar = new fk2.h(new l7.w0(18), 1);
            Intrinsics.checkNotNullExpressionValue(hVar, "error(...)");
            return hVar;
        }
        String a14 = params.a();
        wy0 f13 = ((b60.d) this.f131316c).f();
        String uid = f13 != null ? f13.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        return dVar.w(a14, uid, "0");
    }

    @Override // dl1.a0
    public final uj2.b0 b(dl1.m mVar) {
        dl1.u params = (dl1.u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        int i13 = c0.f131295a[this.f131317d.ordinal()];
        e12.d dVar = this.f131314a;
        if (i13 == 1) {
            return dVar.h(params.a(), n00.b.a(n00.c.BOARD_VIEW));
        }
        if (i13 == 2) {
            return dVar.J(params.a(), n00.b.a(n00.c.AUTO_MAGICAL_BOARD_VIEW));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dl1.a0
    public final uj2.l c(dl1.m mVar, dl1.s sVar) {
        fk2.x e13;
        dl1.u params = (dl1.u) mVar;
        final v7 v7Var = (v7) sVar;
        Intrinsics.checkNotNullParameter(params, "params");
        if (params instanceof m0) {
            return this.f131314a.I(params.a(), v7Var != null ? v7Var.j1() : null, v7Var != null ? v7Var.F0() : null, v7Var != null ? v7Var.R0() : null, (v7Var == null || !kh2.d.M0(v7Var)) ? "public" : "secret", v7Var != null ? v7Var.z0() : null, v7Var != null ? v7Var.K0() : null, v7Var != null ? v7Var.P0() : null, v7Var != null ? v7Var.N0() : null).o();
        }
        boolean z13 = params instanceof n0;
        e12.d dVar = this.f131314a;
        if (z13) {
            return (((n0) params).f131452e ? dVar.i(params.a()) : dVar.D(params.a())).o();
        }
        if (params instanceof p0) {
            String a13 = params.a();
            String str = ((p0) params).f131464e;
            if (str == null) {
                wy0 f13 = ((b60.d) this.f131316c).f();
                String uid = f13 != null ? f13.getUid() : null;
                str = uid == null ? "" : uid;
            }
            return dVar.w(a13, str, "0").o();
        }
        if (params instanceof o0) {
            if (((o0) params).f131458g) {
                String a14 = params.a();
                o0 o0Var = (o0) params;
                uj2.l o13 = dVar.x(a14, o0Var.f131456e, o0Var.f131457f).o();
                Intrinsics.checkNotNullExpressionValue(o13, "toMaybe(...)");
                return o13;
            }
            String a15 = params.a();
            o0 o0Var2 = (o0) params;
            uj2.l o14 = dVar.r(a15, o0Var2.f131456e, o0Var2.f131457f).o();
            Intrinsics.checkNotNullExpressionValue(o14, "toMaybe(...)");
            return o14;
        }
        if (params instanceof r0) {
            String a16 = params.a();
            r0 r0Var = (r0) params;
            return dVar.g(a16, r0Var.f131475e, r0Var.f131476f, r0Var.f131477g).o();
        }
        if (params instanceof l0) {
            String a17 = params.a();
            l0 l0Var = (l0) params;
            return this.f131314a.y(a17, l0Var.f131440e, l0Var.f131441f, l0Var.f131442g, CollectionsKt.Z(l0Var.f131443h, ",", null, null, 0, null, null, 62)).o();
        }
        final int i13 = 1;
        if (params instanceof q0) {
            uj2.l<v7> t13 = dVar.t(((q0) params).f131468e, params.a(), n00.b.a(n00.c.BOARD_WITH_BULK_ACTION));
            jr1.a aVar = new jr1.a(19, new gw1.i(17, this, v7Var));
            t13.getClass();
            return new hk2.h(t13, aVar, i13);
        }
        if (!(params instanceof k0)) {
            hk2.c cVar = new hk2.c(new l7.w0(16), 1);
            Intrinsics.checkNotNullExpressionValue(cVar, "error(...)");
            return cVar;
        }
        if (((k0) params).f131429e) {
            final int i14 = 0;
            e13 = dVar.v(params.a()).e(new ak2.a(this) { // from class: x02.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d0 f131290b;

                {
                    this.f131290b = this;
                }

                @Override // ak2.a
                public final void run() {
                    int i15 = i14;
                    v7 v7Var2 = v7Var;
                    d0 this$0 = this.f131290b;
                    switch (i15) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.f(-1, v7Var2 != null ? kh2.d.M0(v7Var2) : false);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.f(1, v7Var2 != null ? kh2.d.M0(v7Var2) : false);
                            break;
                    }
                }
            });
        } else {
            e13 = dVar.d(params.a()).e(new ak2.a(this) { // from class: x02.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d0 f131290b;

                {
                    this.f131290b = this;
                }

                @Override // ak2.a
                public final void run() {
                    int i15 = i13;
                    v7 v7Var2 = v7Var;
                    d0 this$0 = this.f131290b;
                    switch (i15) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.f(-1, v7Var2 != null ? kh2.d.M0(v7Var2) : false);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.f(1, v7Var2 != null ? kh2.d.M0(v7Var2) : false);
                            break;
                    }
                }
            });
        }
        return e13.o();
    }

    @Override // dl1.a0
    public final uj2.b0 e(dl1.m mVar) {
        dl1.u params = (dl1.u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        if (!(params instanceof f0)) {
            return new kk2.k(new l7.w0(17), 0);
        }
        f0 f0Var = (f0) params;
        String str = f0Var.f131353d;
        boolean z13 = f0Var.f131354e;
        String str2 = z13 ? "secret" : "public";
        Boolean valueOf = Boolean.valueOf(!z13);
        Boolean valueOf2 = Boolean.valueOf(f0Var.f131358i);
        Boolean valueOf3 = Boolean.valueOf(f0Var.f131359j);
        z42.f fVar = f0Var.f131355f;
        String str3 = (fVar == null || fVar != z42.f.TRAVEL) ? null : "travel";
        z42.c cVar = f0Var.f131360k;
        kk2.m k13 = this.f131314a.B(str, f0Var.f131356g, f0Var.f131357h, str2, valueOf, valueOf2, valueOf3, str3, cVar != null ? Integer.valueOf(cVar.getValue()) : null).k(new jr1.a(20, new gw1.i(16, this, params)));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        return k13;
    }

    public final void f(int i13, boolean z13) {
        b60.b bVar = this.f131316c;
        wy0 f13 = ((b60.d) bVar).f();
        if (f13 != null) {
            int max = Math.max(f13.t2().intValue() + i13, 0);
            int max2 = z13 ? Math.max(f13.p4().intValue() + i13, 0) : f13.p4().intValue();
            vy0 H4 = f13.H4();
            H4.f43068p = Integer.valueOf(max);
            boolean[] zArr = H4.V1;
            if (zArr.length > 15) {
                zArr[15] = true;
            }
            H4.f43094x1 = Integer.valueOf(max2);
            boolean[] zArr2 = H4.V1;
            if (zArr2.length > 127) {
                zArr2[127] = true;
            }
            wy0 a13 = H4.a();
            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
            this.f131315b.W(a13);
            ((b60.d) bVar).k(a13);
        }
    }
}

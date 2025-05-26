package nk1;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.q0;
import dl1.s;
import dl1.w;
import h32.f1;
import h32.i0;
import h32.v0;
import java.util.HashMap;
import jk2.a1;
import jk2.l1;
import jk2.v;
import jk2.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.d1;
import rh1.q1;
import x02.a2;

/* loaded from: classes5.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public s f91112a;

    /* renamed from: b, reason: collision with root package name */
    public final g f91113b;

    /* renamed from: c, reason: collision with root package name */
    public final w f91114c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f91115d;

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f91116e;

    /* renamed from: f, reason: collision with root package name */
    public final Function2 f91117f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f91118g;

    /* renamed from: h, reason: collision with root package name */
    public final Function2 f91119h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f91120i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f91121j;

    /* renamed from: k, reason: collision with root package name */
    public final d1 f91122k;

    /* renamed from: l, reason: collision with root package name */
    public final uk2.f f91123l;

    /* renamed from: m, reason: collision with root package name */
    public ek2.j f91124m;

    /* renamed from: n, reason: collision with root package name */
    public ek2.j f91125n;

    /* renamed from: o, reason: collision with root package name */
    public ek2.j f91126o;

    public /* synthetic */ f(s sVar, g gVar, dl1.l lVar, Function2 function2, Function2 function22, Function2 function23, Function1 function1, Function2 function24, int i13) {
        this(sVar, gVar, lVar, function2, function22, function23, function1, function24, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0, true, null);
    }

    public static final void a(f fVar, s sVar) {
        fVar.getClass();
        boolean d2 = c0.d.d2(sVar);
        if (fVar.f91121j) {
            boolean z13 = !((Boolean) fVar.f91119h.invoke(sVar, Boolean.TRUE)).booleanValue();
            fVar.f91112a = sVar;
            fVar.f91123l.c(kh2.d.s(z13, d2));
        }
        fVar.f91116e.invoke(sVar, Boolean.valueOf(d2));
    }

    public static void b(xj2.c cVar) {
        if (cVar == null || cVar.isDisposed()) {
            return;
        }
        cVar.dispose();
    }

    public abstract uj2.q c(s sVar);

    public abstract f1 d();

    public abstract f1 e();

    public final void f() {
        int i13 = 1;
        boolean z13 = !c0.d.d2(this.f91112a);
        boolean z14 = !((Boolean) this.f91119h.invoke(this.f91112a, Boolean.valueOf(z13))).booleanValue();
        if (z14) {
            this.f91118g.invoke(this.f91112a);
            return;
        }
        if (this.f91121j) {
            this.f91112a = this.f91112a;
            this.f91123l.c(kh2.d.s(z14, z13));
        }
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar = ck2.i.f27923c;
        Function2 function2 = this.f91117f;
        boolean z15 = this.f91120i;
        if (z13) {
            s sVar = this.f91112a;
            if (z15) {
                g(sVar, d());
            }
            function2.invoke(sVar, Boolean.TRUE);
            b(this.f91124m);
            this.f91124m = (ek2.j) c(sVar).F(new q1(10, new c(this, 0)), new q1(11, new d(this, sVar, 0)), cVar, a2Var);
            return;
        }
        s sVar2 = this.f91112a;
        if (z15) {
            g(sVar2, e());
        }
        function2.invoke(sVar2, Boolean.FALSE);
        b(this.f91125n);
        this.f91125n = (ek2.j) i(sVar2).F(new q1(12, new c(this, 3)), new q1(13, new d(this, sVar2, i13)), cVar, a2Var);
    }

    public final void g(s sVar, f1 f1Var) {
        v0 v0Var;
        g gVar = this.f91113b;
        String K = kh2.j.K(gVar, this.f91122k);
        d0 d0Var = gVar.f91127a;
        if (d0Var != null) {
            String str = (String) gVar.f91132f.invoke();
            String f39332b = str == null ? sVar.getF39332b() : str;
            i0 i0Var = gVar.f91128b;
            if (i0Var == null) {
                i0Var = new i0(null, null, null, null, null, null);
            }
            i0 i0Var2 = i0Var;
            HashMap hashMap = (HashMap) gVar.f91133g.invoke();
            if (K != null) {
                v0Var = new v0();
                v0Var.G = K;
            } else {
                v0Var = null;
            }
            d0Var.W(f1Var, f39332b, i0Var2, hashMap, v0Var, false);
        }
    }

    public final a1 h() {
        b(this.f91126o);
        String f39332b = this.f91112a.getF39332b();
        Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
        l1 A = new x(((q0) this.f91114c).C(f39332b), new d51.a(26, new c(this, 1)), 2).A(wj2.c.a());
        q1 q1Var = new q1(14, new c(this, 2));
        q1 q1Var2 = new q1(15, e.f91111i);
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        this.f91126o = (ek2.j) A.F(q1Var, q1Var2, cVar, a2Var);
        g51.h hVar = new g51.h(this, 15);
        uk2.f fVar = this.f91123l;
        fVar.getClass();
        a1 a1Var = new a1(new v(fVar, a2Var, hVar, 1));
        Intrinsics.checkNotNullExpressionValue(a1Var, "hide(...)");
        return a1Var;
    }

    public abstract uj2.q i(s sVar);

    public f(s followableModel, g followActionLoggingContext, dl1.l modelUpdatesSource, Function2 followActionSuccess, Function2 followActionFailure, Function2 followActionInitiated, Function1 followActionNotAllowed, Function2 isFollowActionAllowed, boolean z13, boolean z14, d1 d1Var) {
        Intrinsics.checkNotNullParameter(followableModel, "followableModel");
        Intrinsics.checkNotNullParameter(followActionLoggingContext, "followActionLoggingContext");
        Intrinsics.checkNotNullParameter(modelUpdatesSource, "modelUpdatesSource");
        Intrinsics.checkNotNullParameter(followActionSuccess, "followActionSuccess");
        Intrinsics.checkNotNullParameter(followActionFailure, "followActionFailure");
        Intrinsics.checkNotNullParameter(followActionInitiated, "followActionInitiated");
        Intrinsics.checkNotNullParameter(followActionNotAllowed, "followActionNotAllowed");
        Intrinsics.checkNotNullParameter(isFollowActionAllowed, "isFollowActionAllowed");
        this.f91112a = followableModel;
        this.f91113b = followActionLoggingContext;
        this.f91114c = modelUpdatesSource;
        this.f91115d = followActionSuccess;
        this.f91116e = followActionFailure;
        this.f91117f = followActionInitiated;
        this.f91118g = followActionNotAllowed;
        this.f91119h = isFollowActionAllowed;
        this.f91120i = z13;
        this.f91121j = z14;
        this.f91122k = d1Var;
        this.f91123l = cb.r("create(...)");
    }
}

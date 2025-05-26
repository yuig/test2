package w01;

import com.pinterest.api.model.az0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.lx0;
import com.pinterest.api.model.z2;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import nx.d1;
import rq.p2;
import x02.a2;
import x02.i2;
import x02.p1;

/* loaded from: classes5.dex */
public final class x extends i01.c implements i01.v {

    /* renamed from: a, reason: collision with root package name */
    public f30 f127120a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f127121b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f127122c;

    /* renamed from: d, reason: collision with root package name */
    public final x02.u f127123d;

    /* renamed from: e, reason: collision with root package name */
    public final p1 f127124e;

    /* renamed from: f, reason: collision with root package name */
    public final m60.w f127125f;

    /* renamed from: g, reason: collision with root package name */
    public final hs.d f127126g;

    /* renamed from: h, reason: collision with root package name */
    public final z20.c f127127h;

    /* renamed from: i, reason: collision with root package name */
    public final d1 f127128i;

    /* renamed from: j, reason: collision with root package name */
    public lh0.a0 f127129j;

    /* renamed from: k, reason: collision with root package name */
    public final uk1.d f127130k;

    /* renamed from: l, reason: collision with root package name */
    public xj2.b f127131l;

    /* renamed from: m, reason: collision with root package name */
    public rp0.d f127132m;

    /* renamed from: n, reason: collision with root package name */
    public qh1.f f127133n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f127134o;

    /* renamed from: p, reason: collision with root package name */
    public final v f127135p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(i2 pinRepository, uk1.e presenterPinalyticsFactory, b60.b activeUserManager, x02.u aggregatedCommentRepository, p1 didItRepository, m60.w eventManager, hs.d moduleViewabilityHelper, z20.c unifiedCommentService, d1 trackingParamAttacher) {
        super(0);
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(aggregatedCommentRepository, "aggregatedCommentRepository");
        Intrinsics.checkNotNullParameter(didItRepository, "didItRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(moduleViewabilityHelper, "moduleViewabilityHelper");
        Intrinsics.checkNotNullParameter(unifiedCommentService, "unifiedCommentService");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        this.f127120a = null;
        this.f127121b = pinRepository;
        this.f127122c = activeUserManager;
        this.f127123d = aggregatedCommentRepository;
        this.f127124e = didItRepository;
        this.f127125f = eventManager;
        this.f127126g = moduleViewabilityHelper;
        this.f127127h = unifiedCommentService;
        this.f127128i = trackingParamAttacher;
        this.f127130k = ((uk1.a) presenterPinalyticsFactory).g();
        this.f127135p = new v(this);
    }

    public static final void p3(x xVar, rp0.d dVar) {
        f30 f30Var = xVar.f127120a;
        if (f30Var == null) {
            return;
        }
        String v13 = dVar.v();
        rp0.d dVar2 = xVar.f127132m;
        if (Intrinsics.d(v13, dVar2 != null ? dVar2.v() : null)) {
            xVar.f127132m = dVar;
            ((p2) ((i01.w) xVar.getView())).i(f30Var, xVar.f127132m);
        }
    }

    public static rp0.d q3(lx0 lx0Var) {
        az0 q13 = lx0Var.q();
        z2 k13 = lx0Var.k();
        if (q13 != null) {
            return new rp0.c(q13);
        }
        if (k13 != null) {
            return new rp0.b(k13);
        }
        return null;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        yk1.n view = (i01.w) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((p2) view).f109464f = this;
        this.f127125f.h(this.f127135p);
        f30 f30Var = this.f127120a;
        String uid = f30Var != null ? f30Var.getUid() : null;
        if (uid != null) {
            addDisposable(nl.b.s(this.f127121b.S(uid), new w(this, 1), null, null, 6));
        }
        xj2.b bVar = new xj2.b();
        addDisposable(bVar);
        this.f127131l = bVar;
    }

    @Override // yk1.b
    public final void onUnbind() {
        this.f127125f.j(this.f127135p);
        super.onUnbind();
    }

    public final void r3() {
        f30 f30Var = this.f127120a;
        if (f30Var == null) {
            return;
        }
        xj2.c o13 = this.f127127h.a(b40.g(f30Var), n00.b.a(n00.c.UNIFIED_COMMENTS_PREVIEW_FIELDS), SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE).r(tk2.e.f118017c).l(wj2.c.a()).o(new h(10, new ky0.b(13, this, f30Var)), new h(11, new w(this, 0)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    public final void s3() {
        xj2.b bVar = this.f127131l;
        if (bVar != null) {
            bVar.d();
            uj2.q B = this.f127123d.B();
            h hVar = new h(12, new w(this, 2));
            h hVar2 = new h(13, b.K);
            ck2.c cVar = ck2.i.f27923c;
            a2 a2Var = ck2.i.f27924d;
            bVar.a(B.F(hVar, hVar2, cVar, a2Var));
            bVar.a(this.f127124e.B().F(new h(14, new w(this, 3)), new h(15, b.L), cVar, a2Var));
        }
    }

    @Override // i01.c
    public final void updatePin(f30 updatedPin) {
        f3 z33;
        Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
        this.f127120a = updatedPin;
        if (isBound()) {
            lh0.a0 a0Var = this.f127129j;
            if (a0Var == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) a0Var.f83294a;
            if (!g1Var.o("android_closeup_comments_api_call_dedup", "enabled", z3Var) && !g1Var.l("android_closeup_comments_api_call_dedup")) {
                r3();
                return;
            }
            f30 f30Var = this.f127120a;
            if (f30Var == null || b40.g(f30Var).length() <= 0) {
                return;
            }
            f30 f30Var2 = this.f127120a;
            if ((f30Var2 == null || (z33 = f30Var2.z3()) == null || z33.F().intValue() != 0) && !this.f127134o) {
                this.f127134o = true;
                r3();
            }
        }
    }
}

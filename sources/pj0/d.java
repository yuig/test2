package pj0;

import android.os.Bundle;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import g4.u;
import java.util.LinkedHashMap;
import jk2.j1;
import jk2.u0;
import jk2.x;
import kotlin.jvm.internal.Intrinsics;
import lh0.t;
import m60.w;
import nx.b0;
import nx.d1;
import qa2.h0;
import qz.f0;
import uj2.a0;
import x02.a2;
import x02.i2;

/* loaded from: classes5.dex */
public abstract class d extends com.pinterest.framework.multisection.datasource.pagedlist.c implements mj0.g {
    public final String L;
    public final String M;
    public final i2 N;
    public final u O;
    public final qa2.n P;
    public int Q;
    public final LinkedHashMap R;
    public final LinkedHashMap S;
    public final oj0.f T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String boardId, String str, String remoteUrl, boolean z13, i2 pinRepository, uk1.d presenterPinalytics, com.pinterest.feature.pin.j pinAction, d1 trackingParamAttacher, qa2.n gridFeatureConfig, nr0.l viewBinderDelegate, com.pinterest.feature.pin.r repinAnimationUtil, w eventManager, oj0.b saveActionLoggingData, b0 pinAuxHelper, t tVar) {
        super(remoteUrl, viewBinderDelegate, null, null, null, null, null, null, null, 0L, null, 8188);
        u videoUtil = or.a.f97245a;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(videoUtil, "videoUtil");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinAction, "pinAction");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(gridFeatureConfig, "gridFeatureConfig");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(saveActionLoggingData, "saveActionLoggingData");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.L = boardId;
        this.M = str;
        this.N = pinRepository;
        this.O = videoUtil;
        this.P = gridFeatureConfig;
        this.Q = pinRepository.t();
        this.R = new LinkedHashMap();
        this.S = new LinkedHashMap();
        oj0.f fVar = new oj0.f(boardId, str, presenterPinalytics, trackingParamAttacher, pinRepository, repinAnimationUtil, eventManager, pinAction, saveActionLoggingData, new u60.l(this, 5), null, null, pinAuxHelper, 7168);
        this.T = fVar;
        int[] iArr = mj0.j.f87276a;
        mj0.j.a(this, gridFeatureConfig.f103320a, fVar, z13, null, tVar, 16);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, wk1.e
    public final void E2() {
        super.E2();
        uj2.q E = this.N.E(this.Q);
        int i13 = 2;
        dh0.a aVar = new dh0.a(26, new b(this, i13));
        dh0.a aVar2 = new dh0.a(27, a.f100217m);
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        xj2.c F = E.F(aVar, aVar2, cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        u(F);
        uk2.d dVar = gb2.f.f64748b;
        qt.a aVar3 = new qt.a(6, a.f100218n);
        dVar.getClass();
        int i14 = 0;
        xj2.c F2 = new x(new u0(new x(pk2.f.j(new j1(dVar, aVar3, 0), new qt.b(6, a.f100219o), 2, "filter(...)"), new com.pinterest.framework.multisection.datasource.pagedlist.h(25, a.f100220p), i13), ck2.i.f27921a, i14), new com.pinterest.framework.multisection.datasource.pagedlist.h(26, a.f100221q), i13).F(new dh0.a(28, new b(this, 3)), new dh0.a(29, a.f100222r), cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F2, "subscribe(...)");
        u(F2);
        a0 a0Var = tk2.e.f118017c;
        mk2.k kVar = gl1.c.f65741g;
        x xVar = new x(new j1(new j1(pk2.f.j(new j1(dVar, new qt.a(6, a.f100214j), 0), new qt.b(6, a.f100215k), 2, "filter(...)"), new f5.g(false, 0), 0), new qt.a(6, new b(this, i14)), 0), new qt.b(6, a.f100216l), i13);
        if (a0Var != null) {
            xVar.H(a0Var);
        }
        if (kVar != null) {
            xVar.A(kVar);
        }
        xj2.c F3 = xVar.F(new rr.c(1, new b(this, 1)), ck2.i.f27925e, cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F3, "subscribe(...)");
        u(F3);
    }

    @Override // mj0.g
    public final boolean a6(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return this.T.a6(pin);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0, wt1.c
    public final void b(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.b(bundle);
        this.Q = bundle.getInt("ONE_TAP_SAVE_PRESENTER_PIN_ID");
    }

    public f0 f0() {
        return this.f49121k;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        wa2.p pVar;
        dl1.s item = getItem(i13);
        if (!(item instanceof f30)) {
            return this.E.getItemViewType(i13);
        }
        f30 f30Var = (f30) item;
        gb2.i iVar = (gb2.i) this.R.get(f30Var.getId());
        if (iVar == null || (pVar = iVar.f64754b) == null) {
            pVar = wa2.p.STATE_NO_FEEDBACK;
        }
        boolean z13 = this.P.f103320a.f128775i && pVar != wa2.p.STATE_NO_FEEDBACK;
        wa2.a0 a0Var = (wa2.a0) this.S.get(f30Var.getId());
        if (z13) {
            return (!b40.B0(f30Var) || hf0.b.q()) ? RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN;
        }
        Boolean Q5 = f30Var.Q5();
        Intrinsics.checkNotNullExpressionValue(Q5, "getPromotedIsMaxVideo(...)");
        if (Q5.booleanValue()) {
            return 6;
        }
        this.O.getClass();
        if (b40.X0(f30Var)) {
            return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL;
        }
        if (b40.r0(f30Var)) {
            return 160;
        }
        if (a0Var == wa2.a0.PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION_FOR_REPIN_ANIMATION) {
            return 10;
        }
        return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean h(int i13) {
        dl1.s item = getItem(i13);
        if ((item instanceof vh) && Intrinsics.d(((vh) item).q(), "homefeed_more_ideas_educational_header")) {
            return false;
        }
        return this.E.h(i13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0, wt1.c
    public final void l(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.l(bundle);
        bundle.putInt("ONE_TAP_SAVE_PRESENTER_PIN_ID", this.N.t());
    }

    @Override // mj0.g
    public void l2(f30 pin, h0 h0Var) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.T.l2(pin, h0Var);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0, wt1.b
    public void n() {
        this.f49121k = f0();
        super.n();
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.h0, wk1.e
    public final void onUnbind() {
        this.Q = this.N.t();
        this.T.c();
        super.onUnbind();
    }

    public /* synthetic */ d(String str, String str2, boolean z13, i2 i2Var, uk1.d dVar, com.pinterest.feature.pin.j jVar, d1 d1Var, qa2.n nVar, nr0.l lVar, com.pinterest.feature.pin.r rVar, w wVar, oj0.b bVar, b0 b0Var, int i13) {
        this(str, null, str2, z13, i2Var, dVar, jVar, d1Var, nVar, lVar, rVar, wVar, (i13 & 8192) != 0 ? new oj0.b(null, null, null, 7) : bVar, b0Var, null);
    }
}

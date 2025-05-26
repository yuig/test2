package u60;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import jk2.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a3;
import nx.b0;
import nx.d1;
import qa2.h0;
import qz.f0;
import x02.i2;
import x02.x0;

/* loaded from: classes5.dex */
public final class n extends pj0.d {
    public final uk1.d U;
    public final yk1.v V;
    public final Function0 W;
    public final com.pinterest.feature.board.detail.b X;
    public final i92.k Y;
    public final x0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final a3 f120792a0;

    /* renamed from: b0, reason: collision with root package name */
    public final g70.h f120793b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f120794c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f120795d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String boardId, String remoteUrl, i2 pinRepository, uk1.d presenterPinalytics, com.pinterest.feature.pin.j pinAction, d1 trackingParamAttacher, qa2.n gridFeatureConfig, yk1.v viewResources, nr0.l viewBinderDelegate, com.pinterest.feature.pin.r repinAnimationUtil, m60.w eventManager, hl0.c shouldLoad, com.pinterest.feature.board.detail.b boardViewListener, i92.k toastUtils, x0 boardRepository, a3 a3Var, b0 pinAuxHelper, g70.h boardNavigator) {
        super(boardId, remoteUrl, true, pinRepository, presenterPinalytics, pinAction, trackingParamAttacher, gridFeatureConfig, viewBinderDelegate, repinAnimationUtil, eventManager, new oj0.b(g0.BOARD_MORE_IDEAS_ENDLESS_SCROLL, null, null, 6), pinAuxHelper, 32768);
        g4.u videoUtil = or.a.f97245a;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(videoUtil, "videoUtil");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinAction, "pinAction");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(gridFeatureConfig, "gridFeatureConfig");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(shouldLoad, "shouldLoad");
        Intrinsics.checkNotNullParameter(boardViewListener, "boardViewListener");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.U = presenterPinalytics;
        this.V = viewResources;
        this.W = shouldLoad;
        this.X = boardViewListener;
        this.Y = toastUtils;
        this.Z = boardRepository;
        this.f120792a0 = a3Var;
        this.f120793b0 = boardNavigator;
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.BOARD_PIN_FEED));
        this.f49121k = f0Var;
        int[] iArr = mj0.j.f87276a;
        mj0.j.a(this, wa2.i.a(gridFeatureConfig.f103320a, false, false, false, false, false, false, false, null, null, null, null, -8388609, -1, 1023), this, true, null, null, 48);
    }

    @Override // wt1.b
    public final boolean i() {
        return ((Boolean) this.W.invoke()).booleanValue();
    }

    @Override // pj0.d, mj0.g
    public final void l2(f30 pin, h0 h0Var) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (a6(pin)) {
            this.Y.o(((yk1.a) this.V).f139224a.getString(f70.c.pin_deleted));
        } else if (!this.f120794c0) {
            jk2.m S = this.Z.S(this.L);
            hk2.b bVar = new hk2.b(new g(2, new hs.a(26, this, pin)), new g(3, new mz.c(this, 10)), ck2.i.f27923c);
            try {
                S.d(new d0(bVar, 0L));
                Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
                u(bVar);
            } catch (NullPointerException e13) {
                throw e13;
            } catch (Throwable th3) {
                throw n60.o.g(th3, "subscribeActual failed", th3);
            }
        }
        ((hl0.v) this.X).Z = true;
        super.l2(pin, h0Var);
    }

    @Override // pj0.d, com.pinterest.framework.multisection.datasource.pagedlist.h0, wt1.b
    public final void n() {
        super.n();
        if (!i() || this.f120795d0) {
            return;
        }
        nx.d0 d0Var = this.U.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.VIEW, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : g0.BOARD_MORE_IDEAS_ENDLESS_SCROLL, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        this.f120795d0 = true;
    }
}

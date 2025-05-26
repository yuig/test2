package dv0;

import android.content.Context;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.metadata.model.PinEditAdvanceMeta;
import dl1.t;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import jk2.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import m60.w;
import nx.d0;
import sq0.c0;
import x02.i2;
import x02.x2;

/* loaded from: classes5.dex */
public final class o extends wk1.q implements av0.j {

    /* renamed from: a, reason: collision with root package name */
    public final PinEditAdvanceMeta f56371a;

    /* renamed from: b, reason: collision with root package name */
    public final t f56372b;

    /* renamed from: c, reason: collision with root package name */
    public final ag1.b f56373c;

    /* renamed from: d, reason: collision with root package name */
    public final w f56374d;

    /* renamed from: e, reason: collision with root package name */
    public final l f56375e;

    /* renamed from: f, reason: collision with root package name */
    public final xk1.c f56376f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, du0.b presenterPinalytics, PinEditAdvanceMeta pinEditAdvanceMeta, uj2.q networkStateStream, t storyPinLocalDataRepository, ag1.b dataManager, i2 pinRepository, x2 userRepository, s1 experiments, w eventManager, b60.b activeUserManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f56371a = pinEditAdvanceMeta;
        this.f56372b = storyPinLocalDataRepository;
        this.f56373c = dataManager;
        this.f56374d = eventManager;
        this.f56375e = new l(this);
        this.f56376f = pinEditAdvanceMeta != null ? new bv0.d(context, experiments, this, this, this, pinEditAdvanceMeta, activeUserManager, this, userRepository) : new bv0.g(context, dataManager.d(), this, this, this, this, storyPinLocalDataRepository, userRepository, experiments, activeUserManager);
    }

    public static /* synthetic */ void x3(o oVar, boolean z13, Function1 function1, int i13) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        if ((i13 & 2) != 0) {
            function1 = c.f56309w;
        }
        oVar.w3(function1, z13);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f56376f);
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        w wVar = this.f56374d;
        PinEditAdvanceMeta pinEditAdvanceMeta = this.f56371a;
        if (pinEditAdvanceMeta != null) {
            wVar.d(new f11.a(pinEditAdvanceMeta.f46541g, Boolean.valueOf(pinEditAdvanceMeta.f46537c), Boolean.valueOf(pinEditAdvanceMeta.f46538d), pinEditAdvanceMeta.f46542h));
        } else {
            x3(this, true, null, 2);
        }
        wVar.j(this.f56375e);
        super.onUnbind();
    }

    public final void t3(wy0 wy0Var, boolean z13) {
        int i13 = 9;
        PinEditAdvanceMeta pinEditAdvanceMeta = this.f56371a;
        xk1.c cVar = this.f56376f;
        int i14 = 1;
        int i15 = 0;
        if (z13) {
            c cVar2 = c.f56304r;
            if (pinEditAdvanceMeta != null) {
                pinEditAdvanceMeta.f46542h = (String) cVar2.invoke(null);
                cVar.i2();
            } else {
                w3(new t90.n(i13, cVar2), false);
            }
        } else if (wy0Var != null) {
            av0.k kVar = (av0.k) getView();
            String Z2 = wy0Var.Z2();
            if (Z2 == null) {
                Z2 = "";
            }
            ((fv0.b) kVar).W8(Z2, new m(this, i15), new m(this, i14));
        } else {
            c cVar3 = c.f56306t;
            if (pinEditAdvanceMeta != null) {
                pinEditAdvanceMeta.f46542h = (String) cVar3.invoke(null);
                cVar.i2();
            } else {
                w3(new t90.n(i13, cVar3), false);
            }
        }
        boolean z14 = !z13;
        if (cVar instanceof bv0.g) {
            x3(this, false, new r1.f(this, z14, 22), 1);
        }
        d0 pinalytics = getPinalytics();
        f1 f1Var = z13 ? f1.TOGGLE_ON : f1.TOGGLE_OFF;
        u0 u0Var = u0.STORY_PIN_PARTNERSHIP_TOGGLE;
        HashMap hashMap = new HashMap();
        hashMap.put("display_mode", z13 ? "on" : "off");
        Unit unit = Unit.f80348a;
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(av0.k view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        w wVar = this.f56374d;
        l lVar = this.f56375e;
        wVar.h(lVar);
        if (this.f56371a != null) {
            wVar.h(lVar);
        }
    }

    public final void v3(boolean z13) {
        PinEditAdvanceMeta pinEditAdvanceMeta = this.f56371a;
        if (pinEditAdvanceMeta != null) {
            pinEditAdvanceMeta.f46537c = z13;
            return;
        }
        x3(this, false, new rn0.d(z13, 29), 1);
        d0 pinalytics = getPinalytics();
        f1 f1Var = z13 ? f1.TOGGLE_ON : f1.TOGGLE_OFF;
        g0 g0Var = g0.STORY_PIN_CREATE_FINISHING_TOUCHES;
        u0 u0Var = u0.STORY_PIN_TURN_OFF_COMMENTS_TOGGLE;
        HashMap hashMap = new HashMap();
        hashMap.put("display_mode", z13 ? "on" : "off");
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public final void w3(Function1 function1, boolean z13) {
        e0 M = ((dl1.l) this.f56372b).M(this.f56373c.d());
        hk2.b bVar = new hk2.b(new mu0.a(25, new s1.w(function1, z13, this, 11)), new mu0.a(26, c.f56310x), ck2.i.f27923c);
        M.f(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        addDisposable(bVar);
    }
}

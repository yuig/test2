package hx1;

import android.content.res.Resources;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import uj2.b0;
import uj2.q;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes4.dex */
public final class j extends t {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f70546a;

    /* renamed from: b, reason: collision with root package name */
    public final px.a f70547b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f70548c;

    /* renamed from: d, reason: collision with root package name */
    public final w f70549d;

    /* renamed from: e, reason: collision with root package name */
    public gx1.f f70550e;

    /* renamed from: f, reason: collision with root package name */
    public gx1.f f70551f;

    /* renamed from: g, reason: collision with root package name */
    public gx1.d f70552g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(uk1.d presenterPinalytics, q networkStateStream, Resources viewResources, px.c analyticsRepository, b60.b activeUserManager, w eventManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f70546a = viewResources;
        this.f70547b = analyticsRepository;
        this.f70548c = activeUserManager;
        this.f70549d = eventManager;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        a view = (a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "audienceInsightsListener");
        ((f) view).f70540t0 = this;
    }

    public final void p3(gx1.d audienceType) {
        gx1.f fVar;
        Intrinsics.checkNotNullParameter(audienceType, "audienceType");
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.DROPDOWN_CHANGE;
        g0 g0Var = g0.ANALYTICS_AUDIENCE_MOBILE_SECTION;
        u0 u0Var = u0.INSIGHTS_AUDIENCE_SELECT_LIST;
        HashMap hashMap = new HashMap();
        gx1.d dVar = this.f70552g;
        if (dVar != null) {
            String paramName = dVar.getParamName();
            Intrinsics.f(paramName);
            hashMap.put("analytics_previous_value", paramName);
        }
        hashMap.put("analytics_next_value", audienceType.getParamName());
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        if (audienceType == gx1.d.TOTAL_AUDIENCE) {
            fVar = this.f70550e;
            if (fVar == null) {
                Intrinsics.r("totalAudience");
                throw null;
            }
        } else {
            fVar = this.f70551f;
            if (fVar == null) {
                Intrinsics.r("engagedAudience");
                throw null;
            }
        }
        gx1.f fVar2 = fVar;
        this.f70552g = audienceType;
        a aVar = (a) getView();
        gx1.f fVar3 = this.f70550e;
        if (fVar3 == null) {
            Intrinsics.r("totalAudience");
            throw null;
        }
        if (fVar3 == null) {
            Intrinsics.r("totalAudience");
            throw null;
        }
        gx1.f fVar4 = this.f70551f;
        if (fVar4 == null) {
            Intrinsics.r("engagedAudience");
            throw null;
        }
        if (fVar4 == null) {
            Intrinsics.r("engagedAudience");
            throw null;
        }
        ((f) aVar).b8(new gx1.h(new gx1.e(fVar3.f66294c, fVar4.f66294c, fVar2, fVar3.f66297f, fVar4.f66297f, (fVar2.f66300i.f88472b.isEmpty() ^ true) && yb2.a.b(((b60.d) this.f70548c).f()), audienceType)));
    }

    public final void q3(gx1.d audienceType) {
        Intrinsics.checkNotNullParameter(audienceType, "audienceType");
        ((f) ((a) getView())).b8(gx1.g.f66303g);
        if (this.f70550e != null && this.f70551f != null) {
            p3(audienceType);
            return;
        }
        Intrinsics.checkNotNullParameter(audienceType, "audienceType");
        b60.b bVar = this.f70548c;
        String id3 = com.bumptech.glide.d.Q(bVar).getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        px.c cVar = (px.c) this.f70547b;
        kk2.t g13 = cVar.g(id3);
        String id4 = com.bumptech.glide.d.Q(bVar).getId();
        Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
        kk2.t b13 = cVar.b(id4);
        wy0 f13 = ((b60.d) bVar).f();
        addDisposable(b0.v(g13, b13, new ep.g(24, new h(this, f13 != null ? f13.G2() : null))).r(tk2.e.f118017c).l(wj2.c.a()).o(new ru1.d(16, new i(this, audienceType)), new ru1.d(17, new b(this, 1))));
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        a view = (a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "audienceInsightsListener");
        ((f) view).f70540t0 = this;
    }
}

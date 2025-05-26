package gx;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ao2.j0;
import com.pinterest.api.model.h2;
import df.j1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.v;
import o82.u0;
import o82.y0;
import u50.r;
import uj2.q;

/* loaded from: classes3.dex */
public final class m extends LinearLayout implements yk1.n, v {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f66260l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f66261a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f66262b;

    /* renamed from: c, reason: collision with root package name */
    public final q f66263c;

    /* renamed from: d, reason: collision with root package name */
    public final ni0.e f66264d;

    /* renamed from: e, reason: collision with root package name */
    public final uk1.e f66265e;

    /* renamed from: f, reason: collision with root package name */
    public final hs.d f66266f;

    /* renamed from: g, reason: collision with root package name */
    public r f66267g;

    /* renamed from: h, reason: collision with root package name */
    public final pi0.f f66268h;

    /* renamed from: i, reason: collision with root package name */
    public final ex.e f66269i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f66270j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f66271k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, j0 scope, d0 pinalytics, q networkStateStream, ni0.e adsCarouselPresenterFactory, uk1.e presenterPinAnalyticsFactory, hs.d moduleViewabilityHelper) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(adsCarouselPresenterFactory, "adsCarouselPresenterFactory");
        Intrinsics.checkNotNullParameter(presenterPinAnalyticsFactory, "presenterPinAnalyticsFactory");
        Intrinsics.checkNotNullParameter(moduleViewabilityHelper, "moduleViewabilityHelper");
        this.f66261a = context;
        this.f66262b = pinalytics;
        this.f66263c = networkStateStream;
        this.f66264d = adsCarouselPresenterFactory;
        this.f66265e = presenterPinAnalyticsFactory;
        this.f66266f = moduleViewabilityHelper;
        xk2.v b13 = xk2.m.b(new l(this, 2));
        this.f66270j = xk2.m.b(new l(this, 1));
        this.f66271k = xk2.m.b(new l(this, 0));
        addView((LinearLayout) b13.getValue());
        pi0.f fVar = new pi0.f(context, pinalytics, scope, (String) null, 24);
        this.f66268h = fVar;
        ex.e eVar = new ex.e(context, scope, true, new a8.v(this, 20), 6);
        eVar.setPaddingRelative(0, 0, 0, bs1.c.W(eVar, eo1.c.space_100));
        this.f66269i = eVar;
        ((LinearLayout) b13.getValue()).addView(fVar);
        ((LinearLayout) b13.getValue()).addView(eVar);
    }

    public final void a(a displayState) {
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        if (displayState.f66241a != null) {
            ((ni0.d) this.f66270j.getValue()).I3(0, displayState.f66241a, this.f66268h);
        }
        List items = displayState.f66242b;
        items.isEmpty();
        ex.e eVar = this.f66269i;
        int i13 = 1;
        if (eVar != null) {
            Intrinsics.checkNotNullParameter(items, "items");
            if (items.size() < 2) {
                eVar.setVisibility(8);
            } else {
                eVar.f60373f = items;
                List<h2> subList = items.size() > 2 ? items.subList(1, 3) : items;
                ArrayList arrayList = new ArrayList(g0.q(subList, 10));
                for (h2 h2Var : subList) {
                    arrayList.add(new u0(new fx.c(h2Var, 2), i13, String.valueOf(h2Var.m())));
                }
                eVar.f60372e = arrayList;
                eVar.f60371d.A(new y0(arrayList, null, false, 6)).b(eVar.f60370c);
            }
        }
        if (items.size() > 1 && (constraintLayout = (ConstraintLayout) this.f66271k.getValue()) != null) {
            constraintLayout.setOnClickListener(new tq.j(this, 15));
        }
        this.f66268h.f100196o.setVisibility(8);
        j1.A0(this.f66268h.f100195n);
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return e0.b(this.f66268h);
    }

    @Override // nx.v
    public final /* bridge */ /* synthetic */ Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final /* bridge */ /* synthetic */ Object markImpressionStart() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xk2.v vVar = this.f66270j;
        ((ni0.d) vVar.getValue()).bind(this.f66268h);
        ((ni0.d) vVar.getValue()).activate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xk2.v vVar = this.f66270j;
        ((ni0.d) vVar.getValue()).unbind();
        ((ni0.d) vVar.getValue()).deactivate();
    }
}

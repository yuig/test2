package ss;

import android.view.View;
import android.widget.TextSwitcher;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.api.model.f30;
import com.pinterest.feature.pincarouselads.view.CarouselIndexView;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import eb2.k;
import iv.e;
import java.util.ArrayList;
import kg.t;
import kh2.g0;
import kh2.k3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.a0;
import m60.w;
import rq.p0;
import rq.r0;
import uj2.q;
import uk1.d;
import xk2.m;
import xk2.v;
import yk1.c;
import yk1.n;
import yk1.r;

/* loaded from: classes3.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final w f115129a;

    /* renamed from: b, reason: collision with root package name */
    public final j80.b f115130b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f115131c;

    /* renamed from: d, reason: collision with root package name */
    public f30 f115132d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f115133e;

    /* renamed from: f, reason: collision with root package name */
    public int f115134f;

    /* renamed from: g, reason: collision with root package name */
    public final v f115135g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d presenterPinalytics, q networkStateStream, w eventManager, j80.b carouselUtil, a0 closeupExperiments) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(closeupExperiments, "closeupExperiments");
        this.f115129a = eventManager;
        this.f115130b = carouselUtil;
        this.f115131c = closeupExperiments;
        this.f115135g = m.b(new lr.v(this, 4));
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        rs.b view = (rs.b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((p0) view).C = this;
    }

    public final void q3(f30 pin) {
        e eVar;
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f115132d = pin;
        int a13 = (j1.B0(pin) || ph.a.f0(pin)) ? this.f115134f : this.f115130b.a(pin);
        if (isBound()) {
            ArrayList viewModels = j1.B0(pin) ? t.F(pin) : CollectionsKt.H0(g0.B(pin, this.f115131c));
            p0 p0Var = (p0) ((rs.b) getView());
            p0Var.getClass();
            Intrinsics.checkNotNullParameter(viewModels, "viewModels");
            p0Var.f109450r = viewModels;
            CloseupCarouselView closeupCarouselView = p0Var.f109452t;
            if (closeupCarouselView == null) {
                Intrinsics.r("carouselView");
                throw null;
            }
            hs.d dVar = closeupCarouselView.C;
            if (dVar == null) {
                Intrinsics.r("moduleViewabilityHelper");
                throw null;
            }
            boolean a14 = dVar.a();
            r0 r0Var = p0Var.f109438f;
            if (a14) {
                closeupCarouselView.g(eo1.c.space_100);
            } else if (r0Var.f109505e) {
                int i13 = eo1.c.space_100;
                if (closeupCarouselView.f35436w == null) {
                    k kVar = new k(true, bs1.c.W(closeupCarouselView, i13), 0, bs1.c.W(closeupCarouselView, i13), 0);
                    closeupCarouselView.getPinterestRecyclerView().a(kVar);
                    closeupCarouselView.f35436w = kVar;
                }
            } else if (r0Var.f109501a && !r0Var.f109503c) {
                closeupCarouselView.g(eo1.c.margin_half);
            }
            boolean z13 = r0Var.f109501a;
            if (z13) {
                boolean z14 = false;
                boolean z15 = z13 && !r0Var.f109503c;
                if (z13 && hf0.b.q()) {
                    z14 = true;
                }
                eVar = new e(z13, z15, z14, r0Var.f109505e);
            } else {
                eVar = null;
            }
            closeupCarouselView.f35433t = eVar;
            CloseupCarouselView.k(closeupCarouselView, viewModels, null, null, null, r0Var.f109505e, 14);
            CarouselIndexView carouselIndexView = p0Var.f109456x;
            if (carouselIndexView == null) {
                Intrinsics.r("indexTrackerView");
                throw null;
            }
            carouselIndexView.d(viewModels.size());
            this.f115133e = viewModels;
            this.f115134f = a13;
            rs.b bVar = (rs.b) getView();
            int i14 = this.f115134f;
            p0 p0Var2 = (p0) bVar;
            CloseupCarouselView closeupCarouselView2 = p0Var2.f109452t;
            if (closeupCarouselView2 == null) {
                Intrinsics.r("carouselView");
                throw null;
            }
            closeupCarouselView2.getPinterestRecyclerView().f52535e.M0(i14);
            closeupCarouselView2.f35424k = i14;
            p0Var2.e(i14);
            rs.b bVar2 = (rs.b) getView();
            int i15 = this.f115134f;
            p0 p0Var3 = (p0) bVar2;
            CarouselIndexView carouselIndexView2 = p0Var3.f109456x;
            if (carouselIndexView2 == null) {
                Intrinsics.r("indexTrackerView");
                throw null;
            }
            carouselIndexView2.e(i15);
            p0Var3.e(i15);
            r3(this.f115134f);
        }
    }

    public final void r3(int i13) {
        ArrayList arrayList = this.f115133e;
        if (arrayList != null) {
            m21.a aVar = (i13 < 0 || i13 >= arrayList.size()) ? null : (m21.a) arrayList.get(i13);
            if (aVar == null) {
                return;
            }
            String title = aVar.getTitle();
            String description = aVar.getDescription();
            boolean z13 = false;
            boolean z14 = !(title == null || title.length() == 0);
            boolean z15 = (z14 || description == null || description.length() == 0) ? false : true;
            if (!z14) {
                title = description;
            }
            if (z15) {
                description = "";
            }
            p0 p0Var = (p0) ((rs.b) getView());
            TextSwitcher textSwitcher = p0Var.f109454v;
            if (textSwitcher == null) {
                Intrinsics.r("carouselTitle");
                throw null;
            }
            View currentView = textSwitcher.getCurrentView();
            Intrinsics.g(currentView, "null cannot be cast to non-null type com.pinterest.gestalt.text.GestaltText");
            CharSequence text = ((GestaltText) currentView).getText();
            TextSwitcher textSwitcher2 = p0Var.f109455w;
            if (textSwitcher2 == null) {
                Intrinsics.r("carouselDesc");
                throw null;
            }
            View currentView2 = textSwitcher2.getCurrentView();
            Intrinsics.g(currentView2, "null cannot be cast to non-null type com.pinterest.gestalt.text.GestaltText");
            CharSequence text2 = ((GestaltText) currentView2).getText();
            if (!Intrinsics.d(text, title)) {
                TextSwitcher textSwitcher3 = p0Var.f109454v;
                if (textSwitcher3 == null) {
                    Intrinsics.r("carouselTitle");
                    throw null;
                }
                textSwitcher3.setText(title);
            }
            if (!Intrinsics.d(text2, description)) {
                TextSwitcher textSwitcher4 = p0Var.f109455w;
                if (textSwitcher4 == null) {
                    Intrinsics.r("carouselDesc");
                    throw null;
                }
                textSwitcher4.setText(description);
            }
            TextSwitcher textSwitcher5 = p0Var.f109454v;
            if (textSwitcher5 == null) {
                Intrinsics.r("carouselTitle");
                throw null;
            }
            k3.R1(textSwitcher5, (p0Var.g() || title == null || title.length() == 0) ? false : true);
            TextSwitcher textSwitcher6 = p0Var.f109455w;
            if (textSwitcher6 == null) {
                Intrinsics.r("carouselDesc");
                throw null;
            }
            if (!p0Var.g() && description != null && description.length() != 0) {
                z13 = true;
            }
            k3.R1(textSwitcher6, z13);
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        rs.b view = (rs.b) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((p0) view).C = this;
    }
}

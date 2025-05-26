package nx1;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.partnerAnalytics.components.feedback.InfoAboutDataView;
import com.pinterest.partnerAnalytics.feature.audience.top.locations.TopLocationsView;
import com.pinterest.partnerAnalytics.g;
import ex1.n;
import java.util.Date;
import kh2.b0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import pk.a0;

/* loaded from: classes4.dex */
public final class a extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f92492a;

    /* renamed from: b, reason: collision with root package name */
    public final Date f92493b;

    /* renamed from: c, reason: collision with root package name */
    public final ox1.a f92494c;

    /* renamed from: d, reason: collision with root package name */
    public final gx1.d f92495d;

    /* renamed from: e, reason: collision with root package name */
    public final ox1.b f92496e;

    /* renamed from: f, reason: collision with root package name */
    public final w f92497f;

    /* renamed from: g, reason: collision with root package name */
    public GestaltToolbarImpl f92498g;

    /* renamed from: h, reason: collision with root package name */
    public TopLocationsView f92499h;

    public a(d0 pinalytics, Date date, ox1.a topLocationSelected, gx1.d audienceType, ox1.b topLocations, w eventManager) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(topLocationSelected, "topLocationSelected");
        Intrinsics.checkNotNullParameter(audienceType, "audienceType");
        Intrinsics.checkNotNullParameter(topLocations, "topLocations");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f92492a = pinalytics;
        this.f92493b = date;
        this.f92494c = topLocationSelected;
        this.f92495d = audienceType;
        this.f92496e = topLocations;
        this.f92497f = eventManager;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = LayoutInflater.from(context).inflate(com.pinterest.partnerAnalytics.e.top_locations_closeup_fragment, (ViewGroup) null);
        this.f92498g = (GestaltToolbarImpl) inflate.findViewById(com.pinterest.partnerAnalytics.d.brio_toolbar);
        View findViewById = inflate.findViewById(com.pinterest.partnerAnalytics.d.topLocationsCloseup);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f92499h = (TopLocationsView) findViewById;
        View findViewById2 = inflate.findViewById(com.pinterest.partnerAnalytics.d.infoAboutDataView);
        ((InfoAboutDataView) findViewById2).setPinalytics(this.f92492a);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "also(...)");
        aw1.a aVar = new aw1.a(context);
        aVar.s(inflate);
        GestaltToolbarImpl gestaltToolbarImpl = this.f92498g;
        ox1.b bVar = this.f92496e;
        if (gestaltToolbarImpl != null) {
            String D = a.a.D(bVar.f97983a, ", ", gestaltToolbarImpl.getResources().getString(this.f92495d.getFriendlyName()));
            String string = gestaltToolbarImpl.getResources().getString(g.analytics_last_30_days);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            b0.Y1(gestaltToolbarImpl, string, D);
            gestaltToolbarImpl.X(vn1.c.DEFAULT);
            gestaltToolbarImpl.m();
            gestaltToolbarImpl.f49713m = new wq1.a(this, 14);
        }
        TopLocationsView topLocationsView = this.f92499h;
        if (topLocationsView == null) {
            Intrinsics.r("topLocationsView");
            throw null;
        }
        topLocationsView.a(bVar);
        TopLocationsView topLocationsView2 = this.f92499h;
        if (topLocationsView2 == null) {
            Intrinsics.r("topLocationsView");
            throw null;
        }
        topLocationsView2.e(this.f92494c);
        TopLocationsView topLocationsView3 = this.f92499h;
        if (topLocationsView3 == null) {
            Intrinsics.r("topLocationsView");
            throw null;
        }
        topLocationsView3.f50161f.d(new fx1.d(false, 4));
        TopLocationsView topLocationsView4 = this.f92499h;
        if (topLocationsView4 == null) {
            Intrinsics.r("topLocationsView");
            throw null;
        }
        topLocationsView4.f50162g.i(new fx1.d(true, 5));
        TopLocationsView topLocationsView5 = this.f92499h;
        if (topLocationsView5 == null) {
            Intrinsics.r("topLocationsView");
            throw null;
        }
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String text = pp2.a.t(this.f92493b, resources);
        Intrinsics.checkNotNullParameter(text, "text");
        a0.p(topLocationsView5.f50162g, text);
        TopLocationsView topLocationsView6 = this.f92499h;
        if (topLocationsView6 == null) {
            Intrinsics.r("topLocationsView");
            throw null;
        }
        n onClick = new n(this, 4);
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        topLocationsView6.f50156a = onClick;
        return aVar;
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        return -1;
    }
}

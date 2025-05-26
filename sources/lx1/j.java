package lx1;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.partnerAnalytics.components.feedback.InfoAboutDataView;
import com.pinterest.partnerAnalytics.feature.audience.top.categories.AudienceTopCategoriesView;
import java.util.Date;
import kh2.b0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import pk.a0;

/* loaded from: classes4.dex */
public final class j extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f85086a;

    /* renamed from: b, reason: collision with root package name */
    public final Date f85087b;

    /* renamed from: c, reason: collision with root package name */
    public final gx1.d f85088c;

    /* renamed from: d, reason: collision with root package name */
    public final mx1.a f85089d;

    /* renamed from: e, reason: collision with root package name */
    public final w f85090e;

    /* renamed from: f, reason: collision with root package name */
    public GestaltToolbarImpl f85091f;

    /* renamed from: g, reason: collision with root package name */
    public AudienceTopCategoriesView f85092g;

    public j(d0 pinalytics, Date date, gx1.d audienceType, mx1.a topCategories, w eventManager) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(audienceType, "audienceType");
        Intrinsics.checkNotNullParameter(topCategories, "topCategories");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f85086a = pinalytics;
        this.f85087b = date;
        this.f85088c = audienceType;
        this.f85089d = topCategories;
        this.f85090e = eventManager;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = LayoutInflater.from(context).inflate(com.pinterest.partnerAnalytics.e.top_categories_closeup_fragment, (ViewGroup) null);
        View findViewById = inflate.findViewById(com.pinterest.partnerAnalytics.d.infoAboutDataView);
        ((InfoAboutDataView) findViewById).setPinalytics(this.f85086a);
        Intrinsics.checkNotNullExpressionValue(findViewById, "also(...)");
        this.f85091f = (GestaltToolbarImpl) inflate.findViewById(com.pinterest.partnerAnalytics.d.brio_toolbar);
        View findViewById2 = inflate.findViewById(com.pinterest.partnerAnalytics.d.topCategoriesCloseup);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f85092g = (AudienceTopCategoriesView) findViewById2;
        aw1.a aVar = new aw1.a(context);
        aVar.s(inflate);
        GestaltToolbarImpl gestaltToolbarImpl = this.f85091f;
        mx1.a aVar2 = this.f85089d;
        if (gestaltToolbarImpl != null) {
            String D = a.a.D(aVar2.f88471a, ", ", gestaltToolbarImpl.getResources().getString(this.f85088c.getFriendlyName()));
            String string = gestaltToolbarImpl.getResources().getString(com.pinterest.partnerAnalytics.g.analytics_last_30_days);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            b0.Y1(gestaltToolbarImpl, string, D);
            gestaltToolbarImpl.X(vn1.c.DEFAULT);
            gestaltToolbarImpl.m();
            gestaltToolbarImpl.f49713m = new wq1.a(this, 13);
        }
        AudienceTopCategoriesView audienceTopCategoriesView = this.f85092g;
        if (audienceTopCategoriesView == null) {
            Intrinsics.r("topCategoriesView");
            throw null;
        }
        audienceTopCategoriesView.f50150b.d(new fx1.d(false, 2));
        fx1.d dVar = new fx1.d(true, 3);
        GestaltText gestaltText = audienceTopCategoriesView.f50151c;
        gestaltText.i(dVar);
        Resources resources = audienceTopCategoriesView.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String text = pp2.a.t(this.f85087b, resources);
        Intrinsics.checkNotNullParameter(text, "text");
        a0.p(gestaltText, text);
        audienceTopCategoriesView.a(aVar2.f88472b);
        return aVar;
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        return -1;
    }
}

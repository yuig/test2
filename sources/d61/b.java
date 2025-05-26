package d61;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.imageview.ShapeableImageView;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import h32.g0;
import h32.v2;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import ll.j;
import m60.t0;
import nx.v;
import nx.y0;
import xo.s;

/* loaded from: classes5.dex */
public final class b extends s implements a61.a, v {
    public static final /* synthetic */ int B = 0;
    public b61.a A;

    /* renamed from: d, reason: collision with root package name */
    public l f53740d;

    /* renamed from: e, reason: collision with root package name */
    public final float f53741e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f53742f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f53743g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f53744h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltIcon f53745i;

    /* renamed from: j, reason: collision with root package name */
    public final WebImageView f53746j;

    /* renamed from: k, reason: collision with root package name */
    public final WebImageView f53747k;

    /* renamed from: l, reason: collision with root package name */
    public final WebImageView f53748l;

    /* renamed from: m, reason: collision with root package name */
    public final WebImageView f53749m;

    /* renamed from: n, reason: collision with root package name */
    public final LinearLayout f53750n;

    /* renamed from: o, reason: collision with root package name */
    public final ShapeableImageView f53751o;

    /* renamed from: p, reason: collision with root package name */
    public final AppCompatImageView f53752p;

    /* renamed from: q, reason: collision with root package name */
    public final AppCompatImageView f53753q;

    /* renamed from: r, reason: collision with root package name */
    public final ShapeableImageView f53754r;

    /* renamed from: s, reason: collision with root package name */
    public final va.f f53755s;

    /* renamed from: t, reason: collision with root package name */
    public final va.f f53756t;

    /* renamed from: u, reason: collision with root package name */
    public final va.f f53757u;

    /* renamed from: v, reason: collision with root package name */
    public final va.f f53758v;

    /* renamed from: w, reason: collision with root package name */
    public final va.f f53759w;

    /* renamed from: x, reason: collision with root package name */
    public final va.f f53760x;

    /* renamed from: y, reason: collision with root package name */
    public final va.f f53761y;

    /* renamed from: z, reason: collision with root package name */
    public final va.f f53762z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, 13);
        Intrinsics.checkNotNullParameter(context, "context");
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(eo1.c.lego_corner_radius_medium);
        this.f53741e = dimensionPixelOffset;
        this.f53755s = va.f.b(context, j42.b.seasonal_delight_holiday1_avd);
        this.f53756t = va.f.b(context, j42.b.seasonal_delight_holiday2_avd);
        this.f53757u = va.f.b(context, j42.b.seasonal_delight_holiday3_avd);
        this.f53758v = va.f.b(context, j42.b.seasonal_delight_holiday4_avd);
        this.f53759w = va.f.b(context, j42.b.seasonal_delight_you_season1_avd);
        this.f53760x = va.f.b(context, j42.b.seasonal_delight_you_season2_avd);
        this.f53761y = va.f.b(context, j42.b.seasonal_delight_you_season3_avd);
        this.f53762z = va.f.b(context, j42.b.seasonal_delight_you_season4_avd);
        setId(t0.search_landing_bundle);
        View.inflate(context, j42.e.view_search_landing_bundle, this);
        int G0 = dl2.b.G0(this, eo1.a.item_horizontal_spacing);
        setPadding(G0, bs1.c.W(this, eo1.c.space_600), G0, bs1.c.W(this, eo1.c.space_400));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        View findViewById = findViewById(j42.c.image_bundle_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f53742f = (LinearLayout) findViewById;
        View findViewById2 = findViewById(j42.c.subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f53743g = (GestaltText) findViewById2;
        View findViewById3 = findViewById(j42.c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f53744h = (GestaltText) findViewById3;
        View findViewById4 = findViewById(j42.c.arrow_forward);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f53745i = (GestaltIcon) findViewById4;
        View findViewById5 = findViewById(j42.c.first_image);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById5;
        this.f53746j = webImageView;
        View findViewById6 = findViewById(j42.c.second_image);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        WebImageView webImageView2 = (WebImageView) findViewById6;
        this.f53747k = webImageView2;
        View findViewById7 = findViewById(j42.c.third_image);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        WebImageView webImageView3 = (WebImageView) findViewById7;
        this.f53748l = webImageView3;
        View findViewById8 = findViewById(j42.c.fourth_image);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        WebImageView webImageView4 = (WebImageView) findViewById8;
        this.f53749m = webImageView4;
        webImageView.Y(new eu.l(webImageView, 2));
        webImageView2.Y(new eu.l(webImageView2, 2));
        webImageView3.Y(new eu.l(webImageView3, 2));
        webImageView4.Y(new eu.l(webImageView4, 2));
        View findViewById9 = findViewById(j42.c.animation_seasonal_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f53750n = (LinearLayout) findViewById9;
        View findViewById10 = findViewById(j42.c.first_seasonal);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f53751o = (ShapeableImageView) findViewById10;
        View findViewById11 = findViewById(j42.c.second_seasonal);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f53752p = (AppCompatImageView) findViewById11;
        View findViewById12 = findViewById(j42.c.third_seasonal);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f53753q = (AppCompatImageView) findViewById12;
        View findViewById13 = findViewById(j42.c.fourth_seasonal);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.f53754r = (ShapeableImageView) findViewById13;
        if (j1.Y0(context)) {
            webImageView.g2(0.0f, dimensionPixelOffset, 0.0f, dimensionPixelOffset);
            webImageView4.g2(dimensionPixelOffset, 0.0f, dimensionPixelOffset, 0.0f);
        } else {
            webImageView.g2(dimensionPixelOffset, 0.0f, dimensionPixelOffset, 0.0f);
            webImageView4.g2(0.0f, dimensionPixelOffset, 0.0f, dimensionPixelOffset);
        }
        setOnClickListener(new com.pinterest.feature.home.view.c(this, 29));
    }

    public final void E1(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        l lVar = this.f53740d;
        if (lVar == null) {
            Intrinsics.r("uriNavigator");
            throw null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        l.b(lVar, context, url, false, false, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return q0.f80391a;
    }

    public final void i(va.f fVar) {
        e21.e eVar = new e21.e(this, fVar, 1);
        if (fVar != null) {
            fVar.c(eVar);
        }
        if (fVar != null) {
            fVar.start();
        }
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        ih ihVar;
        String e13;
        String id3;
        String q13;
        b61.a aVar = this.A;
        if (aVar == null) {
            return null;
        }
        vh vhVar = aVar.f22016b;
        String id4 = vhVar != null ? vhVar.getId() : null;
        vh vhVar2 = aVar.f22016b;
        String u13 = vhVar2 != null ? vhVar2.u() : null;
        Integer num = aVar.f22017c;
        v2 x13 = j.x(aVar.f22018d, id4, 0, 0, u13, null, num != null ? Short.valueOf((short) num.intValue()) : null, 16);
        HashMap auxData = new HashMap();
        vh vhVar3 = aVar.f22016b;
        if (vhVar3 != null && (q13 = vhVar3.q()) != null) {
        }
        vh vhVar4 = aVar.f22016b;
        if (vhVar4 != null && (id3 = vhVar4.getId()) != null) {
        }
        Integer num2 = aVar.f22017c;
        if (num2 != null) {
        }
        String p33 = aVar.p3();
        if (p33 != null) {
        }
        vh vhVar5 = aVar.f22016b;
        String queryParameter = (vhVar5 == null || (ihVar = vhVar5.f42857o) == null || (e13 = ihVar.e()) == null) ? null : Uri.parse(e13).getQueryParameter("today_article");
        if (queryParameter != null) {
            auxData.put("today_article_id", queryParameter);
        }
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        if (x13 != null) {
            return new y0(x13, auxData, null, g0.DYNAMIC_GRID_STORY, 4);
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        b61.a aVar = this.A;
        if (aVar != null) {
            return new y0(aVar.f22018d.y(aVar.f22017c), null, null, g0.DYNAMIC_GRID_STORY, 6);
        }
        return null;
    }
}

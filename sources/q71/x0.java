package q71;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.api.model.vh;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import h32.v2;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 extends LinearLayout implements k71.n, nx.v {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f102782i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f102783a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f102784b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f102785c;

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f102786d;

    /* renamed from: e, reason: collision with root package name */
    public final WebImageView f102787e;

    /* renamed from: f, reason: collision with root package name */
    public final WebImageView f102788f;

    /* renamed from: g, reason: collision with root package name */
    public final WebImageView f102789g;

    /* renamed from: h, reason: collision with root package name */
    public o71.g0 f102790h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(eo1.c.lego_corner_radius_medium);
        setId(m60.t0.search_typeahead_bundle);
        View.inflate(context, n42.d.search_typeahead_bundle_view, this);
        int G0 = dl2.b.G0(this, eo1.a.item_horizontal_spacing);
        setPadding(G0, bs1.c.W(this, eo1.c.space_600), G0, bs1.c.W(this, eo1.c.space_400));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        View findViewById = findViewById(n42.c.image_bundle_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f102783a = (LinearLayout) findViewById;
        View findViewById2 = findViewById(n42.c.subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f102784b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(n42.c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f102785c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(n42.c.arrow_forward);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        View findViewById5 = findViewById(n42.c.first_image);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById5;
        this.f102786d = webImageView;
        View findViewById6 = findViewById(n42.c.second_image);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        WebImageView webImageView2 = (WebImageView) findViewById6;
        this.f102787e = webImageView2;
        View findViewById7 = findViewById(n42.c.third_image);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        WebImageView webImageView3 = (WebImageView) findViewById7;
        this.f102788f = webImageView3;
        View findViewById8 = findViewById(n42.c.fourth_image);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        WebImageView webImageView4 = (WebImageView) findViewById8;
        this.f102789g = webImageView4;
        webImageView.Y(new eu.l(webImageView, 3));
        webImageView2.Y(new eu.l(webImageView2, 3));
        webImageView3.Y(new eu.l(webImageView3, 3));
        webImageView4.Y(new eu.l(webImageView4, 3));
        if (j1.Y0(context)) {
            webImageView.g2(0.0f, dimensionPixelOffset, 0.0f, dimensionPixelOffset);
            webImageView4.g2(dimensionPixelOffset, 0.0f, dimensionPixelOffset, 0.0f);
        } else {
            webImageView.g2(dimensionPixelOffset, 0.0f, dimensionPixelOffset, 0.0f);
            webImageView4.g2(0.0f, dimensionPixelOffset, 0.0f, dimensionPixelOffset);
        }
        setOnClickListener(new x61.e(this, 13));
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return kotlin.collections.q0.f80391a;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        String uid;
        o71.g0 g0Var = this.f102790h;
        if (g0Var == null) {
            return null;
        }
        vh vhVar = g0Var.f93295d;
        String uid2 = vhVar != null ? vhVar.getUid() : null;
        vh vhVar2 = g0Var.f93295d;
        v2 x13 = ll.j.x(g0Var.f93297f, uid2, 0, 0, vhVar2 != null ? vhVar2.u() : null, null, Short.valueOf((short) g0Var.f93296e), 16);
        HashMap auxData = ep.b.o("story_type", "autocomplete_trending_articles");
        vh vhVar3 = g0Var.f93295d;
        if (vhVar3 != null && (uid = vhVar3.getUid()) != null) {
        }
        auxData.put("story_index", String.valueOf(g0Var.f93296e));
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        if (x13 != null) {
            return new nx.y0(x13, auxData, null, h32.g0.DYNAMIC_GRID_STORY, 4);
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        o71.g0 g0Var = this.f102790h;
        if (g0Var == null) {
            return null;
        }
        return new nx.y0(g0Var.f93297f.y(Integer.valueOf(g0Var.f93296e)), null, null, h32.g0.DYNAMIC_GRID_STORY, 6);
    }
}

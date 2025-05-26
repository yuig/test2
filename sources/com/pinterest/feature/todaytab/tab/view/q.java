package com.pinterest.feature.todaytab.tab.view;

import a.z0;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import h32.g0;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import nx.d0;
import nx.v;
import pk.a0;
import we1.a2;

/* loaded from: classes5.dex */
public final class q extends FrameLayout implements ch1.b, v {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f48740i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltAvatar f48741a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f48742b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f48743c;

    /* renamed from: d, reason: collision with root package name */
    public final q21.d f48744d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f48745e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f48746f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f48747g;

    /* renamed from: h, reason: collision with root package name */
    public dh1.e f48748h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, d0 pinalytics, uj2.q networkStateStream) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        View.inflate(context, o92.c.single_pin_today_article_module, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setClipToPadding(false);
        View findViewById = findViewById(o92.b.single_pin_module_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48746f = (GestaltText) findViewById;
        View findViewById2 = findViewById(o92.b.single_pin_module_linear_layout_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById2;
        this.f48745e = linearLayout;
        q21.d dVar = new q21.d(context, pinalytics, networkStateStream, null, r0.today_tab_module_single_pin_corner_radius, null, null, null, RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM);
        this.f48744d = dVar;
        linearLayout.addView(dVar, 0);
        View findViewById3 = findViewById(o92.b.single_pin_module_creator_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48741a = (GestaltAvatar) findViewById3;
        View findViewById4 = findViewById(o92.b.single_pin_module_creator);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48742b = (LinearLayout) findViewById4;
        View findViewById5 = findViewById(o92.b.single_pin_module_creator_name);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48743c = (GestaltText) findViewById5;
        setOnClickListener(new a2(this, 14));
    }

    @Override // ch1.b
    public final void D3(dh1.e eVar) {
        this.f48748h = eVar;
    }

    @Override // ch1.b
    public final void S5(wy0 creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        String t03 = dl2.b.t0(creator);
        LinearLayout linearLayout = this.f48742b;
        linearLayout.setVisibility(0);
        this.f48741a.loadUrl(t03);
        String Z2 = creator.Z2();
        if (Z2 != null) {
            linearLayout.setVisibility(0);
            a0.p(this.f48743c, Z2);
        }
    }

    @Override // ch1.b
    public final void c3(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        q21.d.b(this.f48744d, pin, 0, this.f48747g, null, new z0(this, 14), false, null, g0.TODAY_ARTICLE, null, null, false, null, false, false, 32480);
        this.f48745e.post(new a11.p(18, pin, this));
    }

    @Override // ch1.b
    public final void d() {
        a0.p(this.f48746f, "");
        this.f48742b.setVisibility(8);
        a0.p(this.f48743c, "");
        this.f48741a.H2(b.f48705v);
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return e0.b(this.f48744d);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        dh1.e eVar = this.f48748h;
        if (eVar != null) {
            return eVar.u3();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        dh1.e eVar = this.f48748h;
        if (eVar != null) {
            return eVar.v3();
        }
        return null;
    }

    @Override // ch1.b
    public final void p(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        a0.p(this.f48746f, text);
    }

    @Override // ch1.b
    public final void p2(HashMap auxData) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f48747g = auxData;
    }
}

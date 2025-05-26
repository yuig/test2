package com.pinterest.feature.search.results.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.api.model.vh;
import com.pinterest.gestalt.text.GestaltText;
import h32.v2;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import nx.y0;
import so.jb;
import x02.x2;

/* loaded from: classes5.dex */
public final class d0 extends LinearLayout implements h61.o, ky.h, nx.v, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f47775a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47776b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f47777c;

    /* renamed from: d, reason: collision with root package name */
    public final yk1.j f47778d;

    /* renamed from: e, reason: collision with root package name */
    public final nx.f0 f47779e;

    /* renamed from: f, reason: collision with root package name */
    public final x2 f47780f;

    /* renamed from: g, reason: collision with root package name */
    public final uj2.q f47781g;

    /* renamed from: h, reason: collision with root package name */
    public l0 f47782h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f47783i;

    /* renamed from: j, reason: collision with root package name */
    public final yg1.d f47784j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f47785k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, m60.w eventManager, yk1.j mvpBinder, nx.f0 pinalyticsFactory, x2 userRepository) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        if (!this.f47776b) {
            this.f47776b = true;
            this.f47781g = (uj2.q) ((jb) ((e0) generatedComponent())).f113483a.f113947u9.get();
        }
        this.f47777c = eventManager;
        this.f47778d = mvpBinder;
        this.f47779e = pinalyticsFactory;
        this.f47780f = userRepository;
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.setPaddingRelative(bs1.c.W(gestaltText, eo1.c.lego_spacing_horizontal_small), bs1.c.W(gestaltText, eo1.c.lego_spacing_vertical_xlarge), bs1.c.W(gestaltText, eo1.c.lego_spacing_horizontal_small), bs1.c.W(gestaltText, eo1.c.lego_spacing_vertical_small));
        GestaltText i13 = gestaltText.i(d.f47773n);
        this.f47783i = i13;
        yg1.d dVar = new yg1.d(context);
        dVar.setPaddingRelative(bs1.c.W(dVar, eo1.c.lego_spacing_horizontal_small), bs1.c.W(dVar, eo1.c.lego_spacing_vertical_medium), bs1.c.W(dVar, eo1.c.lego_spacing_horizontal_small), bs1.c.W(dVar, eo1.c.ignore));
        dVar.setVisibility(8);
        this.f47784j = dVar;
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.setPaddingRelative(bs1.c.W(gestaltText2, eo1.c.lego_spacing_horizontal_small), bs1.c.W(gestaltText2, eo1.c.lego_spacing_vertical_medium), bs1.c.W(gestaltText2, eo1.c.lego_spacing_horizontal_small), bs1.c.W(gestaltText2, eo1.c.space_600));
        GestaltText i14 = gestaltText2.i(d.f47772m);
        this.f47785k = i14;
        setOrientation(1);
        addView(i13, -1, -2);
        addView(dVar, -1, -2);
        addView(i14, -1, -2);
    }

    public static final void a(d0 d0Var, SpannableString spannableString) {
        d0Var.getClass();
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        Intrinsics.f(uRLSpanArr);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            String url = uRLSpan.getURL();
            Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
            spannableString.setSpan(new InAppUrlSpan(d0Var.f47777c, url), spanStart, spanEnd, 33);
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f47775a == null) {
            this.f47775a = new ye2.o(this);
        }
        return this.f47775a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f47775a == null) {
            this.f47775a = new ye2.o(this);
        }
        return this.f47775a.generatedComponent();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return q0.f80391a;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        l0 l0Var = this.f47782h;
        if (l0Var == null) {
            return null;
        }
        vh vhVar = l0Var.f47812a;
        v2 x13 = ll.j.x(l0Var.f47815d, vhVar.getUid(), 0, 0, vhVar.u(), null, Short.valueOf((short) l0Var.f47813b), 16);
        HashMap auxData = new HashMap();
        String q13 = vhVar.q();
        if (q13 != null) {
        }
        String str = l0Var.f47814c;
        if (str != null) {
            auxData.put("today_article_id", str);
        }
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        if (x13 != null) {
            return new y0(x13, auxData, null, h32.g0.DYNAMIC_GRID_STORY, 4);
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        l0 l0Var = this.f47782h;
        if (l0Var == null) {
            return null;
        }
        return new y0(l0Var.f47815d.y(Integer.valueOf(l0Var.f47813b)), null, null, h32.g0.DYNAMIC_GRID_STORY, 6);
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.OTHER;
    }
}

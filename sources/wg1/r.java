package wg1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.vh;
import com.pinterest.design.brio.widget.IconView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import h32.g0;
import h32.v2;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lh0.e4;
import m60.s0;
import nx.y0;
import oi.j0;
import so.jb;

/* loaded from: classes5.dex */
public final class r extends LinearLayout implements tg1.j, nx.v, af2.c {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f129827r = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f129828a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f129829b;

    /* renamed from: c, reason: collision with root package name */
    public final uk1.d f129830c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f129831d;

    /* renamed from: e, reason: collision with root package name */
    public final ku1.l f129832e;

    /* renamed from: f, reason: collision with root package name */
    public final e4 f129833f;

    /* renamed from: g, reason: collision with root package name */
    public j0 f129834g;

    /* renamed from: h, reason: collision with root package name */
    public tq0.a f129835h;

    /* renamed from: i, reason: collision with root package name */
    public tq0.c f129836i;

    /* renamed from: j, reason: collision with root package name */
    public tq0.j f129837j;

    /* renamed from: k, reason: collision with root package name */
    public tq0.c f129838k;

    /* renamed from: l, reason: collision with root package name */
    public long f129839l;

    /* renamed from: m, reason: collision with root package name */
    public ug1.g f129840m;

    /* renamed from: n, reason: collision with root package name */
    public final ViewPager f129841n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltText f129842o;

    /* renamed from: p, reason: collision with root package name */
    public final LinearLayout f129843p;

    /* renamed from: q, reason: collision with root package name */
    public int f129844q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, uk1.d presenterPinalytics, Function0 isScreenActivated) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(isScreenActivated, "isScreenActivated");
        if (!this.f129829b) {
            this.f129829b = true;
            jb jbVar = (jb) ((s) generatedComponent());
            this.f129832e = (ku1.l) jbVar.f113485c.f114476s.get();
            this.f129833f = jbVar.f113483a.D2();
        }
        this.f129830c = presenterPinalytics;
        this.f129831d = isScreenActivated;
        this.f129839l = 4000L;
        ViewPager viewPager = new ViewPager(context);
        this.f129841n = viewPager;
        GestaltText i13 = new GestaltText(6, context, (AttributeSet) null).i(d.E);
        this.f129842o = i13;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f129843p = linearLayout;
        setOrientation(1);
        setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getResources().getDimensionPixelOffset(eo1.c.space_100));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        i13.setLayoutParams(layoutParams);
        i13.setPaddingRelative(i13.getPaddingStart(), i13.getResources().getDimensionPixelOffset(eo1.c.space_300), i13.getPaddingEnd(), i13.getResources().getDimensionPixelOffset(eo1.c.ignore));
        i13.i(d.D);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, linearLayout.getResources().getDimensionPixelOffset(eo1.c.space_200));
        layoutParams2.bottomMargin = linearLayout.getResources().getDimensionPixelOffset(eo1.c.space_200);
        layoutParams2.gravity = 17;
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(8);
        addView(i13);
        int dimensionPixelSize = (hf0.b.c().widthPixels - getResources().getDimensionPixelSize(i82.b.article_spotlight_width)) / 2;
        viewPager.D(viewPager.getResources().getInteger(i82.d.article_spotlight_offscreen_page_limit));
        int dimensionPixelOffset = viewPager.getResources().getDimensionPixelOffset(eo1.c.space_200);
        int i14 = viewPager.f19900m;
        viewPager.f19900m = dimensionPixelOffset;
        int width = viewPager.getWidth();
        viewPager.v(width, width, dimensionPixelOffset, i14);
        viewPager.requestLayout();
        viewPager.setPaddingRelative(dimensionPixelSize, viewPager.getResources().getDimensionPixelSize(eo1.c.space_300), dimensionPixelSize, viewPager.getResources().getDimensionPixelSize(eo1.c.space_200));
        viewPager.setClipToPadding(false);
        viewPager.setClipChildren(false);
        viewPager.setLayoutParams(new LinearLayout.LayoutParams(-1, viewPager.getResources().getDimensionPixelSize(i82.b.article_spotlight_height_and_padding)));
        viewPager.b(new th0.b(this, 4));
        addView(viewPager);
        addView(linearLayout);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("j");
            Intrinsics.checkNotNullExpressionValue(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            Intrinsics.checkNotNullParameter(context, "context");
            q qVar = new q(context);
            qVar.f129826a = 1000;
            declaredField.set(viewPager, qVar);
        } catch (Exception unused) {
        }
    }

    @Override // tg1.j
    public final void F3(float f13) {
        ViewPager viewPager = this.f129841n;
        int dimensionPixelSize = viewPager.getResources().getDimensionPixelSize(eo1.c.space_800);
        int dimensionPixelSize2 = viewPager.getResources().getDimensionPixelSize(i82.b.article_spotlight_width);
        int dimensionPixelSize3 = viewPager.getResources().getDimensionPixelSize(eo1.c.space_200);
        int dimensionPixelSize4 = viewPager.getResources().getDimensionPixelSize(xe1.v.C);
        Resources resources = viewPager.getResources();
        vn1.g titleTextVariant = vn1.g.UI_400;
        vn1.g subtitleTextVariant = vn1.g.BODY_100;
        int i13 = eo1.c.structured_feed_spotlight_empty_header_top_padding;
        om1.e iconButtonSize = om1.e.MD;
        Intrinsics.checkNotNullParameter(titleTextVariant, "titleTextVariant");
        Intrinsics.checkNotNullParameter(subtitleTextVariant, "subtitleTextVariant");
        Intrinsics.checkNotNullParameter(iconButtonSize, "iconButtonSize");
        viewPager.setPaddingRelative(dimensionPixelSize3, resources.getDimensionPixelSize(i13), dimensionPixelSize, dimensionPixelSize4);
        viewPager.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) (dimensionPixelSize2 * f13)));
        requestLayout();
    }

    @Override // tg1.j
    public final void J3(ih dynamicAction, String str) {
        String e13;
        String g13;
        if (Intrinsics.d(str, "today_tab_search_upsell") || dynamicAction == null || (e13 = dynamicAction.e()) == null || kotlin.text.z.j(e13) || (g13 = dynamicAction.g()) == null || kotlin.text.z.j(g13)) {
            return;
        }
        xa.a aVar = this.f129841n.f19892e;
        p pVar = aVar instanceof p ? (p) aVar : null;
        if (pVar != null) {
            Intrinsics.checkNotNullParameter(dynamicAction, "dynamicAction");
            pVar.f129823n = dynamicAction;
            pVar.f129824o = str;
            pVar.g();
        }
    }

    @Override // tg1.j
    public final void L1(boolean z13) {
        LinearLayout linearLayout = this.f129843p;
        bs1.c.R1(linearLayout, z13);
        xa.a aVar = this.f129841n.f19892e;
        if (aVar != null) {
            int b13 = aVar.b();
            linearLayout.removeAllViews();
            for (int i13 = 0; i13 < b13; i13++) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                IconView iconView = new IconView(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iconView.getResources().getDimensionPixelOffset(eo1.c.space_200), iconView.getResources().getDimensionPixelOffset(eo1.c.space_200));
                layoutParams.setMarginStart(iconView.getResources().getDimensionPixelOffset(eo1.c.space_100));
                layoutParams.setMarginEnd(iconView.getResources().getDimensionPixelOffset(eo1.c.space_100));
                iconView.setLayoutParams(layoutParams);
                Context context2 = iconView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int i14 = s0.circle_gray;
                int i15 = eo1.b.color_themed_text_default;
                Intrinsics.checkNotNullParameter(context2, "context");
                Object obj = d5.a.f53679a;
                Drawable drawable = context2.getDrawable(i14);
                Intrinsics.checkNotNullParameter(context2, "context");
                iconView.setImageDrawable(drawable != null ? sh.f.d(i15 == 0 ? context2.getColor(df0.a.f54892a) : context2.getColor(i15), context2, drawable) : null);
                iconView.setAlpha(0.4f);
                linearLayout.addView(iconView);
            }
            a(0);
        }
    }

    @Override // tg1.j
    public final void V3(tq0.j impressionLogger) {
        Intrinsics.checkNotNullParameter(impressionLogger, "impressionLogger");
        this.f129837j = impressionLogger;
    }

    @Override // tg1.j
    public final void V4() {
    }

    @Override // tg1.j
    public final void W0(tq0.c impressionLogger) {
        Intrinsics.checkNotNullParameter(impressionLogger, "impressionLogger");
        this.f129836i = impressionLogger;
    }

    @Override // tg1.j
    public final void X5(ug1.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f129840m = listener;
    }

    @Override // tg1.j
    public final void Y1(vh models, ArrayList articlePresenters) {
        tq0.c cVar;
        tq0.j jVar;
        tq0.c cVar2;
        Intrinsics.checkNotNullParameter(articlePresenters, "presenters");
        Intrinsics.checkNotNullParameter(models, "models");
        ViewPager viewPager = this.f129841n;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        yk1.j a13 = yk1.j.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(...)");
        tq0.a aVar = this.f129835h;
        if (aVar == null || (cVar = this.f129836i) == null || (jVar = this.f129837j) == null || (cVar2 = this.f129838k) == null) {
            return;
        }
        ku1.l lVar = this.f129832e;
        if (lVar == null) {
            Intrinsics.r("uriNavigator");
            throw null;
        }
        e4 e4Var = this.f129833f;
        if (e4Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        p pVar = new p(context, a13, aVar, cVar, jVar, cVar2, lVar, this.f129830c, false, e4Var);
        Intrinsics.checkNotNullParameter(articlePresenters, "articlePresenters");
        pVar.f129822m = articlePresenters;
        pVar.n(viewPager.f19893f, 1);
        viewPager.z(pVar);
    }

    public final void a(int i13) {
        LinearLayout linearLayout = this.f129843p;
        if (linearLayout.getChildCount() > 0) {
            View childAt = linearLayout.getChildAt(this.f129844q);
            if (childAt != null) {
                childAt.setAlpha(0.4f);
            }
            View childAt2 = linearLayout.getChildAt(i13);
            if (childAt2 != null) {
                childAt2.setAlpha(1.0f);
            }
        }
        this.f129844q = i13;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f129828a == null) {
            this.f129828a = new ye2.o(this);
        }
        return this.f129828a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f129828a == null) {
            this.f129828a = new ye2.o(this);
        }
        return this.f129828a.generatedComponent();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        ViewPager viewPager = this.f129841n;
        IntRange q13 = ql2.s.q(0, viewPager.getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator it = q13.iterator();
        while (it.hasNext()) {
            View childAt = viewPager.getChildAt(((u0) it).b());
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        return CollectionsKt.F0(arrayList);
    }

    @Override // tg1.j
    public final void l6(long j13, boolean z13) {
        Handler handler;
        if (!z13) {
            j0 j0Var = this.f129834g;
            if (j0Var != null && (handler = getHandler()) != null) {
                handler.removeCallbacks(j0Var);
            }
            this.f129834g = null;
            return;
        }
        this.f129839l = 4000L;
        j0 j0Var2 = new j0(this, 4000L, 3);
        this.f129834g = j0Var2;
        Handler handler2 = getHandler();
        if (handler2 != null) {
            handler2.postDelayed(j0Var2, this.f129839l);
        }
    }

    @Override // tg1.j
    public final void m1(int i13) {
        setId(i13);
    }

    @Override // tg1.j
    public final void m3(tq0.c impressionLogger) {
        Intrinsics.checkNotNullParameter(impressionLogger, "impressionLogger");
        this.f129838k = impressionLogger;
    }

    @Override // tg1.j
    public final void m6(String str) {
        if (str != null) {
            this.f129842o.i(new qf1.z(str, 9));
        }
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        tg1.i u33;
        ViewPager viewPager = this.f129841n;
        xa.a aVar = viewPager.f19892e;
        p pVar = aVar instanceof p ? (p) aVar : null;
        if (pVar != null) {
            pVar.m(viewPager.f19893f);
        }
        tq0.a aVar2 = this.f129835h;
        if (aVar2 != null) {
            aVar2.d();
        }
        tq0.c cVar = this.f129836i;
        if (cVar != null) {
            cVar.d();
        }
        tq0.c cVar2 = this.f129838k;
        if (cVar2 != null) {
            cVar2.d();
        }
        ug1.g gVar = this.f129840m;
        if (gVar == null || (u33 = gVar.u3()) == null) {
            return null;
        }
        return new y0(u33.f117589a, null, u33.f117590b, g0.DYNAMIC_GRID_STORY, 2);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        ug1.g gVar = this.f129840m;
        if (gVar == null) {
            return null;
        }
        v2 impression = gVar.f122169b.y(gVar.D);
        HashMap extraAuxData = gVar.r3();
        Intrinsics.checkNotNullParameter(impression, "impression");
        Intrinsics.checkNotNullParameter(extraAuxData, "extraAuxData");
        return new y0(impression, null, extraAuxData, g0.DYNAMIC_GRID_STORY, 2);
    }

    @Override // tg1.j
    public final void o5() {
        vn1.g titleTextVariant = (511 & 1) != 0 ? vn1.g.UI_400 : null;
        vn1.g subtitleTextVariant = (511 & 2) != 0 ? vn1.g.BODY_100 : null;
        int i13 = (511 & 4) != 0 ? xe1.v.f134789d0 : 0;
        int i14 = (511 & 8) != 0 ? xe1.v.S : 0;
        int i15 = (511 & 32) != 0 ? xe1.v.X : 0;
        om1.e iconButtonSize = (511 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? om1.e.MD : null;
        Intrinsics.checkNotNullParameter(titleTextVariant, "titleTextVariant");
        Intrinsics.checkNotNullParameter(subtitleTextVariant, "subtitleTextVariant");
        Intrinsics.checkNotNullParameter(iconButtonSize, "iconButtonSize");
        GestaltText gestaltText = this.f129842o;
        int dimensionPixelSize = gestaltText.getResources().getDimensionPixelSize(i13);
        gestaltText.setPaddingRelative(dimensionPixelSize, gestaltText.getResources().getDimensionPixelSize(i14), dimensionPixelSize, gestaltText.getResources().getDimensionPixelSize(i15));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388611;
        gestaltText.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Handler handler;
        j0 j0Var = this.f129834g;
        if (j0Var != null && (handler = getHandler()) != null) {
            handler.removeCallbacks(j0Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // tg1.j
    public final void u2(tq0.a impressionLogger) {
        Intrinsics.checkNotNullParameter(impressionLogger, "impressionLogger");
        this.f129835h = impressionLogger;
    }
}

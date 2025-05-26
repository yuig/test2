package wg1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.vh;
import com.pinterest.design.brio.widget.IconView;
import df.j1;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lh0.e4;
import m60.s0;
import nx.y0;
import oi.j0;
import so.jb;
import so.oa;

/* loaded from: classes5.dex */
public final class j extends FrameLayout implements tg1.j, nx.v, af2.c {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f129778t = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f129779a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f129780b;

    /* renamed from: c, reason: collision with root package name */
    public final uk1.d f129781c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f129782d;

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f129783e;

    /* renamed from: f, reason: collision with root package name */
    public final ku1.l f129784f;

    /* renamed from: g, reason: collision with root package name */
    public final ac2.m f129785g;

    /* renamed from: h, reason: collision with root package name */
    public final e4 f129786h;

    /* renamed from: i, reason: collision with root package name */
    public final th0.b f129787i;

    /* renamed from: j, reason: collision with root package name */
    public j0 f129788j;

    /* renamed from: k, reason: collision with root package name */
    public tq0.a f129789k;

    /* renamed from: l, reason: collision with root package name */
    public tq0.c f129790l;

    /* renamed from: m, reason: collision with root package name */
    public tq0.c f129791m;

    /* renamed from: n, reason: collision with root package name */
    public tq0.j f129792n;

    /* renamed from: o, reason: collision with root package name */
    public long f129793o;

    /* renamed from: p, reason: collision with root package name */
    public ug1.g f129794p;

    /* renamed from: q, reason: collision with root package name */
    public final ViewPager f129795q;

    /* renamed from: r, reason: collision with root package name */
    public final LinearLayout f129796r;

    /* renamed from: s, reason: collision with root package name */
    public int f129797s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, uk1.d presenterPinalytics, Function0 isScreenActivated, Function2 onSetTransparentSearchBar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(isScreenActivated, "isScreenActivated");
        Intrinsics.checkNotNullParameter(onSetTransparentSearchBar, "onSetTransparentSearchBar");
        if (!this.f129780b) {
            this.f129780b = true;
            jb jbVar = (jb) ((o) generatedComponent());
            this.f129784f = (ku1.l) jbVar.f113485c.f114476s.get();
            oa oaVar = jbVar.f113483a;
            this.f129785g = (ac2.m) oaVar.C7.get();
            this.f129786h = oaVar.D2();
        }
        this.f129781c = presenterPinalytics;
        this.f129782d = isScreenActivated;
        this.f129783e = onSetTransparentSearchBar;
        this.f129793o = 4000L;
        ViewPager viewPager = new ViewPager(context);
        this.f129795q = viewPager;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f129796r = linearLayout;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, linearLayout.getResources().getDimensionPixelOffset(eo1.c.space_200));
        layoutParams.bottomMargin = linearLayout.getResources().getDimensionPixelOffset(eo1.c.space_200);
        layoutParams.gravity = 81;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(8);
        viewPager.D(viewPager.getResources().getInteger(i82.d.article_spotlight_offscreen_page_limit));
        viewPager.setClipToPadding(false);
        viewPager.setClipChildren(false);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, kh2.b0.o0(bs1.c.k0(context2)));
        layoutParams2.bottomMargin = viewPager.getResources().getDimensionPixelOffset(eo1.c.space_600);
        viewPager.setLayoutParams(layoutParams2);
        this.f129787i = new th0.b(this, 3);
        addView(viewPager);
        addView(linearLayout);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("j");
            Intrinsics.checkNotNullExpressionValue(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            Intrinsics.checkNotNullParameter(context, "context");
            i iVar = new i(context);
            iVar.f129777a = 1000;
            declaredField.set(viewPager, iVar);
        } catch (Exception unused) {
        }
    }

    public static final boolean a(j jVar) {
        xa.a aVar = jVar.f129795q.f19892e;
        Intrinsics.g(aVar, "null cannot be cast to non-null type com.pinterest.feature.style.spotlight.view.SpotlightPagerAdapter");
        p pVar = (p) aVar;
        int i13 = jVar.f129797s;
        if (!(CollectionsKt.U(i13, pVar.f129822m) instanceof ug1.k)) {
            return false;
        }
        Object U = CollectionsKt.U(i13, pVar.f129822m);
        ug1.k kVar = U instanceof ug1.k ? (ug1.k) U : null;
        return kVar != null && kVar.f122209m;
    }

    @Override // tg1.j
    public final void F3(float f13) {
    }

    @Override // tg1.j
    public final void J3(ih ihVar, String str) {
    }

    @Override // tg1.j
    public final void L1(boolean z13) {
        LinearLayout linearLayout = this.f129796r;
        bs1.c.R1(linearLayout, z13);
        xa.a aVar = this.f129795q.f19892e;
        if (aVar != null) {
            int b13 = aVar.b();
            linearLayout.removeAllViews();
            for (int i13 = 0; i13 < b13; i13++) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                IconView iconView = new IconView(context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iconView.getResources().getDimensionPixelOffset(eo1.c.space_200), iconView.getResources().getDimensionPixelOffset(eo1.c.space_200));
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
                iconView.setAlpha(0.5f);
                linearLayout.addView(iconView);
            }
            g(0);
        }
    }

    @Override // tg1.j
    public final void V3(tq0.j impressionLogger) {
        Intrinsics.checkNotNullParameter(impressionLogger, "impressionLogger");
        this.f129792n = impressionLogger;
    }

    @Override // tg1.j
    public final void V4() {
        ViewPager viewPager = this.f129795q;
        xa.a aVar = viewPager.f19892e;
        int b13 = (viewPager.f19893f + 1) % (aVar != null ? aVar.b() : 0);
        if (((Boolean) this.f129782d.invoke()).booleanValue()) {
            viewPager.B(b13, true);
        }
    }

    @Override // tg1.j
    public final void W0(tq0.c impressionLogger) {
        Intrinsics.checkNotNullParameter(impressionLogger, "impressionLogger");
        this.f129790l = impressionLogger;
    }

    @Override // tg1.j
    public final void X5(ug1.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f129794p = listener;
    }

    @Override // tg1.j
    public final void Y1(vh dynamicStory, ArrayList articlePresenters) {
        tq0.c cVar;
        tq0.j jVar;
        tq0.c cVar2;
        Intrinsics.checkNotNullParameter(articlePresenters, "presenters");
        Intrinsics.checkNotNullParameter(dynamicStory, "dynamicStory");
        ViewPager viewPager = this.f129795q;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        yk1.j a13 = yk1.j.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(...)");
        tq0.a aVar = this.f129789k;
        if (aVar == null || (cVar = this.f129790l) == null || (jVar = this.f129792n) == null || (cVar2 = this.f129791m) == null) {
            return;
        }
        ku1.l lVar = this.f129784f;
        if (lVar == null) {
            Intrinsics.r("uriNavigator");
            throw null;
        }
        e4 e4Var = this.f129786h;
        if (e4Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        p pVar = new p(context, a13, aVar, cVar, jVar, cVar2, lVar, this.f129781c, true, e4Var);
        Intrinsics.checkNotNullParameter(articlePresenters, "articlePresenters");
        pVar.f129822m = articlePresenters;
        pVar.n(viewPager.f19893f, 0);
        viewPager.z(pVar);
    }

    public final void b() {
        Handler handler;
        j0 j0Var = this.f129788j;
        if (j0Var == null || (handler = getHandler()) == null) {
            return;
        }
        handler.removeCallbacks(j0Var);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f129779a == null) {
            this.f129779a = new ye2.o(this);
        }
        return this.f129779a;
    }

    public final void e() {
        j0 j0Var;
        Handler handler;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!j1.l(context) || (j0Var = this.f129788j) == null || (handler = getHandler()) == null) {
            return;
        }
        handler.postDelayed(j0Var, this.f129793o);
    }

    public final void g(int i13) {
        LinearLayout linearLayout = this.f129796r;
        if (linearLayout.getChildCount() > 0) {
            View childAt = linearLayout.getChildAt(this.f129797s);
            if (childAt != null) {
                childAt.setAlpha(0.5f);
            }
            View childAt2 = linearLayout.getChildAt(i13);
            if (childAt2 != null) {
                childAt2.setAlpha(1.0f);
            }
        }
        this.f129797s = i13;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f129779a == null) {
            this.f129779a = new ye2.o(this);
        }
        return this.f129779a.generatedComponent();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        ViewPager viewPager = this.f129795q;
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

    public final void i() {
        FrameLayout.LayoutParams layoutParams;
        LinearLayout linearLayout = this.f129796r;
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = linearLayout.getResources().getDimensionPixelOffset(eo1.c.space_800);
        ViewPager viewPager = this.f129795q;
        if (hf0.b.m()) {
            Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
            layoutParams = new FrameLayout.LayoutParams(-1, (int) (kh2.b0.o0(bs1.c.k0(r5)) * 0.42857143f));
        } else {
            Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
            layoutParams = new FrameLayout.LayoutParams(-1, (int) (kh2.b0.o0(bs1.c.k0(r5)) * 0.5625f));
        }
        viewPager.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams3 = viewPager.getLayoutParams();
        Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = viewPager.getResources().getDimensionPixelOffset(eo1.c.space_1200);
    }

    @Override // tg1.j
    public final void l6(long j13, boolean z13) {
        if (!z13) {
            b();
            this.f129788j = null;
        } else {
            this.f129793o = j13;
            this.f129788j = new j0(this, j13, 2);
            e();
        }
    }

    @Override // tg1.j
    public final void m1(int i13) {
        setId(i13);
    }

    @Override // tg1.j
    public final void m3(tq0.c impressionLogger) {
        Intrinsics.checkNotNullParameter(impressionLogger, "impressionLogger");
        this.f129791m = impressionLogger;
    }

    @Override // tg1.j
    public final void m6(String str) {
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        tg1.i u33;
        ViewPager viewPager = this.f129795q;
        xa.a aVar = viewPager.f19892e;
        p pVar = aVar instanceof p ? (p) aVar : null;
        if (pVar != null) {
            pVar.m(viewPager.f19893f);
        }
        tq0.a aVar2 = this.f129789k;
        if (aVar2 != null) {
            aVar2.d();
        }
        tq0.c cVar = this.f129790l;
        if (cVar != null) {
            cVar.d();
        }
        tq0.j jVar = this.f129792n;
        if (jVar != null) {
            jVar.d();
        }
        tq0.c cVar2 = this.f129791m;
        if (cVar2 != null) {
            cVar2.d();
        }
        ug1.g gVar = this.f129794p;
        if (gVar == null || (u33 = gVar.u3()) == null) {
            return null;
        }
        return new y0(u33.f117589a, null, u33.f117590b, g0.DYNAMIC_GRID_STORY, 2);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        ug1.g gVar = this.f129794p;
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
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f129795q.b(this.f129787i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b();
        ArrayList arrayList = this.f129795q.O;
        if (arrayList != null) {
            arrayList.remove(this.f129787i);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i13, KeyEvent keyEvent) {
        if (i13 == 24 || i13 == 25) {
            ViewPager viewPager = this.f129795q;
            xa.a aVar = viewPager.f19892e;
            p pVar = aVar instanceof p ? (p) aVar : null;
            int i14 = viewPager.f19893f;
            if (pVar != null && pVar.l(i14)) {
                viewPager.getChildAt(i14).onKeyDown(i13, keyEvent);
                return true;
            }
        }
        return super.onKeyDown(i13, keyEvent);
    }

    @Override // tg1.j
    public final void q1(boolean z13, boolean z14) {
        this.f129783e.invoke(Boolean.valueOf(z13), Boolean.valueOf(z14));
    }

    @Override // tg1.j
    public final void u2(tq0.a impressionLogger) {
        Intrinsics.checkNotNullParameter(impressionLogger, "impressionLogger");
        this.f129789k = impressionLogger;
    }
}

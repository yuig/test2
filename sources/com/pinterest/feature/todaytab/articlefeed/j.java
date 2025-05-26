package com.pinterest.feature.todaytab.articlefeed;

import a.cb;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.c2;
import b2.t;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.api.model.wv0;
import com.pinterest.api.model.zv0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import dl1.s;
import h32.a4;
import h32.d4;
import kh2.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import nx.f0;
import pk.a0;
import so.oa;
import so.s8;
import x02.i2;
import x02.x2;
import yq0.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/pinterest/feature/todaytab/articlefeed/j;", "Lwk1/k;", "Ldl1/s;", "Lcom/pinterest/feature/todaytab/articlefeed/b;", "Lnr0/j;", "<init>", "()V", "todayTab_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class j extends a<s> implements b {

    /* renamed from: f1, reason: collision with root package name */
    public static final /* synthetic */ int f48625f1 = 0;
    public yk1.j R0;
    public i2 S0;
    public f0 T0;
    public w20.a U0;
    public nr0.m V0;
    public zf0.f W0;
    public c2 X0;
    public n Y0;
    public AppBarLayout Z0;

    /* renamed from: a1, reason: collision with root package name */
    public GestaltIconButton f48626a1;

    /* renamed from: b1, reason: collision with root package name */
    public String f48627b1 = "";

    /* renamed from: c1, reason: collision with root package name */
    public final d4 f48628c1 = d4.FEED;

    /* renamed from: d1, reason: collision with root package name */
    public final a4 f48629d1 = a4.TODAY_ARTICLE_FEED;

    /* renamed from: e1, reason: collision with root package name */
    public final e f48630e1 = new e(this);

    public static final void j9(j jVar, SpannableString spannableString) {
        jVar.getClass();
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        Intrinsics.f(uRLSpanArr);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            w f73 = jVar.f7();
            String url = uRLSpan.getURL();
            Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
            spannableString.setSpan(new InAppUrlSpan(f73, url), spanStart, spanEnd, 33);
        }
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        f7().d(new r70.h(false, false));
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        int i13 = 0;
        adapter.G(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_FEED_FOOTER, new h(this, i13));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_RELATED_ARTICLES_HEADER, new h(this, 1));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION, new h(this, 2));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_TODAY_ARTICLE_BOARD_SECTION_HEADER, new h(this, 3));
        int[] iArr = com.pinterest.feature.todaytab.tab.view.n.f48737a;
        while (i13 < 8) {
            int i14 = iArr[i13];
            adapter.G(i14, new t(this, i14, 9));
            i13++;
        }
    }

    @Override // sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.S7(toolbar);
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        Drawable mutate = gestaltToolbarImpl.u().mutate();
        Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        mutate.setTint(dl2.b.x0(requireContext, eo1.a.base_color_grayscale_0));
        gestaltToolbarImpl.S(mutate);
        gestaltToolbarImpl.m();
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, requireContext2, (AttributeSet) null);
        gestaltIconButton.t(i.f48616j);
        gestaltIconButton.u(new ca1.h(this, 27));
        gestaltIconButton.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ViewGroup.LayoutParams layoutParams = gestaltIconButton.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        com.bumptech.glide.c.a1((FrameLayout.LayoutParams) layoutParams, 0, 0, gestaltIconButton.getContext().getResources().getDimensionPixelSize(eo1.c.space_200), 0);
        gestaltIconButton.r(16);
        String string = getResources().getString(a62.e.share_simple);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        gestaltToolbarImpl.f(gestaltIconButton, string);
        this.f48626a1 = gestaltIconButton;
        gestaltToolbarImpl.g(true);
    }

    @Override // sq0.e
    public final tq0.b[] S8() {
        return new tq0.b[]{new tq0.c(pb0.g.f99432a, s7())};
    }

    @Override // sq0.e
    public final qa2.n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        d0 s73 = s7();
        y32.f fVar = y32.f.TODAY_ARTICLE_FEED;
        Navigation navigation = this.I;
        boolean S = navigation != null ? navigation.S("com.pinterest.EXTRA_TODAY_ARTICLE_IS_FEED_SINGLE_COLUMN", false) : false;
        if (this.W0 == null) {
            Intrinsics.r("educationHelper");
            throw null;
        }
        boolean h10 = zf0.f.h();
        Navigation navigation2 = this.I;
        return new kl0.a(s73, fVar, pinActionHandler, S, h10, navigation2 != null ? navigation2.S("com.pinterest.EXTRA_TODAY_ARTICLE_IS_SHOPPING_FEED", false) : false, 1).a(new yk1.a(getResources(), requireContext().getTheme()));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        if (f49940b == null) {
            f49940b = "";
        }
        this.f48627b1 = f49940b;
        wv0 wv0Var = new wv0(0);
        wv0Var.d(this.f48627b1);
        Navigation navigation2 = this.I;
        wv0Var.c(navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_TODAY_ARTICLE_TITLE") : null);
        Navigation navigation3 = this.I;
        wv0Var.b(navigation3 != null ? Boolean.valueOf(navigation3.S("com.pinterest.EXTRA_TODAY_ARTICLE_IS_FEED_SINGLE_COLUMN", false)) : Boolean.FALSE);
        zv0 a13 = wv0Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        Navigation navigation4 = this.I;
        int q13 = navigation4 != null ? navigation4.q1(c42.f.UNKNOWN.getValue(), "com.pinterest.EXTRA_TODAY_ARTICLE_REFERRER") : c42.f.UNKNOWN.getValue();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        String str = this.f48627b1;
        f0 f0Var = this.T0;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        bVar.g(new n70.o(f0Var, str));
        i2 i2Var = this.S0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a14 = bVar.a();
        Navigation navigation5 = this.I;
        String v03 = navigation5 != null ? navigation5.v0("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS") : null;
        w f73 = f7();
        w20.a aVar = this.U0;
        if (aVar == null) {
            Intrinsics.r("todayTabService");
            throw null;
        }
        nr0.m mVar = this.V0;
        if (mVar == null) {
            Intrinsics.r("dynamicGridViewBinderDelegateFactory");
            throw null;
        }
        x2 A7 = A7();
        c2 c2Var = this.X0;
        if (c2Var != null) {
            return new n(a14, a13, q13, f73, aVar, mVar, A7, v03, c2Var);
        }
        Intrinsics.r("sharesheetUtils");
        throw null;
    }

    @Override // wk1.k, yq0.t
    /* renamed from: f9 */
    public final void y8(z adapter, sq0.f0 dataSourceProvider) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        super.y8(adapter, dataSourceProvider);
        wk1.i iVar = (wk1.i) dataSourceProvider;
        f fVar = new f(iVar, this, 0);
        f fVar2 = new f(iVar, this, 2);
        f fVar3 = new f(iVar, this, 1);
        a8(new eb2.d(fVar3, fVar2, fVar3, fVar));
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF87513d1() {
        return this.f48629d1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF98673x0() {
        return this.f48628c1;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(n92.c.fragment_today_tab_article_feed, n92.b.p_recycler_view);
        eVar.c(n92.b.today_tab_article_feed_multisection_swipe_container);
        return eVar;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AppBarLayout appBarLayout = this.Z0;
        if (appBarLayout == null) {
            Intrinsics.r("appBarLayout");
            throw null;
        }
        appBarLayout.l(this.f48630e1);
        super.onDestroyView();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = getContext();
        super.onViewCreated(view, bundle);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(n92.b.today_tab_article_feed_header);
        frameLayout.getLayoutParams().height = Math.min(frameLayout.getLayoutParams().height, hf0.b.j(context));
        WebImageView webImageView = (WebImageView) view.findViewById(n92.b.today_tab_article_feed_header_image);
        Navigation navigation = this.I;
        webImageView.loadUrl(navigation != null ? navigation.v0("com.pinterest.EXTRA_TODAY_ARTICLE_HEADER_IMAGE_URL") : null);
        Navigation navigation2 = this.I;
        String v03 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_TODAY_ARTICLE_TITLE") : null;
        GestaltText gestaltText = (GestaltText) view.findViewById(n92.b.today_tab_article_feed_title);
        if (v03 != null) {
            Intrinsics.f(gestaltText);
            a0.p(gestaltText, v03);
        }
        GestaltText gestaltText2 = (GestaltText) view.findViewById(n92.b.today_tab_article_feed_subtitle);
        Navigation navigation3 = this.I;
        String v04 = navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_TODAY_ARTICLE_SUBTITLE") : null;
        if (v04 != null && v04.length() != 0) {
            gestaltText2.i(new qf1.z(v04, 12));
        }
        GestaltText gestaltText3 = (GestaltText) view.findViewById(n92.b.today_tab_article_feed_description);
        Navigation navigation4 = this.I;
        String v05 = navigation4 != null ? navigation4.v0("com.pinterest.EXTRA_TODAY_ARTICLE_DESCRIPTION") : null;
        if (v05 != null && v05.length() != 0) {
            gestaltText3.i(new ic1.c(20, this, new SpannableString(j1.a0(v05))));
        }
        if (com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_TODAY_ARTICLE_ARTICLE_CREATOR_USER_ID", "").length() > 0) {
            View dVar = new yg1.d(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            com.bumptech.glide.c.b1(layoutParams, 0, getResources().getDimensionPixelSize(eo1.c.space_200), 0, 0, 13);
            dVar.setLayoutParams(layoutParams);
            yk1.j jVar = this.R0;
            if (jVar == null) {
                Intrinsics.r("mvpBinder");
                throw null;
            }
            String str = this.f48627b1;
            f0 f0Var = this.T0;
            if (f0Var == null) {
                Intrinsics.r("pinalyticsFactory");
                throw null;
            }
            jVar.d(dVar, new yg1.g(new n70.o(f0Var, str), ((s8) g0.r(context)).z5(), A7(), com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_TODAY_ARTICLE_ARTICLE_CREATOR_USER_ID", "")));
            ((ViewGroup) view.findViewById(n92.b.today_tab_article_following_module_container)).addView(dVar);
        }
        View findViewById = view.findViewById(n92.b.today_tab_article_feed_appbarlayout);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById;
        appBarLayout.b(this.f48630e1);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.Z0 = appBarLayout;
    }

    @Override // nl1.d
    public final y32.f v7() {
        return y32.f.TODAY_ARTICLE_FEED;
    }
}

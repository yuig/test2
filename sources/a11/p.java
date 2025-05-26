package a11;

import ac2.m0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Property;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import androidx.viewpager2.widget.ViewPager2;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.m70;
import com.pinterest.api.model.v7;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.feature.search.results.hairpattern.view.HairPatternEducationView;
import com.pinterest.feature.sharesheet.view.SharesheetModalAppListView;
import com.pinterest.feature.storypin.creation.interesttagging.view.ShoppingBrandCapsule;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconbuttonfloating.GestaltIconButtonFloating;
import com.pinterest.navigation.Navigation;
import com.pinterest.oneBarLibrary.modals.views.BodyTypeFilterEducationView;
import com.pinterest.screens.i0;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.video.core.view.PinterestVideoView;
import ed1.l0;
import fd1.f1;
import i91.k0;
import j51.d0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kh2.c3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m60.r0;
import m60.x0;
import rh1.q0;
import wa2.g0;
import x40.ye;
import x81.f0;
import x81.o0;

/* loaded from: classes5.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f337c;

    public /* synthetic */ p(int i13, Object obj, Object obj2) {
        this.f335a = i13;
        this.f336b = obj;
        this.f337c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int g13;
        vd0.c cVar;
        l2 l2Var;
        int i13 = this.f335a;
        int i14 = 0;
        Object obj = this.f337c;
        Object obj2 = this.f336b;
        switch (i13) {
            case 0:
                q this$0 = (q) obj2;
                dl1.s model = (dl1.s) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(model, "$model");
                long time = new Date().getTime();
                lb0.r rVar = this$0.f339b;
                lz1.c cVar2 = (lz1.c) this$0.f340c;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                int g14 = rVar.g(model instanceof v7 ? "PREF_SCREENSHOT_UPSELL_SEEN_COUNT_2022_V1_BOARD" : "PREF_SCREENSHOT_UPSELL_SEEN_COUNT_2022_V1", 0);
                boolean a13 = cVar2.a(time, k0.SCREENSHOT, model);
                lb0.r rVar2 = this$0.f339b;
                if (a13) {
                    Intrinsics.checkNotNullParameter(model, "model");
                    g13 = rVar2.g(model instanceof v7 ? "PREF_SCREENSHOT_UPSELL_SEEN_LAST_24H_COUNT_2022_V1_BOARD" : "PREF_SCREENSHOT_UPSELL_SEEN_LAST_24H_COUNT_2022_V1", 0);
                } else {
                    g13 = 0;
                }
                Intrinsics.checkNotNullParameter(model, "model");
                boolean z13 = model instanceof v7;
                if (rVar2.f(z13 ? "PREF_UPSELL_SENT_LAST_UPSELL_2022_V1_BOARD" : "PREF_UPSELL_SENT_LAST_UPSELL_2022_V1", false) || g13 < 2) {
                    Intrinsics.checkNotNullParameter(model, "model");
                    rVar2.h(z13 ? "PREF_SCREENSHOT_UPSELL_SEEN_COUNT_2022_V1_BOARD" : "PREF_SCREENSHOT_UPSELL_SEEN_COUNT_2022_V1", g14 + 1);
                    Intrinsics.checkNotNullParameter(model, "model");
                    rVar2.h(z13 ? "PREF_SCREENSHOT_UPSELL_SEEN_LAST_24H_COUNT_2022_V1_BOARD" : "PREF_SCREENSHOT_UPSELL_SEEN_LAST_24H_COUNT_2022_V1", g13 + 1);
                    Intrinsics.checkNotNullParameter(model, "model");
                    rVar2.c(z13 ? "PREF_SCREENSHOT_UPSELL_SEEN_AT_MS_2022_V1_BOARD" : "PREF_SCREENSHOT_UPSELL_SEEN_AT_MS_2022_V1", time);
                    int value = y32.f.CLOSEUP.value();
                    f1 f1Var = f1.SCREENSHOT;
                    m60.w wVar = m60.u.f85943a;
                    Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
                    this$0.f338a.t(model, value, f1Var, false, wVar);
                    if (model instanceof f30) {
                        e0.t.f56748f = true;
                        return;
                    } else {
                        if (z13) {
                            e0.t.f56749g = true;
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1:
                PinCloseupFragment this$02 = (PinCloseupFragment) obj2;
                String pinId = (String) obj;
                int i15 = PinCloseupFragment.f46972m3;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(pinId, "$pinId");
                this$02.f7().d(Navigation.z0(i0.c(), pinId));
                return;
            case 2:
                k11.b this$03 = (k11.b) obj2;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.f78114c.d((Navigation) obj);
                return;
            case 3:
                Bundle result = (Bundle) obj2;
                l11.j this$04 = (l11.j) obj;
                int i16 = l11.j.W1;
                Intrinsics.checkNotNullParameter(result, "$result");
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                if (result.getBoolean("com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_KEY_NEW_COLLAGE", false)) {
                    this$04.dismiss();
                    return;
                }
                return;
            case 4:
                d0 this$05 = (d0) obj2;
                Runnable runnable = (Runnable) obj;
                int i17 = d0.f74720s1;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                if (this$05.V0 == null) {
                    Intrinsics.r("educationHelper");
                    throw null;
                }
                zf0.f.a(runnable);
                RecyclerView g83 = this$05.g8();
                if (g83 != null) {
                    g83.w2(this$05.f74738r1);
                    return;
                }
                return;
            case 5:
                GestaltIconButton gestaltIconButton = (GestaltIconButton) obj2;
                View parent = (View) obj;
                List list = HairPatternEducationView.f47651h;
                Intrinsics.checkNotNullParameter(parent, "$parent");
                Rect rect = new Rect();
                gestaltIconButton.getHitRect(rect);
                int i18 = eo1.c.space_400;
                rect.top -= i18;
                rect.bottom += i18;
                rect.left -= i18;
                rect.right += i18;
                parent.setTouchDelegate(new TouchDelegate(rect, gestaltIconButton));
                return;
            case 6:
                c71.z this$06 = (c71.z) obj2;
                bb2.e fixedHeightImageSpec = (bb2.e) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(fixedHeightImageSpec, "$fixedHeightImageSpec");
                if (this$06.Q.f26728a == h61.h.PRODUCTS) {
                    wa2.i iVar = this$06.f26852i.f130131b.f103320a;
                    g0 g0Var = iVar.f128764c0;
                    iVar.f128764c0 = g0Var != null ? g0.a(g0Var, fixedHeightImageSpec, false, 33554367) : new g0(false, false, false, false, false, false, fixedHeightImageSpec, null, null, false, false, false, false, 0, false, false, false, false, false, false, false, false, 33554367);
                    this$06.f26879v0 = false;
                    return;
                }
                return;
            case 7:
                bl1.a aVar = (bl1.a) obj2;
                s81.p this$07 = (s81.p) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                if (aVar == null || (cVar = aVar.f23479b) == null) {
                    return;
                }
                ha2.a0 a0Var = s81.p.f111919b0;
                this$07.getClass();
                nm.u uVar = cVar.f125623a;
                nm.s v13 = uVar.v("data");
                nm.q qVar = v13 instanceof nm.q ? (nm.q) v13 : null;
                if ((qVar != null && !qVar.f91364a.isEmpty()) || this$07.P == m81.k.NO_ERROR) {
                    this$07.P = m81.k.NO_ERROR;
                    this$07.f4();
                    return;
                }
                Object v14 = uVar.v("display_error_message_1");
                String str = v14 instanceof String ? (String) v14 : null;
                yk1.v vVar = this$07.f111946x;
                if (str == null) {
                    str = ((yk1.a) vVar).f139224a.getString(uc2.h.lens_backend_error_title);
                }
                this$07.Q = str;
                Object v15 = uVar.v("display_error_message_2");
                String str2 = v15 instanceof String ? (String) v15 : null;
                if (str2 == null) {
                    str2 = ((yk1.a) vVar).f139224a.getString(uc2.h.lens_backend_error_message);
                }
                this$07.R = str2;
                Object v16 = uVar.v("display_error_button");
                String str3 = v16 instanceof String ? (String) v16 : null;
                if (str3 == null) {
                    str3 = ((yk1.a) vVar).f139224a.getString(x0.try_again);
                }
                this$07.S = str3;
                this$07.P = m81.k.ERROR_PROCESSED;
                this$07.e4(m81.g.RESULTS_ERROR);
                this$07.f4();
                return;
            case 8:
                o0 this$08 = (o0) obj2;
                List list2 = (List) obj;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                if (this$08.U || !this$08.isBound()) {
                    return;
                }
                this$08.U = true;
                this$08.T = list2;
                if (list2 == null) {
                    return;
                }
                List list3 = list2;
                ArrayList skinToneFilters = new ArrayList(kotlin.collections.g0.q(list3, 10));
                Iterator it = list3.iterator();
                while (true) {
                    int i19 = i14;
                    if (!it.hasNext()) {
                        f0 f0Var = (f0) ((x81.v) this$08.getView());
                        f0Var.getClass();
                        Intrinsics.checkNotNullParameter(skinToneFilters, "skinToneFilters");
                        g71.f fVar = f0Var.f134204f2;
                        if (fVar != null) {
                            fVar.b(e71.b.ROUNDED_RECT, skinToneFilters);
                            return;
                        }
                        return;
                    }
                    Object next = it.next();
                    i14 = i19 + 1;
                    if (i19 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    e71.a aVar2 = (e71.a) next;
                    skinToneFilters.add(new d71.a(aVar2.getDisplay(), i19, Intrinsics.d(String.valueOf(aVar2.getId()), this$08.f134273i), null, aVar2.f57621e, aVar2.getTerm()));
                }
                break;
            case 9:
                List<m70> productFilterItems = (List) obj2;
                d91.j this$09 = (d91.j) obj;
                int i23 = d91.j.f54083v1;
                Intrinsics.checkNotNullParameter(productFilterItems, "$productFilterItems");
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                for (m70 m70Var : productFilterItems) {
                    ShoppingBrandCapsule shoppingBrandCapsule = new ShoppingBrandCapsule((ContextWrapper) this$09.getContext());
                    String i24 = m70Var.i();
                    if (i24 != null) {
                        shoppingBrandCapsule.b(i24);
                        shoppingBrandCapsule.c(vn1.c.LIGHT);
                        shoppingBrandCapsule.a();
                        c91.g gVar = c91.g.BRAND;
                        if (!StringsKt.E(i24, gVar.getText(), true)) {
                            gVar = c91.g.PRICE;
                            if (!StringsKt.E(i24, gVar.getText(), true)) {
                                gVar = c91.g.COLOR;
                                if (!StringsKt.E(i24, gVar.getText(), true)) {
                                    gVar = null;
                                }
                            }
                        }
                        if (gVar != null) {
                            this$09.f54092p1.put(gVar, shoppingBrandCapsule);
                            shoppingBrandCapsule.setOnClickListener(new qv0.d0(23, this$09, gVar));
                        }
                    }
                    LinearLayout linearLayout = this$09.f54086j1;
                    if (linearLayout == null) {
                        Intrinsics.r("filterContainer");
                        throw null;
                    }
                    linearLayout.addView(shoppingBrandCapsule);
                }
                HorizontalScrollView horizontalScrollView = this$09.f54085i1;
                if (horizontalScrollView != null) {
                    horizontalScrollView.setVisibility(0);
                    return;
                } else {
                    Intrinsics.r("filterPillsCarousel");
                    throw null;
                }
            case 10:
                ed1.i this$010 = (ed1.i) obj2;
                List appList = (List) obj;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(appList, "$appList");
                SharesheetModalAppListView sharesheetModalAppListView = (SharesheetModalAppListView) this$010.getViewIfBound();
                PinterestRecyclerView pinterestRecyclerView = sharesheetModalAppListView != null ? sharesheetModalAppListView.getPinterestRecyclerView() : null;
                if (pinterestRecyclerView != null) {
                    if (!this$010.f58643u || appList.size() <= 4) {
                        l2Var = this$010.f58645w;
                        if (l2Var == null) {
                            Intrinsics.r("defaultLayoutManager");
                            throw null;
                        }
                    } else {
                        l2Var = this$010.f58644v;
                    }
                    pinterestRecyclerView.l(l2Var);
                }
                SharesheetModalAppListView sharesheetModalAppListView2 = (SharesheetModalAppListView) this$010.getViewIfBound();
                PinterestRecyclerView pinterestRecyclerView2 = sharesheetModalAppListView2 != null ? sharesheetModalAppListView2.getPinterestRecyclerView() : null;
                if (pinterestRecyclerView2 == null) {
                    return;
                }
                pinterestRecyclerView2.setVisibility(0);
                return;
            case 11:
                l0 this$011 = (l0) obj2;
                View it2 = (View) obj;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(it2, "$it");
                if (this$011.f58660e.g("PREF_BOARD_EDU_TOOLTIP_EDUCATION_SEEN_COUNT", 0) < 2) {
                    lb0.q qVar2 = this$011.f58660e;
                    qVar2.i("PREF_BOARD_EDU_TOOLTIP_EDUCATION_SEEN_COUNT", qVar2.g("PREF_BOARD_EDU_TOOLTIP_EDUCATION_SEEN_COUNT", 0) + 1);
                    this$011.f58661f.j(it2, new ym1.t(ym1.e.RIGHT_CENTER), ed1.c.B, ed1.c.C, null, ed1.k0.f58654i, null, null, ed1.c.D);
                    return;
                }
                return;
            case 12:
                bb2.e fixedHeightImageSpec2 = (bb2.e) obj2;
                id1.g this$012 = (id1.g) obj;
                Intrinsics.checkNotNullParameter(fixedHeightImageSpec2, "$fixedHeightImageSpec");
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                g0 g0Var2 = new g0(false, false, false, false, false, false, fixedHeightImageSpec2, null, null, false, false, false, false, 0, false, false, false, false, false, false, false, false, 33554367);
                if (this$012.isBound()) {
                    yk1.n view = this$012.getView();
                    Intrinsics.g(view, "null cannot be cast to non-null type com.pinterest.feature.shopping.baseshoppingfeed.BaseShoppingFeedContract.BaseShoppingFeedView.ShoppingDynamicGridHeightView");
                    ((gd1.a) view).B5(g0Var2);
                    return;
                }
                return;
            case 13:
                de1.t this$013 = (de1.t) obj2;
                ArrayList filters = (ArrayList) obj;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(filters, "$filters");
                de1.x xVar = this$013.f54655k;
                if (xVar != null) {
                    xVar.K3(filters, this$013.f54657m);
                }
                this$013.f54654j = filters;
                return;
            case 14:
                de1.x this$014 = (de1.x) obj2;
                zd1.g multiSelectFilter = (zd1.g) obj;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(multiSelectFilter, "$multiSelectFilter");
                this$014.u1(this$014.f54667h.indexOf(multiSelectFilter), multiSelectFilter);
                return;
            case 15:
                de1.a0 this$015 = (de1.a0) obj2;
                zd1.g multiSelectFilter2 = (zd1.g) obj;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                Intrinsics.checkNotNullParameter(multiSelectFilter2, "$multiSelectFilter");
                this$015.u1(this$015.f54565i.indexOf(multiSelectFilter2), multiSelectFilter2);
                return;
            case 16:
                yf1.d this$016 = (yf1.d) obj2;
                a42.r rating = (a42.r) obj;
                int i25 = yf1.d.f138967c;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                Intrinsics.checkNotNullParameter(rating, "$rating");
                this$016.f138968a.invoke(rating);
                return;
            case 17:
                q21.d this_apply = (q21.d) obj2;
                zg1.c this$017 = (zg1.c) obj;
                int i26 = zg1.c.f141957d;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                this_apply.g(this$017.f141960c.getWidth(), this$017.f141960c.getHeight());
                return;
            case 18:
                f30 pin = (f30) obj2;
                com.pinterest.feature.todaytab.tab.view.q this$018 = (com.pinterest.feature.todaytab.tab.view.q) obj;
                int i27 = com.pinterest.feature.todaytab.tab.view.q.f48740i;
                Intrinsics.checkNotNullParameter(pin, "$pin");
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                String imageUrl = bs1.c.y0(pin);
                if (imageUrl != null) {
                    q21.d dVar = this$018.f48744d;
                    String i43 = pin.i4();
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                    dVar.f102137l.e4(imageUrl, i43);
                    this$018.f48744d.g(this$018.f48745e.getWidth(), (int) ((r0.getWidth() / bs1.c.z0(pin)) * bs1.c.x0(pin)));
                    return;
                }
                return;
            case 19:
                q0 this$019 = (q0) obj2;
                ca2.e this_apply2 = (ca2.e) obj;
                int i28 = q0.B1;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                Navigation navigation = this$019.I;
                if (navigation == null || !navigation.S("com.pinterest.EXTRA_COMMENT_FEED_HALF_EXPANDED", false)) {
                    this_apply2.s("initial_slide_up", true);
                    return;
                } else {
                    this_apply2.u();
                    return;
                }
            case 20:
                pp1.f this$020 = (pp1.f) obj2;
                pp1.h expandAction = (pp1.h) obj;
                int i29 = pp1.f.f100918i;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                Intrinsics.checkNotNullParameter(expandAction, "$expandAction");
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this$020.f100924f, (Property<ConstraintLayout, Float>) View.TRANSLATION_Y, this$020.getHeight(), this$020.getHeight() - this$020.f100924f.getHeight());
                expandAction.getClass();
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(new DecelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
                ofFloat.start();
                return;
            case 21:
                pp1.f this$021 = (pp1.f) obj2;
                pp1.g expandAction2 = (pp1.g) obj;
                int i33 = pp1.f.f100918i;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                Intrinsics.checkNotNullParameter(expandAction2, "$expandAction");
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this$021.f100924f, (Property<ConstraintLayout, Float>) View.TRANSLATION_Y, this$021.getHeight() - this$021.f100924f.getHeight(), this$021.getHeight());
                expandAction2.getClass();
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new DecelerateInterpolator());
                c3.i(ofFloat2, new yj1.d(this$021, 16));
                Intrinsics.checkNotNullExpressionValue(ofFloat2, "apply(...)");
                ofFloat2.start();
                return;
            case 22:
                GestaltIconButtonFloating gestaltIconButtonFloating = (GestaltIconButtonFloating) obj2;
                View parent2 = (View) obj;
                int i34 = BodyTypeFilterEducationView.f49996g;
                Intrinsics.checkNotNullParameter(parent2, "$parent");
                Rect rect2 = new Rect();
                gestaltIconButtonFloating.getHitRect(rect2);
                Resources resources = gestaltIconButtonFloating.getContext().getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                int U = bs1.c.U(r0.margin_double, resources);
                rect2.top -= U;
                rect2.bottom += U;
                rect2.left -= U;
                rect2.right += U;
                parent2.setTouchDelegate(new TouchDelegate(rect2, gestaltIconButtonFloating));
                return;
            case 23:
                com.google.firebase.messaging.q this$022 = (com.google.firebase.messaging.q) obj2;
                ye mutation = (ye) obj;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                Intrinsics.checkNotNullParameter(mutation, "$mutation");
                com.bumptech.glide.d.u0(((oc.c) ((xk2.k) this$022.f33806d).getValue()).a(mutation)).r(tk2.e.f118017c).o(new yx1.l(9, com.pinterest.pushnotification.a.f50251l), new yx1.l(10, com.pinterest.pushnotification.a.f50252m));
                return;
            case 24:
                View view2 = (View) obj2;
                ViewPager2 pager = (ViewPager2) obj;
                int i35 = a02.d.f218l0;
                Intrinsics.checkNotNullParameter(view2, "$view");
                Intrinsics.checkNotNullParameter(pager, "$pager");
                view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = pager.getLayoutParams();
                layoutParams.height = view2.getMeasuredHeight();
                pager.setLayoutParams(layoutParams);
                pager.invalidate();
                return;
            case 25:
                l62.a0 this$023 = (l62.a0) obj2;
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                Intrinsics.checkNotNullParameter(throwable, "$throwable");
                this$023.f81618d.invoke(new l62.u(throwable));
                return;
            case 26:
                c92.f this$024 = (c92.f) obj2;
                c92.h expandAction3 = (c92.h) obj;
                int i36 = c92.f.f27000i;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                Intrinsics.checkNotNullParameter(expandAction3, "$expandAction");
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this$024.f27006f, (Property<ConstraintLayout, Float>) View.TRANSLATION_Y, this$024.getHeight(), this$024.getHeight() - this$024.f27006f.getHeight());
                expandAction3.getClass();
                ofFloat3.setDuration(200L);
                ofFloat3.setInterpolator(new DecelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(ofFloat3, "apply(...)");
                ofFloat3.start();
                return;
            case 27:
                c92.f this$025 = (c92.f) obj2;
                c92.g expandAction4 = (c92.g) obj;
                int i37 = c92.f.f27000i;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                Intrinsics.checkNotNullParameter(expandAction4, "$expandAction");
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this$025.f27006f, (Property<ConstraintLayout, Float>) View.TRANSLATION_Y, this$025.getHeight() - this$025.f27006f.getHeight(), this$025.getHeight());
                expandAction4.getClass();
                ofFloat4.setDuration(200L);
                ofFloat4.setInterpolator(new DecelerateInterpolator());
                c3.i(ofFloat4, new c72.o(this$025, 8));
                Intrinsics.checkNotNullExpressionValue(ofFloat4, "apply(...)");
                ofFloat4.start();
                return;
            case 28:
                bc2.k kVar = (bc2.k) obj2;
                PinterestVideoView this$026 = (PinterestVideoView) obj;
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                String b13 = m0.b(kVar.f22663g);
                ac2.v vVar2 = ac2.w.f2066a;
                Context context = this$026.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                h7.w wVar2 = (h7.w) ac2.w.b(context);
                wVar2.o(kVar.f22663g);
                if (b13 != null) {
                    HashSet j13 = wVar2.j();
                    Intrinsics.checkNotNullExpressionValue(j13, "getKeys(...)");
                    Iterator it3 = j13.iterator();
                    while (it3.hasNext()) {
                        String str4 = (String) it3.next();
                        if (StringsKt.E(str4, b13, true)) {
                            wVar2.o(str4);
                        }
                    }
                    return;
                }
                return;
            default:
                hg2.d dVar2 = (hg2.d) obj2;
                Context context2 = (Context) obj;
                int i38 = hg2.d.f69088c;
                try {
                    c0.d.M2("power-service-registration");
                    try {
                        xk2.q qVar3 = xk2.s.f135225b;
                        if (dVar2.f69089a.invoke() != null) {
                            context2.registerReceiver(dVar2, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
                        }
                        Unit unit = Unit.f80348a;
                    } catch (Throwable th3) {
                        xk2.q qVar4 = xk2.s.f135225b;
                        ue.c.m(th3);
                    }
                    Unit unit2 = Unit.f80348a;
                    return;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } finally {
                        c0.d.N();
                    }
                }
        }
    }
}

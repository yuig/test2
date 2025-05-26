package com.pinterest.education.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.design.brio.widget.voice.PinterestToolTip;
import com.pinterest.education.event.BoardCreateOrPickerNavigationProviderImpl;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.w4;
import df.j1;
import dg0.d;
import dg0.h;
import dg0.j;
import dg0.k;
import dg0.o;
import dg0.p;
import dg0.q;
import eg0.c;
import gg0.z;
import h32.f1;
import h32.g0;
import h32.u0;
import i32.l;
import i32.y0;
import jg0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls1.m;
import m60.u;
import m60.w;
import nt.c2;
import nx.d0;
import oe0.e;
import oe0.g;
import org.jetbrains.annotations.NotNull;
import rg0.n;
import so.oa;
import so1.b;
import v.b2;
import xk2.v;
import zf0.f;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/education/view/EducationToolTipView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "educationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EducationToolTipView extends FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f45022m = 0;

    /* renamed from: a, reason: collision with root package name */
    public View f45023a;

    /* renamed from: b, reason: collision with root package name */
    public final PinterestToolTip f45024b;

    /* renamed from: c, reason: collision with root package name */
    public final g f45025c;

    /* renamed from: d, reason: collision with root package name */
    public final float f45026d;

    /* renamed from: e, reason: collision with root package name */
    public final int f45027e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f45028f;

    /* renamed from: g, reason: collision with root package name */
    public final c2 f45029g;

    /* renamed from: h, reason: collision with root package name */
    public final f f45030h;

    /* renamed from: i, reason: collision with root package name */
    public final w f45031i;

    /* renamed from: j, reason: collision with root package name */
    public c f45032j;

    /* renamed from: k, reason: collision with root package name */
    public String f45033k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f45034l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EducationToolTipView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(i32.c cVar, boolean z13, View view, boolean z14) {
        View view2;
        f fVar = this.f45030h;
        if (view == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view2 = fVar.d(context, cVar);
            if (view2 == null) {
                return;
            }
        } else {
            view2 = view;
        }
        this.f45023a = view2;
        Object parent = getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
        View view3 = this.f45023a;
        Intrinsics.g(view3, "null cannot be cast to non-null type android.view.View");
        fVar.getClass();
        if (!f.k((View) parent, view3, cVar)) {
            setVisibility(8);
            this.f45028f.removeCallbacksAndMessages(null);
            this.f45034l = true;
            return;
        }
        View view4 = this.f45023a;
        Intrinsics.f(view4);
        Resources resources = view4.getResources();
        int i13 = this.f45025c.f94231a;
        switch (cVar == null ? -1 : z.f64969a[cVar.ordinal()]) {
            case 1:
                Intrinsics.f(resources);
                int i14 = a.following_feed_education_tooltip_width;
                Intrinsics.checkNotNullParameter(resources, "<this>");
                i13 = resources.getDimensionPixelOffset(i14);
                break;
            case 2:
                Intrinsics.f(resources);
                int i15 = a.following_feed_education_tooltip_width;
                Intrinsics.checkNotNullParameter(resources, "<this>");
                i13 = resources.getDimensionPixelOffset(i15);
                break;
            case 3:
                Intrinsics.f(resources);
                int i16 = a.wishlist_icon_education_tooltip_width;
                Intrinsics.checkNotNullParameter(resources, "<this>");
                i13 = resources.getDimensionPixelOffset(i16);
                break;
            case 4:
                Intrinsics.f(resources);
                int i17 = a.create_profile_highlight_tooltip_width;
                Intrinsics.checkNotNullParameter(resources, "<this>");
                i13 = resources.getDimensionPixelOffset(i17);
                break;
            case 5:
                n e13 = fVar.e();
                if (e13 != null) {
                    if (e13.f108060b == l.ANDROID_CLOSEUP_REACTION_TOOLTIP_3.value()) {
                        Intrinsics.f(resources);
                        int i18 = a.reaction_tooltip_3_width;
                        Intrinsics.checkNotNullParameter(resources, "<this>");
                        i13 = resources.getDimensionPixelOffset(i18);
                        break;
                    }
                }
                break;
            case 6:
                if (j1.D0(y0.ANDROID_NEWS_HUB_DETAIL_TAKEOVER, l.ANDROID_NEWS_HUB_UPSELL_HF_TOOLTIP)) {
                    Intrinsics.f(resources);
                    int i19 = a.news_hub_detail_education_tooltip_width;
                    Intrinsics.checkNotNullParameter(resources, "<this>");
                    i13 = resources.getDimensionPixelOffset(i19);
                    break;
                }
                break;
        }
        int i23 = i13 > r1 ? r1 : i13;
        PinterestToolTip pinterestToolTip = this.f45024b;
        Intrinsics.g(pinterestToolTip, "null cannot be cast to non-null type com.pinterest.design.brio.widget.voice.PinterestVoiceLayout");
        View view5 = this.f45023a;
        Intrinsics.g(view5, "null cannot be cast to non-null type android.view.View");
        boolean b13 = this.f45025c.b(pinterestToolTip, view5, e.ANCHOR_TO_CENTER, null, i23, this.f45034l, z14, new b2(z13, this));
        setVisibility(0);
        if (this.f45034l && b13) {
            this.f45034l = false;
        }
    }

    public final void b() {
        String obj;
        u0 u0Var = u0.EDUCATION_TOOLTIP_CONFIRM_BUTTON;
        d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        f1 f1Var = f1.TAP;
        g0 g0Var = g0.EDUCATION_TOOLTIP_POPUP;
        f fVar = this.f45030h;
        a13.N(f1Var, u0Var, g0Var, String.valueOf(fVar.f141905b), false);
        c cVar = this.f45032j;
        Intrinsics.f(cVar);
        i32.c anchor = i32.c.findByValue(cVar.f58891j);
        if (anchor != null) {
            c cVar2 = this.f45032j;
            Intrinsics.f(cVar2);
            String completeButtonAuxData = cVar2.f58886e;
            Intrinsics.checkNotNullExpressionValue(completeButtonAuxData, "completeButtonAuxData");
            if (completeButtonAuxData.length() > 0) {
                c cVar3 = this.f45032j;
                Intrinsics.f(cVar3);
                obj = cVar3.f58886e;
            } else {
                fVar.getClass();
                if (f.f(y0.ANDROID_SEARCH_PIN_RESULTS_TAKEOVER, new l[]{l.ANDROID_USM_REPEATED_SEARCH_UPSELL, l.ANDROID_USM_HIGH_QUALITY_SEARCH_UPSELL, l.ANDROID_USM_BOARD_CREATE_UPSELL_SEARCH_SCROLL, l.USM_CHRISTMAS_SEARCH_TOOLTIP_UPSELL})) {
                    c cVar4 = this.f45032j;
                    Intrinsics.f(cVar4);
                    obj = cVar4.f58882a;
                } else {
                    y0 y0Var = y0.ANDROID_USER_PROFILE_TAKEOVER;
                    l lVar = l.ANDROID_INSTAGRAM_ACCOUNT_CLAIMING_PROFILE_TAKEOVER;
                    obj = f.f(y0Var, new l[]{lVar}) ? lVar.toString() : this.f45033k;
                }
            }
            Intrinsics.checkNotNullParameter(anchor, "anchor");
            switch (q.f54929a[anchor.ordinal()]) {
                case 1:
                    u.f85943a.d(new dg0.f());
                    break;
                case 2:
                    u.f85943a.d(new o());
                    break;
                case 3:
                    u.f85943a.d(new g4.u());
                    break;
                case 4:
                    if (obj == null) {
                        obj = "";
                    }
                    u.f85943a.d(new m(obj));
                    break;
                case 5:
                    v vVar = f.f141903e;
                    vb0.e.e().getClass();
                    if (f.f(y0.ANDROID_SEARCH_PIN_RESULTS_TAKEOVER, new l[]{l.ANDROID_USM_REPEATED_SEARCH_UPSELL, l.ANDROID_USM_HIGH_QUALITY_SEARCH_UPSELL, l.ANDROID_USM_BOARD_CREATE_UPSELL_SEARCH_SCROLL, l.USM_CHRISTMAS_SEARCH_TOOLTIP_UPSELL})) {
                        w wVar = u.f85943a;
                        Context context = kb0.a.f79058b;
                        wVar.d(((BoardCreateOrPickerNavigationProviderImpl) ((oa) ((b) ep.b.g(b.class))).Dc.get()).getNavigation(obj));
                        break;
                    }
                    break;
                case 6:
                    if (obj == null) {
                        obj = "";
                    }
                    if (obj.length() != 0) {
                        u.f85943a.d(Navigation.z0((ScreenLocation) w4.f51518a.getValue(), obj));
                        break;
                    } else {
                        u.f85943a.d(Navigation.w1((ScreenLocation) w4.f51519b.getValue()));
                        break;
                    }
                case 7:
                    u.f85943a.d(new k());
                    break;
                case 8:
                    u.f85943a.d(new j());
                    break;
                case 9:
                    u.f85943a.d(new g4.u());
                    break;
                case 10:
                    if (!Intrinsics.d(obj, "is_manual_filters_education_tooltip")) {
                        if (!Intrinsics.d(obj, "is_allow_idea_pin_downloads")) {
                            if (!Intrinsics.d(obj, "is_about_drawer_tooltip")) {
                                if (!Intrinsics.d(obj, "is_deprecate_video_profile_cover_tooltip")) {
                                    if (!Intrinsics.d(obj, "is_deprecate_tilted_pins_profile_cover_tooltip")) {
                                        if (!Intrinsics.d(obj, "is_account_level_comment_control")) {
                                            if (!Intrinsics.d(obj, l.ANDROID_INSTAGRAM_ACCOUNT_CLAIMING_PROFILE_TAKEOVER.toString())) {
                                                u.f85943a.d(new dg0.n());
                                                break;
                                            }
                                        } else {
                                            u.f85943a.d(new dg0.e());
                                            break;
                                        }
                                    } else {
                                        u.f85943a.d(new dg0.g());
                                        break;
                                    }
                                } else {
                                    u.f85943a.d(new h());
                                    break;
                                }
                            } else {
                                u.f85943a.d(new d());
                                break;
                            }
                        } else {
                            u.f85943a.d(new dg0.l());
                            break;
                        }
                    } else {
                        u.f85943a.d(new dg0.m());
                        break;
                    }
                    break;
            }
        }
        c cVar5 = this.f45032j;
        if (cVar5 != null) {
            int value = i32.u.COMPLETE.value();
            w wVar2 = this.f45031i;
            int i13 = cVar5.f58890i;
            if (i13 == value) {
                c cVar6 = this.f45032j;
                Intrinsics.f(cVar6);
                wVar2.d(new p(cVar6.f58887f));
            } else if (i13 == i32.u.DONT_COMPLETE_AND_HIDE.value()) {
                wVar2.d(new dg0.c(dg0.b.DISMISS_UI));
            }
        }
    }

    public final void c() {
        u0 u0Var = u0.EDUCATION_TOOLTIP_DISMISS_BUTTON;
        d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        a13.N(f1.TAP, u0Var, g0.EDUCATION_TOOLTIP_POPUP, String.valueOf(this.f45030h.f141905b), false);
        c cVar = this.f45032j;
        w wVar = this.f45031i;
        if (cVar != null) {
            if (cVar.f58889h == i32.u.COMPLETE.value()) {
                wVar.d(new dg0.c(dg0.b.DISMISS));
                return;
            }
        }
        wVar.d(new dg0.c(dg0.b.DISMISS_UI));
    }

    @Override // android.view.View
    public final boolean onFilterTouchEventForSecurity(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationToolTipView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        PinterestToolTip pinterestToolTip = new PinterestToolTip(6, context, (AttributeSet) null);
        addView(pinterestToolTip, new FrameLayout.LayoutParams(-2, -2));
        this.f45024b = pinterestToolTip;
        this.f45025c = new g(getResources());
        this.f45026d = bs1.c.Z(this, eo1.c.tool_tips_anim_y_offset);
        this.f45027e = getResources().getInteger(eo1.e.tool_tips_anim_duration_msec);
        this.f45028f = new Handler();
        this.f45029g = new c2(this, 11);
        v vVar = f.f141903e;
        this.f45030h = vb0.e.e();
        w wVar = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        this.f45031i = wVar;
        this.f45034l = true;
    }
}

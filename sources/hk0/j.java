package hk0;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.pinterest.feature.board.detail.actions.view.BoardActionUpsellBannerView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import h32.f1;
import h32.g0;
import h32.u0;
import i32.o;
import i32.r;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.f0;
import m60.r0;
import nx.d0;
import rg0.n;
import xk2.v;

/* loaded from: classes5.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f69313a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f69314b;

    /* renamed from: c, reason: collision with root package name */
    public final n f69315c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f69316d;

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f69317e;

    /* renamed from: f, reason: collision with root package name */
    public final Function2 f69318f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f69319g;

    /* renamed from: h, reason: collision with root package name */
    public final u0 f69320h;

    /* renamed from: i, reason: collision with root package name */
    public View f69321i;

    /* renamed from: j, reason: collision with root package name */
    public ek2.j f69322j;

    /* renamed from: k, reason: collision with root package name */
    public int f69323k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f69324l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f69325m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f69326n;

    /* renamed from: o, reason: collision with root package name */
    public final v f69327o;

    /* renamed from: p, reason: collision with root package name */
    public final e f69328p;

    public j(Context context, ViewGroup parentView, n experienceValue, String str, d0 pinalytics, Function2 primaryActionButtonAction, Function2 dismissButtonAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(primaryActionButtonAction, "primaryActionButtonAction");
        Intrinsics.checkNotNullParameter(dismissButtonAction, "dismissButtonAction");
        this.f69313a = context;
        this.f69314b = parentView;
        this.f69315c = experienceValue;
        this.f69316d = pinalytics;
        this.f69317e = primaryActionButtonAction;
        this.f69318f = dismissButtonAction;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("board_id", str);
        }
        this.f69319g = hashMap;
        this.f69320h = u0.BOARD_ACTION_UPSELL_BANNER;
        this.f69327o = xk2.m.b(f.f69306i);
        this.f69328p = new e(this, 2);
    }

    public static final void a(j jVar, b bVar) {
        int i13;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        jVar.i();
        View view = jVar.f69321i;
        if (view != null) {
            int width = view.getWidth();
            if (bVar == b.LEFT) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                width += marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
                i13 = -1;
            } else {
                if (bVar == b.RIGHT) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    width += marginLayoutParams != null ? marginLayoutParams.rightMargin : 0;
                }
                i13 = 1;
            }
            view.animate().translationX(i13 * width).setStartDelay(0L).setDuration(jVar.f69313a.getResources().getInteger(m60.u0.anim_speed_fast)).setInterpolator(new DecelerateInterpolator(2.0f)).setListener(new h(jVar, view, 1)).start();
        }
        ek2.j jVar2 = jVar.f69322j;
        if (jVar2 != null) {
            bk2.c.dispose(jVar2);
        }
    }

    public void b() {
        String text;
        String imageUrl;
        String imageUrl2;
        ag2.e eVar = this.f69315c.f108068j;
        rg0.c cVar = eVar instanceof rg0.c ? (rg0.c) eVar : null;
        BoardActionUpsellBannerView boardActionUpsellBannerView = new BoardActionUpsellBannerView(this.f69313a);
        e action = new e(this, 0);
        Intrinsics.checkNotNullParameter(action, "action");
        defpackage.a aVar = new defpackage.a(8, action);
        GestaltButton gestaltButton = boardActionUpsellBannerView.f45179m;
        gestaltButton.e(aVar);
        e action2 = new e(this, 1);
        Intrinsics.checkNotNullParameter(action2, "action");
        defpackage.a aVar2 = new defpackage.a(7, action2);
        GestaltButton gestaltButton2 = boardActionUpsellBannerView.f45178l;
        gestaltButton2.e(aVar2);
        String text2 = cVar != null ? cVar.f107966d : null;
        if (text2 == null) {
            text2 = "";
        }
        Intrinsics.checkNotNullParameter(text2, "text");
        int i13 = 11;
        gestaltButton.d(new ip.d(i13, text2));
        String str = cVar != null ? cVar.f107967e : null;
        String text3 = str != null ? str : "";
        Intrinsics.checkNotNullParameter(text3, "text");
        gestaltButton2.d(new ip.d(i13, text3));
        o oVar = cVar != null ? cVar.f107968f : null;
        if (oVar != null && c.f69301a[oVar.ordinal()] == 1) {
            boardActionUpsellBannerView.x(2);
        } else {
            boardActionUpsellBannerView.x(1);
        }
        GestaltText gestaltText = boardActionUpsellBannerView.f45177k;
        if (cVar != null && (imageUrl2 = cVar.f107971i) != null) {
            Intrinsics.checkNotNullParameter(imageUrl2, "imageUrl");
            WebImageView webImageView = boardActionUpsellBannerView.f45175i;
            webImageView.loadUrl(imageUrl2);
            webImageView.setVisibility(0);
            boolean z13 = !z.j(imageUrl2);
            int i14 = 4;
            ViewGroup viewGroup = boardActionUpsellBannerView.f45174h;
            if (z13) {
                bs1.c.U1(viewGroup);
                gestaltText.i(new yb0.m(vn1.b.START, i14));
            } else {
                bs1.c.X0(viewGroup);
                gestaltText.i(new yb0.m(vn1.b.CENTER_HORIZONTAL, i14));
            }
        }
        if (cVar != null && (imageUrl = cVar.f107972j) != null) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            WebImageView webImageView2 = boardActionUpsellBannerView.f45176j;
            webImageView2.loadUrl(imageUrl);
            webImageView2.setVisibility(0);
        }
        if (cVar != null && (text = cVar.f107965c) != null) {
            Intrinsics.checkNotNullParameter(text, "text");
            gestaltText.i(new ip.d(10, text));
        }
        this.f69321i = boardActionUpsellBannerView;
        m();
    }

    public void c(boolean z13) {
        r rVar;
        r rVar2;
        ag2.e eVar = this.f69315c.f108068j;
        rg0.c cVar = eVar instanceof rg0.c ? (rg0.c) eVar : null;
        if (z13) {
            if (cVar == null || (rVar2 = cVar.f107969g) == null) {
                return;
            }
            this.f69317e.invoke(rVar2, cVar);
            return;
        }
        if (cVar == null || (rVar = cVar.f107970h) == null) {
            return;
        }
        this.f69318f.invoke(rVar, cVar);
    }

    public g0 d() {
        return null;
    }

    public u0 e() {
        return this.f69320h;
    }

    public HashMap f() {
        return this.f69319g;
    }

    public long g() {
        return 20000L;
    }

    public final View h() {
        b();
        this.f69324l = true;
        final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        Context context = this.f69313a;
        g0Var.f80425a = context.getResources().getDimension(r0.lego_floating_nav_bottom_screen_offset);
        f0 f0Var = r70.b.f106349i;
        if (f0Var.k0().f106352b) {
            g0Var.f80425a = context.getResources().getDimension(r0.lego_floating_nav_bottom_screen_offset) + context.getResources().getDimension(r0.lego_floating_nav_bottom_bar_height);
        }
        final View view = this.f69321i;
        if (view != null) {
            n nVar = this.f69315c;
            nVar.g();
            this.f69316d.h0((r18 & 1) != 0 ? f1.TAP : f1.VIEW, (r18 & 2) != 0 ? null : e(), (r18 & 4) != 0 ? null : d(), (r18 & 8) != 0 ? null : String.valueOf(nVar.f108060b), (r18 & 32) != 0 ? null : f(), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            view.post(new Runnable() { // from class: hk0.a
                @Override // java.lang.Runnable
                public final void run() {
                    View it = view;
                    Intrinsics.checkNotNullParameter(it, "$it");
                    kotlin.jvm.internal.g0 showTranslationValue = g0Var;
                    Intrinsics.checkNotNullParameter(showTranslationValue, "$showTranslationValue");
                    j this$0 = this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    it.animate().setStartDelay(1000L).alpha(1.0f).translationY((-1) * showTranslationValue.f80425a).setInterpolator(new DecelerateInterpolator(1.0f)).setListener(new d(this$0, 2)).start();
                }
            });
            ((Handler) this.f69327o.getValue()).postDelayed(new p4.a(2, this.f69328p), g());
            this.f69322j = (ek2.j) f0Var.k0().d().F(new pj0.f(11, new hh0.a(this, 23)), new pj0.f(12, g.f69307i), ck2.i.f27923c, ck2.i.f27924d);
        }
        return this.f69321i;
    }

    public final void i() {
        if (this.f69326n) {
            return;
        }
        this.f69326n = true;
        n nVar = this.f69315c;
        nVar.c(null, null);
        this.f69316d.h0((r18 & 1) != 0 ? f1.TAP : f1.DISMISS, (r18 & 2) != 0 ? null : e(), (r18 & 4) != 0 ? null : d(), (r18 & 8) != 0 ? null : String.valueOf(nVar.f108060b), (r18 & 32) != 0 ? null : f(), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public boolean j() {
        return false;
    }

    public final void k() {
        this.f69325m = true;
        n nVar = this.f69315c;
        nVar.a(null, null);
        this.f69316d.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : e(), (r18 & 4) != 0 ? null : d(), (r18 & 8) != 0 ? null : String.valueOf(nVar.f108060b), (r18 & 32) != 0 ? null : f(), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        c(true);
        l();
    }

    public final void l() {
        if (!this.f69325m) {
            i();
        }
        View view = this.f69321i;
        if (view != null) {
            int height = view.getHeight();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            view.animate().translationY(height + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r2.bottomMargin : 0)).setStartDelay(0L).setDuration(this.f69313a.getResources().getInteger(m60.u0.anim_speed_fast)).setInterpolator(new DecelerateInterpolator(1.5f)).setListener(new h(this, view, 0)).start();
        }
        ek2.j jVar = this.f69322j;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
    }

    public final void m() {
        View view = this.f69321i;
        if (view != null) {
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new com.google.android.material.navigation.b(view, 12));
            } else {
                view.setTranslationY(view.getY());
            }
            view.setOnTouchListener(new i(this, view.getContext()));
        }
    }
}

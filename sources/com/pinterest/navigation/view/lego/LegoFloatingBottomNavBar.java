package com.pinterest.navigation.view.lego;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.widget.x;
import b20.c;
import b60.b;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.notificationtab.view.NotificationsTabBadgeFlyoutView;
import com.pinterest.feature.pin.creation.view.UploadProgressBarLayout;
import com.pinterest.feature.pincarouselads.view.h;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;
import df.j1;
import ff0.f;
import h32.f1;
import h32.g0;
import h32.u0;
import hm1.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kh2.k3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ks1.e;
import lh0.b2;
import lp.k;
import m60.d;
import m60.r0;
import m60.w;
import nx.d0;
import or1.j;
import org.jetbrains.annotations.NotNull;
import pg0.e0;
import pg0.m0;
import pk.a0;
import r70.a;
import ru1.i;
import ru1.l;
import ru1.o;
import ru1.q;
import ru1.s;
import ru1.t;
import ru1.u;
import ru1.y;
import tb0.p;
import u50.n;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\r\u000e\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/pinterest/navigation/view/lego/LegoFloatingBottomNavBar;", "Landroid/widget/LinearLayout;", "Lr70/a;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nl/b", "ru1/q", "en/b", "legoFloatingNavBarLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LegoFloatingBottomNavBar extends l implements a, View.OnClickListener {
    public static final /* synthetic */ int N = 0;
    public w A;
    public f B;
    public x C;
    public b D;
    public b2 E;
    public c F;
    public fv1.b G;
    public final v H;
    public final t I;

    /* renamed from: J, reason: collision with root package name */
    public final v f49954J;
    public final v K;
    public final v L;
    public final v M;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayout f49955c;

    /* renamed from: d, reason: collision with root package name */
    public long f49956d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f49957e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f49958f;

    /* renamed from: g, reason: collision with root package name */
    public int f49959g;

    /* renamed from: h, reason: collision with root package name */
    public com.pinterest.framework.screens.t f49960h;

    /* renamed from: i, reason: collision with root package name */
    public int f49961i;

    /* renamed from: j, reason: collision with root package name */
    public d0 f49962j;

    /* renamed from: k, reason: collision with root package name */
    public final int f49963k;

    /* renamed from: l, reason: collision with root package name */
    public final int f49964l;

    /* renamed from: m, reason: collision with root package name */
    public xj2.c f49965m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f49966n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f49967o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f49968p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f49969q;

    /* renamed from: r, reason: collision with root package name */
    public NotificationsTabBadgeFlyoutView f49970r;

    /* renamed from: s, reason: collision with root package name */
    public en.b f49971s;

    /* renamed from: t, reason: collision with root package name */
    public q f49972t;

    /* renamed from: u, reason: collision with root package name */
    public final r70.b f49973u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f49974v;

    /* renamed from: w, reason: collision with root package name */
    public final LegoFloatingBottomNavBar f49975w;

    /* renamed from: x, reason: collision with root package name */
    public wk2.a f49976x;

    /* renamed from: y, reason: collision with root package name */
    public r70.f f49977y;

    /* renamed from: z, reason: collision with root package name */
    public mr1.a f49978z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoFloatingBottomNavBar(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        p();
        this.f49958f = new ArrayList();
        this.f49961i = 2;
        Context context2 = getContext();
        int i13 = t70.a.gray_icon_selected_tint;
        Object obj = d5.a.f53679a;
        this.f49963k = context2.getColor(i13);
        this.f49964l = dl2.b.y0(this, eo1.a.sema_color_icon_default);
        this.f49972t = q.HIDDEN;
        this.f49973u = r70.b.f106349i.k0();
        this.f49975w = this;
        this.H = m.b(new s(this, 0));
        this.I = new t(this);
        this.f49954J = m.b(new s(this, 1));
        this.K = m.b(new s(this, 3));
        this.L = m.b(new s(this, 4));
        this.M = m.b(new s(this, 2));
        B();
    }

    public static final void t(LegoFloatingBottomNavBar legoFloatingBottomNavBar) {
        Object obj = legoFloatingBottomNavBar.f49958f.get(legoFloatingBottomNavBar.f49961i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        y yVar = (y) obj;
        int i13 = legoFloatingBottomNavBar.w().f63028b;
        int i14 = legoFloatingBottomNavBar.w().f63029c;
        if (i13 + i14 <= 0) {
            ((i) yVar).f().i(ru1.f.f110034k);
        } else {
            ((i) yVar).l();
        }
        legoFloatingBottomNavBar.F(i14, i13);
    }

    public final int A() {
        return j1.E1() ? getResources().getDimensionPixelOffset(ks1.a.nav_redesign_total_tab_width) : getResources().getDimensionPixelSize(ks1.a.lego_floating_nav_total_tab_baseline);
    }

    public final void B() {
        int intValue;
        Unit unit;
        Object obj;
        LinearLayout.LayoutParams layoutParams;
        int i13 = 1;
        setOrientation(1);
        boolean E1 = j1.E1();
        r70.b bVar = this.f49973u;
        if (E1) {
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.f49959g = getResources().getDimensionPixelOffset(ks1.a.nav_redesign_total_tab_width);
            bVar.f106354d = false;
        } else if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new u(this, 1));
        } else {
            getLayoutParams().width = -2;
            getLayoutParams().height = -2;
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (x()) {
                n nVar = u().f110009d.f110015e;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                intValue = nVar.a(context).intValue();
            } else {
                intValue = ((Number) this.f49954J.getValue()).intValue();
            }
            marginLayoutParams.bottomMargin = intValue;
        }
        if (x()) {
            ru1.b bVar2 = u().f110009d;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            n nVar2 = u().f110007b;
            Intrinsics.checkNotNullExpressionValue(linearLayout.getContext(), "getContext(...)");
            linearLayout.setElevation(nVar2.a(r10).intValue());
            u50.i iVar = bVar2.f110016f;
            Context context2 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            linearLayout.setBackgroundColor(((Number) iVar.a(context2)).intValue());
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            Context context3 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int intValue2 = bVar2.f110011a.a(context3).intValue();
            Context context4 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            int intValue3 = bVar2.f110013c.a(context4).intValue();
            Context context5 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            int intValue4 = bVar2.f110012b.a(context5).intValue();
            Context context6 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            linearLayout.setPaddingRelative(intValue2, intValue3, intValue4, bVar2.f110014d.a(context6).intValue());
            if (j1.E1()) {
                View view = new View(linearLayout.getContext());
                view.setLayoutParams(new LinearLayout.LayoutParams(-1, dl2.b.G0(view, eo1.a.space_100)));
                Context context7 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                view.setBackground(bs1.c.c0(context7, ks1.b.top_shadow_gradient));
                addView(view);
            } else {
                linearLayout.setBackground(y());
            }
            this.f49955c = linearLayout;
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
            int intValue5 = bVar2.f110015e.a(context8).intValue();
            if (j1.E1()) {
                layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.bottomMargin = intValue5;
            } else {
                layoutParams = new LinearLayout.LayoutParams(-2, -2);
                n nVar3 = u().f110007b;
                Context context9 = getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                int intValue6 = nVar3.a(context9).intValue();
                layoutParams.bottomMargin = intValue6;
                layoutParams.leftMargin = intValue6;
                layoutParams.rightMargin = intValue6;
                layoutParams.gravity = 1;
            }
            addView(linearLayout, layoutParams);
        } else {
            C();
        }
        Context context10 = getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        UploadProgressBarLayout uploadProgressBarLayout = new UploadProgressBarLayout(6, context10, (AttributeSet) null);
        UploadProgressBarLayout.f(uploadProgressBarLayout, bVar.f106356f);
        uploadProgressBarLayout.f47126d = new ru1.w(this);
        if (j1.E1()) {
            addView(uploadProgressBarLayout, 0);
        } else {
            addView(uploadProgressBarLayout);
        }
        ((d) d.a()).g();
        int i14 = 0;
        for (Object obj2 : u().f110006a) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                f0.p();
                throw null;
            }
            D((r70.i) obj2, i14);
            i14 = i15;
        }
        if (!this.f49974v) {
            List j13 = f0.j(u0.IDEA_STREAM_NAV_BUTTON, u0.PERSONAL_BOUTIQUE_SHOP_TAB);
            r70.f fVar = this.f49977y;
            if (fVar == null) {
                Intrinsics.r("bottomNavConfiguration");
                throw null;
            }
            Iterator it = fVar.b(x()).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (j13.contains(((r70.i) obj).f106383d)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r70.i iVar2 = (r70.i) obj;
            if (iVar2 != null) {
                d0 d0Var = this.f49962j;
                if (d0Var != null) {
                    d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : iVar2.f106383d, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                }
                this.f49974v = true;
            }
        }
        b bVar3 = this.D;
        if (bVar3 == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        wy0 f13 = ((b60.d) bVar3).f();
        ck2.a aVar = bVar.f106355e;
        if (f13 != null) {
            if (!Intrinsics.d((String) aVar.f27914b, f13.getUid())) {
                String uid = f13.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                aVar.getClass();
                Intrinsics.checkNotNullParameter(uid, "<set-?>");
                aVar.f27914b = uid;
                aVar.f27913a = 0;
            }
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            aVar.f27913a = 0;
        }
        e(aVar.f27913a, null);
        i iVar3 = (i) ((y) this.f49958f.get(this.f49961i));
        iVar3.getClass();
        getViewTreeObserver().addOnGlobalLayoutListener(new g(i13, iVar3, this));
    }

    public final void C() {
        LinearLayout.LayoutParams layoutParams;
        int Z = bs1.c.Z(this, ks1.a.lego_floating_nav_internal_padding);
        int Z2 = bs1.c.Z(this, ks1.a.lego_floating_nav_internal_spacing);
        if (j1.E1()) {
            Z = 0;
            Z2 = 0;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setElevation(linearLayout.getResources().getDimensionPixelSize(r0.lego_floating_nav_elevation));
        if (j1.E1()) {
            linearLayout.setElevation(0.0f);
            linearLayout.setGravity(1);
            Context context = linearLayout.getContext();
            int i13 = eo1.b.color_themed_background_default;
            Object obj = d5.a.f53679a;
            linearLayout.setBackgroundColor(context.getColor(i13));
        } else {
            linearLayout.setBackground((Drawable) this.K.getValue());
        }
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPaddingRelative(Z2, Z, Z2, Z);
        this.f49955c = linearLayout;
        if (j1.E1()) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = ((Number) this.f49954J.getValue()).intValue();
            layoutParams.gravity = 1;
        } else {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int dimensionPixelSize = getResources().getDimensionPixelSize(r0.lego_floating_nav_elevation);
            layoutParams.bottomMargin = dimensionPixelSize;
            layoutParams.leftMargin = dimensionPixelSize;
            layoutParams.rightMargin = dimensionPixelSize;
            layoutParams.gravity = 1;
        }
        addView(linearLayout, layoutParams);
    }

    public final void D(r70.i iVar, int i13) {
        LinearLayout.LayoutParams z13;
        int A;
        ru1.c cVar = u().f110010e;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final o oVar = new o(context, iVar, cVar);
        if (!x()) {
            if (!oVar.isLaidOut() || oVar.isLayoutRequested()) {
                oVar.addOnLayoutChangeListener(new u(this, 0));
            } else if (oVar.getWidth() > this.f49959g) {
                this.f49959g = oVar.getWidth();
                I();
            } else if (oVar.getWidth() < this.f49959g) {
                I();
            }
        }
        oVar.setId(iVar.f106384e);
        oVar.setOnClickListener(this);
        r70.i iVar2 = oVar.f110048d;
        u70.a aVar = iVar2.f106380a;
        u70.a aVar2 = u70.a.PROFILE;
        if (aVar == aVar2) {
            oVar.setOnLongClickListener(new h(this, 1));
        } else {
            oVar.setOnLongClickListener(new View.OnLongClickListener() { // from class: ru1.p
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int i14 = LegoFloatingBottomNavBar.N;
                    y tab = oVar;
                    Intrinsics.checkNotNullParameter(tab, "$tab");
                    LegoFloatingBottomNavBar this$0 = this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    int i15 = r.f110079a[((i) tab).f110048d.f106380a.ordinal()];
                    u0 u0Var = i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? u0.NAVIGATION_HOME_BUTTON : u0.NAVIGATION_HOME_BUTTON : u0.NAVIGATION_CREATE_BUTTON : u0.NAVIGATION_SEARCH_BUTTON : u0.NAVIGATION_NOTIFICATIONS;
                    d0 d0Var = this$0.f49962j;
                    if (d0Var != null) {
                        d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.LONG_PRESS, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0.NAVIGATION, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    }
                    return true;
                }
            });
        }
        this.f49958f.add(i13, oVar);
        boolean x13 = x();
        u70.a aVar3 = iVar2.f106380a;
        if (x13) {
            n nVar = u().f110010e.f110017a;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int intValue = nVar.a(context2).intValue();
            n nVar2 = u().f110010e.f110018b;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            z13 = new LinearLayout.LayoutParams(nVar2.a(context3).intValue(), intValue, 1.0f);
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            if (j1.Y0(context4)) {
                if (aVar3 != u70.a.HOME) {
                    n nVar3 = u().f110010e.f110021e;
                    Context context5 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    z13.setMarginEnd(nVar3.a(context5).intValue());
                }
                if (aVar3 != aVar2) {
                    n nVar4 = u().f110010e.f110020d;
                    Context context6 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                    z13.setMarginStart(nVar4.a(context6).intValue());
                }
            } else {
                if (aVar3 != u70.a.HOME) {
                    n nVar5 = u().f110010e.f110020d;
                    Context context7 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                    z13.setMarginStart(nVar5.a(context7).intValue());
                }
                if (aVar3 != aVar2) {
                    n nVar6 = u().f110010e.f110021e;
                    Context context8 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                    z13.setMarginEnd(nVar6.a(context8).intValue());
                }
            }
        } else {
            z13 = z(aVar3);
        }
        if (x()) {
            n nVar7 = u().f110010e.f110019c;
            Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
            A = nVar7.a(context9).intValue();
        } else {
            A = A();
        }
        oVar.setMinimumWidth(A);
        LinearLayout linearLayout = this.f49955c;
        if (linearLayout == null) {
            Intrinsics.r("tabBarContainer");
            throw null;
        }
        linearLayout.addView(oVar, i13, z13);
        if (iVar.f106383d == u0.NOTIFICATIONS_ICON) {
            this.f49961i = i13;
        }
    }

    public final boolean E(int i13) {
        return i13 != -1 && i13 >= 0 && i13 < this.f49958f.size();
    }

    public final void F(int i13, int i14) {
        NotificationsTabBadgeFlyoutView notificationsTabBadgeFlyoutView = this.f49970r;
        if (notificationsTabBadgeFlyoutView != null) {
            String quantityString = getResources().getQuantityString(e.updates_tooltip_count, i14, Integer.valueOf(i14));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            String quantityString2 = getResources().getQuantityString(e.messages_tooltip_count, i13, Integer.valueOf(i13));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            notificationsTabBadgeFlyoutView.b(quantityString, quantityString2);
            J(quantityString, quantityString2);
        }
    }

    public final void G(boolean z13) {
        K(z13, true, new androidx.media3.ui.c(this, 18), new qf1.f0(this, z13, 11));
    }

    public final void H(long j13) {
        if (j13 >= 300000) {
            v().f(new e0());
        } else if (j13 >= 30000) {
            v().f(new m0(Long.valueOf(j13)));
        }
    }

    public final void I() {
        ArrayList arrayList = this.f49958f;
        if (arrayList.size() > 1 && this.f49959g > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i iVar = (i) ((y) it.next());
                iVar.getClass();
                ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.width = this.f49959g;
                iVar.setLayoutParams(layoutParams2);
            }
        }
        requestLayout();
    }

    public final void J(String str, String str2) {
        Object obj = this.f49958f.get(this.f49961i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        i iVar = (i) ((y) obj);
        String q13 = a.a.q(new StringBuilder(getResources().getString(iVar.f110048d.f106389j)), ", ", str, ", ", str2);
        Intrinsics.checkNotNullExpressionValue(q13, "toString(...)");
        iVar.setContentDescription(q13);
    }

    public final void K(boolean z13, boolean z14, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Function1 function1) {
        if (z13 == a()) {
            return;
        }
        if (z13 && this.f49968p) {
            return;
        }
        if (z13 || !this.f49969q) {
            if (z13 && bs1.c.j1(this)) {
                setTranslationY(getHeight());
                bs1.c.U1(this);
            }
            float height = z13 ? 0 : getHeight();
            if (!z14) {
                setTranslationY(height);
                return;
            }
            ViewPropertyAnimator translationY = animate().translationY(height);
            translationY.setDuration(300L);
            if (animatorUpdateListener != null) {
                translationY.setUpdateListener(animatorUpdateListener);
            }
            translationY.setListener(new hk.c(this, z13, function1));
            translationY.start();
        }
    }

    @Override // r70.a
    public final boolean a() {
        return k3.v1(this) && getTranslationY() < ((float) getHeight());
    }

    @Override // r70.a
    public final void b() {
        Object obj = this.f49958f.get(4);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        y yVar = (y) obj;
        e(4, null);
        com.pinterest.framework.screens.t tVar = this.f49960h;
        if (tVar != null) {
            ((com.pinterest.framework.screens.s) tVar).u(4, ((i) yVar).g(), true);
        }
    }

    @Override // r70.a
    public final void c(boolean z13) {
        K(true, z13, null, ru1.g.f110041n);
    }

    @Override // r70.a
    public final void d() {
        if (x()) {
            ru1.b bVar = u().f110009d;
            LinearLayout linearLayout = this.f49955c;
            if (linearLayout == null) {
                Intrinsics.r("tabBarContainer");
                throw null;
            }
            u50.i iVar = bVar.f110016f;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            linearLayout.setBackgroundColor(((Number) iVar.a(context)).intValue());
        } else {
            LinearLayout linearLayout2 = this.f49955c;
            if (linearLayout2 == null) {
                Intrinsics.r("tabBarContainer");
                throw null;
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            linearLayout2.setBackgroundColor(dl2.b.x0(context2, eo1.a.sema_color_background_default));
        }
        Iterator it = this.f49958f.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            y yVar = (y) next;
            if (i13 == this.f49973u.f106355e.f27913a) {
                i iVar2 = (i) yVar;
                if (!iVar2.k()) {
                    iVar2.f110059o.setColorFilter(this.f49964l);
                }
            } else {
                i iVar3 = (i) yVar;
                if (!iVar3.k()) {
                    iVar3.f110059o.setColorFilter(this.f49963k);
                }
            }
            i13 = i14;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    @Override // r70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r6, com.pinterest.framework.screens.u r7) {
        /*
            r5 = this;
            boolean r7 = r5.E(r6)
            if (r7 != 0) goto L7
            return
        L7:
            boolean r7 = df.j1.E1()
            if (r7 == 0) goto L10
            r5.d()
        L10:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r5.f49956d
            long r0 = r0 - r2
            u70.a r7 = u70.a.HOME
            int r2 = r5.i(r7)
            r3 = -1
            r70.b r4 = r5.f49973u
            if (r2 == r3) goto L34
            if (r6 != r2) goto L34
            ck2.a r3 = r4.f106355e
            int r3 = r3.f27913a
            if (r3 == r2) goto L34
            r2 = 5000(0x1388, double:2.4703E-320)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L46
            r5.H(r0)
            goto L46
        L34:
            int r7 = r5.i(r7)
            if (r6 == r7) goto L46
            ck2.a r0 = r4.f106355e
            int r0 = r0.f27913a
            if (r0 != r7) goto L46
            long r0 = android.os.SystemClock.uptimeMillis()
            r5.f49956d = r0
        L46:
            com.pinterest.framework.screens.t r7 = r5.f49960h
            java.util.ArrayList r0 = r5.f49958f
            r1 = 1
            if (r7 == 0) goto La8
            com.pinterest.framework.screens.s r7 = (com.pinterest.framework.screens.s) r7
            int r2 = r7.f49233h
            if (r2 <= 0) goto L64
            if (r6 < 0) goto L64
            java.util.ArrayList r2 = r7.f49237l
            int r3 = r2.size()
            if (r6 >= r3) goto L64
            java.lang.Object r7 = r2.get(r6)
            java.util.List r7 = (java.util.List) r7
            goto L66
        L64:
            java.util.ArrayList r7 = r7.f49235j
        L66:
            int r7 = r7.size()
            if (r7 > r1) goto La8
            java.lang.Object r7 = r0.get(r6)
            ru1.y r7 = (ru1.y) r7
            ru1.i r7 = (ru1.i) r7
            r70.i r7 = r7.f110048d
            kotlin.jvm.functions.Function0 r7 = r7.f106385f
            java.lang.Object r7 = r7.invoke()
            com.pinterest.navigation.Navigation r7 = (com.pinterest.navigation.Navigation) r7
            com.pinterest.framework.screens.ScreenLocation r2 = r7.getF49939a()
            xk2.v r3 = com.pinterest.screens.n2.f51142b
            java.lang.Object r3 = r3.getValue()
            com.pinterest.framework.screens.ScreenLocation r3 = (com.pinterest.framework.screens.ScreenLocation) r3
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            if (r3 == 0) goto L96
            ey.g3 r2 = ey.g3.f60489a
            ey.g3.b(r7)
            goto La8
        L96:
            xk2.v r7 = com.pinterest.screens.n2.f51141a
            java.lang.Object r7 = r7.getValue()
            com.pinterest.framework.screens.ScreenLocation r7 = (com.pinterest.framework.screens.ScreenLocation) r7
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r2, r7)
            if (r7 == 0) goto La8
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            tz1.b.f119715c = r7
        La8:
            ck2.a r7 = r4.f106355e
            int r7 = r7.f27913a
            boolean r2 = r5.E(r7)
            if (r2 == 0) goto Lc1
            java.lang.Object r7 = r0.get(r7)
            ru1.y r7 = (ru1.y) r7
            ru1.i r7 = (ru1.i) r7
            r7.getClass()
            r2 = 0
            r7.setSelected(r2)
        Lc1:
            java.lang.Object r7 = r0.get(r6)
            ru1.y r7 = (ru1.y) r7
            ru1.i r7 = (ru1.i) r7
            r7.getClass()
            r7.setSelected(r1)
            ck2.a r7 = r4.f106355e
            r7.f27913a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar.e(int, com.pinterest.framework.screens.u):void");
    }

    @Override // r70.a
    public final void f(boolean z13) {
        this.f49967o = z13;
    }

    @Override // r70.a
    public final void g(boolean z13, boolean z14) {
        this.f49971s = new en.b(z13);
        Window window = bs1.c.m0(this).getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        a0.g1(window, !z13);
        if (this.f49972t == q.FORCE_SHOWN) {
            return;
        }
        if (z14) {
            G(z13);
            return;
        }
        setTranslationY(0.0f);
        bs1.c.R1(this, z13);
        this.f49973u.f106352b = z13;
        post(new sq0.a(this, 5));
    }

    @Override // r70.a
    public final LinearLayout getView() {
        return this.f49975w;
    }

    @Override // r70.a
    public final void h() {
        Object obj = this.f49958f.get(1);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        y yVar = (y) obj;
        e(1, null);
        com.pinterest.framework.screens.t tVar = this.f49960h;
        if (tVar != null) {
            ((com.pinterest.framework.screens.s) tVar).u(1, ((i) yVar).g(), true);
        }
    }

    @Override // r70.a
    public final int i(u70.a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList arrayList = this.f49958f;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            if (type == ((i) ((y) obj)).f110048d.f106380a) {
                return i13;
            }
        }
        return -1;
    }

    @Override // r70.a
    public final void j(com.pinterest.framework.screens.s listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f49960h = listener;
    }

    @Override // r70.a
    public final void k(com.pinterest.framework.screens.u tabSelectionSource) {
        Intrinsics.checkNotNullParameter(tabSelectionSource, "tabSelectionSource");
        Object obj = this.f49958f.get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        y yVar = (y) obj;
        e(0, tabSelectionSource);
        com.pinterest.framework.screens.t tVar = this.f49960h;
        if (tVar != null) {
            ((com.pinterest.framework.screens.s) tVar).u(0, ((i) yVar).g(), true);
        }
    }

    @Override // r70.a
    public final void l(u70.a type, int i13, Bundle bundle, boolean z13) {
        r70.i c13;
        Intrinsics.checkNotNullParameter(type, "bottomNavTabType");
        Intrinsics.checkNotNullParameter(type, "bottomNavTabType");
        Intrinsics.checkNotNullParameter(type, "bottomNavTabType");
        ArrayList arrayList = this.f49958f;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((i) ((y) it.next())).f110048d.f106380a == type) {
                    i13 = i(type);
                    break;
                }
            }
        }
        if (i13 < 0 || i13 > arrayList.size()) {
            throw new IndexOutOfBoundsException("BottomNavBar tab insertion out of range");
        }
        r70.b bVar = this.f49973u;
        u70.a aVar = ((i) ((y) arrayList.get(bVar.f106355e.f27913a))).f110048d.f106380a;
        r70.f fVar = this.f49977y;
        if (fVar == null) {
            Intrinsics.r("bottomNavConfiguration");
            throw null;
        }
        boolean x13 = x();
        Intrinsics.checkNotNullParameter(type, "type");
        int i14 = r70.c.f106359a[type.ordinal()];
        if (i14 == 1) {
            c13 = fVar.c();
        } else if (i14 == 2) {
            c13 = fVar.g();
        } else if (i14 == 3) {
            c13 = fVar.a();
        } else if (i14 == 4) {
            c13 = fVar.d(x13);
        } else {
            if (i14 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            c13 = fVar.f();
        }
        D(c13, i13);
        bVar.f106355e.f27913a = i(aVar);
        if (i13 <= this.f49961i) {
            this.f49961i = i(u70.a.NOTIFICATIONS);
        }
        com.pinterest.framework.screens.t tVar = this.f49960h;
        if (tVar != null) {
            com.pinterest.framework.screens.s sVar = (com.pinterest.framework.screens.s) tVar;
            int i15 = sVar.f49232g;
            if (i15 >= i13) {
                sVar.f49232g = i15 + 1;
            }
            ArrayList arrayList2 = sVar.f49236k;
            int size = arrayList2.size();
            for (int i16 = 0; i16 < size; i16++) {
                if (((Number) arrayList2.get(i16)).intValue() >= i13) {
                    arrayList2.set(i16, Integer.valueOf(((Number) arrayList2.get(i16)).intValue() + 1));
                    arrayList2.set(i16, arrayList2.get(i16));
                }
            }
            sVar.f49237l.add(i13, new ArrayList());
            sVar.f49233h++;
        }
        if (i13 == -1) {
            return;
        }
        Object obj = arrayList.get(i13);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        e(i13, null);
        i iVar = (i) ((y) obj);
        ScreenDescription g13 = iVar.g();
        if (bundle != null) {
            ((ScreenModel) g13).f49207c.putAll(bundle);
        }
        com.pinterest.framework.screens.t tVar2 = this.f49960h;
        if (tVar2 != null) {
            ((com.pinterest.framework.screens.s) tVar2).u(i13, g13, z13);
        }
        d0 d0Var = this.f49962j;
        if (d0Var != null) {
            d0Var.F(g0.NAVIGATION, iVar.f110048d.f106383d);
        }
    }

    @Override // r70.a
    public final void m(boolean z13) {
        g(z13, false);
    }

    @Override // r70.a
    public final void o(boolean z13) {
        this.f49966n = z13;
        if (isInEditMode() || !z13) {
            return;
        }
        for (y yVar : this.f49958f) {
            Intrinsics.g(yVar, "null cannot be cast to non-null type com.pinterest.navigation.view.lego.LegoBottomNavTab");
            ((o) yVar).r();
        }
        I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v().h(this.I);
        x xVar = this.C;
        if (xVar == null) {
            Intrinsics.r("badgeManagerDelegate");
            throw null;
        }
        String userId = (String) xVar.f16713f;
        oc.c apolloClient = (oc.c) xVar.f16710c;
        q12.b conversationService = (q12.b) xVar.f16709b;
        fv1.b notificationCount = (fv1.b) xVar.f16712e;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(conversationService, "conversationService");
        Intrinsics.checkNotNullParameter(notificationCount, "notificationCount");
        ((e82.n) xVar.f16708a).getClass();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(conversationService, "conversationService");
        Intrinsics.checkNotNullParameter(notificationCount, "notificationCount");
        Date date = e82.n.f57885b;
        if (date == null || new Date().getTime() - date.getTime() > 20000) {
            e82.n.a(userId, apolloClient, conversationService, notificationCount);
        }
        e82.n.f57885b = new Date();
        uj2.h N2 = e82.n.f57886c.N(uj2.a.LATEST);
        Intrinsics.checkNotNullExpressionValue(N2, "toFlowable(...)");
        xj2.c j13 = N2.i(wj2.c.a()).j(new j(11, new hk1.t(this, 23)), new j(12, ru1.f.f110035l));
        Intrinsics.checkNotNullExpressionValue(j13, "subscribe(...)");
        this.f49965m = j13;
        x xVar2 = this.C;
        if (xVar2 != null) {
            xVar2.k();
        } else {
            Intrinsics.r("badgeManagerDelegate");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View v13) {
        kg.n.a(v13);
        Intrinsics.checkNotNullParameter(v13, "v");
        if (v13 instanceof y) {
            i iVar = (i) ((y) v13);
            u70.a aVar = iVar.f110048d.f106380a;
            if (aVar == u70.a.CREATE) {
                d0 d0Var = this.f49962j;
                if (d0Var != null) {
                    v().d(new jc0.v(new k(d0Var, ou1.b.NAVBAR_PLUS_BUTTON.getValue()), false, 0L, 30));
                }
            } else {
                int i13 = i(aVar);
                if (i13 == 1) {
                    b2 b2Var = this.E;
                    if (b2Var == null) {
                        Intrinsics.r("experiments");
                        throw null;
                    }
                    b2Var.a();
                }
                e(i13, com.pinterest.framework.screens.u.TAB_CLICK);
                com.pinterest.framework.screens.t tVar = this.f49960h;
                if (tVar != null) {
                    ((com.pinterest.framework.screens.s) tVar).u(i13, iVar.g(), true);
                }
            }
            vb0.j.f125466a.M(this.f49962j, "Nav click on " + Thread.currentThread().getName() + " with no pinalytics, was set: " + this.f49957e, p.NAVBAR, new Object[0]);
            d0 d0Var2 = this.f49962j;
            if (d0Var2 != null) {
                d0Var2.F(g0.NAVIGATION, iVar.f110048d.f106383d);
            }
            v().d(new defpackage.e());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        xj2.c cVar;
        v().j(this.I);
        xj2.c cVar2 = this.f49965m;
        if (cVar2 != null && !cVar2.isDisposed() && (cVar = this.f49965m) != null) {
            cVar.dispose();
        }
        this.f49965m = null;
        Iterator it = this.f49958f.iterator();
        while (it.hasNext()) {
            ((i) ((y) it.next())).f110065u.dispose();
        }
        super.onDetachedFromWindow();
    }

    @Override // r70.a
    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f49962j = pinalytics;
        this.f49957e = true;
    }

    public final ru1.a u() {
        return (ru1.a) this.H.getValue();
    }

    public final w v() {
        w wVar = this.A;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    public final fv1.b w() {
        fv1.b bVar = this.G;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("notificationCount");
        throw null;
    }

    public final boolean x() {
        return ((Boolean) this.M.getValue()).booleanValue();
    }

    public final Drawable y() {
        return (Drawable) this.L.getValue();
    }

    public final LinearLayout.LayoutParams z(u70.a aVar) {
        if (j1.E1()) {
            return new LinearLayout.LayoutParams(bs1.c.W(this, ks1.a.nav_redesign_total_tab_width), bs1.c.W(this, r0.lego_floating_nav_20_icon_tap_target));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, bs1.c.W(this, ks1.a.lego_floating_nav_icon_tap_target), 1.0f);
        if (aVar == u70.a.HOME) {
            return layoutParams;
        }
        layoutParams.setMarginStart(bs1.c.W(this, ks1.a.lego_floating_nav_internal_spacing));
        return layoutParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoFloatingBottomNavBar(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        p();
        this.f49958f = new ArrayList();
        this.f49961i = 2;
        Context context2 = getContext();
        int i14 = t70.a.gray_icon_selected_tint;
        Object obj = d5.a.f53679a;
        this.f49963k = context2.getColor(i14);
        this.f49964l = dl2.b.y0(this, eo1.a.sema_color_icon_default);
        this.f49972t = q.HIDDEN;
        this.f49973u = r70.b.f106349i.k0();
        this.f49975w = this;
        this.H = m.b(new s(this, 0));
        this.I = new t(this);
        this.f49954J = m.b(new s(this, 1));
        this.K = m.b(new s(this, 3));
        this.L = m.b(new s(this, 4));
        this.M = m.b(new s(this, 2));
        B();
    }
}

package com.pinterest.gestalt.toolbar;

import a.z0;
import an1.i;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.b2;
import androidx.appcompat.widget.c2;
import c2.m4;
import com.pinterest.design.brio.widget.IconView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import dl1.i0;
import eo1.c;
import fo1.a;
import fo1.e;
import fo1.f;
import h5.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kh2.n;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import la1.k;
import le0.d;
import le0.h;
import m.l;
import n.o;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import pn1.g;
import we1.a2;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/toolbar/GestaltToolbarImpl;", "Landroid/widget/RelativeLayout;", "Lfo1/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "toolbar_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltToolbarImpl extends RelativeLayout implements a {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f49700u = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f49701a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49702b;

    /* renamed from: c, reason: collision with root package name */
    public int f49703c;

    /* renamed from: d, reason: collision with root package name */
    public final int f49704d;

    /* renamed from: e, reason: collision with root package name */
    public final int f49705e;

    /* renamed from: f, reason: collision with root package name */
    public final int f49706f;

    /* renamed from: g, reason: collision with root package name */
    public final int f49707g;

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f49708h;

    /* renamed from: i, reason: collision with root package name */
    public int f49709i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f49710j;

    /* renamed from: k, reason: collision with root package name */
    public c2 f49711k;

    /* renamed from: l, reason: collision with root package name */
    public b2 f49712l;

    /* renamed from: m, reason: collision with root package name */
    public View.OnClickListener f49713m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f49714n;

    /* renamed from: o, reason: collision with root package name */
    public final v f49715o;

    /* renamed from: p, reason: collision with root package name */
    public final v f49716p;

    /* renamed from: q, reason: collision with root package name */
    public final v f49717q;

    /* renamed from: r, reason: collision with root package name */
    public final v f49718r;

    /* renamed from: s, reason: collision with root package name */
    public final v f49719s;

    /* renamed from: t, reason: collision with root package name */
    public final v f49720t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltToolbarImpl(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49701a = "";
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.f49702b = a0.L(resources, 24.0f);
        this.f49703c = getResources().getDimensionPixelSize(c.toolbar_general_h_padding_dp);
        this.f49704d = getResources().getDimensionPixelSize(c.toolbar_h_padding_with_search_dp);
        this.f49705e = getResources().getDimensionPixelSize(c.toolbar_general_v_margin_dp);
        this.f49706f = getResources().getDimensionPixelSize(c.toolbar_height);
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        this.f49707g = a0.K(16, resources2);
        this.f49708h = h1.c(Integer.valueOf(d.menu_pin_overflow), Integer.valueOf(d.menu_edit), Integer.valueOf(d.menu_send));
        this.f49714n = new ArrayList();
        this.f49715o = m.b(new f(context, this, 0));
        this.f49716p = m.b(new f(context, this, 3));
        this.f49717q = m.b(new f(context, this, 2));
        this.f49718r = m.b(new f(context, this, 1));
        this.f49719s = a.c.n(context, 9);
        v n13 = a.c.n(context, 8);
        this.f49720t = n13;
        setGravity(16);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(c.image_size_lego_medium_in_dp), getResources().getDimensionPixelSize(c.image_size_lego_medium_in_dp));
        layoutParams.addRule(20, -1);
        layoutParams.addRule(15, -1);
        addView(v(), layoutParams);
        Drawable drawable = v().getDrawable();
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        k(drawable);
        K(v());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        layoutParams2.setMarginEnd(a0.K(16, resources3));
        layoutParams2.addRule(15, -1);
        layoutParams2.addRule(21, -1);
        addView((LinearLayout) n13.getValue(), layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(15, -1);
        layoutParams3.addRule(16, d.bar_actions);
        addView(t(), layoutParams3);
        setFocusable(true);
    }

    public static void j(ObjectAnimator... objectAnimatorArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList e03 = c0.e0(objectAnimatorArr);
        Set singleton = Collections.singleton(null);
        Intrinsics.checkNotNullExpressionValue(singleton, "singleton(...)");
        e03.removeAll(singleton);
        animatorSet.playTogether(e03);
        animatorSet.start();
    }

    public static void p(GestaltToolbarImpl gestaltToolbarImpl, float f13, float f14, float f15, float f16, fm1.c cVar) {
        int i13 = 1;
        if (gestaltToolbarImpl.f49710j || gestaltToolbarImpl.x().l().f108855m == cVar) {
            return;
        }
        gestaltToolbarImpl.f49710j = true;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gestaltToolbarImpl.x(), "alpha", f13, f14);
        ofFloat.setDuration(150L);
        ofFloat.addListener(new fo1.d(gestaltToolbarImpl, cVar, i13));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(gestaltToolbarImpl.t(), "alpha", f15, f16);
        ofFloat2.setDuration(150L);
        ofFloat2.addListener(new e(gestaltToolbarImpl, cVar, f16));
        j(ofFloat, ofFloat2, null);
    }

    public final GestaltText A() {
        if (this.f49717q.isInitialized()) {
            return x();
        }
        return null;
    }

    public final void B() {
        setVisibility(8);
    }

    public final void C() {
        v().setVisibility(8);
        ViewGroup.LayoutParams layoutParams = z().getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(20, -1);
            z().setLayoutParams(layoutParams);
        }
    }

    public final void D(int i13) {
        c2 c2Var = new c2(getContext(), this);
        Intrinsics.checkNotNullParameter(c2Var, "<this>");
        new l((Context) c2Var.f16531b).inflate(i13, (o) c2Var.f16532c);
        ArrayList arrayList = new ArrayList(((o) c2Var.f16532c).f88653f.size());
        final int i14 = 1;
        int size = ((o) c2Var.f16532c).f88653f.size() - 1;
        final int i15 = 0;
        if (size >= 0) {
            int i16 = 0;
            while (true) {
                arrayList.add(((o) c2Var.f16532c).getItem(i16));
                if (i16 == size) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Drawable icon = ((MenuItem) it.next()).getIcon();
            if (icon != null) {
                arrayList2.add(icon);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            k((Drawable) it2.next());
        }
        ArrayList menuItems = new ArrayList();
        t().removeAllViews();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            final MenuItem menuItem = (MenuItem) it3.next();
            if (menuItem.getIcon() != null) {
                Drawable icon2 = menuItem.getIcon();
                Intrinsics.f(icon2);
                IconView F = F(icon2);
                F.setId(menuItem.getItemId());
                if (!menuItem.isVisible()) {
                    F.setVisibility(8);
                }
                F.setOnClickListener(new View.OnClickListener(this) { // from class: fo1.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ GestaltToolbarImpl f62731b;

                    {
                        this.f62731b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i17 = i15;
                        MenuItem item = menuItem;
                        GestaltToolbarImpl this$0 = this.f62731b;
                        switch (i17) {
                            case 0:
                                int i18 = GestaltToolbarImpl.f49700u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(item, "$item");
                                b2 b2Var = this$0.f49712l;
                                if (b2Var != null) {
                                    ((z0) b2Var).s(item);
                                    break;
                                }
                                break;
                            default:
                                int i19 = GestaltToolbarImpl.f49700u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(item, "$item");
                                b2 b2Var2 = this$0.f49712l;
                                if (b2Var2 != null) {
                                    ((z0) b2Var2).s(item);
                                    break;
                                }
                                break;
                        }
                    }
                });
                CharSequence contentDescription = menuItem instanceof b ? ((b) menuItem).getContentDescription() : menuItem.getContentDescription();
                if (contentDescription == null) {
                    contentDescription = menuItem.getTitle();
                }
                F.setContentDescription(contentDescription);
                K(F);
                t().addView(F, F.getLayoutParams());
            } else if (menuItem.getOrder() > 0) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (this.f49703c * 2) + this.f49702b);
                gestaltText.i(fo1.c.f62736m);
                int i17 = this.f49703c;
                gestaltText.setPadding(i17, i17, i17, i17);
                gestaltText.setLayoutParams(layoutParams);
                gestaltText.setAllCaps(true);
                gestaltText.setBackgroundResource(eo1.d.toolbar_tap);
                int i18 = 22;
                gestaltText.i(new i(menuItem, i18));
                gestaltText.j(new k(i18, this, menuItem));
                t().addView(gestaltText);
            } else if (menuItem.getActionView() != null) {
                View actionView = menuItem.getActionView();
                if (actionView != null) {
                    View actionView2 = menuItem.getActionView();
                    Intrinsics.f(actionView2);
                    setId(actionView2.getId());
                    setOnClickListener(new View.OnClickListener(this) { // from class: fo1.b

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ GestaltToolbarImpl f62731b;

                        {
                            this.f62731b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i172 = i14;
                            MenuItem item = menuItem;
                            GestaltToolbarImpl this$0 = this.f62731b;
                            switch (i172) {
                                case 0:
                                    int i182 = GestaltToolbarImpl.f49700u;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(item, "$item");
                                    b2 b2Var = this$0.f49712l;
                                    if (b2Var != null) {
                                        ((z0) b2Var).s(item);
                                        break;
                                    }
                                    break;
                                default:
                                    int i19 = GestaltToolbarImpl.f49700u;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(item, "$item");
                                    b2 b2Var2 = this$0.f49712l;
                                    if (b2Var2 != null) {
                                        ((z0) b2Var2).s(item);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    CharSequence contentDescription2 = menuItem instanceof b ? ((b) menuItem).getContentDescription() : menuItem.getContentDescription();
                    if (contentDescription2 == null) {
                        contentDescription2 = menuItem.getTitle();
                    }
                    setContentDescription(contentDescription2);
                    setBackgroundResource(eo1.d.toolbar_tap);
                    if (menuItem.isVisible()) {
                        actionView.getLayoutParams().height = this.f49709i;
                        t().addView(actionView);
                    } else {
                        setVisibility(8);
                    }
                }
            } else {
                menuItems.add(menuItem);
            }
        }
        if (menuItems.size() > 0) {
            Drawable f03 = bs1.c.f0(this, sm1.b.ic_ellipsis_gestalt, null, null, 6);
            Context context2 = getContext();
            int i19 = eo1.b.color_themed_text_default;
            Object obj = d5.a.f53679a;
            f03.setTint(context2.getColor(i19));
            IconView F2 = F(f03);
            F2.setContentDescription(F2.getResources().getString(h.accessibility_more_options_desc));
            K(F2);
            F2.setId(d.bar_overflow);
            c2 c2Var2 = new c2(getContext(), F2);
            c2Var2.f16535f = new z0(this, 24);
            F2.setOnClickListener(new a2(c2Var2, 25));
            this.f49711k = c2Var2;
            t().addView(F2);
            c2 c2Var3 = this.f49711k;
            if (c2Var3 != null) {
                Intrinsics.checkNotNullParameter(c2Var3, "<this>");
                Intrinsics.checkNotNullParameter(menuItems, "menuItems");
                int size2 = menuItems.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        Object obj2 = menuItems.get(i15);
                        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                        MenuItem menuItem2 = (MenuItem) obj2;
                        ((o) c2Var3.f16532c).a(menuItem2.getGroupId(), menuItem2.getItemId(), menuItem2.getOrder(), menuItem2.getTitle());
                        if (i15 == size2) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
        }
        h();
        K(v());
    }

    public final void E() {
        setImportantForAccessibility(2);
    }

    public final IconView F(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconView iconView = new IconView(context);
        iconView.setLayoutParams(new RelativeLayout.LayoutParams(iconView.getResources().getDimensionPixelSize(c.image_size_lego_medium_in_dp), iconView.getResources().getDimensionPixelSize(c.image_size_lego_medium_in_dp)));
        iconView.setImageDrawable(drawable);
        iconView.setBackgroundResource(eo1.d.toolbar_tap);
        return iconView;
    }

    public final void G() {
        int i13 = this.f49703c;
        int i14 = this.f49704d;
        if (i13 != i14) {
            this.f49703c = i14;
            this.f49709i = 0;
            yn2.h hVar = new yn2.h(yn2.c0.j(d7.b.O(t()), fo1.c.f62737n));
            while (hVar.hasNext()) {
                Drawable drawable = ((IconView) hVar.next()).getDrawable();
                Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
                k(drawable);
            }
            if (this.f49709i == 0) {
                Drawable drawable2 = v().getDrawable();
                Intrinsics.checkNotNullExpressionValue(drawable2, "getDrawable(...)");
                k(drawable2);
            }
            J();
            h();
        }
    }

    public final void H() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((LinearLayout) this.f49720t.getValue()).getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.setMarginEnd(0);
    }

    public final void I() {
        t().removeAllViews();
    }

    public final void J() {
        LinearLayout t13 = t();
        int childCount = t13.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = t13.getChildAt(i13);
            if (childAt instanceof IconView) {
                K((IconView) childAt);
            } else {
                childAt.getLayoutParams().height = this.f49709i;
            }
        }
    }

    public final void K(IconView iconView) {
        int intrinsicHeight = (this.f49709i - iconView.getDrawable().getIntrinsicHeight()) / 2;
        int intrinsicWidth = (this.f49709i - iconView.getDrawable().getIntrinsicWidth()) / 2;
        if (iconView.getPaddingStart() != intrinsicWidth || iconView.getPaddingEnd() != intrinsicWidth || iconView.getPaddingTop() != intrinsicHeight || iconView.getPaddingBottom() != intrinsicHeight) {
            iconView.setPaddingRelative(intrinsicWidth, intrinsicHeight, intrinsicWidth, intrinsicHeight);
        }
        if (Intrinsics.d(iconView, v())) {
            int i13 = this.f49707g - intrinsicWidth;
            if (iconView.getLayoutParams() != null && (iconView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
                Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                if (((RelativeLayout.LayoutParams) layoutParams).getMarginStart() == i13) {
                    return;
                }
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(c.image_size_lego_medium_in_dp), getResources().getDimensionPixelSize(c.image_size_lego_medium_in_dp));
            layoutParams2.addRule(20, -1);
            layoutParams2.addRule(15, -1);
            layoutParams2.setMarginStart(i13);
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            layoutParams2.setMarginEnd(0);
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
            updateViewLayout(iconView, layoutParams2);
            return;
        }
        int i14 = this.f49703c - intrinsicWidth;
        if (iconView.getLayoutParams() != null && (iconView.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            ViewGroup.LayoutParams layoutParams3 = iconView.getLayoutParams();
            Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            if (((LinearLayout.LayoutParams) layoutParams3).getMarginStart() == i14) {
                ViewGroup.LayoutParams layoutParams4 = iconView.getLayoutParams();
                Intrinsics.g(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                if (((LinearLayout.LayoutParams) layoutParams4).getMarginEnd() == i14) {
                    return;
                }
            }
        }
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        if (i14 > 0) {
            layoutParams5.setMarginStart(i14);
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = 0;
            layoutParams5.setMarginEnd(i14);
            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = 0;
        }
        iconView.setLayoutParams(layoutParams5);
    }

    public final void L(int i13) {
        Context context = getContext();
        Object obj = d5.a.f53679a;
        setBackground(context.getDrawable(i13));
    }

    public final void M(int i13) {
        Context context = getContext();
        Object obj = d5.a.f53679a;
        setBackgroundColor(context.getColor(i13));
    }

    public final void N(int i13) {
        int i14 = 1;
        x().i(new g(i14, i14));
    }

    public final void O(int i13, boolean z13) {
        o oVar;
        View findViewById = findViewById(i13);
        if (findViewById != null) {
            findViewById.setVisibility(z13 ? 0 : 8);
            return;
        }
        c2 c2Var = this.f49711k;
        MenuItem findItem = (c2Var == null || (oVar = (o) c2Var.f16532c) == null) ? null : oVar.findItem(i13);
        if (findItem == null) {
            return;
        }
        findItem.setVisible(z13);
    }

    public final void P(int i13, int i14) {
        Q(i13, i14, 0);
    }

    public final void Q(int i13, int i14, int i15) {
        Drawable drawable;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = getContext();
        Object obj = d5.a.f53679a;
        Drawable drawable2 = context2.getDrawable(i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (drawable2 != null) {
            drawable = sh.f.d(i14 == 0 ? context.getColor(df0.a.f54892a) : context.getColor(i14), context, drawable2);
        } else {
            drawable = null;
        }
        CharSequence text = getResources().getText(i15, "");
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        T(drawable, text);
    }

    public final void R(int i13, String contentDescription) {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        h0();
        Context context = getContext();
        Object obj = d5.a.f53679a;
        Drawable drawable = context.getDrawable(i13);
        n.b0(drawable);
        T(drawable, contentDescription);
    }

    public final void S(Drawable drawable) {
        n.b0(drawable);
        if (drawable == null) {
            C();
            return;
        }
        h0();
        v().setImageDrawable(drawable);
        K(v());
    }

    public final void T(Drawable drawable, CharSequence contentDescriptor) {
        Intrinsics.checkNotNullParameter(contentDescriptor, "contentDescriptor");
        if (drawable != null && contentDescriptor.length() > 0) {
            v().setContentDescription(contentDescriptor);
        }
        S(drawable);
    }

    public final void U(View.OnClickListener onClickListener) {
        this.f49713m = onClickListener;
    }

    public final void V(int i13) {
        ((GestaltText) this.f49718r.getValue()).i(new g(i13, 2));
    }

    public final void W(String str) {
        ((GestaltText) this.f49718r.getValue()).i(new i0(str, 2));
    }

    public final void X(vn1.c color) {
        Intrinsics.checkNotNullParameter(color, "color");
        ((GestaltText) this.f49718r.getValue()).i(new sp.a(25, color));
    }

    public final void Y(int i13) {
        Z(i13, fm1.c.VISIBLE);
    }

    public final void Z(int i13, fm1.c visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        x().i(new m4(i13, visibility, 25));
    }

    public final void a(IconView view, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(17, v().getId());
            layoutParams2.addRule(15, -1);
            int i14 = this.f49705e;
            layoutParams2.topMargin = i14;
            layoutParams2.bottomMargin = i14;
            view.setLayoutParams(layoutParams);
        }
        addView(view);
        ViewGroup.LayoutParams layoutParams3 = z().getLayoutParams();
        if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams3).setMarginStart(i13);
            z().setLayoutParams(layoutParams3);
        }
    }

    public final void a0(String str) {
        x().i(new ip.d(20, str));
    }

    public final void b(int i13) {
        View inflate = LayoutInflater.from(getContext()).inflate(i13, (ViewGroup) this, false);
        Intrinsics.f(inflate);
        c(inflate);
    }

    public final void b0(CharSequence charSequence) {
        c0(charSequence, fm1.c.VISIBLE);
    }

    public final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        ((LinearLayout) this.f49720t.getValue()).addView(view, layoutParams);
    }

    public final void c0(CharSequence charSequence, fm1.c visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        x().i(new xm1.k(16, charSequence, visibility));
    }

    public final void d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        }
        if (v().getVisibility() == 8) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(20);
            int i13 = this.f49707g;
            layoutParams2.setMarginStart(i13);
            layoutParams2.setMarginEnd(i13);
        } else {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(17, v().getId());
        }
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams3.addRule(16, t().getId());
        layoutParams3.addRule(15, -1);
        int i14 = this.f49705e;
        layoutParams3.topMargin = i14;
        layoutParams3.bottomMargin = i14;
        addView(view, layoutParams);
    }

    public final void d0(vn1.c color) {
        Intrinsics.checkNotNullParameter(color, "color");
        x().i(new sp.a(26, color));
    }

    public final void e(ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(20);
        layoutParams.addRule(21);
        layoutParams.addRule(15, -1);
        int i13 = this.f49705e;
        layoutParams.topMargin = i13;
        layoutParams.bottomMargin = i13;
        layoutParams.addRule(13);
        view.setLayoutParams(layoutParams);
        view.setPaddingRelative(t().getChildCount() > 0 ? Math.max(this.f49709i, t().getWidth()) : view.getResources().getDimensionPixelSize(c.space_200), 0, ((LinearLayout) this.f49720t.getValue()).getChildCount() > 0 ? Math.max(this.f49709i, t().getWidth()) : view.getResources().getDimensionPixelSize(c.space_200), 0);
        setGravity(17);
        addView(view);
    }

    public final void e0(vn1.g textVariant) {
        Intrinsics.checkNotNullParameter(textVariant, "textVariant");
        x().i(new mp.m(textVariant, 9));
    }

    public final void f(View view, String contentDescriptor) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(contentDescriptor, "contentDescriptor");
        view.setContentDescription(contentDescriptor);
        t().addView(view);
        if (!(view instanceof IconView)) {
            view.getLayoutParams().height = this.f49709i;
            return;
        }
        Drawable drawable = ((IconView) view).getDrawable();
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        k(drawable);
        J();
        K(v());
    }

    public final void f0(boolean z13) {
        if (z13) {
            setVisibility(0);
        } else {
            B();
        }
    }

    public final void g(boolean z13) {
        ViewGroup.LayoutParams layoutParams = t().getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(15, -1);
            if (z13) {
                layoutParams2.addRule(21, -1);
            } else {
                layoutParams2.removeRule(21);
                layoutParams2.removeRule(16);
                layoutParams2.addRule(17, d.bar_home);
            }
            t().setLayoutParams(layoutParams);
        }
    }

    public final void g0() {
        setVisibility(0);
    }

    public final void h() {
        View childAt;
        if (t().getChildCount() <= 0 || (childAt = t().getChildAt(t().getChildCount() - 1)) == null) {
            return;
        }
        boolean z13 = childAt instanceof IconView;
        int i13 = this.f49707g;
        int intrinsicWidth = z13 ? i13 - ((this.f49709i - ((IconView) childAt).getDrawable().getIntrinsicWidth()) / 2) : i13 - childAt.getPaddingEnd();
        ViewGroup.LayoutParams layoutParams = t().getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.setMarginEnd(intrinsicWidth);
            marginLayoutParams.bottomMargin = 0;
        }
    }

    public final void h0() {
        v().setVisibility(0);
        ViewGroup.LayoutParams layoutParams = z().getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(20);
            layoutParams2.addRule(17, d.bar_home);
            z().setLayoutParams(layoutParams);
        }
    }

    public final void i() {
        x().setPaddingRelative(this.f49703c, 0, 0, 0);
    }

    public final void k(Drawable drawable) {
        this.f49709i = Math.max(this.f49709i, Math.min(this.f49706f, (this.f49703c * 2) + drawable.getIntrinsicWidth()));
    }

    public final void l() {
        x().getLayoutParams().height = -2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(c.lego_actionable_icon_size), getResources().getDimensionPixelSize(c.lego_actionable_icon_size));
        layoutParams.addRule(15);
        v().setLayoutParams(layoutParams);
    }

    public final void m() {
        x().getLayoutParams().width = -2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        z().setLayoutParams(layoutParams);
        z().setGravity(17);
    }

    public final void n() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(20);
        layoutParams.addRule(21);
        layoutParams.addRule(13);
        z().setLayoutParams(layoutParams);
        GestaltText x13 = x();
        int max = Math.max(this.f49709i, t().getWidth());
        x13.setPaddingRelative(max, 0, max, 0);
        x13.i(fo1.c.f62733j);
        x13.setSingleLine(true);
    }

    public final void o() {
        setBackground(null);
    }

    @Override // nc0.f
    public final void onDestroy() {
        this.f49712l = null;
        this.f49713m = null;
        setOnClickListener(null);
        setOnLongClickListener(null);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13);
        int size2 = View.MeasureSpec.getSize(i14);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        t().measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = t().getMeasuredWidth();
        super.onMeasure(i13, i14);
        int childCount = t().getChildCount();
        if (childCount <= 1 || t().getChildAt(childCount - 1).getId() != d.menu_pin_overflow) {
            return;
        }
        while (measuredWidth > t().getMeasuredWidth()) {
            HashSet hashSet = this.f49708h;
            if (childCount <= hashSet.size()) {
                return;
            }
            View childAt = t().getChildAt(t().getChildCount() - (hashSet.size() + 1));
            if (childAt != null && !hashSet.contains(Integer.valueOf(childAt.getId()))) {
                t().removeView(childAt);
                this.f49714n.add(childAt);
            }
            childCount = t().getChildCount();
            t().measure(makeMeasureSpec, makeMeasureSpec2);
            measuredWidth = t().getMeasuredWidth();
            super.onMeasure(i13, i14);
        }
    }

    public final void q() {
        p(this, 0.0f, 1.0f, 1.0f, 0.0f, fm1.c.VISIBLE);
    }

    public final void r() {
        fm1.c cVar = fm1.c.VISIBLE;
        if (this.f49710j || x().l().f108855m == cVar) {
            return;
        }
        this.f49710j = true;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x(), "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(150L);
        ofFloat.addListener(new fo1.d(this, cVar, 0));
        j(ofFloat, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager, fo1.a
    public final void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((LinearLayout) this.f49720t.getValue()).removeView(view);
        super.removeView(view);
    }

    public final void s() {
        p(this, 1.0f, 0.0f, 0.0f, 1.0f, fm1.c.GONE);
    }

    public final LinearLayout t() {
        return (LinearLayout) this.f49719s.getValue();
    }

    public final Drawable u() {
        Drawable drawable = v().getDrawable();
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        return drawable;
    }

    public final IconView v() {
        return (IconView) this.f49715o.getValue();
    }

    public final IconView w() {
        return v();
    }

    public final GestaltText x() {
        return (GestaltText) this.f49717q.getValue();
    }

    public final String y() {
        return this.f49717q.isInitialized() ? a0.R(x()) : "";
    }

    public final LinearLayout z() {
        return (LinearLayout) this.f49716p.getValue();
    }
}

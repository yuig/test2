package com.pinterest.gestalt.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import df.j1;
import ek.d;
import ek.e;
import eo1.a;
import hk1.t;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pn1.b;
import pn1.h;
import pn1.k;
import q5.v0;
import u50.i0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/gestalt/tabs/GestaltTabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tabs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class GestaltTabLayout extends TabLayout {

    /* renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ int f49631b0 = 0;
    public final boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f49632a0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltTabLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final Drawable B() {
        if (this.W) {
            Drawable drawable = getResources().getDrawable(h.always_light_selected_tab_indicator, getContext().getTheme());
            Intrinsics.f(drawable);
            return drawable;
        }
        Drawable drawable2 = getResources().getDrawable(h.default_selected_tab_indicator, getContext().getTheme());
        Intrinsics.f(drawable2);
        return drawable2;
    }

    public final String C(e eVar) {
        b T;
        i0 i0Var;
        View view = eVar.f59129f;
        GestaltTab gestaltTab = view instanceof GestaltTab ? (GestaltTab) view : null;
        if (gestaltTab == null || (T = gestaltTab.T()) == null || (i0Var = T.f100735a) == null) {
            return null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CharSequence a13 = i0Var.a(context);
        if (a13 != null) {
            return a13.toString();
        }
        return null;
    }

    public final void D(e eVar) {
        WeakHashMap weakHashMap = v0.f102521a;
        if (getLayoutDirection() == 1 && m() != -1) {
            this.f49632a0 = true;
            requestLayout();
        }
        View view = eVar.f59129f;
        LinearLayout linearLayout = (LinearLayout) (view != null ? view.getParent() : null);
        if (linearLayout != null) {
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            linearLayout.setPaddingRelative(0, 0, 0, 0);
        }
        View view2 = eVar.f59129f;
        LinearLayout linearLayout2 = (LinearLayout) (view2 != null ? view2.getParent() : null);
        if (linearLayout2 != null) {
            linearLayout2.setBackgroundColor(0);
        }
        View view3 = eVar.f59129f;
        GestaltTab gestaltTab = view3 instanceof GestaltTab ? (GestaltTab) view3 : null;
        if (gestaltTab != null) {
            gestaltTab.L(new t(this, 11));
        }
    }

    public final void E(int i13, List tabList) {
        Intrinsics.checkNotNullParameter(tabList, "tabList");
        if (i13 < 0 || i13 >= tabList.size()) {
            i13 = 0;
        }
        int size = this.f33126b.size();
        tabList.size();
        int i14 = 0;
        for (Object obj : tabList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                f0.p();
                throw null;
            }
            e eVar = (e) obj;
            e n13 = n(i14);
            if (n13 == null) {
                d(eVar, i14, i13 == i14);
            } else if (C(n13) == null || !Intrinsics.d(C(n13), C(eVar))) {
                s(i14);
                d(eVar, i14, i13 == i14);
            } else if (i13 == i14) {
                n13.b();
            }
            i14 = i15;
        }
        int size2 = tabList.size();
        if (size > size2) {
            while (size2 < size) {
                s(size2);
                size2++;
            }
        }
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final void c(e tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        super.c(tab);
        D(tab);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final void d(e tab, int i13, boolean z13) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        super.d(tab, i13, z13);
        D(tab);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final void e(e tab, boolean z13) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        super.e(tab, z13);
        D(tab);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        if (this.f49632a0) {
            this.f49632a0 = false;
            if (m() != -1) {
                w(m(), 0.0f, false, false, true);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltTabLayout(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        int x03;
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.GestaltTabLayout, i13, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z13 = obtainStyledAttributes.getBoolean(k.GestaltTabLayout_onDarkBackground, false);
        this.W = z13;
        setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), j1.O(8));
        if (this.f33150z != 1) {
            this.f33150z = 1;
            h();
        }
        if (this.C != 0) {
            this.C = 0;
            h();
        }
        x(B());
        if (z13) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            x03 = dl2.b.x0(context2, a.sema_color_background_light);
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            x03 = dl2.b.x0(context3, a.comp_tabs_underline_color);
        }
        this.f33140p = x03;
        Drawable drawable = this.f33139o;
        if (x03 != 0) {
            drawable.setTint(x03);
        } else {
            drawable.setTintList(null);
        }
        A(false);
        if (this.B != 0) {
            this.B = 0;
            WeakHashMap weakHashMap = v0.f102521a;
            this.f33128d.postInvalidateOnAnimation();
        }
        this.E = false;
        int i14 = d.f59121c;
        d dVar = this.f33128d;
        dVar.a(dVar.f59123b.m());
        WeakHashMap weakHashMap2 = v0.f102521a;
        dVar.postInvalidateOnAnimation();
    }
}

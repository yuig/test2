package com.pinterest.gestalt.buttonToggle;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import bm1.a0;
import bm1.b0;
import bm1.i;
import bm1.j;
import bm1.k;
import bm1.l;
import bm1.m;
import bm1.w;
import bm1.x;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.messaging.q;
import eo1.c;
import gm1.a;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u50.o;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0004\f\u0003\r\u000eB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/pinterest/gestalt/buttonToggle/GestaltButtonToggle;", "Lcom/google/android/material/button/MaterialButton;", "Lgm1/b;", "Lbm1/m;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bm1/l", "bm1/n", "bm1/o", "buttonToggle_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall"})
/* loaded from: classes5.dex */
public final class GestaltButtonToggle extends MaterialButton implements b {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f49328x = 0;

    /* renamed from: u, reason: collision with root package name */
    public final q f49329u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f49330v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f49331w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltButtonToggle(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final GestaltButtonToggle s(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltButtonToggle) this.f49329u.d(nextState, new com.pinterest.framework.screens.q(9, this, u()));
    }

    public final GestaltButtonToggle t(a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltButtonToggle) this.f49329u.c(eventHandler, new bm1.a(this, 1));
    }

    public final m u() {
        return (m) ((o) this.f49329u.f33803a);
    }

    public final void v(l lVar) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f49330v = dl2.b.v0(eo1.a.comp_buttontoggle_save_uses_icon, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f49331w = dl2.b.v0(eo1.a.comp_buttontoggle_image_uses_opacity, context2);
        if (lVar instanceof j) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            setMinimumWidth(getResources().getDimensionPixelSize(x.button_toggle_min_width));
            j(dl2.b.G0(this, eo1.a.comp_buttontoggle_save_rounding));
            int G0 = dl2.b.G0(this, eo1.a.comp_buttontoggle_save_horizontal_padding);
            setPaddingRelative(G0, 0, G0, 0);
            y();
            b(d5.a.b(getContext(), w.save_button_toggle_background_colors));
            setTextColor(d5.a.b(getContext(), w.save_button_toggle_text_colors));
            return;
        }
        if (lVar instanceof bm1.b) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = -2;
                layoutParams2.height = -2;
            }
            setMinimumWidth(getResources().getDimensionPixelSize(x.button_toggle_min_width));
            j(dl2.b.G0(this, u().f23507a.getCornerRadius()));
            y();
            b(d5.a.b(getContext(), w.default_button_toggle_background_color));
            setTextColor(d5.a.b(getContext(), w.default_button_toggle_text_color));
            ColorStateList b13 = d5.a.b(getContext(), w.default_button_toggle_icon_color);
            if (this.f32345h != b13) {
                this.f32345h = b13;
                q(false);
            }
            l(1);
            return;
        }
        if (!(lVar instanceof i)) {
            if (lVar instanceof k) {
                ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = dl2.b.G0(this, eo1.a.comp_buttontoggle_image_width);
                    layoutParams3.height = -2;
                }
                setMinimumWidth(dl2.b.G0(this, eo1.a.comp_buttontoggle_image_width));
                setMinimumHeight(getResources().getDimensionPixelSize(c.space_1200));
                j(dl2.b.G0(this, eo1.a.comp_buttontoggle_image_rounding));
                y();
                k(null);
                o(dl2.b.G0(this, eo1.a.comp_buttontoggle_image_unselected_border_weight));
                setText("");
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
        if (layoutParams4 != null) {
            layoutParams4.width = -2;
            layoutParams4.height = -2;
        }
        setMinimumWidth(getResources().getDimensionPixelSize(x.button_toggle_min_width));
        setMinimumHeight(getResources().getDimensionPixelSize(c.space_1400));
        j(dl2.b.G0(this, eo1.a.comp_buttontoggle_graphic_rounding));
        setPaddingRelative(dl2.b.G0(this, eo1.a.comp_buttontoggle_graphic_horizontal_padding), dl2.b.G0(this, eo1.a.comp_buttontoggle_graphic_top_padding), dl2.b.G0(this, eo1.a.comp_buttontoggle_graphic_horizontal_padding), dl2.b.G0(this, eo1.a.comp_buttontoggle_graphic_bottom_padding));
        y();
        setTextAppearance(a0.GestaltButtonToggleText_Graphic);
        setTextColor(d5.a.b(getContext(), w.default_button_toggle_text_color));
        b(d5.a.b(getContext(), w.default_button_toggle_background_color));
        if (this.f32348k != 0) {
            this.f32348k = 0;
            q(true);
        }
        ColorStateList b14 = d5.a.b(getContext(), w.default_button_toggle_icon_color);
        if (this.f32345h != b14) {
            this.f32345h = b14;
            q(false);
        }
        l(32);
        int G02 = dl2.b.G0(this, eo1.a.comp_buttontoggle_graphic_vertical_space);
        if (this.f32351n != G02) {
            this.f32351n = G02;
            setCompoundDrawablePadding(G02);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0194, code lost:
    
        if (r14 == false) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(bm1.m r21, bm1.m r22) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.gestalt.buttonToggle.GestaltButtonToggle.w(bm1.m, bm1.m):void");
    }

    public final void x() {
        boolean z13 = u().f23510d;
        q qVar = this.f49329u;
        if (z13) {
            setClickable(true);
            qVar.F(new bm1.a(this, 5), new bm1.a(this, 6));
        } else {
            setClickable(false);
            ((View) qVar.f33805c).setOnClickListener(null);
        }
    }

    public final void y() {
        setGravity(17);
        int dimensionPixelSize = getResources().getDimensionPixelSize(x.button_toggle_min_width);
        com.google.android.material.button.b bVar = this.f32341d;
        bVar.e(dimensionPixelSize, bVar.f32372f);
        bVar.e(bVar.f32371e, getResources().getDimensionPixelSize(x.button_toggle_min_width));
        if (h()) {
            bVar.f32383q = true;
        }
        setStateListAnimator(null);
        ColorStateList z03 = dl2.b.z0(this, eo1.a.sema_color_background_transparent);
        if (!h() || bVar.f32378l == z03) {
            return;
        }
        bVar.f32378l = z03;
        MaterialButton materialButton = bVar.f32367a;
        if (materialButton.getBackground() instanceof RippleDrawable) {
            ((RippleDrawable) materialButton.getBackground()).setColor(zj.a.c(z03));
        }
    }

    public final BitmapDrawable z(rm1.q qVar, Context context, int i13) {
        Drawable f03 = bs1.c.f0(this, qVar.drawableRes(context), null, null, 6);
        f03.setTint(getCurrentTextColor());
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return d7.b.p0(f03, resources, dl2.b.G0(this, i13), dl2.b.G0(this, i13));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltButtonToggle(Context context, m initialDisplayState) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        this.f49329u = new q(this, initialDisplayState);
        v(initialDisplayState.f23509c);
        w(null, initialDisplayState);
        x();
    }

    public /* synthetic */ GestaltButtonToggle(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltButtonToggle(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] GestaltButtonToggle = b0.GestaltButtonToggle;
        Intrinsics.checkNotNullExpressionValue(GestaltButtonToggle, "GestaltButtonToggle");
        this.f49329u = new q(this, attributeSet, i13, GestaltButtonToggle, new bm1.a(this, 0));
        v(u().f23509c);
        w(null, u());
        x();
    }
}

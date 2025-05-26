package com.pinterest.gestalt.buttonSocial;

import am1.e;
import am1.f;
import am1.k;
import am1.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.messaging.q;
import df.j1;
import fm1.c;
import gm1.a;
import gm1.b;
import i2.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u50.o;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0004\f\u0003\r\u000eB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/pinterest/gestalt/buttonSocial/GestaltButtonSocial;", "Lcom/google/android/material/button/MaterialButton;", "Lgm1/b;", "Lam1/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ps0/m", "am1/c", "am1/d", "buttonSocial_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall"})
/* loaded from: classes2.dex */
public final class GestaltButtonSocial extends MaterialButton implements b {

    /* renamed from: v, reason: collision with root package name */
    public static final c f49326v = c.VISIBLE;

    /* renamed from: u, reason: collision with root package name */
    public final q f49327u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltButtonSocial(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final GestaltButtonSocial s(a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltButtonSocial) this.f49327u.c(eventHandler, new e(this, 0));
    }

    public final void t(am1.b bVar, am1.b bVar2) {
        j1.v(bVar, bVar2, f.f15531j, new i(24, this, bVar2));
        j1.v(bVar, bVar2, f.f15532k, new am1.a(this, 2));
        j1.v(bVar, bVar2, f.f15533l, new am1.a(this, 3));
        j1.v(bVar, bVar2, f.f15534m, new am1.a(this, 4));
        if (bVar2.f15528f != Integer.MIN_VALUE) {
            j1.v(bVar, bVar2, f.f15535n, new am1.a(this, 1));
        }
    }

    public /* synthetic */ GestaltButtonSocial(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltButtonSocial(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] GestaltButtonSocial = l.GestaltButtonSocial;
        Intrinsics.checkNotNullExpressionValue(GestaltButtonSocial, "GestaltButtonSocial");
        q qVar = new q(this, attributeSet, i13, GestaltButtonSocial, new am1.a(this, 0));
        this.f49327u = qVar;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        setMinimumHeight(dl2.b.G0(this, eo1.a.comp_buttonsocial_height));
        int G0 = dl2.b.G0(this, eo1.a.comp_buttonsocial_horizontal_padding);
        setPaddingRelative(G0, 0, G0, 0);
        setTextAppearance(k.GestaltButtonSocial);
        j(dl2.b.G0(this, eo1.a.comp_buttonsocial_corner_radius));
        b(dl2.b.z0(this, eo1.a.comp_buttonsocial_background_color));
        o(dl2.b.G0(this, eo1.a.comp_buttonsocial_border_weight));
        n(dl2.b.z0(this, eo1.a.comp_buttonsocial_border_color));
        l(1);
        setGravity(17);
        setTextAlignment(4);
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_0);
        com.google.android.material.button.b bVar = this.f32341d;
        bVar.e(dimensionPixelSize, bVar.f32372f);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.space_0);
        com.google.android.material.button.b bVar2 = this.f32341d;
        bVar2.e(bVar2.f32371e, dimensionPixelSize2);
        setStateListAnimator(null);
        setMaxLines(2);
        setEllipsize(TextUtils.TruncateAt.END);
        t(null, (am1.b) ((o) qVar.f33803a));
    }
}

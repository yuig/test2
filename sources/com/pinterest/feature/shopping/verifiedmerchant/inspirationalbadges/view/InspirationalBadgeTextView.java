package com.pinterest.feature.shopping.verifiedmerchant.inspirationalbadges.view;

import a.a;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import bs1.c;
import cf1.d;
import com.pinterest.gestalt.text.GestaltText;
import eo1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.e;
import m60.r0;
import m60.s0;
import org.jetbrains.annotations.NotNull;
import vn1.h;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/shopping/verifiedmerchant/inspirationalbadges/view/InspirationalBadgeTextView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "verifiedMerchantLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class InspirationalBadgeTextView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f48534a;

    /* renamed from: b, reason: collision with root package name */
    public final String f48535b;

    /* renamed from: c, reason: collision with root package name */
    public final String f48536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspirationalBadgeTextView(e context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48535b = a.j("#", Integer.toHexString(getContext().getColor(b.color_white_mochimalist_0)));
        this.f48536c = a.j("#", Integer.toHexString(getContext().getColor(b.color_black_cosmicore_900)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        gestaltText.i(d.f27647i);
        this.f48534a = gestaltText;
        addView(gestaltText);
        int W = c.W(this, r0.margin_quarter);
        int W2 = c.W(this, r0.margin_half);
        setPaddingRelative(W2, W, W2, W);
        a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            android.content.Context r1 = r16.getContext()
            int r2 = eo1.b.color_gray_roboflow_100
            int r1 = r1.getColor(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r2 = "#"
            java.lang.String r1 = a.a.j(r2, r1)
            if (r17 != 0) goto L1a
            r2 = r1
            goto L1c
        L1a:
            r2 = r17
        L1c:
            java.lang.String r3 = "whiteColorHex"
            java.lang.String r4 = r0.f48535b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r3 = "darkColorHex"
            java.lang.String r5 = r0.f48536c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            r3 = 6
            if (r2 == 0) goto L83
            r6 = 1
            r7 = 3
            java.lang.String r6 = r2.substring(r6, r7)
            java.lang.String r7 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r8 = 16
            int r6 = java.lang.Integer.parseInt(r6, r8)
            r9 = 4
            r10 = 5
            java.lang.String r9 = r2.substring(r9, r10)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
            int r9 = java.lang.Integer.parseInt(r9, r8)
            r10 = 7
            java.lang.String r2 = r2.substring(r3, r10)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            int r2 = java.lang.Integer.parseInt(r2, r8)
            float r6 = (float) r6
            r7 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 / r7
            double r10 = (double) r6
            r6 = 1074580685(0x400ccccd, float:2.2)
            double r12 = (double) r6
            double r10 = java.lang.Math.pow(r10, r12)
            float r6 = (float) r10
            double r10 = (double) r6
            r14 = 4596827742536767164(0x3fcb367a0f9096bc, double:0.2126)
            double r10 = r10 * r14
            float r6 = (float) r9
            float r6 = r6 / r7
            double r8 = (double) r6
            java.lang.Math.pow(r8, r12)
            float r2 = (float) r2
            float r2 = r2 / r7
            double r6 = (double) r2
            java.lang.Math.pow(r6, r12)
            r6 = 4595653203753948938(0x3fc70a3d70a3d70a, double:0.18)
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L83
            r2 = r4
            goto L84
        L83:
            r2 = r5
        L84:
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r2, r4)
            if (r4 == 0) goto L8d
            vn1.c r2 = vn1.c.LIGHT
            goto L98
        L8d:
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r5)
            if (r2 == 0) goto L96
            vn1.c r2 = vn1.c.DARK
            goto L98
        L96:
            vn1.c r2 = vn1.h.f126277c
        L98:
            sp.a r4 = new sp.a
            r5 = 18
            r4.<init>(r5, r2)
            com.pinterest.gestalt.text.GestaltText r2 = r0.f48534a
            r2.i(r4)
            int r2 = m60.s0.rounded_rect_gray
            r4 = 0
            android.graphics.drawable.Drawable r2 = bs1.c.f0(r0, r2, r4, r4, r3)
            android.graphics.PorterDuffColorFilter r3 = new android.graphics.PorterDuffColorFilter
            if (r17 != 0) goto Lb0
            goto Lb2
        Lb0:
            r1 = r17
        Lb2:
            int r1 = android.graphics.Color.parseColor(r1)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r3.<init>(r1, r4)
            r2.setColorFilter(r3)
            r0.setBackground(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.shopping.verifiedmerchant.inspirationalbadges.view.InspirationalBadgeTextView.a(java.lang.String):void");
    }

    public final void b(int i13) {
        String whiteColorHex = this.f48535b;
        Intrinsics.checkNotNullParameter(whiteColorHex, "whiteColorHex");
        String darkColorHex = this.f48536c;
        Intrinsics.checkNotNullParameter(darkColorHex, "darkColorHex");
        int red = Color.red(i13);
        int green = Color.green(i13);
        int blue = Color.blue(i13);
        double d2 = 2.2f;
        double pow = ((float) Math.pow(red / 255.0f, d2)) * 0.2126d;
        Math.pow(green / 255.0f, d2);
        Math.pow(blue / 255.0f, d2);
        String str = pow <= 0.18d ? whiteColorHex : darkColorHex;
        this.f48534a.i(new sp.a(19, Intrinsics.d(str, whiteColorHex) ? vn1.c.LIGHT : Intrinsics.d(str, darkColorHex) ? vn1.c.DARK : h.f126277c));
        Drawable f03 = c.f0(this, s0.rounded_rect_gray, null, null, 6);
        f03.setColorFilter(new PorterDuffColorFilter(i13, PorterDuff.Mode.SRC_ATOP));
        setBackground(f03);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspirationalBadgeTextView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48535b = a.j("#", Integer.toHexString(getContext().getColor(b.color_white_mochimalist_0)));
        this.f48536c = a.j("#", Integer.toHexString(getContext().getColor(b.color_black_cosmicore_900)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        gestaltText.i(d.f27647i);
        this.f48534a = gestaltText;
        addView(gestaltText);
        int W = c.W(this, r0.margin_quarter);
        int W2 = c.W(this, r0.margin_half);
        setPaddingRelative(W2, W, W2, W);
        a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspirationalBadgeTextView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48535b = a.j("#", Integer.toHexString(getContext().getColor(b.color_white_mochimalist_0)));
        this.f48536c = a.j("#", Integer.toHexString(getContext().getColor(b.color_black_cosmicore_900)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        gestaltText.i(d.f27647i);
        this.f48534a = gestaltText;
        addView(gestaltText);
        int W = c.W(this, r0.margin_quarter);
        int W2 = c.W(this, r0.margin_half);
        setPaddingRelative(W2, W, W2, W);
        a(null);
    }
}

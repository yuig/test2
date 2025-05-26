package ej1;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import u50.c0;
import u50.e;
import u50.i0;
import u50.j;
import u50.o0;
import ua2.d1;
import va2.l;

/* loaded from: classes2.dex */
public class a extends d1 {

    /* renamed from: h, reason: collision with root package name */
    public final l f59096h;

    /* renamed from: i, reason: collision with root package name */
    public c f59097i;

    /* renamed from: j, reason: collision with root package name */
    public int f59098j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View pinRepView) {
        super(pinRepView);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        Context context = pinRepView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f59096h = new l(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(ej1.d r11) {
        /*
            r10 = this;
            java.lang.String r0 = "displayState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            u50.i0 r0 = r11.f59108b
            android.view.View r1 = r10.f121492a
            android.content.Context r2 = r1.getContext()
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.CharSequence r0 = r0.a(r2)
            java.lang.String r0 = r0.toString()
            va2.l r2 = r10.f59096h
            r2.o(r0)
            java.lang.String r0 = "color"
            vn1.c r4 = r11.f59109c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            tn1.c r0 = r2.f125401m
            r0.b(r4)
            vn1.g r0 = r11.f59114h
            r2.p(r0)
            java.util.List r0 = r11.f59110d
            r2.n(r0)
            vn1.b r0 = r11.f59115i
            r2.m(r0)
            int r0 = r11.f59111e
            r2.f125406r = r0
            r0 = 1
            r4 = 0
            ej1.b r5 = r11.f59112f
            if (r5 == 0) goto L4c
            boolean r6 = r5.b()
            if (r6 != r0) goto L4c
        L4a:
            r7 = r4
            goto L81
        L4c:
            if (r5 != 0) goto L4f
            goto L4a
        L4f:
            android.content.Context r6 = r1.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            u50.i0 r7 = r5.f59099a
            java.lang.CharSequence r6 = r7.a(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = r5.a()
            r8 = 6
            r9 = 0
            int r8 = kotlin.text.StringsKt.L(r6, r7, r9, r9, r8)
            if (r8 < 0) goto L4a
            int r7 = r7.length()
            if (r7 != 0) goto L73
            goto L4a
        L73:
            va2.p r7 = new va2.p
            int r6 = r6.length()
            android.text.style.StyleSpan r9 = new android.text.style.StyleSpan
            r9.<init>(r0)
            r7.<init>(r8, r6, r9)
        L81:
            r2.f125408t = r7
            if (r5 == 0) goto L9d
            boolean r6 = r5.b()
            if (r6 != r0) goto L9d
            u50.o0 r0 = r10.B(r5)
            if (r0 == 0) goto Lac
            android.content.Context r4 = r1.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            android.text.SpannableStringBuilder r4 = r0.a(r4)
            goto Lac
        L9d:
            u50.o0 r0 = r11.f59113g
            if (r0 == 0) goto Lac
            android.content.Context r4 = r1.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            android.text.SpannableStringBuilder r4 = r0.a(r4)
        Lac:
            r2.f125409u = r4
            android.content.res.Resources r0 = r1.getResources()
            int r1 = r11.f59107a
            int r0 = r0.getDimensionPixelSize(r1)
            r10.f59098j = r0
            ej1.c r11 = r11.f59116j
            r10.f59097i = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ej1.a.A(ej1.d):void");
    }

    public final o0 B(b bVar) {
        if (bVar == null) {
            return null;
        }
        Context context = this.f121492a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        i0 i0Var = bVar.f59099a;
        CharSequence a13 = i0Var.a(context);
        String str = bVar.f59100b;
        int L = StringsKt.L(a13, str, 0, false, 6);
        if (L < 0 || str.length() == 0) {
            return null;
        }
        return new o0(i0Var, z0.g(new Pair(new j(new e(vn1.c.SUBTLE.getColorRes())), new c0(0, a13.length(), 17)), new Pair(new j(new e(vn1.c.DEFAULT.getColorRes())), new c0(L, str.length() + L, 17))));
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f59096h;
    }

    @Override // ua2.f1
    public void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i17 = this.f59098j;
        int i18 = i13 + i17;
        int i19 = this.f121483f;
        int i23 = i15 - i17;
        int i24 = this.f121484g;
        l lVar = this.f59096h;
        lVar.setBounds(i18, i19, i23, i24);
        lVar.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public ua2.z0 y(int i13, int i14) {
        int i15 = i13 - (this.f59098j * 2);
        l lVar = this.f59096h;
        lVar.f125407s = i15;
        lVar.l();
        return new ua2.z0(i13, lVar.f128842e);
    }
}

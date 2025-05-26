package qv0;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import so.jb;

/* loaded from: classes5.dex */
public final class z extends FrameLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f105224a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f105225b;

    /* renamed from: c, reason: collision with root package name */
    public final rm1.q f105226c;

    /* renamed from: d, reason: collision with root package name */
    public final rm1.c f105227d;

    /* renamed from: e, reason: collision with root package name */
    public final wk2.a f105228e;

    /* renamed from: f, reason: collision with root package name */
    public final String f105229f;

    /* renamed from: g, reason: collision with root package name */
    public final int f105230g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f105231h;

    /* renamed from: i, reason: collision with root package name */
    public final float f105232i;

    /* renamed from: j, reason: collision with root package name */
    public final int f105233j;

    /* renamed from: k, reason: collision with root package name */
    public final int f105234k;

    /* renamed from: l, reason: collision with root package name */
    public final float f105235l;

    /* renamed from: m, reason: collision with root package name */
    public final float f105236m;

    /* renamed from: n, reason: collision with root package name */
    public final int f105237n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f105238o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f105239p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, int i13, rm1.q qVar, vn1.c gestaltTextColor, rm1.c gestaltIconColor, int i14) {
        super(context);
        List split$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gestaltTextColor, "gestaltTextColor");
        Intrinsics.checkNotNullParameter(gestaltIconColor, "gestaltIconColor");
        int i15 = 1;
        if (!this.f105225b) {
            this.f105225b = true;
            this.f105228e = ((jb) ((a0) generatedComponent())).f113483a.f114036z8;
        }
        this.f105226c = qVar;
        this.f105227d = gestaltIconColor;
        String f23 = bs1.c.f2(this, i14);
        this.f105229f = f23;
        if (StringsKt.E(f23, " ", false) && f23.length() > 10) {
            split$default = StringsKt__StringsKt.split$default(f23, new String[]{" "}, false, 0, 6, null);
            i15 = split$default.size();
        }
        this.f105230g = i15;
        this.f105232i = 2.0f * hf0.b.f69001a;
        this.f105233j = bs1.c.W(this, eo1.c.space_100);
        int W = bs1.c.W(this, aq1.b.idea_pin_sticker_thumbnail_cell_max_size);
        this.f105234k = W;
        this.f105235l = context.getResources().getDimension(eo1.c.font_size_500);
        this.f105236m = context.getResources().getDimension(rm1.t.gestalt_icon_size_lg);
        int W2 = bs1.c.W(this, eo1.c.space_200);
        this.f105237n = W2;
        this.f105238o = j1.Y0(context);
        this.f105239p = xk2.m.b(new au0.a(this, 12));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        gestaltText.i(new au0.f(this, 23));
        gestaltText.setMaxWidth(W);
        gestaltText.setLineSpacing(0.0f, 0.8f);
        gestaltText.setPadding(W2, W2, W2, W2);
        this.f105231h = gestaltText;
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundResource(aq1.c.rounded_rect_gray_transparent_30);
        frameLayout.addView(gestaltText);
        addView(frameLayout);
        gestaltText.i(new rq.a0(this, i14, gestaltTextColor, 4));
        frameLayout.setBackgroundResource(i13);
    }

    public final float a(float f13) {
        List split$default;
        String str = this.f105229f;
        xk2.v vVar = this.f105239p;
        float f14 = this.f105232i;
        int i13 = this.f105237n;
        int i14 = this.f105233j;
        rm1.q qVar = this.f105226c;
        int i15 = this.f105230g;
        if (i15 == 1) {
            float f15 = qVar != null ? f13 + i14 : 0.0f;
            ((TextPaint) vVar.getValue()).setTextSize(f13);
            return ((TextPaint) vVar.getValue()).measureText(str) + (i13 * 2) + f15 + f14;
        }
        ((TextPaint) vVar.getValue()).setTextSize(f13);
        split$default = StringsKt__StringsKt.split$default(str, new String[]{" "}, false, 0, 6, null);
        Iterator it = split$default.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float measureText = ((TextPaint) vVar.getValue()).measureText((String) it.next());
        while (it.hasNext()) {
            measureText = Math.max(measureText, ((TextPaint) vVar.getValue()).measureText((String) it.next()));
        }
        return (i13 * 2) + (qVar != null ? (f13 * i15) + i14 : 0.0f) + measureText + f14;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f105224a == null) {
            this.f105224a = new ye2.o(this);
        }
        return this.f105224a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f105224a == null) {
            this.f105224a = new ye2.o(this);
        }
        return this.f105224a.generatedComponent();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        int size = View.MeasureSpec.getSize(i13);
        int min = Math.min(size, this.f105234k);
        float f13 = this.f105236m;
        float f14 = f13;
        float f15 = 1.0f;
        float f16 = 0.0f;
        while (true) {
            i15 = 2;
            if (f15 > f14) {
                break;
            }
            float f17 = (f15 + f14) / 2;
            if (a(f17) <= min) {
                float f18 = f17 + 1;
                f16 = f15;
                f15 = f18;
            } else {
                f16 = f17 - 1;
                f14 = f16;
            }
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float E = j1.E(f16, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float v13 = c0.d.v(E, context2);
        float f19 = this.f105230g;
        int i16 = (int) (v13 * f19);
        int i17 = min - i16;
        int i18 = min + i16;
        float f23 = this.f105235l;
        float f24 = 1.0f;
        float f25 = 0.0f;
        while (f24 <= f23) {
            float f26 = (f24 + f23) / 2;
            if (a(f26) <= i17) {
                float f27 = f26 + 1;
                f25 = f24;
                f24 = f27;
            } else {
                f25 = f26 - 1;
                f23 = f25;
            }
        }
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        float rint = (float) Math.rint(j1.E(f25, r6));
        mp.m mVar = new mp.m((1.0f > rint || rint > 12.0f) ? (13.0f > rint || rint > 16.0f) ? (17.0f > rint || rint > 20.0f) ? (21.0f > rint || rint > 28.0f) ? (29.0f > rint || rint > 36.0f) ? vn1.h.f126278d : vn1.g.HEADING_XL : vn1.g.HEADING_700 : vn1.g.UI_400 : vn1.g.BODY_300 : vn1.g.BODY_100, 4);
        GestaltText gestaltText = this.f105231h;
        gestaltText.i(mVar);
        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = i18;
        gestaltText.setLayoutParams(layoutParams2);
        float f28 = 1.0f;
        float f29 = 0.0f;
        while (f28 <= f13) {
            float f33 = (f28 + f13) / i15;
            if (a(f33) <= i17) {
                float f34 = f33 + 1;
                i15 = 2;
                f29 = f28;
                f28 = f34;
            } else {
                f29 = f33 - 1;
                f13 = f29;
                i15 = 2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        float rint2 = ((float) Math.rint(j1.E(f29, r2))) * f19;
        rm1.i iVar = (1.0f > rint2 || rint2 > 12.0f) ? (13.0f > rint2 || rint2 > 16.0f) ? (17.0f > rint2 || rint2 > 20.0f) ? (21.0f > rint2 || rint2 > 24.0f) ? (25.0f > rint2 || rint2 > 32.0f) ? GestaltIcon.f49403e : rm1.i.XL : rm1.i.LG : rm1.i.MD : rm1.i.SM : rm1.i.XS;
        rm1.q qVar = this.f105226c;
        if (qVar != null) {
            rm1.d dVar = new rm1.d(new rm1.f(qVar, iVar), this.f105227d, null, 0, null, 28);
            if (this.f105238o) {
                gestaltText.i(new ks0.f(dVar, 3));
            } else {
                gestaltText.i(new ks0.f(dVar, 4));
            }
        } else {
            gestaltText.i(d.f105171r);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }
}

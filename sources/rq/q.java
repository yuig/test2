package rq;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.text.GestaltText;
import java.net.URL;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q extends h {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f109482m = 0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f109483c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f109484d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f109485e;

    /* renamed from: f, reason: collision with root package name */
    public String f109486f;

    /* renamed from: g, reason: collision with root package name */
    public String f109487g;

    /* renamed from: h, reason: collision with root package name */
    public GestaltText f109488h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f109489i;

    /* renamed from: j, reason: collision with root package name */
    public GestaltText f109490j;

    /* renamed from: k, reason: collision with root package name */
    public a.l2 f109491k;

    /* renamed from: l, reason: collision with root package name */
    public String f109492l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, boolean z13, boolean z14, boolean z15) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f109483c = z13;
        this.f109484d = z14;
        this.f109485e = z15;
    }

    @Override // rq.v3
    public final void b() {
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        a.l2 l2Var;
        setOrientation(1);
        this.f109491k = new a.l2(this, 21);
        boolean z13 = this.f109484d;
        boolean z14 = this.f109485e;
        if (z14) {
            getPaddingRect().top = z13 ? bs1.c.W(this, eo1.c.space_200) : 0;
            setBottom(0);
        } else {
            int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.margin_half);
            getPaddingRect().bottom = dimensionPixelSize;
            getPaddingRect().top = dimensionPixelSize;
        }
        updateHorizontalPadding();
        boolean z15 = this.f109483c;
        if (z15) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
            gestaltText.i(o.f109403j);
            kh2.j1.q1(gestaltText, eo1.c.font_size_300);
            kh2.j1.p1(gestaltText, eo1.b.color_themed_text_default);
            gestaltText.setLinkTextColor(gestaltText.getResources().getColor(eo1.b.color_themed_text_default, gestaltText.getContext().getTheme()));
            if (z14) {
                gestaltText.setMaxLines(2);
            }
            if (hf0.b.n()) {
                kh2.j1.q1(gestaltText, eo1.c.font_size_500);
                gestaltText.setGravity(8388611);
            } else {
                gestaltText.setGravity(z14 ? 8388611 : 17);
            }
            gestaltText.setOnClickListener(this.f109491k);
            this.f109488h = gestaltText;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText2 = new GestaltText(6, context2, (AttributeSet) null);
        gestaltText2.i(o.f109404k);
        kh2.j1.q1(gestaltText2, eo1.c.font_size_400);
        kh2.j1.p1(gestaltText2, eo1.b.color_themed_text_default);
        if (hf0.b.n()) {
            if (hf0.b.n()) {
                kh2.j1.q1(gestaltText2, eo1.c.font_size_500);
            }
            gestaltText2.setGravity(8388611);
        } else {
            gestaltText2.setGravity(z14 ? 8388611 : 17);
        }
        if (!z15 && !z13) {
            gestaltText2.setOnClickListener(this.f109491k);
        }
        gestaltText2.setOnLongClickListener(new n(0));
        dl2.b.A2(gestaltText2);
        if (!z14) {
            pk.a0.h1(gestaltText2, eo1.a.space_100);
        }
        this.f109490j = gestaltText2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (!z15 && !z13 && (l2Var = this.f109491k) != null) {
            linearLayout.setOnClickListener(l2Var);
        }
        linearLayout.setOnLongClickListener(new n(1));
        linearLayout.addView(this.f109490j, layoutParams);
        this.f109489i = linearLayout;
        if (z15) {
            addView(this.f109488h, -1, -2);
        }
        addView(this.f109489i, -1, -2);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_TITLE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0[197(0xc5, float:2.76E-43)] != false) goto L15;
     */
    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasContent() {
        /*
            r3 = this;
            com.pinterest.api.model.f30 r0 = r3.getPin()
            if (r0 == 0) goto L12
            boolean[] r0 = r0.f37485h3
            int r1 = r0.length
            r2 = 197(0xc5, float:2.76E-43)
            if (r1 <= r2) goto L12
            boolean r0 = r0[r2]
            if (r0 == 0) goto L12
            goto L23
        L12:
            com.pinterest.api.model.f30 r0 = r3.getPin()
            if (r0 == 0) goto L25
            boolean[] r0 = r0.f37485h3
            int r1 = r0.length
            r2 = 60
            if (r1 <= r2) goto L25
            boolean r0 = r0[r2]
            if (r0 == 0) goto L25
        L23:
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.q.hasContent():boolean");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        kh2.r.u(this.f109489i, "PinCloseupTitleModule.titleContainer");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        f30 pin = getPin();
        this.f109486f = pin != null ? sq.i.b(pin) : null;
        f30 pin2 = getPin();
        String s53 = pin2 != null ? pin2.s5() : null;
        boolean z13 = this.f109483c;
        if (z13 && s53 != null) {
            this.f109487g = new URL(s53).getHost();
        }
        return df.j1.d1(this.f109486f) || (z13 && df.j1.d1(this.f109487g));
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        Pair pair;
        GestaltText gestaltText;
        super.updateView();
        if (this.f109483c || (gestaltText = this.f109488h) == null) {
            GestaltText gestaltText2 = this.f109488h;
            if (gestaltText2 != null) {
                gestaltText2.setPaddingRelative(0, 0, 0, gestaltText2.getResources().getDimensionPixelSize(eo1.c.lego_spacing_vertical_small));
                String str = this.f109487g;
                int length = str != null ? str.length() : 0;
                SpannableString spannableString = new SpannableString(this.f109487g);
                spannableString.setSpan(new UnderlineSpan(), 0, length, 0);
                gestaltText2.setText(spannableString);
                gestaltText2.setVisibility(0);
            }
        } else {
            gestaltText.setVisibility(8);
        }
        if (df.j1.d1(this.f109486f)) {
            String str2 = this.f109486f;
            pair = new Pair(str2 != null ? str2 : "", fm1.c.VISIBLE);
        } else {
            pair = new Pair("", fm1.c.GONE);
        }
        String str3 = (String) pair.f80346a;
        fm1.c cVar = (fm1.c) pair.f80347b;
        GestaltText gestaltText3 = this.f109490j;
        if (gestaltText3 != null) {
            gestaltText3.i(new p(str3, cVar, 0));
        }
    }
}

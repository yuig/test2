package rq;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.r40;
import com.pinterest.api.model.wz;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a2 extends j {

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f109086c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltText f109087d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltText f109088e;

    /* renamed from: f, reason: collision with root package name */
    public String f109089f;

    /* renamed from: g, reason: collision with root package name */
    public oq.c1 f109090g;

    /* renamed from: h, reason: collision with root package name */
    public vn1.c f109091h;

    /* renamed from: i, reason: collision with root package name */
    public String f109092i;

    /* renamed from: j, reason: collision with root package name */
    public vn1.c f109093j;

    /* renamed from: k, reason: collision with root package name */
    public String f109094k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f109095l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f109096m;

    /* renamed from: n, reason: collision with root package name */
    public String f109097n;

    /* renamed from: o, reason: collision with root package name */
    public vn1.c f109098o;

    /* renamed from: p, reason: collision with root package name */
    public wz f109099p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(Context context) {
        super(context, 5);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f109090g = oq.c1.UNKNOWN;
        vn1.c cVar = vn1.c.DEFAULT;
        this.f109091h = cVar;
        this.f109093j = cVar;
        this.f109098o = cVar;
    }

    public final void b() {
        wz wzVar = this.f109099p;
        if (wzVar != null) {
            Intrinsics.checkNotNullParameter(wzVar, "<this>");
            this.f109089f = po1.c.h(wzVar);
            this.f109090g = wz.a.IN_STOCK == wzVar.m() ? oq.c1.IN_STOCK : wz.a.OUT_OF_STOCK == wzVar.m() ? oq.c1.OUT_OF_STOCK : oq.c1.UNKNOWN;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        Context context = getContext();
        Resources resources = getResources();
        getPaddingRect().bottom = resources.getDimensionPixelSize(eo1.c.margin_half);
        this.f109091h = vn1.c.SUBTLE;
        this.f109092i = resources.getString(az1.c.product_in_stock);
        this.f109093j = vn1.c.DISABLED;
        this.f109094k = resources.getString(az1.c.product_out_of_stock);
        vn1.c cVar = vn1.c.DEFAULT;
        Intrinsics.f(context);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(new z1(this, 0));
        dl2.b.y2(gestaltText);
        this.f109086c = gestaltText;
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.i(new z1(this, 1));
        dl2.b.y2(gestaltText2);
        GestaltText gestaltText3 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText3.i(new z1(this, 2));
        dl2.b.y2(gestaltText3);
        this.f109087d = gestaltText3;
        GestaltText gestaltText4 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText4.i(o.K);
        dl2.b.y2(gestaltText4);
        this.f109088e = gestaltText4;
        setGravity(17);
        int dimensionPixelSize = resources.getDimensionPixelSize(eo1.c.margin_quarter);
        resources.getDimensionPixelSize(eo1.c.margin);
        getPaddingRect().top = dimensionPixelSize;
        getPaddingRect().bottom = dimensionPixelSize;
        setOrientation(0);
        if (!hf0.b.n()) {
            applyDefaultSidePadding();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        addView(this.f109086c, layoutParams);
        addView(this.f109088e, layoutParams);
        addView(this.f109087d, layoutParams);
        b();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_COMMERCE_HEADER;
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return this.f109089f != null;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void renderLandscapeConfiguration() {
        setGravity(8388611);
        getPaddingRect().left = getResources().getDimensionPixelSize(eo1.c.lego_spacing_horizontal_large);
        getPaddingRect().right = getResources().getDimensionPixelSize(eo1.c.lego_spacing_horizontal_large);
        setPaddingRelative(getPaddingRect().left, getPaddingRect().top, getPaddingRect().right, getPaddingRect().bottom);
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return this.f109099p != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5.f109097n, r5.f109094k) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5.f109097n, r5.f109092i) == false) goto L16;
     */
    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldUpdateView() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f109089f
            com.pinterest.gestalt.text.GestaltText r1 = r5.f109086c
            if (r1 == 0) goto Lb
            java.lang.CharSequence r1 = r1.getText()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            r1 = 1
            r0 = r0 ^ r1
            oq.c1 r2 = r5.f109090g
            int[] r3 = rq.y1.f109667a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r3 = 0
            if (r2 == r1) goto L36
            r4 = 2
            if (r2 == r4) goto L2a
            r4 = 3
            if (r2 == r4) goto L27
        L25:
            r2 = r3
            goto L41
        L27:
            boolean r2 = r5.f109096m
            goto L41
        L2a:
            java.lang.String r2 = r5.f109097n
            java.lang.String r4 = r5.f109094k
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r4)
            if (r2 != 0) goto L25
        L34:
            r2 = r1
            goto L41
        L36:
            java.lang.String r2 = r5.f109097n
            java.lang.String r4 = r5.f109092i
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r4)
            if (r2 != 0) goto L25
            goto L34
        L41:
            if (r0 != 0) goto L47
            if (r2 == 0) goto L46
            goto L47
        L46:
            r1 = r3
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.a2.shouldUpdateView():boolean");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePin(f30 pin) {
        wz wzVar;
        Intrinsics.checkNotNullParameter(pin, "pin");
        r40 p13 = b40.p(pin);
        if (p13 instanceof s10.a) {
            this.f109099p = ((s10.a) p13).f110573b;
        }
        r40 A = b40.A(pin);
        if (this.f109099p == null && b40.I0(pin) && (A instanceof s10.a) && (wzVar = ((s10.a) A).f110573b) != null) {
            this.f109099p = wzVar;
        }
        b();
        super.updatePin(pin);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        GestaltText gestaltText;
        String s13;
        super.updateView();
        this.f109095l = this.f109089f != null;
        wz wzVar = this.f109099p;
        if (wzVar != null && po1.c.k(wzVar) && (s13 = wzVar.s()) != null) {
            s13.length();
        }
        this.f109096m = this.f109090g != oq.c1.UNKNOWN;
        String string = getResources().getString(az1.c.product_out_of_stock);
        this.f109094k = string;
        oq.c1 c1Var = this.f109090g;
        oq.c1 c1Var2 = oq.c1.IN_STOCK;
        if (c1Var == c1Var2) {
            string = this.f109092i;
        }
        this.f109097n = string;
        this.f109098o = c1Var == c1Var2 ? this.f109091h : this.f109093j;
        bs1.c.R1(this, this.f109095l);
        GestaltText gestaltText2 = this.f109088e;
        if (gestaltText2 != null) {
            gestaltText2.i(new z1(this, 3));
        }
        String str = this.f109097n;
        if (str == null || (gestaltText = this.f109087d) == null) {
            return;
        }
        gestaltText.i(new ba.s(21, this, str));
    }
}

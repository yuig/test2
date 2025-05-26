package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.pinterest.api.model.f30;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 extends FrameLayout implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f46366a;

    /* renamed from: b, reason: collision with root package name */
    public final t1 f46367b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f46368c;

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f46369d;

    /* renamed from: e, reason: collision with root package name */
    public final View f46370e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f46371f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f46372g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Context context, f30 pin, t1 t1Var) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f46366a = pin;
        this.f46367b = t1Var;
        xk2.v b13 = xk2.m.b(l0.f46221l);
        this.f46371f = bs1.c.f0(this, aq1.c.rounded_rect_lego_white_always_small_to_med_radius, null, null, 6);
        xk2.m.b(new au0.a(this, 2));
        View.inflate(context, aq1.f.layout_idea_pin_product_sticker_rep, this);
        View findViewById = findViewById(aq1.d.idea_pin_product_sticker_rep);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46370e = findViewById;
        zf1.e eVar = (zf1.e) ((wk2.a) b13.getValue()).get();
        View findViewById2 = findViewById(aq1.d.product_title);
        TextView textView = (TextView) findViewById2;
        String r43 = pin.r4();
        String str = "";
        r43 = r43 == null ? "" : r43;
        if (r43.length() > 25) {
            String substring = r43.substring(0, 22);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            r43 = substring + "...";
        }
        textView.setText(r43);
        Intrinsics.f(eVar);
        Typeface d2 = eVar.d(zf1.f.REGULAR_ITALIC);
        textView.setTypeface(Typeface.create(d2 == null ? Typeface.DEFAULT : d2, 2));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f46368c = textView;
        View findViewById3 = findViewById(aq1.d.product_image);
        WebImageView webImageView = (WebImageView) findViewById3;
        float f23 = webImageView.f2();
        webImageView.g2(f23, f23, f23, f23);
        webImageView.Y(new oq.i(this, 5));
        String p03 = bs1.c.p0(pin);
        if (p03 == null) {
            String y43 = pin.y4();
            if (y43 != null) {
                str = y43;
            }
        } else {
            str = p03;
        }
        webImageView.loadUrl(str);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f46369d = webImageView;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.u1
    public final void a(int i13, int i14) {
        Drawable mutate = this.f46371f.mutate();
        mutate.setTint(i13);
        this.f46370e.setBackground(mutate);
        this.f46368c.setTextColor(i14);
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.u1
    public final void b(t1 t1Var) {
        if (this.f46372g) {
            ((l0.d) t1Var).a();
            return;
        }
        oq.i iVar = new oq.i(t1Var, 6);
        WebImageView webImageView = this.f46369d;
        webImageView.Y(iVar);
        f30 f30Var = this.f46366a;
        String p03 = bs1.c.p0(f30Var);
        if (p03 == null && (p03 = f30Var.y4()) == null) {
            p03 = "";
        }
        webImageView.loadUrl(p03);
    }
}

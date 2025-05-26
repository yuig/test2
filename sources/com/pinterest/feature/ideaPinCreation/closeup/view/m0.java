package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 extends FrameLayout implements u1 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f46232n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final a42.c f46233a;

    /* renamed from: b, reason: collision with root package name */
    public final t1 f46234b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f46235c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f46236d;

    /* renamed from: e, reason: collision with root package name */
    public final WebImageView f46237e;

    /* renamed from: f, reason: collision with root package name */
    public final WebImageView f46238f;

    /* renamed from: g, reason: collision with root package name */
    public final WebImageView f46239g;

    /* renamed from: h, reason: collision with root package name */
    public final View f46240h;

    /* renamed from: i, reason: collision with root package name */
    public final Drawable f46241i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f46242j;

    /* renamed from: k, reason: collision with root package name */
    public final dc0.g f46243k;

    /* renamed from: l, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.x f46244l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f46245m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Context context, v7 board, a42.c variant, t1 t1Var) {
        super(context);
        String z43;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f46233a = variant;
        this.f46234b = t1Var;
        xk2.v b13 = xk2.m.b(l0.f46219j);
        a42.c cVar = a42.c.DEFAULT;
        this.f46241i = bs1.c.f0(this, variant == cVar ? aq1.c.rounded_rect_lego_white_always_med_radius : aq1.c.rounded_rect_lego_white_always_small_to_med_radius, null, null, 6);
        this.f46242j = xk2.m.b(new au0.a(this, 1));
        View.inflate(context, variant == cVar ? aq1.f.layout_idea_pin_board_sticker_rep_default : aq1.f.layout_idea_pin_board_sticker_rep_compact, this);
        zf1.e eVar = (zf1.e) ((wk2.a) b13.getValue()).get();
        dc0.q qVar = dc0.q.Default;
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        dc0.o W = gi2.b.W(board, qVar, resources);
        View findViewById = findViewById(aq1.d.idea_pin_board_sticker_rep);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46240h = findViewById;
        View findViewById2 = findViewById(aq1.d.idea_pin_board_sticker_rep_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(aq1.d.primary_image);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById3;
        this.f46237e = webImageView;
        View findViewById4 = findViewById(aq1.d.secondary_image_top);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        WebImageView webImageView2 = (WebImageView) findViewById4;
        this.f46238f = webImageView2;
        View findViewById5 = findViewById(aq1.d.secondary_image_bottom);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        WebImageView webImageView3 = (WebImageView) findViewById5;
        this.f46239g = webImageView3;
        View findViewById6 = findViewById(aq1.d.board_name);
        TextView textView = (TextView) findViewById6;
        dc0.k kVar = W.f54340d;
        textView.setText(d(Integer.valueOf(kVar != null ? variant == cVar ? 16 : 14 : 20), W.f54343g));
        Typeface d2 = eVar.d(zf1.f.BOLD_ITALIC);
        textView.setTypeface(Typeface.create(d2 == null ? Typeface.DEFAULT : d2, 0));
        kh2.j1.q1(textView, eo1.c.font_size_300);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        this.f46235c = textView;
        View findViewById7 = findViewById(aq1.d.owner_name);
        TextView textView2 = (TextView) findViewById7;
        wy0 k13 = board.k1();
        textView2.setText(d(20, "@".concat((k13 == null || (z43 = k13.z4()) == null) ? "" : z43)));
        Typeface d13 = eVar.d(zf1.f.REGULAR_ITALIC);
        textView2.setTypeface(Typeface.create(d13 == null ? Typeface.DEFAULT : d13, 0));
        kh2.j1.q1(textView2, eo1.c.font_size_100);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        this.f46236d = textView2;
        View findViewById8 = findViewById(aq1.d.facepile);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        GestaltAvatarGroup gestaltAvatarGroup = (GestaltAvatarGroup) findViewById8;
        if (kVar != null) {
            gestaltAvatarGroup.a(new lq0.g1(28, W, board));
            if (variant == a42.c.ONE_LINE) {
                findViewById2.getLayoutParams().width = getResources().getDimensionPixelSize(aq1.b.idea_pin_board_sticker_width_compact_collaborative_board);
            }
        }
        Context context2 = getContext();
        int i13 = aq1.a.color_empty_state_gray;
        Object obj = d5.a.f53679a;
        int color = context2.getColor(i13);
        webImageView.setBackgroundColor(color);
        webImageView2.setBackgroundColor(color);
        webImageView3.setBackgroundColor(color);
        if (bs1.c.l1(this)) {
            webImageView.g2(0.0f, c(), 0.0f, c());
            webImageView2.g2(c(), 0.0f, 0.0f, 0.0f);
            webImageView3.g2(0.0f, 0.0f, c(), 0.0f);
        } else {
            webImageView.g2(c(), 0.0f, c(), 0.0f);
            webImageView2.g2(0.0f, c(), 0.0f, 0.0f);
            webImageView3.g2(0.0f, 0.0f, 0.0f, c());
        }
        dc0.g gVar = W.f54338b;
        this.f46243k = gVar;
        Boolean[] boolArr = new Boolean[3];
        for (int i14 = 0; i14 < 3; i14++) {
            boolArr[i14] = Boolean.FALSE;
        }
        int i15 = 0;
        for (Pair pair : kotlin.collections.f0.j(new Pair(gVar.f54319a, 0), new Pair(gVar.f54320b, 1), new Pair(gVar.f54321c, 2))) {
            CharSequence charSequence = (CharSequence) pair.f80346a;
            if (charSequence == null || charSequence.length() == 0) {
                boolArr[((Number) pair.f80347b).intValue()] = Boolean.TRUE;
            }
        }
        while (true) {
            if (i15 >= 3) {
                this.f46245m = true;
                break;
            } else if (!boolArr[i15].booleanValue()) {
                break;
            } else {
                i15++;
            }
        }
        this.f46244l = new com.google.android.gms.internal.measurement.x(boolArr);
        b(this.f46234b);
    }

    public static String d(Integer num, String str) {
        if (str.length() <= num.intValue()) {
            return str;
        }
        String substring = str.substring(0, num.intValue() - 3);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return a.a.C(substring, "...");
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.u1
    public final void a(int i13, int i14) {
        Drawable mutate = this.f46241i.mutate();
        mutate.setTint(i13);
        this.f46240h.setBackground(mutate);
        this.f46236d.setTextColor(i14);
        this.f46235c.setTextColor(i14);
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.u1
    public final void b(t1 t1Var) {
        if (this.f46245m && t1Var != null) {
            t1Var.a();
        }
        ((uk2.f) this.f46244l.f31695c).E(new au0.h(10, new lq0.g1(29, this, t1Var)), new au0.h(11, p.f46279l));
        k0 k0Var = new k0(this, 0);
        WebImageView webImageView = this.f46237e;
        webImageView.Y(k0Var);
        k0 k0Var2 = new k0(this, 1);
        WebImageView webImageView2 = this.f46238f;
        webImageView2.Y(k0Var2);
        k0 k0Var3 = new k0(this, 2);
        WebImageView webImageView3 = this.f46239g;
        webImageView3.Y(k0Var3);
        dc0.g gVar = this.f46243k;
        webImageView.loadUrl(gVar.f54319a);
        webImageView2.loadUrl(gVar.f54320b);
        webImageView3.loadUrl(gVar.f54321c);
    }

    public final float c() {
        return ((Number) this.f46242j.getValue()).floatValue();
    }
}

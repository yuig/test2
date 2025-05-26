package com.pinterest.design.brio.widget.voice;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import eo1.a;
import kotlin.jvm.internal.Intrinsics;
import le0.e;
import le0.i;
import pk.a0;
import ve0.b;
import ve0.c;
import ve0.f;
import ve0.k;
import ve0.m;
import ve0.o;
import xo.j;

/* loaded from: classes5.dex */
public class PinterestSuggestion extends PinterestVoiceLayout implements c {

    /* renamed from: i */
    public static final /* synthetic */ int f44894i = 0;

    /* renamed from: f */
    public final o f44895f;

    /* renamed from: g */
    public final GestaltText f44896g;

    /* renamed from: h */
    public boolean f44897h;

    public PinterestSuggestion(Context context) {
        this(context, null, 0);
    }

    @Override // ve0.c
    public final void a(CharSequence charSequence) {
        GestaltText gestaltText = this.f44896g;
        if (gestaltText != null) {
            a0.q(gestaltText, bs1.c.h2(charSequence));
        }
    }

    @Override // ve0.c
    public final boolean b() {
        return a0.D0(a0.R(this.f44896g));
    }

    @Override // ve0.c
    public final void c(int i13) {
        this.f44895f.d(i13);
        invalidate();
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestVoiceLayout
    public final f d() {
        return this.f44895f;
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestVoiceLayout
    public final void f(Context context, AttributeSet attributeSet) {
        super.f(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.PinterestSuggestion);
        this.f44897h = obtainStyledAttributes.getBoolean(i.PinterestSuggestion_drawXButton, this.f44897h);
        obtainStyledAttributes.recycle();
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestVoiceLayout
    public final void h(Context context) {
        this.f44913e = b.TOP_LEFT;
        this.f44897h = true;
    }

    public PinterestSuggestion(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PinterestSuggestion(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Resources resources = getResources();
        GestaltText gestaltText = new GestaltText(context);
        gestaltText.i(new j(23));
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        dl2.b.y2(gestaltText);
        this.f44896g = gestaltText;
        addView(gestaltText);
        m mVar = new m();
        mVar.f125723i = true;
        mVar.f125715a = resources.getDimensionPixelSize(le0.b.suggestions_button_size);
        mVar.f125716b = resources.getDimensionPixelSize(le0.b.suggestions_stroke_width);
        mVar.f125717c = resources.getDimensionPixelSize(le0.b.suggestions_x_circle_inset);
        mVar.f125718d = resources.getDimensionPixelSize(le0.b.suggestions_x_offset);
        mVar.f125719e = resources.getDimensionPixelSize(le0.b.suggestions_arrow_width);
        mVar.f125720f = resources.getDimensionPixelSize(le0.b.suggestions_arrow_height);
        mVar.f125722h = j1.f0(resources);
        mVar.f125721g = a0.K(e.suggestions_button_right_margin_in_dp, resources);
        mVar.f125723i = this.f44897h;
        int K = j1.K(context);
        int x03 = dl2.b.x0(context, a.sema_color_background_default);
        int i14 = eo1.b.black900_20;
        Object obj = d5.a.f53679a;
        this.f44895f = new o(K, x03, context.getColor(i14), mVar);
        this.f44895f.e(context, a0.K(eo1.e.suggestions_left_padding_in_dp, resources), a0.K(eo1.e.suggestions_top_padding_in_dp, resources), resources.getDimensionPixelSize(le0.b.suggestions_button_size) + a0.K(eo1.e.suggestions_right_padding_in_dp, resources), a0.K(eo1.e.suggestions_btm_padding_in_dp, resources));
        o oVar = this.f44895f;
        ve0.j jVar = new ve0.j(this, 0);
        ve0.i iVar = oVar.f125734j;
        if (iVar != null) {
            iVar.f125704h = jVar;
        }
        oVar.f125735k.f125704h = new ve0.j(this, 1);
        oVar.setCallback(this);
        setOnTouchListener(new k(this));
    }
}

package com.pinterest.gestalt.sheet.header;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import eo1.a;
import gm1.b;
import hn1.c;
import hn1.p;
import hn1.q;
import hn1.s;
import hn1.t;
import hn1.x;
import kn1.d;
import kn1.f;
import kn1.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u50.f0;
import u50.o;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\r\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB'\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/pinterest/gestalt/sheet/header/GestaltSheetHeader;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lkn1/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al1/n", "sheet_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltSheetHeader extends ConstraintLayout implements b {

    /* renamed from: n, reason: collision with root package name */
    public static final q f49579n = q.Center;

    /* renamed from: o, reason: collision with root package name */
    public static final f0 f49580o = ep.b.x("@string/content_description_image_pds", "string", "@string/content_description_image_pds");

    /* renamed from: p, reason: collision with root package name */
    public static final f0 f49581p = ep.b.x("@string/content_description_image_pds", "string", "@string/content_description_image_pds");

    /* renamed from: q, reason: collision with root package name */
    public static final p f49582q = p.DISMISS;

    /* renamed from: r, reason: collision with root package name */
    public static final c f49583r = new c(rm1.q.DIRECTIONAL_ARROW_RIGHT, null, null, 14);

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.messaging.q f49584a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltIconButton f49585b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f49586c;

    /* renamed from: d, reason: collision with root package name */
    public View f49587d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltText f49588e;

    /* renamed from: f, reason: collision with root package name */
    public GestaltIconButton f49589f;

    /* renamed from: g, reason: collision with root package name */
    public GestaltButton f49590g;

    /* renamed from: h, reason: collision with root package name */
    public WebImageView f49591h;

    /* renamed from: i, reason: collision with root package name */
    public final TransitionDrawable f49592i;

    /* renamed from: j, reason: collision with root package name */
    public final v f49593j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f49594k;

    /* renamed from: l, reason: collision with root package name */
    public View.OnClickListener f49595l;

    /* renamed from: m, reason: collision with root package name */
    public final v f49596m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltSheetHeader(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void L(boolean z13) {
        androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
        pVar.j(this);
        pVar.m(t.sheet_title, 7, z13 ? t.sheet_end_button : t.sheet_end_icon_button, 6, 0);
        pVar.b(this);
    }

    public final void T(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        com.google.firebase.messaging.q qVar = this.f49584a;
        qVar.d(nextState, new d(this, (kn1.b) ((o) qVar.f33803a), 0));
    }

    public final void X(kn1.b bVar, kn1.b bVar2) {
        int i13 = a0() ? hn1.v.sheet_media_header : hn1.v.sheet_header;
        Integer num = this.f49594k;
        if (num == null || num.intValue() != i13) {
            removeAllViews();
            View.inflate(getContext(), i13, this);
            this.f49594k = Integer.valueOf(i13);
            View findViewById = findViewById(t.sheet_start_button);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById;
            this.f49585b = gestaltIconButton;
            View.OnClickListener onClickListener = this.f49595l;
            if (onClickListener != null) {
                if (gestaltIconButton == null) {
                    Intrinsics.r("startIconButton");
                    throw null;
                }
                gestaltIconButton.v(onClickListener);
            }
            View findViewById2 = findViewById(t.sheet_title);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            this.f49586c = (GestaltText) findViewById2;
            View findViewById3 = findViewById(t.drag_handle);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
            this.f49587d = findViewById3;
            if (i13 == hn1.v.sheet_media_header) {
                this.f49591h = (WebImageView) findViewById(t.sheet_image);
                this.f49588e = null;
                this.f49589f = null;
                this.f49590g = null;
            } else {
                this.f49588e = (GestaltText) findViewById(t.sheet_sub_header);
                this.f49589f = (GestaltIconButton) findViewById(t.sheet_end_icon_button);
                this.f49590g = (GestaltButton) findViewById(t.sheet_end_button);
                this.f49591h = null;
            }
        }
        int G0 = a0() ? dl2.b.G0(this, a.space_0) : dl2.b.G0(this, a.space_200);
        setPaddingRelative(G0, G0, G0, G0);
        j1.v(bVar, bVar2, f.f80256o, new kn1.a(this, 6));
        j1.v(bVar, bVar2, f.f80257p, new kn1.a(this, 7));
        j1.v(bVar, bVar2, f.f80258q, new kn1.a(this, 8));
        j1.v(bVar, bVar2, f.f80259r, new kn1.a(this, 9));
        int i14 = 1;
        j1.v(bVar, bVar2, f.f80260s, new kn1.a(this, i14));
        j1.v(bVar, bVar2, f.f80251j, new kn1.a(this, 2));
        j1.v(bVar, bVar2, f.f80252k, new d(this, bVar2, i14));
        j1.v(bVar, bVar2, f.f80253l, new kn1.a(this, 3));
        j1.v(bVar, bVar2, f.f80254m, new kn1.a(this, 4));
        j1.v(bVar, bVar2, f.f80255n, new kn1.a(this, 5));
    }

    public final int Z() {
        return ((Number) this.f49593j.getValue()).intValue();
    }

    public final boolean a0() {
        Object obj = this.f49584a.f33803a;
        return !(((kn1.b) ((o) obj)).f80240h == null && ((kn1.b) ((o) obj)).f80242j == null) && ((Boolean) this.f49596m.getValue()).booleanValue();
    }

    public final void d0() {
        WebImageView webImageView = this.f49591h;
        if (webImageView != null) {
            webImageView.setVisibility(0);
        }
        WebImageView webImageView2 = this.f49591h;
        if (webImageView2 != null) {
            webImageView2.g2(dl2.b.G0(webImageView2, a.comp_sheet_partial_header_rounding), dl2.b.G0(webImageView2, a.comp_sheet_partial_header_rounding), 0.0f, 0.0f);
        }
        GestaltText gestaltText = this.f49586c;
        if (gestaltText == null) {
            Intrinsics.r("sheetTitle");
            throw null;
        }
        pp2.a.k(gestaltText, f.f80261t);
        g0(a.space_400);
    }

    public final void g0(int i13) {
        GestaltText gestaltText = this.f49586c;
        if (gestaltText == null) {
            Intrinsics.r("sheetTitle");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMarginStart(dl2.b.G0(this, i13));
        }
        GestaltText gestaltText2 = this.f49586c;
        if (gestaltText2 != null) {
            gestaltText2.setLayoutParams(layoutParams2);
        } else {
            Intrinsics.r("sheetTitle");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltSheetHeader(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49593j = m.b(new g(this, 1));
        int i14 = 0;
        this.f49596m = m.b(new g(this, i14));
        int[] GestaltSheetHeader = x.GestaltSheetHeader;
        Intrinsics.checkNotNullExpressionValue(GestaltSheetHeader, "GestaltSheetHeader");
        com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q(this, attributeSet, i13, GestaltSheetHeader, new kn1.a(this, i14));
        this.f49584a = qVar;
        setMinHeight(dl2.b.G0(this, a.comp_sheet_header_min_height));
        int i15 = s.sheet_header_background;
        Object obj = d5.a.f53679a;
        Drawable drawable = context.getDrawable(i15);
        Intrinsics.g(drawable, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
        TransitionDrawable transitionDrawable = (TransitionDrawable) drawable;
        this.f49592i = transitionDrawable;
        setBackground(transitionDrawable);
        transitionDrawable.reverseTransition(Z());
        X(null, (kn1.b) ((o) qVar.f33803a));
    }
}

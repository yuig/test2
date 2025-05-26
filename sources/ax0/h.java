package ax0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.f30;
import com.pinterest.design.components.images.ImageStack;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import h32.g0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ni1.c0;
import ni1.o2;
import ni1.t2;
import nx.d0;
import nx.v;
import qa2.f0;
import qa2.h0;
import qa2.j0;
import uq.w;
import wa2.m;

/* loaded from: classes5.dex */
public final class h extends w implements v, f0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f20618v = 0;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f20619d;

    /* renamed from: e, reason: collision with root package name */
    public j0 f20620e;

    /* renamed from: f, reason: collision with root package name */
    public ni1.d0 f20621f;

    /* renamed from: g, reason: collision with root package name */
    public t2 f20622g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f20623h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageStack f20624i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f20625j;

    /* renamed from: k, reason: collision with root package name */
    public final FrameLayout f20626k;

    /* renamed from: l, reason: collision with root package name */
    public final ConstraintLayout.LayoutParams f20627l;

    /* renamed from: m, reason: collision with root package name */
    public final ConstraintLayout.LayoutParams f20628m;

    /* renamed from: n, reason: collision with root package name */
    public final LinearLayout.LayoutParams f20629n;

    /* renamed from: o, reason: collision with root package name */
    public final LinearLayout.LayoutParams f20630o;

    /* renamed from: p, reason: collision with root package name */
    public final LinearLayout.LayoutParams f20631p;

    /* renamed from: q, reason: collision with root package name */
    public int f20632q;

    /* renamed from: r, reason: collision with root package name */
    public m f20633r;

    /* renamed from: s, reason: collision with root package name */
    public final SbaPinRep f20634s;

    /* renamed from: t, reason: collision with root package name */
    public final o2 f20635t;

    /* renamed from: u, reason: collision with root package name */
    public c0 f20636u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, d0 pinalytics, ao2.j0 scope) {
        super(context, 13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f20619d = pinalytics;
        View inflate = LayoutInflater.from(context).inflate(f62.d.see_it_styled_scene_pin_item, this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        View findViewById = inflate.findViewById(f62.c.product_images_dropdown);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        this.f20623h = linearLayout;
        View findViewById2 = inflate.findViewById(f62.c.image_stack);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ImageStack imageStack = (ImageStack) findViewById2;
        this.f20624i = imageStack;
        View findViewById3 = inflate.findViewById(f62.c.dropdown_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById3;
        this.f20625j = gestaltText;
        View findViewById4 = inflate.findViewById(f62.c.dropdown_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltIcon gestaltIcon = (GestaltIcon) findViewById4;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(f62.c.scene_pin_cell_container);
        this.f20626k = frameLayout;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        this.f20627l = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        this.f20628m = layoutParams2 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams2 : null;
        ViewGroup.LayoutParams layoutParams3 = imageStack.getLayoutParams();
        this.f20629n = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
        ViewGroup.LayoutParams layoutParams4 = gestaltText.getLayoutParams();
        this.f20630o = layoutParams4 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams4 : null;
        ViewGroup.LayoutParams layoutParams5 = gestaltIcon.getLayoutParams();
        this.f20631p = layoutParams5 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams5 : null;
        m a13 = m.a(m60.f0.i0(bs1.c.r()), false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, g0.SEE_IT_STYLED, false, false, null, null, null, false, null, null, false, false, null, null, false, -1310721, -17, 1023);
        this.f20633r = a13;
        t2 t2Var = this.f20622g;
        if (t2Var == null) {
            Intrinsics.r("pinRepViewModelFactory");
            throw null;
        }
        j0 j0Var = this.f20620e;
        if (j0Var == null) {
            Intrinsics.r("pinGridCellFactory");
            throw null;
        }
        Pair q13 = l3.c.q(context, a13, pinalytics, scope, j0Var, t2Var);
        SbaPinRep sbaPinRep = (SbaPinRep) q13.f80346a;
        o2 o2Var = (o2) q13.f80347b;
        this.f20634s = sbaPinRep;
        this.f20635t = o2Var;
        frameLayout.addView(sbaPinRep);
        ImageStack.b(imageStack, bs1.c.W(imageStack, f62.a.see_it_styled_image_stack_size), bs1.c.W(imageStack, f62.a.see_it_styled_image_stack_size), 0, 0.0f, 0, 0, 3, 60);
    }

    @Override // qa2.f0
    public final h0 getInternalCell() {
        return this.f20634s;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return this.f20634s.markImpressionEnd();
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f20634s.markImpressionStart();
    }

    @Override // qa2.e0
    public final void setPin(f30 pin, int i13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
    }
}

package cx0;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ao2.j0;
import com.pinterest.api.model.f30;
import com.pinterest.design.components.images.ImageStack;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.grid.LegoPinGridCell;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.v;
import qa2.f0;
import qa2.h0;
import ti1.o;
import ti1.r;
import uq.w;
import wa2.m;

/* loaded from: classes5.dex */
public final class i extends w implements v, r, f0 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f53363r = 0;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f53364d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f53365e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageStack f53366f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f53367g;

    /* renamed from: h, reason: collision with root package name */
    public final FrameLayout f53368h;

    /* renamed from: i, reason: collision with root package name */
    public final ConstraintLayout.LayoutParams f53369i;

    /* renamed from: j, reason: collision with root package name */
    public final ConstraintLayout.LayoutParams f53370j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout.LayoutParams f53371k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayout.LayoutParams f53372l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout.LayoutParams f53373m;

    /* renamed from: n, reason: collision with root package name */
    public int f53374n;

    /* renamed from: o, reason: collision with root package name */
    public final o f53375o;

    /* renamed from: p, reason: collision with root package name */
    public final LegoPinGridCell f53376p;

    /* renamed from: q, reason: collision with root package name */
    public final wa2.i f53377q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, d0 pinalytics, j0 scope) {
        super(context, 14);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f53364d = pinalytics;
        View inflate = LayoutInflater.from(context).inflate(f62.d.shop_the_look_focus_scene_pin_item, this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        View findViewById = inflate.findViewById(f62.c.product_images_dropdown);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        this.f53365e = linearLayout;
        View findViewById2 = inflate.findViewById(f62.c.image_stack);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ImageStack imageStack = (ImageStack) findViewById2;
        this.f53366f = imageStack;
        View findViewById3 = inflate.findViewById(f62.c.dropdown_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById3;
        this.f53367g = gestaltText;
        View findViewById4 = inflate.findViewById(f62.c.dropdown_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltIcon gestaltIcon = (GestaltIcon) findViewById4;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(f62.c.scene_pin_cell_container);
        this.f53368h = frameLayout;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        this.f53369i = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        this.f53370j = layoutParams2 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams2 : null;
        ViewGroup.LayoutParams layoutParams3 = imageStack.getLayoutParams();
        this.f53371k = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
        ViewGroup.LayoutParams layoutParams4 = gestaltText.getLayoutParams();
        this.f53372l = layoutParams4 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams4 : null;
        ViewGroup.LayoutParams layoutParams5 = gestaltIcon.getLayoutParams();
        this.f53373m = layoutParams5 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams5 : null;
        o oVar = new o(context, pinalytics, scope, new m(-1, -1, 1023, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false), this, null, null, 480);
        this.f53375o = oVar;
        oVar.b();
        KeyEvent.Callback a13 = oVar.a().a();
        this.f53376p = (LegoPinGridCell) a13;
        Intrinsics.g(a13, "null cannot be cast to non-null type android.view.View");
        frameLayout.addView((View) a13);
        ImageStack.b(imageStack, bs1.c.W(imageStack, f62.a.see_it_styled_image_stack_size), bs1.c.W(imageStack, f62.a.see_it_styled_image_stack_size), 0, 0.0f, 0, 0, 3, 60);
        this.f53377q = bs1.c.r();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.pinterest.ui.grid.LegoPinGridCell, qa2.h0] */
    @Override // qa2.f0
    public final h0 getInternalCell() {
        return this.f53376p;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return this.f53375o.markImpressionEnd();
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f53375o.markImpressionStart();
    }

    @Override // ti1.r
    public final boolean o() {
        return true;
    }

    @Override // qa2.e0
    public final void setPin(f30 pin, int i13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f53375o.d(pin, i13, m60.f0.i0(this.f53377q), h.f53360j);
    }
}

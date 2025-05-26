package e81;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.ChangeBounds;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.search.visual.collage.view.CollageInteractiveFrameLayout;
import com.pinterest.feature.search.visual.collage.view.CollageInteractiveImageView;
import com.pinterest.feature.search.visual.collage.view.DotsIndicatorView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import h32.d4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import so.a4;
import ua.t0;
import xk2.v;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\t\b\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Le81/d;", "Lyk1/k;", "Le81/m;", "Le81/f;", "Lt71/f;", "Lt71/b;", "Lt71/d;", "Lt71/c;", "<init>", "()V", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends o implements m, f, t71.f, t71.b, t71.d, t71.c {
    public static final /* synthetic */ int O0 = 0;
    public View A0;
    public View B0;
    public t71.e G0;
    public t71.i H0;
    public uk1.e N0;

    /* renamed from: j0, reason: collision with root package name */
    public a4 f57763j0;

    /* renamed from: k0, reason: collision with root package name */
    public RoundedCornersLayout f57764k0;

    /* renamed from: l0, reason: collision with root package name */
    public CollageInteractiveFrameLayout f57765l0;

    /* renamed from: m0, reason: collision with root package name */
    public CollageInteractiveImageView f57766m0;

    /* renamed from: n0, reason: collision with root package name */
    public LinearLayoutCompat f57767n0;

    /* renamed from: o0, reason: collision with root package name */
    public DotsIndicatorView f57768o0;

    /* renamed from: p0, reason: collision with root package name */
    public ImageView f57769p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltButton f57770q0;

    /* renamed from: r0, reason: collision with root package name */
    public GestaltIconButton f57771r0;

    /* renamed from: s0, reason: collision with root package name */
    public View f57772s0;

    /* renamed from: t0, reason: collision with root package name */
    public View f57773t0;

    /* renamed from: u0, reason: collision with root package name */
    public View f57774u0;

    /* renamed from: v0, reason: collision with root package name */
    public View f57775v0;

    /* renamed from: w0, reason: collision with root package name */
    public View f57776w0;

    /* renamed from: x0, reason: collision with root package name */
    public View f57777x0;

    /* renamed from: y0, reason: collision with root package name */
    public View f57778y0;

    /* renamed from: z0, reason: collision with root package name */
    public View f57779z0;
    public final v C0 = xk2.m.b(new b(this, 1));
    public final v D0 = xk2.m.b(new b(this, 5));
    public final v E0 = xk2.m.b(new b(this, 2));
    public final v F0 = xk2.m.b(new b(this, 6));
    public final int I0 = kh2.d.p(8);
    public final xk2.k J0 = xk2.m.a(xk2.n.NONE, new b(this, 0));
    public final d4 K0 = d4.COLLAGE_EDITOR_CANVAS;
    public final v L0 = xk2.m.b(new b(this, 4));
    public final v M0 = xk2.m.b(new b(this, 3));

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        t71.e eVar;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_CREATE_RESULT_CODE") || (eVar = this.G0) == null) {
            return;
        }
        ((a81.g) eVar).t3();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        a4 a4Var = this.f57763j0;
        if (a4Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        uk1.e eVar = this.N0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        e3.a aVar = new e3.a(5);
        aVar.p(d4.COLLAGE_EDITOR_CANVAS, null, null, null);
        Unit unit = Unit.f80348a;
        return a4Var.a(((uk1.a) eVar).e("", aVar), p7());
    }

    public final void b8(boolean z13) {
        ImageView imageView = this.f57769p0;
        if (imageView == null) {
            Intrinsics.r("deleteButton");
            throw null;
        }
        bs1.c.X0(imageView);
        for (View view : (View[]) this.E0.getValue()) {
            bs1.c.X0(view);
        }
        for (View view2 : (View[]) this.F0.getValue()) {
            bs1.c.X0(view2);
        }
        for (View view3 : (View[]) this.C0.getValue()) {
            bs1.c.X0(view3);
        }
        for (View view4 : (View[]) this.D0.getValue()) {
            bs1.c.X0(view4);
        }
    }

    public final RectF c8() {
        return (RectF) this.M0.getValue();
    }

    public final RectF d8() {
        return (RectF) this.L0.getValue();
    }

    public final PointF e8(i overlayView, RectF viewRect, Matrix viewMatrix) {
        Intrinsics.checkNotNullParameter(overlayView, "overlayView");
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        float f13 = 2;
        Float[] fArr = {Float.valueOf(c8().left), Float.valueOf(d8().width() / f13), Float.valueOf(c8().right)};
        return f8(new Float[]{Float.valueOf(viewRect.left), Float.valueOf(viewRect.centerX()), Float.valueOf(viewRect.right)}, (View[]) this.E0.getValue(), fArr, new Float[]{Float.valueOf(viewRect.top), Float.valueOf(viewRect.centerY()), Float.valueOf(viewRect.bottom)}, (View[]) this.F0.getValue(), new Float[]{Float.valueOf(c8().top), Float.valueOf(d8().height() / f13), Float.valueOf(c8().bottom)});
    }

    public final PointF f8(Float[] fArr, View[] viewArr, Float[] fArr2, Float[] fArr3, View[] viewArr2, Float[] fArr4) {
        int i13;
        int length = fArr2.length;
        int i14 = -1;
        float f13 = 0.0f;
        int i15 = 0;
        int i16 = -1;
        float f14 = 0.0f;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i13 = this.I0;
            if (i17 >= length) {
                break;
            }
            int i19 = i18 + 1;
            float floatValue = fArr2[i17].floatValue() - fArr[i18].floatValue();
            if (Math.abs(floatValue) < i13) {
                i16 = i18;
                f14 = floatValue;
            }
            i17++;
            i18 = i19;
        }
        int length2 = viewArr.length;
        int i23 = 0;
        int i24 = 0;
        while (i23 < length2) {
            View view = viewArr[i23];
            int i25 = i24 + 1;
            if (i24 == i16) {
                bs1.c.U1(view);
            } else {
                bs1.c.X0(view);
            }
            i23++;
            i24 = i25;
        }
        int length3 = fArr4.length;
        int i26 = 0;
        int i27 = 0;
        while (i26 < length3) {
            int i28 = i27 + 1;
            float floatValue2 = fArr4[i26].floatValue() - fArr3[i27].floatValue();
            if (Math.abs(floatValue2) < i13) {
                i14 = i27;
                f13 = floatValue2;
            }
            i26++;
            i27 = i28;
        }
        int length4 = viewArr2.length;
        int i29 = 0;
        while (i15 < length4) {
            View view2 = viewArr2[i15];
            int i33 = i29 + 1;
            if (i29 == i14) {
                bs1.c.U1(view2);
            } else {
                bs1.c.X0(view2);
            }
            i15++;
            i29 = i33;
        }
        return new PointF(f14, f13);
    }

    public final void g8(int i13, int i14) {
        CollageInteractiveFrameLayout collageInteractiveFrameLayout = this.f57765l0;
        if (collageInteractiveFrameLayout == null) {
            Intrinsics.r("contentContainer");
            throw null;
        }
        t0.a(collageInteractiveFrameLayout, new ChangeBounds());
        CollageInteractiveFrameLayout collageInteractiveFrameLayout2 = this.f57765l0;
        if (collageInteractiveFrameLayout2 == null) {
            Intrinsics.r("contentContainer");
            throw null;
        }
        View childAt = collageInteractiveFrameLayout2.getChildAt(i13);
        CollageInteractiveFrameLayout collageInteractiveFrameLayout3 = this.f57765l0;
        if (collageInteractiveFrameLayout3 == null) {
            Intrinsics.r("contentContainer");
            throw null;
        }
        collageInteractiveFrameLayout3.removeViewAt(i13);
        CollageInteractiveFrameLayout collageInteractiveFrameLayout4 = this.f57765l0;
        if (collageInteractiveFrameLayout4 == null) {
            Intrinsics.r("contentContainer");
            throw null;
        }
        collageInteractiveFrameLayout4.addView(childAt, i14);
        DotsIndicatorView dotsIndicatorView = this.f57768o0;
        if (dotsIndicatorView != null) {
            dotsIndicatorView.b(i14 - 1);
        } else {
            Intrinsics.r("dotsIndicatorView");
            throw null;
        }
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getB0() {
        return this.K0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = uc2.f.collage_canvas_fragment;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(uc2.d.rounded_corners_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f57764k0 = (RoundedCornersLayout) findViewById;
        View findViewById2 = v13.findViewById(uc2.d.content_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f57765l0 = (CollageInteractiveFrameLayout) findViewById2;
        View findViewById3 = v13.findViewById(uc2.d.interactive_image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f57766m0 = (CollageInteractiveImageView) findViewById3;
        View findViewById4 = v13.findViewById(uc2.d.delete_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f57769p0 = (ImageView) findViewById4;
        View findViewById5 = v13.findViewById(uc2.d.left_text_grid_line);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f57772s0 = findViewById5;
        View findViewById6 = v13.findViewById(uc2.d.top_text_grid_line);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f57773t0 = findViewById6;
        View findViewById7 = v13.findViewById(uc2.d.right_text_grid_line);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f57774u0 = findViewById7;
        View findViewById8 = v13.findViewById(uc2.d.bottom_text_grid_line);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f57775v0 = findViewById8;
        View findViewById9 = v13.findViewById(uc2.d.left_media_grid_line);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f57776w0 = findViewById9;
        View findViewById10 = v13.findViewById(uc2.d.top_media_grid_line);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f57777x0 = findViewById10;
        View findViewById11 = v13.findViewById(uc2.d.right_media_grid_line);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f57778y0 = findViewById11;
        View findViewById12 = v13.findViewById(uc2.d.bottom_media_grid_line);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f57779z0 = findViewById12;
        View findViewById13 = v13.findViewById(uc2.d.vertical_center_grid_line);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.A0 = findViewById13;
        View findViewById14 = v13.findViewById(uc2.d.horizontal_center_grid_line);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.B0 = findViewById14;
        View findViewById15 = v13.findViewById(uc2.d.dots_container);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        this.f57767n0 = (LinearLayoutCompat) findViewById15;
        View findViewById16 = v13.findViewById(uc2.d.dots_indicator_view);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        this.f57768o0 = (DotsIndicatorView) findViewById16;
        final int i13 = 0;
        ((GestaltButton) v13.findViewById(uc2.d.add_object_button)).d(c.f57760j).e(new gm1.a(this) { // from class: e81.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f57757b;

            {
                this.f57757b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                t71.e eVar;
                int i14 = i13;
                d this$0 = this.f57757b;
                switch (i14) {
                    case 0:
                        int i15 = d.O0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        t71.e eVar2 = this$0.G0;
                        break;
                    case 1:
                        int i16 = d.O0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        t71.e eVar3 = this$0.G0;
                        if (eVar3 != null) {
                            ((a81.g) eVar3).z3();
                            break;
                        }
                        break;
                    default:
                        int i17 = d.O0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (eVar = this$0.G0) != null) {
                            ((a81.g) eVar).w3();
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 1;
        this.f57770q0 = ((GestaltButton) v13.findViewById(uc2.d.save_canvas_button)).d(c.f57761k).e(new gm1.a(this) { // from class: e81.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f57757b;

            {
                this.f57757b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                t71.e eVar;
                int i142 = i14;
                d this$0 = this.f57757b;
                switch (i142) {
                    case 0:
                        int i15 = d.O0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        t71.e eVar2 = this$0.G0;
                        break;
                    case 1:
                        int i16 = d.O0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        t71.e eVar3 = this$0.G0;
                        if (eVar3 != null) {
                            ((a81.g) eVar3).z3();
                            break;
                        }
                        break;
                    default:
                        int i17 = d.O0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (eVar = this$0.G0) != null) {
                            ((a81.g) eVar).w3();
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById17 = v13.findViewById(uc2.d.navigation_button);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById17;
        this.f57771r0 = gestaltIconButton;
        if (gestaltIconButton == null) {
            Intrinsics.r("navigationButton");
            throw null;
        }
        final int i15 = 2;
        gestaltIconButton.u(new gm1.a(this) { // from class: e81.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f57757b;

            {
                this.f57757b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                t71.e eVar;
                int i142 = i15;
                d this$0 = this.f57757b;
                switch (i142) {
                    case 0:
                        int i152 = d.O0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        t71.e eVar2 = this$0.G0;
                        break;
                    case 1:
                        int i16 = d.O0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        t71.e eVar3 = this$0.G0;
                        if (eVar3 != null) {
                            ((a81.g) eVar3).z3();
                            break;
                        }
                        break;
                    default:
                        int i17 = d.O0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (eVar = this$0.G0) != null) {
                            ((a81.g) eVar).w3();
                            break;
                        }
                        break;
                }
            }
        });
        CollageInteractiveImageView collageInteractiveImageView = this.f57766m0;
        if (collageInteractiveImageView == null) {
            Intrinsics.r("interactiveImageView");
            throw null;
        }
        collageInteractiveImageView.A2(d8());
        collageInteractiveImageView.G2(this, this);
        int c13 = ml2.c.c(d8().left);
        int c14 = ml2.c.c(d8().top);
        RoundedCornersLayout roundedCornersLayout = this.f57764k0;
        if (roundedCornersLayout == null) {
            Intrinsics.r("roundedCornersLayout");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = roundedCornersLayout.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        com.bumptech.glide.c.a1(layoutParams2, c13, c14, c13, 0);
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = ml2.c.c(d8().height());
        View view = this.f57773t0;
        if (view == null) {
            Intrinsics.r("topTextGridLine");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams.topMargin = ml2.c.c(c8().top);
        view.setLayoutParams(marginLayoutParams);
        View view2 = this.f57775v0;
        if (view2 == null) {
            Intrinsics.r("bottomTextGridLine");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
        marginLayoutParams2.bottomMargin = ml2.c.c(d8().height() - c8().bottom);
        view2.setLayoutParams(marginLayoutParams2);
        View view3 = this.f57772s0;
        if (view3 == null) {
            Intrinsics.r("leftTextGridLine");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams3.leftMargin = ml2.c.c(c8().left);
        view3.setLayoutParams(marginLayoutParams3);
        View view4 = this.f57774u0;
        if (view4 == null) {
            Intrinsics.r("rightTextGridLine");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams6 = view4.getLayoutParams();
        if (layoutParams6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams6;
        marginLayoutParams4.rightMargin = ml2.c.c(d8().width() - c8().right);
        view4.setLayoutParams(marginLayoutParams4);
    }
}

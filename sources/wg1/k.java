package wg1;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.e4;
import lh0.g1;
import lh0.z3;
import m60.r0;
import so.jb;
import we1.n1;

/* loaded from: classes5.dex */
public class k extends a implements tg1.h, tg1.f {
    public final ViewGroup A;
    public final View B;
    public final View C;

    /* renamed from: o, reason: collision with root package name */
    public final ku1.l f129798o;

    /* renamed from: p, reason: collision with root package name */
    public final e4 f129799p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f129800q;

    /* renamed from: r, reason: collision with root package name */
    public final LinearLayout f129801r;

    /* renamed from: s, reason: collision with root package name */
    public final LinearLayout f129802s;

    /* renamed from: t, reason: collision with root package name */
    public final GestaltAvatarGroup f129803t;

    /* renamed from: u, reason: collision with root package name */
    public final GestaltText f129804u;

    /* renamed from: v, reason: collision with root package name */
    public final GestaltText f129805v;

    /* renamed from: w, reason: collision with root package name */
    public final float f129806w;

    /* renamed from: x, reason: collision with root package name */
    public final WebImageView f129807x;

    /* renamed from: y, reason: collision with root package name */
    public final WebImageView f129808y;

    /* renamed from: z, reason: collision with root package name */
    public final WebImageView f129809z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(Context context, com.google.android.gms.common.api.internal.q pillColorHelper) {
        super(context);
        int dimensionPixelSize;
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pillColorHelper, "pillColorHelper");
        if (!this.f129719n) {
            this.f129719n = true;
            jb jbVar = (jb) ((l) generatedComponent());
            this.f129798o = (ku1.l) jbVar.f113485c.f114476s.get();
            this.f129799p = jbVar.f113483a.D2();
        }
        this.f129806w = getResources().getDimensionPixelSize(eo1.c.space_300);
        View view = new View(context);
        this.B = view;
        e4 e4Var = this.f129799p;
        if (e4Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) e4Var.f83339a;
        boolean z13 = g1Var.o("android_search_slp_immersive_vr_design", "enabled", z3Var) || g1Var.l("android_search_slp_immersive_vr_design");
        this.f129800q = z13;
        float f13 = z13 ? 1.0f : 0.6f;
        WebImageView Y = Y(f13);
        this.f129807x = Y;
        WebImageView Y2 = Y(1.0f);
        Y2.g2(Y2.f2(), Y2.f2(), 0.0f, 0.0f);
        this.f129808y = Y2;
        this.f129809z = Y(f13);
        View inflate = View.inflate(context, i82.e.view_spotlight_header_scrim, null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.C = inflate;
        inflate.setId(View.generateViewId());
        setElevation(getResources().getDimension(eo1.c.space_100));
        t(getResources().getDimensionPixelSize(eo1.c.ignore));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (!z13) {
            setBackgroundColor(pillColorHelper.b());
        }
        this.f135012i.i(d.f129738m);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(d.f129739n);
        this.f129805v = gestaltText;
        GestaltAvatarGroup a13 = new GestaltAvatarGroup(6, context, (AttributeSet) null).a(d.f129740o);
        this.f129803t = a13;
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.i(d.f129741p);
        gestaltText2.setPaddingRelative(gestaltText2.getResources().getDimensionPixelSize(eo1.c.space_100), 0, 0, 0);
        this.f129804u = gestaltText2;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = linearLayout.getResources().getDimensionPixelSize(eo1.c.space_200);
        layoutParams.bottomMargin = linearLayout.getResources().getDimensionPixelSize(eo1.c.space_400);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(z13 ? 8388611 : 17);
        setVisibility(8);
        linearLayout.addView(a13);
        linearLayout.addView(gestaltText2);
        this.f129802s = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = linearLayout2.getResources().getDimensionPixelSize(r0.search_toolbar_height);
        if (z13) {
            layoutParams2.bottomMargin = linearLayout2.getResources().getDimensionPixelSize(eo1.c.space_400);
        }
        linearLayout2.setLayoutParams(layoutParams2);
        linearLayout2.setOrientation(1);
        if (z13) {
            linearLayout2.setGravity(8388691);
            dimensionPixelSize = linearLayout2.getResources().getDimensionPixelSize(eo1.c.space_200);
        } else {
            linearLayout2.setGravity(17);
            dimensionPixelSize = linearLayout2.getResources().getDimensionPixelSize(eo1.c.space_1200);
        }
        linearLayout2.setPaddingRelative(dimensionPixelSize, linearLayout2.getPaddingTop(), dimensionPixelSize, linearLayout2.getPaddingBottom());
        linearLayout2.addView(gestaltText);
        linearLayout2.addView(this.f135012i);
        linearLayout2.addView(linearLayout);
        this.f129801r = linearLayout2;
        if (z13) {
            ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
            constraintLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
            Y.setId(View.generateViewId());
            Y.setLayoutParams(new ConstraintLayout.LayoutParams(0, 0));
            constraintLayout2.addView(Y);
            pVar.j(constraintLayout2);
            pVar.l(Y.getId(), 6, 0, 6);
            pVar.l(Y.getId(), 7, 0, 7);
            pVar.l(Y.getId(), 3, 0, 3);
            pVar.l(Y.getId(), 4, 0, 4);
            pVar.b(constraintLayout2);
            constraintLayout = constraintLayout2;
        } else {
            LinearLayout linearLayout3 = new LinearLayout(context);
            linearLayout3.setOrientation(0);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams3.gravity = 81;
            linearLayout3.setLayoutParams(layoutParams3);
            getBackground().setColorFilter(new PorterDuffColorFilter(dl2.b.y0(this, eo1.a.color_background_dark_opacity_200), PorterDuff.Mode.SRC_ATOP));
            linearLayout3.addView(Y);
            constraintLayout = linearLayout3;
        }
        this.A = constraintLayout;
        view.setBackgroundColor(dl2.b.y0(view, eo1.a.color_background_dark_opacity_300));
        bs1.c.R1(view, pk.a0.q0(context));
    }

    public static ArrayList Z(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList l13 = f0.l(Integer.valueOf(eo1.b.base_color_blue_100), Integer.valueOf(eo1.b.base_color_purple_100), Integer.valueOf(eo1.b.base_color_green_100), Integer.valueOf(eo1.b.base_color_orange_100), Integer.valueOf(eo1.b.base_color_red_100));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(g0.q(l13, 10));
        Iterator it = l13.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Object obj = d5.a.f53679a;
            arrayList2.add(Integer.valueOf(context.getColor(intValue)));
        }
        ArrayList H0 = CollectionsKt.H0(arrayList2);
        while (arrayList.size() < 3) {
            int intValue2 = ((Number) CollectionsKt.o0(H0, ol2.f.f96454a)).intValue();
            arrayList.add(Integer.valueOf(intValue2));
            H0.remove(Integer.valueOf(intValue2));
        }
        return arrayList;
    }

    @Override // xi0.f
    public final ku1.l D() {
        ku1.l lVar = this.f129798o;
        if (lVar != null) {
            return lVar;
        }
        Intrinsics.r("uriNavigator");
        throw null;
    }

    @Override // xi0.f
    public final void L() {
        addView(this.B);
        addView(this.A);
        if (this.f129800q) {
            addView(this.C);
        }
        addView(this.f129801r);
    }

    @Override // tg1.h
    public final void O(String str) {
        boolean z13 = true ^ (str == null || kotlin.text.z.j(str));
        GestaltText gestaltText = this.f129804u;
        bs1.c.R1(gestaltText, z13);
        gestaltText.setText(str);
    }

    @Override // xi0.f, vi0.b
    public final void U2(String str) {
        setContentDescription(getResources().getString(i82.f.content_description_today_article_view, str));
    }

    public final View X(int i13) {
        float dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_300);
        float[] fArr = new float[8];
        for (int i14 = 0; i14 < 8; i14++) {
            fArr[i14] = dimensionPixelSize;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(i13);
        View view = new View(getContext());
        view.setBackground(shapeDrawable);
        view.setLayoutParams(new ConstraintLayout.LayoutParams(0, 0));
        view.setId(View.generateViewId());
        return view;
    }

    public final WebImageView Y(float f13) {
        WebImageView webImageView = new WebImageView(getContext());
        webImageView.setId(View.generateViewId());
        boolean z13 = this.f129800q;
        webImageView.setLayoutParams(z13 ? new ConstraintLayout.LayoutParams(0, 0) : new LinearLayout.LayoutParams(0, -1, f13));
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        webImageView.f52564p = new yv1.g(1);
        if (!z13) {
            webImageView.setColorFilter(dl2.b.y0(webImageView, eo1.a.color_background_dark_opacity_300));
        }
        return webImageView;
    }

    public void a0() {
        boolean z13 = this.f129800q;
        WebImageView webImageView = this.f129807x;
        if (!z13) {
            webImageView.setColorFilter(dl2.b.y0(this, eo1.a.color_background_dark_opacity_300));
        }
        ViewGroup.LayoutParams layoutParams = this.A.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.height = -1;
        layoutParams2.width = -1;
        webImageView.g2(0.0f, 0.0f, 0.0f, 0.0f);
        Intrinsics.g(webImageView, "null cannot be cast to non-null type android.view.View");
        ViewGroup.LayoutParams layoutParams3 = webImageView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.topMargin = getResources().getDimensionPixelSize(eo1.c.ignore);
    }

    @Override // vi0.b
    public final void c(String str) {
        this.f129805v.i(new qf1.z(str, 8));
    }

    public void d0() {
        if (this.f129800q) {
            r0();
            return;
        }
        this.f135012i.i(d.f129746u);
        d dVar = d.f129747v;
        GestaltText gestaltText = this.f129805v;
        gestaltText.i(dVar);
        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(eo1.c.space_100);
        }
        ViewGroup.LayoutParams layoutParams2 = this.f129801r.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 == null) {
            return;
        }
        marginLayoutParams2.bottomMargin = getResources().getDimensionPixelSize(eo1.c.space_600);
    }

    public final void g0(boolean z13) {
        boolean z14 = this.f129800q;
        WebImageView webImageView = this.f129809z;
        WebImageView webImageView2 = this.f129807x;
        if (z14) {
            float f13 = this.f129806w;
            if (!z13) {
                webImageView2.g2(0.0f, 0.0f, 0.0f, f13);
                webImageView.g2(f13, 0.0f, 0.0f, 0.0f);
                return;
            } else {
                webImageView2.g2(f13, f13, 0.0f, 0.0f);
                this.f129808y.g2(f13, f13, f13, f13);
                webImageView.g2(f13, 0.0f, f13, 0.0f);
                return;
            }
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (j1.Y0(context)) {
            webImageView2.g2(0.0f, getResources().getDimensionPixelSize(eo1.c.space_300), 0.0f, 0.0f);
            webImageView.g2(getResources().getDimensionPixelSize(eo1.c.space_300), 0.0f, 0.0f, 0.0f);
        } else {
            webImageView2.g2(getResources().getDimensionPixelSize(eo1.c.space_300), 0.0f, 0.0f, 0.0f);
            webImageView.g2(0.0f, getResources().getDimensionPixelSize(eo1.c.space_300), 0.0f, 0.0f);
        }
    }

    @Override // xi0.f, vi0.b
    public final void j1(vi0.c viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        pk.a0.p(this.f135012i, viewModel.f125870h);
        WebImageView webImageView = this.f129807x;
        List list = viewModel.f125871i;
        webImageView.loadUrl((String) CollectionsKt.firstOrNull(list));
        int size = list.size();
        WebImageView webImageView2 = this.f129809z;
        WebImageView webImageView3 = this.f129808y;
        if (size > 1) {
            if (this.f129800q) {
                Intrinsics.g(webImageView3, "null cannot be cast to non-null type android.view.View");
                webImageView3.setLayoutParams(new ConstraintLayout.LayoutParams(0, 0));
                Intrinsics.g(webImageView2, "null cannot be cast to non-null type android.view.View");
                webImageView2.setLayoutParams(new ConstraintLayout.LayoutParams(0, 0));
            }
            String str = (String) CollectionsKt.U(1, list);
            if (str != null) {
                webImageView3.loadUrl(str);
                this.A.addView(webImageView3);
            }
            String str2 = (String) CollectionsKt.U(2, list);
            if (str2 != null) {
                webImageView2.loadUrl(str2);
                this.A.addView(webImageView2);
            }
            k0();
            o0();
            LinearLayout linearLayout = this.f129802s;
            linearLayout.removeAllViews();
            linearLayout.setVisibility(8);
        } else {
            Intrinsics.g(webImageView3, "null cannot be cast to non-null type android.view.View");
            ViewGroup viewGroup = this.A;
            if (viewGroup.indexOfChild(webImageView3) != -1) {
                viewGroup.removeView(webImageView3);
            }
            Intrinsics.g(webImageView2, "null cannot be cast to non-null type android.view.View");
            ViewGroup viewGroup2 = this.A;
            if (viewGroup2.indexOfChild(webImageView2) != -1) {
                viewGroup2.removeView(webImageView2);
            }
            a0();
            d0();
        }
        T(viewModel.f125873k);
    }

    public void k0() {
        WebImageView webImageView = this.f129809z;
        WebImageView webImageView2 = this.f129807x;
        ViewGroup viewGroup = this.A;
        if (this.f129800q) {
            androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
            pVar.j(viewGroup instanceof ConstraintLayout ? (ConstraintLayout) viewGroup : null);
            Intrinsics.g(webImageView2, "null cannot be cast to non-null type android.view.View");
            pVar.g(webImageView2.getId());
            int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_100);
            Guideline guideline = new Guideline(getContext());
            guideline.setId(View.generateViewId());
            Guideline guideline2 = new Guideline(getContext());
            guideline2.setId(View.generateViewId());
            viewGroup.addView(guideline);
            viewGroup.addView(guideline2);
            pVar.s(guideline.getId(), 1);
            pVar.s(guideline2.getId(), 1);
            pVar.G(guideline.getId(), 0.29f);
            pVar.G(guideline2.getId(), 0.71f);
            Guideline guideline3 = new Guideline(getContext());
            guideline3.setId(View.generateViewId());
            Guideline guideline4 = new Guideline(getContext());
            guideline4.setId(View.generateViewId());
            Guideline guideline5 = new Guideline(getContext());
            guideline5.setId(View.generateViewId());
            viewGroup.addView(guideline3);
            viewGroup.addView(guideline4);
            viewGroup.addView(guideline5);
            pVar.s(guideline3.getId(), 0);
            pVar.s(guideline4.getId(), 0);
            pVar.s(guideline5.getId(), 0);
            pVar.G(guideline3.getId(), 0.54f);
            pVar.G(guideline4.getId(), 0.43f);
            pVar.G(guideline5.getId(), 0.62f);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ArrayList Z = Z(context);
            int intValue = ((Number) Z.get(0)).intValue();
            pVar.l(webImageView2.getId(), 6, 0, 6);
            int i13 = dimensionPixelSize * 2;
            pVar.m(webImageView2.getId(), 7, guideline.getId(), 6, i13);
            pVar.l(webImageView2.getId(), 3, 0, 3);
            pVar.m(webImageView2.getId(), 4, guideline3.getId(), 3, dimensionPixelSize);
            View X = X(intValue);
            viewGroup.addView(X);
            pVar.m(X.getId(), 3, guideline3.getId(), 4, dimensionPixelSize);
            int i14 = 3 * (-dimensionPixelSize);
            pVar.m(X.getId(), 4, 0, 4, i14);
            pVar.m(X.getId(), 6, 0, 6, i14);
            pVar.m(X.getId(), 7, guideline.getId(), 6, i13);
            int intValue2 = ((Number) Z.get(1)).intValue();
            WebImageView webImageView3 = this.f129808y;
            Intrinsics.g(webImageView3, "null cannot be cast to non-null type android.view.View");
            pVar.l(webImageView3.getId(), 6, guideline.getId(), 6);
            pVar.l(webImageView3.getId(), 7, guideline2.getId(), 6);
            pVar.m(webImageView3.getId(), 3, guideline4.getId(), 4, dimensionPixelSize);
            pVar.l(webImageView3.getId(), 4, 0, 4);
            View X2 = X(intValue2);
            viewGroup.addView(X2);
            pVar.l(X2.getId(), 6, guideline.getId(), 7);
            pVar.l(X2.getId(), 7, guideline2.getId(), 6);
            pVar.m(X2.getId(), 3, 0, 3, i14);
            pVar.m(X2.getId(), 4, guideline4.getId(), 3, dimensionPixelSize);
            int intValue3 = ((Number) Z.get(2)).intValue();
            Intrinsics.g(webImageView, "null cannot be cast to non-null type android.view.View");
            pVar.m(webImageView.getId(), 6, guideline2.getId(), 7, i13);
            pVar.l(webImageView.getId(), 7, 0, 7);
            pVar.m(webImageView.getId(), 3, guideline5.getId(), 4, dimensionPixelSize);
            pVar.l(webImageView.getId(), 4, 0, 4);
            View X3 = X(intValue3);
            viewGroup.addView(X3);
            pVar.m(X3.getId(), 6, guideline2.getId(), 7, i13);
            pVar.m(X3.getId(), 7, 0, 7, i14);
            pVar.m(X3.getId(), 4, guideline5.getId(), 3, dimensionPixelSize);
            pVar.m(X3.getId(), 3, 0, 3, i14);
            pVar.b(viewGroup instanceof ConstraintLayout ? (ConstraintLayout) viewGroup : null);
        } else {
            webImageView2.setColorFilter(dl2.b.y0(this, eo1.a.color_background_dark_opacity_300));
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = getResources().getDimensionPixelSize(i82.b.article_immersive_header_three_pins_image_container_height);
            layoutParams2.width = getResources().getDimensionPixelSize(i82.b.article_immersive_header_three_pins_image_container_width);
            ViewGroup.LayoutParams layoutParams3 = webImageView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = getResources().getDimensionPixelSize(eo1.c.space_600);
            }
            Intrinsics.g(webImageView, "null cannot be cast to non-null type android.view.View");
            ViewGroup.LayoutParams layoutParams4 = webImageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = getResources().getDimensionPixelSize(eo1.c.space_600);
            }
            getBackground().setColorFilter(new PorterDuffColorFilter(dl2.b.y0(this, eo1.a.color_background_dark_opacity_200), PorterDuff.Mode.SRC_ATOP));
        }
        g0(false);
    }

    public void o0() {
        if (this.f129800q) {
            r0();
            return;
        }
        this.f135012i.i(d.f129748w);
        this.f129805v.i(d.f129749x);
        ViewGroup.LayoutParams layoutParams = this.f129801r.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(i82.b.article_immersive_header_three_pins_image_container_height);
    }

    public final void r0() {
        n1 n1Var = new n1(this, 12);
        GestaltText gestaltText = this.f135012i;
        gestaltText.i(n1Var);
        d dVar = d.f129750y;
        GestaltText gestaltText2 = this.f129805v;
        gestaltText2.i(dVar);
        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(eo1.c.space_100);
        }
        ViewGroup.LayoutParams layoutParams2 = gestaltText2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.bottomMargin = getResources().getDimensionPixelSize(eo1.c.space_100);
        }
        ViewGroup.LayoutParams layoutParams3 = gestaltText2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.leftMargin = getResources().getDimensionPixelSize(eo1.c.space_200);
        }
        LinearLayout linearLayout = this.f129802s;
        ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        if (marginLayoutParams4 != null) {
            marginLayoutParams4.bottomMargin = getResources().getDimensionPixelSize(eo1.c.space_100);
        }
        ViewGroup.LayoutParams layoutParams5 = linearLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
        if (marginLayoutParams5 == null) {
            return;
        }
        marginLayoutParams5.leftMargin = getResources().getDimensionPixelSize(eo1.c.space_200);
    }

    @Override // tg1.h
    public final void v(List avatarList) {
        Intrinsics.checkNotNullParameter(avatarList, "avatarList");
        this.f129803t.a(new w1.g(avatarList, 21));
        bs1.c.R1(this.f129802s, !avatarList.isEmpty());
    }

    @Override // xi0.f
    public final WebImageView x() {
        return this.f129807x;
    }
}

package s80;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.shuffles.composer.ui.ComposerView;
import com.pinterest.shuffles.composer.ui.widget.ActionMenu;
import com.pinterest.shuffles.composer.ui.widget.SceneViewContainer;
import com.pinterest.shuffles.composer.ui.widget.ZOrderIndicator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i3 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n72.b f111578i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n72.m f111579j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f111580k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t62.b f111581l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f111582m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f111583n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f111584o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f111585p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Function1 f111586q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(n72.b bVar, n72.m mVar, ao2.j0 j0Var, t62.b bVar2, float f13, long j13, Function1 function1, i2.q1 q1Var, Function1 function12) {
        super(1);
        this.f111578i = bVar;
        this.f111579j = mVar;
        this.f111580k = j0Var;
        this.f111581l = bVar2;
        this.f111582m = f13;
        this.f111583n = j13;
        this.f111584o = function1;
        this.f111585p = q1Var;
        this.f111586q = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        ComposerView composerView = new ComposerView(context, null);
        composerView.t(this.f111582m);
        composerView.setElevation(0.0f);
        int u13 = androidx.compose.ui.graphics.a.u(this.f111583n);
        int i13 = qa0.c.collages_grid_background_pattern_always_light;
        SceneViewContainer sceneViewContainer = composerView.f51861s;
        if (sceneViewContainer == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        sceneViewContainer.setBackgroundColor(u13);
        SceneViewContainer sceneViewContainer2 = composerView.f51861s;
        if (sceneViewContainer2 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        View view = sceneViewContainer2.f51902i;
        if (view == null) {
            Intrinsics.r("backgroundView");
            throw null;
        }
        view.setBackgroundResource(i13);
        bk.o shapeAppearanceModel = bk.o.c(composerView.getContext(), fj.l.ShapeAppearance_Material3_Corner_Medium, fj.l.ShapeAppearance_Material3_Corner_Full).a();
        Intrinsics.checkNotNullExpressionValue(shapeAppearanceModel, "build(...)");
        Intrinsics.checkNotNullParameter(shapeAppearanceModel, "shapeAppearanceModel");
        SceneViewContainer sceneViewContainer3 = composerView.f51861s;
        if (sceneViewContainer3 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        ZOrderIndicator g13 = sceneViewContainer3.g();
        Intrinsics.checkNotNullParameter(shapeAppearanceModel, "shapeAppearanceModel");
        g13.f51920l = shapeAppearanceModel;
        g13.f51921m.Y0(shapeAppearanceModel);
        int W = bs1.c.W(composerView, eo1.c.space_200);
        int paddingTop = composerView.getPaddingTop();
        int paddingRight = composerView.getPaddingRight();
        int paddingBottom = composerView.getPaddingBottom();
        SceneViewContainer sceneViewContainer4 = composerView.f51861s;
        if (sceneViewContainer4 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        ZOrderIndicator g14 = sceneViewContainer4.g();
        ViewGroup.LayoutParams layoutParams = g14.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(W, paddingTop, paddingRight, paddingBottom);
        g14.setLayoutParams(marginLayoutParams);
        int W2 = bs1.c.W(composerView, eo1.c.space_600);
        int W3 = bs1.c.W(composerView, eo1.c.space_400);
        SceneViewContainer sceneViewContainer5 = composerView.f51861s;
        if (sceneViewContainer5 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        sceneViewContainer5.g().setPadding(W3, W2, W3, W2);
        int B = bs1.c.B(composerView, eo1.b.color_background_light);
        SceneViewContainer sceneViewContainer6 = composerView.f51861s;
        if (sceneViewContainer6 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        sceneViewContainer6.g().f51921m.t(ColorStateList.valueOf(B));
        ColorStateList color = new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{bs1.c.B(composerView, eo1.b.color_icon_dark), bs1.c.B(composerView, eo1.b.color_icon_disabled)});
        Intrinsics.checkNotNullParameter(color, "color");
        SceneViewContainer sceneViewContainer7 = composerView.f51861s;
        if (sceneViewContainer7 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        ZOrderIndicator g15 = sceneViewContainer7.g();
        Intrinsics.checkNotNullParameter(color, "color");
        g15.f51917i = color;
        g15.invalidate();
        Context context2 = composerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int g03 = kg.a.g0(32, context2);
        Context context3 = composerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int g04 = kg.a.g0(16, context3);
        SceneViewContainer sceneViewContainer8 = composerView.f51861s;
        if (sceneViewContainer8 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        ZOrderIndicator g16 = sceneViewContainer8.g();
        g16.f51911c = g03;
        g16.f51912d = g04;
        g16.invalidate();
        Context context4 = composerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int g05 = kg.a.g0(6, context4);
        Context context5 = composerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        int g06 = kg.a.g0(4, context5);
        SceneViewContainer sceneViewContainer9 = composerView.f51861s;
        if (sceneViewContainer9 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        ZOrderIndicator g17 = sceneViewContainer9.g();
        g17.f51913e = g05;
        g17.f51914f = g06;
        g17.invalidate();
        SceneViewContainer sceneViewContainer10 = composerView.f51861s;
        if (sceneViewContainer10 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        ZOrderIndicator g18 = sceneViewContainer10.g();
        g18.f51918j = 17;
        g18.invalidate();
        int color2 = composerView.getContext().getColor(eo1.b.base_color_grayscale_150);
        View view2 = composerView.f51863u;
        if (view2 == null) {
            Intrinsics.r("verticalGuideline");
            throw null;
        }
        view2.setBackgroundColor(color2);
        View view3 = composerView.f51862t;
        if (view3 == null) {
            Intrinsics.r("horizontalGuideline");
            throw null;
        }
        view3.setBackgroundColor(color2);
        bk.o shapeAppearanceModel2 = bk.o.c(composerView.getContext(), fj.l.ShapeAppearance_Material3_Corner_Medium, fj.l.ShapeAppearance_Material3_Corner_Full).a();
        Intrinsics.checkNotNullExpressionValue(shapeAppearanceModel2, "build(...)");
        Intrinsics.checkNotNullParameter(shapeAppearanceModel2, "shapeAppearanceModel");
        SceneViewContainer sceneViewContainer11 = composerView.f51861s;
        if (sceneViewContainer11 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        ActionMenu c13 = sceneViewContainer11.c();
        Intrinsics.checkNotNullParameter(shapeAppearanceModel2, "shapeAppearanceModel");
        c13.f51890i = shapeAppearanceModel2;
        c13.f51891j.Y0(shapeAppearanceModel2);
        int B2 = bs1.c.B(composerView, eo1.b.color_background_light);
        SceneViewContainer sceneViewContainer12 = composerView.f51861s;
        if (sceneViewContainer12 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        sceneViewContainer12.c().f51891j.t(ColorStateList.valueOf(B2));
        int W4 = bs1.c.W(composerView, eo1.c.space_200);
        int paddingLeft = composerView.getPaddingLeft();
        int paddingTop2 = composerView.getPaddingTop();
        int paddingBottom2 = composerView.getPaddingBottom();
        SceneViewContainer sceneViewContainer13 = composerView.f51861s;
        if (sceneViewContainer13 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        ActionMenu c14 = sceneViewContainer13.c();
        ViewGroup.LayoutParams layoutParams2 = c14.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(paddingLeft, paddingTop2, W4, paddingBottom2);
        c14.setLayoutParams(marginLayoutParams2);
        int W5 = bs1.c.W(composerView, eo1.c.space_500);
        int W6 = bs1.c.W(composerView, eo1.c.space_200);
        SceneViewContainer sceneViewContainer14 = composerView.f51861s;
        if (sceneViewContainer14 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        sceneViewContainer14.c().setPadding(W6, W5, W6, W5);
        int W7 = bs1.c.W(composerView, eo1.c.space_600);
        SceneViewContainer sceneViewContainer15 = composerView.f51861s;
        if (sceneViewContainer15 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        ActionMenu c15 = sceneViewContainer15.c();
        c15.f51884c = W7;
        c15.a(W7);
        int W8 = bs1.c.W(composerView, eo1.c.space_400);
        SceneViewContainer sceneViewContainer16 = composerView.f51861s;
        if (sceneViewContainer16 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        ActionMenu c16 = sceneViewContainer16.c();
        c16.f51885d = W8;
        c16.c(W8);
        int B3 = bs1.c.B(composerView, eo1.b.color_icon_dark);
        SceneViewContainer sceneViewContainer17 = composerView.f51861s;
        if (sceneViewContainer17 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        ActionMenu c17 = sceneViewContainer17.c();
        c17.f51886e = B3;
        c17.b(B3);
        SceneViewContainer sceneViewContainer18 = composerView.f51861s;
        if (sceneViewContainer18 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        sceneViewContainer18.c().f51883b = false;
        List<p62.a> actions = CollectionsKt.F0(g2.f111554l.values());
        Intrinsics.checkNotNullParameter(actions, "actions");
        SceneViewContainer sceneViewContainer19 = composerView.f51861s;
        if (sceneViewContainer19 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        ActionMenu c18 = sceneViewContainer19.c();
        Intrinsics.checkNotNullParameter(actions, "actions");
        c18.f51892k = actions;
        c18.removeAllViews();
        LayoutInflater from = LayoutInflater.from(c18.getContext());
        for (p62.a aVar : actions) {
            View inflate = from.inflate(h62.o.composer_view_action_menu_action, (ViewGroup) c18, false);
            inflate.setId(aVar.f98924a);
            inflate.setOnClickListener(new fd1.e(23, c18, aVar));
            c18.addView(inflate);
            c18.e(aVar.f98924a, false);
        }
        c18.a(c18.f51884c);
        c18.c(c18.f51885d);
        c18.b(c18.f51886e);
        com.pinterest.shuffles.scene.composer.a1 a1Var = new com.pinterest.shuffles.scene.composer.a1(true, true, false, false);
        n72.b bVar = this.f111578i;
        n72.m mVar = this.f111579j;
        com.pinterest.shuffles.scene.composer.q qVar = new com.pinterest.shuffles.scene.composer.q(context, a1Var, bVar, mVar);
        com.pinterest.shuffles.scene.composer.y yVar = new com.pinterest.shuffles.scene.composer.y(composerView.a0(), this.f111580k, mVar);
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        yVar.f52036a = qVar;
        Unit unit = Unit.f80348a;
        this.f111585p.setValue(new l62.a0(this.f111580k, composerView, yVar, new i1.f1(17, this.f111584o), this.f111581l));
        h3 h3Var = new h3(context, this.f111586q);
        h3Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        h3Var.addView(composerView);
        return h3Var;
    }
}

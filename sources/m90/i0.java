package m90;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.pinterest.collage.cutoutpicker.screens.CollageCutoutPickerLocation;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.d4;
import i2.f2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm90/i0;", "Lmm1/l;", "<init>", "()V", "cutoutPicker_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i0 extends m1 {

    /* renamed from: j0, reason: collision with root package name */
    public static final List f86662j0 = kotlin.collections.f0.j(CollageCutoutPickerLocation.COLLAGE_CUTOUT_PICKER, com.pinterest.screens.l0.b(), com.pinterest.screens.l0.c());

    /* renamed from: g0, reason: collision with root package name */
    public x92.b f86663g0;

    /* renamed from: h0, reason: collision with root package name */
    public lh0.f0 f86664h0;

    /* renamed from: i0, reason: collision with root package name */
    public com.pinterest.framework.screens.s f86665i0;

    public static final void d8(i0 i0Var, i2.o oVar, int i13) {
        i0Var.getClass();
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1954079832);
        fc0.n.a(false, null, false, false, q2.i.c(923328136, new h0(i0Var, 0), sVar), sVar, 24576, 15);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new j1.t0(i0Var, i13, 11);
        }
    }

    @Override // nl1.d, ku1.k
    public final void D5() {
        com.pinterest.framework.screens.s sVar = this.f86665i0;
        if (sVar == null) {
            Intrinsics.r("childScreenManager");
            throw null;
        }
        if (sVar.G() <= 1) {
            mm1.k kVar = this.f87627c0;
            if (kVar != null) {
                kVar.j(jn1.c.CLOSE_BUTTON_TAPPED);
                return;
            } else {
                Intrinsics.r("delegate");
                throw null;
            }
        }
        com.pinterest.framework.screens.s sVar2 = this.f86665i0;
        if (sVar2 == null) {
            Intrinsics.r("childScreenManager");
            throw null;
        }
        ScreenDescription k13 = sVar2.k();
        com.pinterest.framework.screens.s sVar3 = this.f86665i0;
        if (sVar3 != null) {
            sVar3.z(k13);
        } else {
            Intrinsics.r("childScreenManager");
            throw null;
        }
    }

    @Override // nl1.d, ku1.k
    public final void F6(Navigation navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        if (!f86662j0.contains(navigation.getF49939a())) {
            super.F6(navigation);
            return;
        }
        com.pinterest.framework.screens.s sVar = this.f86665i0;
        if (sVar == null) {
            Intrinsics.r("childScreenManager");
            throw null;
        }
        ScreenDescription k13 = sVar.k();
        f8(navigation);
        com.pinterest.framework.screens.s sVar2 = this.f86665i0;
        if (sVar2 != null) {
            sVar2.z(k13);
        } else {
            Intrinsics.r("childScreenManager");
            throw null;
        }
    }

    @Override // nl1.d, ku1.k
    public final void M1(Navigation navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        if (f86662j0.contains(navigation.getF49939a())) {
            f8(navigation);
        } else {
            super.M1(navigation);
        }
    }

    @Override // mm1.l
    public final mm1.d b8() {
        return new mm1.d(l90.b.fragment_collage_content_bottom_sheet, true, com.bumptech.glide.d.G(this, "CutoutPickerExtras.CUTOUT_PICKER_IS_ONBOARDING", false) ? 70 : 0, 98, true, com.bumptech.glide.d.G(this, "CutoutPickerExtras.CUTOUT_PICKER_IS_ONBOARDING", false), new g0(this, 1), 704);
    }

    public final void f8(Navigation navigation) {
        com.pinterest.framework.screens.s sVar = this.f86665i0;
        if (sVar == null) {
            Intrinsics.r("childScreenManager");
            throw null;
        }
        ScreenModel screenDescription = navigation.b1();
        Intrinsics.checkNotNullExpressionValue(screenDescription, "toScreenDescription(...)");
        boolean r13 = navigation.r1();
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        sVar.c(screenDescription, true, false, true, r13);
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        D5();
        return true;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getR0() {
        return d4.COLLAGE_COMPOSER_ITEM_PICKER;
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.pinterest.framework.screens.s sVar = this.f86665i0;
        if (sVar != null) {
            if (sVar == null) {
                Intrinsics.r("childScreenManager");
                throw null;
            }
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            sVar.h(requireContext, false);
        }
        super.onDestroyView();
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Bundle bundle2;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        x92.b bVar = this.f86663g0;
        if (bVar == null) {
            Intrinsics.r("screenManagerFactory");
            throw null;
        }
        View findViewById = v13.findViewById(l90.a.sheet_fragment_container_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f86665i0 = x92.b.r(bVar, (ViewGroup) findViewById, new g6.f(), 2, false, 20);
        bs1.c.X0(v13.findViewById(tk1.a.gestalt_sheet_header));
        ComposeView composeView = (ComposeView) v13.findViewById(l90.a.sheet_close_button);
        lh0.f0 f0Var = this.f86664h0;
        if (f0Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        if (f0Var.a()) {
            bs1.c.X0(composeView);
        } else {
            if (Build.VERSION.SDK_INT >= 35) {
                Intrinsics.f(composeView);
                Resources resources = composeView.getContext().getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                composeView.setPaddingRelative(composeView.getPaddingStart(), composeView.getPaddingTop(), composeView.getPaddingEnd(), identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0);
            }
            h0 h0Var = new h0(this, 1);
            Object obj = q2.i.f102113a;
            composeView.o(new q2.h(h0Var, true, -240822789));
        }
        Z7(t.f86700m);
        CollageCutoutPickerLocation collageCutoutPickerLocation = CollageCutoutPickerLocation.COLLAGE_CUTOUT_PICKER;
        Navigation navigation = this.I;
        if (navigation == null || (bundle2 = navigation.getF49942d()) == null) {
            bundle2 = Bundle.EMPTY;
        }
        NavigationImpl v14 = Navigation.v1(collageCutoutPickerLocation, bundle2);
        Intrinsics.checkNotNullExpressionValue(v14, "create(...)");
        f8(v14);
        if (com.bumptech.glide.d.G(this, "CutoutPickerExtras.CUTOUT_PICKER_IS_ONBOARDING", false)) {
            P6("CutoutPickerExtras.CUTOUT_PICKER_ONBOARDING_COMPLETE", e0.t.i());
        }
    }

    @Override // nl1.d, ku1.k
    public final void y1(Function1 shouldStopDismissingAt, String bundleId, Bundle bundle) {
        Intrinsics.checkNotNullParameter(shouldStopDismissingAt, "shouldStopDismissingAt");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.l0.a());
        Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
        if (!((Boolean) shouldStopDismissingAt.invoke(w13)).booleanValue()) {
            super.y1(shouldStopDismissingAt, bundleId, bundle);
            return;
        }
        P6(bundleId, bundle);
        mm1.k kVar = this.f87627c0;
        if (kVar != null) {
            kVar.j(jn1.c.CLOSE_BUTTON_TAPPED);
        } else {
            Intrinsics.r("delegate");
            throw null;
        }
    }
}

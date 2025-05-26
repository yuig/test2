package ns;

import android.view.View;
import com.pinterest.collage.cutoutpicker.browse.components.CutoutPickerCarouselView;
import com.pinterest.collage.cutoutpicker.closeup.components.CloseupMetadataSectionView;
import com.pinterest.feature.board.redesign.common.SavedContentPreviewModuleView;
import com.pinterest.feature.board.redesign.landing.components.BoardLandingHeaderView;
import com.pinterest.feature.board.redesign.landing.components.SectionHeaderView;
import com.pinterest.feature.settings.shared.view.SettingsTextItemView;
import com.pinterest.feature.settings.shared.view.SettingsToggleItemView;
import com.pinterest.feature.unauth.sba.TitleHeader;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import la0.q1;
import la0.x1;
import om0.e1;
import va1.m1;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements o82.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91919a;

    public /* synthetic */ i(int i13) {
        this.f91919a = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o82.c
    public final void e(View view, u50.o oVar) {
        switch (this.f91919a) {
            case 0:
                int i13 = r.f91954c1;
                Intrinsics.checkNotNullParameter((b) view, "view");
                Intrinsics.checkNotNullParameter((p) oVar, "displayState");
                break;
            case 1:
                CutoutPickerCarouselView view2 = (CutoutPickerCarouselView) view;
                n90.c state = (n90.c) oVar;
                int i14 = m90.w.X0;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(state, "state");
                view2.o(state);
                break;
            case 2:
                CloseupMetadataSectionView view3 = (CloseupMetadataSectionView) view;
                q90.b state2 = (q90.b) oVar;
                int i15 = p90.w.Y0;
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(state2, "state");
                view3.o(state2);
                break;
            case 3:
                ia0.m state3 = (ia0.m) oVar;
                int i16 = ea0.t.W0;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(state3, "state");
                ((ia0.n) view).a1(state3);
                break;
            case 4:
                ga0.i state4 = (ga0.i) oVar;
                int i17 = fa0.t.V0;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(state4, "state");
                ((ga0.h) view).C2(state4);
                break;
            case 5:
                xa0.a state5 = (xa0.a) oVar;
                int i18 = la0.f0.V0;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(state5, "state");
                q1 q1Var = view instanceof q1 ? (q1) view : null;
                if (q1Var != null) {
                    ((x1) q1Var).a(state5);
                    break;
                }
                break;
            case 6:
                BoardLandingHeaderView view4 = (BoardLandingHeaderView) view;
                rm0.a state6 = (rm0.a) oVar;
                int i19 = qm0.p0.f104322d1;
                Intrinsics.checkNotNullParameter(view4, "view");
                Intrinsics.checkNotNullParameter(state6, "state");
                view4.o(state6);
                break;
            case 7:
                SavedContentPreviewModuleView view5 = (SavedContentPreviewModuleView) view;
                e1 state7 = (e1) oVar;
                int i23 = qm0.p0.f104322d1;
                Intrinsics.checkNotNullParameter(view5, "view");
                Intrinsics.checkNotNullParameter(state7, "state");
                view5.o(state7);
                break;
            case 8:
                SectionHeaderView view6 = (SectionHeaderView) view;
                rm0.d state8 = (rm0.d) oVar;
                int i24 = qm0.p0.f104322d1;
                Intrinsics.checkNotNullParameter(view6, "view");
                Intrinsics.checkNotNullParameter(state8, "state");
                view6.o(state8);
                break;
            case 9:
                GestaltText view7 = (GestaltText) view;
                ny0.b0 displayState = (ny0.b0) oVar;
                int i25 = ny0.v.T0;
                Intrinsics.checkNotNullParameter(view7, "view");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                pk.a0.q(view7, displayState.f92554a);
                break;
            case 10:
                GestaltText view8 = (GestaltText) view;
                ny0.e1 displayState2 = (ny0.e1) oVar;
                int i26 = ny0.v.T0;
                Intrinsics.checkNotNullParameter(view8, "view");
                Intrinsics.checkNotNullParameter(displayState2, "displayState");
                pk.a0.q(view8, displayState2.f92580a);
                break;
            case 11:
                SettingsTextItemView view9 = (SettingsTextItemView) view;
                int i27 = ma1.n.K0;
                Intrinsics.checkNotNullParameter(view9, "view");
                Intrinsics.checkNotNullParameter((ma1.d) oVar, "<anonymous parameter 1>");
                view9.a(new uc1.f(l52.c.settings_security_connected_devices_description_text));
                break;
            case 12:
                GestaltText view10 = (GestaltText) view;
                com.pinterest.feature.settings.notifications.p0 displayState3 = (com.pinterest.feature.settings.notifications.p0) oVar;
                int i28 = com.pinterest.feature.settings.notifications.v.J0;
                Intrinsics.checkNotNullParameter(view10, "view");
                Intrinsics.checkNotNullParameter(displayState3, "displayState");
                pk.a0.p(view10, displayState3.f48250a);
                break;
            case 13:
                SettingsToggleItemView view11 = (SettingsToggleItemView) view;
                rb1.u displayState4 = (rb1.u) oVar;
                int i29 = rb1.k.K0;
                Intrinsics.checkNotNullParameter(view11, "view");
                Intrinsics.checkNotNullParameter(displayState4, "displayState");
                m1 m1Var = displayState4.f107095a;
                if (m1Var != null) {
                    view11.a(m1Var);
                    break;
                }
                break;
            case 14:
                TitleHeader view12 = (TitleHeader) view;
                com.pinterest.feature.unauth.sba.c0 displayState5 = (com.pinterest.feature.unauth.sba.c0) oVar;
                int i33 = com.pinterest.feature.unauth.sba.w.I0;
                Intrinsics.checkNotNullParameter(view12, "view");
                Intrinsics.checkNotNullParameter(displayState5, "displayState");
                view12.L(displayState5.f48784f);
                break;
            default:
                com.pinterest.feature.unauth.sba.a view13 = (com.pinterest.feature.unauth.sba.a) view;
                int i34 = com.pinterest.feature.unauth.sba.w.I0;
                Intrinsics.checkNotNullParameter(view13, "view");
                Intrinsics.checkNotNullParameter((com.pinterest.feature.unauth.sba.c0) oVar, "displayState");
                view13.getClass();
                break;
        }
    }
}

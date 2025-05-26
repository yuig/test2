package p90;

import android.view.View;
import com.pinterest.collage.cutoutpicker.closeup.components.CutoutEditorView;
import com.pinterest.feature.home.tuner.sba.SbaHfBoardToggleSettingCellView;
import com.pinterest.feature.home.tuner.sba.SbaHfTunerActivityPinCellView;
import com.pinterest.feature.settings.notifications.expandablesection.ExpandableSectionView;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;

/* loaded from: classes5.dex */
public final /* synthetic */ class m implements o82.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99197a;

    public /* synthetic */ m(int i13) {
        this.f99197a = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o82.b
    public final void d(View view, u50.o oVar, u50.r eventIntake) {
        switch (this.f99197a) {
            case 0:
                CutoutEditorView view2 = (CutoutEditorView) view;
                sa0.a state = (sa0.a) oVar;
                int i13 = w.Y0;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                view2.L(state);
                view2.T(new p70.a(eventIntake, 3));
                break;
            case 1:
                ni1.u0 displayState = (ni1.u0) oVar;
                int i14 = cj0.p.X0;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                ti1.f fVar = (ti1.f) view;
                fVar.setEventIntake(eventIntake);
                fVar.bindDisplayState(displayState);
                break;
            case 2:
                ni1.u0 displayState2 = (ni1.u0) oVar;
                int i15 = jm0.j.f76978k1;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(displayState2, "displayState");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                ti1.f fVar2 = (ti1.f) view;
                fVar2.setEventIntake(eventIntake);
                fVar2.bindDisplayState(displayState2);
                break;
            case 3:
                ni1.u0 displayState3 = (ni1.u0) oVar;
                int i16 = qm0.p0.f104322d1;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(displayState3, "displayState");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                ti1.f fVar3 = (ti1.f) view;
                fVar3.setEventIntake(eventIntake);
                fVar3.bindDisplayState(displayState3);
                break;
            case 4:
                SbaHfBoardToggleSettingCellView view3 = (SbaHfBoardToggleSettingCellView) view;
                xs0.a displayState4 = (xs0.a) oVar;
                int i17 = ys0.h.L0;
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(displayState4, "displayState");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                view3.getClass();
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                view3.f45817d = eventIntake;
                view3.a(displayState4);
                break;
            case 5:
                SbaHfTunerActivityPinCellView view4 = (SbaHfTunerActivityPinCellView) view;
                xs0.q displayState5 = (xs0.q) oVar;
                int i18 = dt0.n.S0;
                Intrinsics.checkNotNullParameter(view4, "view");
                Intrinsics.checkNotNullParameter(displayState5, "displayState");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                view4.getClass();
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                SbaPinRep sbaPinRep = view4.f45829f;
                Intrinsics.g(sbaPinRep, "null cannot be cast to non-null type com.pinterest.featurelibrary.pingridcell.sba.view.PinRep");
                sbaPinRep.setEventIntake(new ca0.y(eventIntake, 25));
                view4.f45830g = eventIntake;
                view4.b(displayState5);
                break;
            case 6:
                ni1.u0 displayState6 = (ni1.u0) oVar;
                int i19 = iz0.n.Y0;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(displayState6, "displayState");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                ti1.f fVar4 = (ti1.f) view;
                fVar4.setEventIntake(eventIntake);
                fVar4.bindDisplayState(displayState6);
                break;
            case 7:
                ExpandableSectionView view5 = (ExpandableSectionView) view;
                com.pinterest.feature.settings.notifications.b displayState7 = (com.pinterest.feature.settings.notifications.b) oVar;
                int i23 = com.pinterest.feature.settings.notifications.v.J0;
                Intrinsics.checkNotNullParameter(view5, "view");
                Intrinsics.checkNotNullParameter(displayState7, "displayState");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                view5.b(displayState7);
                view5.c(eventIntake);
                view5.a(new p91.v(8, eventIntake, displayState7));
                break;
            case 8:
                ni1.u0 displayState8 = (ni1.u0) oVar;
                int i24 = kd1.k.X0;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(displayState8, "displayState");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                ti1.f fVar5 = (ti1.f) view;
                fVar5.setEventIntake(eventIntake);
                fVar5.bindDisplayState(displayState8);
                break;
            case 9:
                com.pinterest.feature.unauth.sba.d view6 = (com.pinterest.feature.unauth.sba.d) view;
                com.pinterest.feature.unauth.sba.c0 displayState9 = (com.pinterest.feature.unauth.sba.c0) oVar;
                int i25 = com.pinterest.feature.unauth.sba.w.I0;
                Intrinsics.checkNotNullParameter(view6, "view");
                Intrinsics.checkNotNullParameter(displayState9, "displayState");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                view6.T(eventIntake);
                view6.L(displayState9.f48781c, displayState9.f48782d, displayState9.f48784f, displayState9.f48785g);
                break;
            case 10:
                com.pinterest.feature.unauth.sba.g view7 = (com.pinterest.feature.unauth.sba.g) view;
                com.pinterest.feature.unauth.sba.c0 displayState10 = (com.pinterest.feature.unauth.sba.c0) oVar;
                int i26 = com.pinterest.feature.unauth.sba.w.I0;
                Intrinsics.checkNotNullParameter(view7, "view");
                Intrinsics.checkNotNullParameter(displayState10, "displayState");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                view7.T(eventIntake);
                view7.L(displayState10.f48779a, displayState10.f48780b, displayState10.f48783e, displayState10.f48786h);
                break;
            case 11:
                com.pinterest.feature.unauth.sba.h view8 = (com.pinterest.feature.unauth.sba.h) view;
                int i27 = com.pinterest.feature.unauth.sba.w.I0;
                Intrinsics.checkNotNullParameter(view8, "view");
                Intrinsics.checkNotNullParameter((com.pinterest.feature.unauth.sba.c0) oVar, "displayState");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                view8.b(eventIntake);
                view8.a();
                break;
            default:
                int i28 = b3.f93539l;
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(oVar, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(eventIntake, "<anonymous parameter 2>");
                break;
        }
    }
}

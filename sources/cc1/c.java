package cc1;

import android.animation.AnimatorSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o2;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.settings.SettingsRoundHeaderView;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import com.pinterest.ui.recyclerview.FastScrollerView;
import df.j1;
import kh2.c3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ua2.s;
import ua2.t0;
import va2.j;
import zt1.g;

/* loaded from: classes5.dex */
public final class c extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27450b;

    public c(Object obj, int i13) {
        this.f27449a = i13;
        this.f27450b = obj;
    }

    @Override // androidx.recyclerview.widget.o2
    public final void g(RecyclerView recyclerView, int i13) {
        int i14 = this.f27449a;
        Object obj = this.f27450b;
        switch (i14) {
            case 5:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (i13 == 0) {
                    ((SbaPinRep) obj).setupOverlayAnimationAndStart();
                    break;
                } else if (i13 == 1) {
                    ((SbaPinRep) obj).cancelOverlayAnimation();
                    break;
                }
                break;
            case 8:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (i13 == 0) {
                    LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) obj;
                    int i15 = LegoPinGridCellImpl.Z2;
                    legoPinGridCellImpl.k0().getClass();
                    ((s) legoPinGridCellImpl.Q2.getValue()).n();
                    ((t0) legoPinGridCellImpl.R2.getValue()).n();
                    break;
                } else if (i13 == 1) {
                    LegoPinGridCellImpl legoPinGridCellImpl2 = (LegoPinGridCellImpl) obj;
                    int i16 = LegoPinGridCellImpl.Z2;
                    legoPinGridCellImpl2.k0().getClass();
                    s sVar = (s) legoPinGridCellImpl2.Q2.getValue();
                    if (sVar.f121601z) {
                        AnimatorSet animatorSet = sVar.B;
                        if (!animatorSet.isRunning() && !sVar.A) {
                            c3.m0(animatorSet);
                            sVar.f121601z = false;
                            sVar.A = false;
                        }
                    }
                    t0 t0Var = (t0) legoPinGridCellImpl2.R2.getValue();
                    if (t0Var.A) {
                        AnimatorSet animatorSet2 = t0Var.D;
                        if (!animatorSet2.isRunning() && !t0Var.B) {
                            c3.m0(animatorSet2);
                            t0Var.E().f125388s.setAlpha(255);
                            j E = t0Var.E();
                            int i17 = t0Var.C;
                            E.f125389t.setAlpha(i17);
                            E.H = Integer.valueOf(i17);
                            t0Var.E().S = false;
                            t0Var.E().U = false;
                            t0Var.A = false;
                            t0Var.B = false;
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.o2
    public final void j(RecyclerView recyclerView, int i13, int i14) {
        boolean isPinMediaHalfVisible;
        RecyclerView recyclerView2;
        int i15 = this.f27449a;
        Object obj = this.f27450b;
        switch (i15) {
            case 0:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (!recyclerView.canScrollVertically(-1)) {
                    SettingsRoundHeaderView settingsRoundHeaderView = ((d) obj).C0;
                    if (settingsRoundHeaderView != null) {
                        settingsRoundHeaderView.setElevation(0.0f);
                        break;
                    }
                } else {
                    d dVar = (d) obj;
                    SettingsRoundHeaderView settingsRoundHeaderView2 = dVar.C0;
                    if (settingsRoundHeaderView2 != null) {
                        settingsRoundHeaderView2.setElevation(((Number) dVar.G0.getValue()).floatValue());
                        break;
                    }
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (!recyclerView.canScrollVertically(-1)) {
                    SettingsRoundHeaderView settingsRoundHeaderView3 = ((fc1.e) obj).I0;
                    if (settingsRoundHeaderView3 != null) {
                        settingsRoundHeaderView3.setElevation(0.0f);
                        break;
                    }
                } else {
                    fc1.e eVar = (fc1.e) obj;
                    SettingsRoundHeaderView settingsRoundHeaderView4 = eVar.I0;
                    if (settingsRoundHeaderView4 != null) {
                        settingsRoundHeaderView4.setElevation(((Number) eVar.M0.getValue()).floatValue());
                        break;
                    }
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (!recyclerView.canScrollVertically(-1)) {
                    SettingsRoundHeaderView settingsRoundHeaderView5 = ((pc1.d) obj).D0;
                    if (settingsRoundHeaderView5 != null) {
                        settingsRoundHeaderView5.setElevation(0.0f);
                        break;
                    }
                } else {
                    pc1.d dVar2 = (pc1.d) obj;
                    SettingsRoundHeaderView settingsRoundHeaderView6 = dVar2.D0;
                    if (settingsRoundHeaderView6 != null) {
                        settingsRoundHeaderView6.setElevation(((Number) dVar2.F0.getValue()).floatValue());
                        break;
                    }
                }
                break;
            case 3:
            case 7:
            default:
                FastScrollerView fastScrollerView = (FastScrollerView) obj;
                if (!fastScrollerView.f52633a.isSelected() && (recyclerView2 = fastScrollerView.f52637e) != null) {
                    int computeVerticalScrollOffset = recyclerView2.computeVerticalScrollOffset();
                    float computeVerticalScrollRange = fastScrollerView.f52637e.computeVerticalScrollRange();
                    float f13 = fastScrollerView.f52636d;
                    fastScrollerView.b((computeVerticalScrollOffset / (computeVerticalScrollRange - f13)) * f13);
                    break;
                }
                break;
            case 4:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (!recyclerView.canScrollVertically(-1)) {
                    SettingsRoundHeaderView settingsRoundHeaderView7 = ((wc1.e) obj).E0;
                    if (settingsRoundHeaderView7 != null) {
                        settingsRoundHeaderView7.setElevation(0.0f);
                        break;
                    }
                } else {
                    wc1.e eVar2 = (wc1.e) obj;
                    SettingsRoundHeaderView settingsRoundHeaderView8 = eVar2.E0;
                    if (settingsRoundHeaderView8 != null) {
                        settingsRoundHeaderView8.setElevation(((Number) eVar2.F0.getValue()).floatValue());
                        break;
                    }
                }
                break;
            case 5:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                SbaPinRep sbaPinRep = (SbaPinRep) obj;
                isPinMediaHalfVisible = sbaPinRep.isPinMediaHalfVisible();
                sbaPinRep.sendMediaVisibilityEventIfNecessary(isPinMediaHalfVisible);
                sbaPinRep.resetOverlayIfNecessary();
                break;
            case 6:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                int computeVerticalScrollOffset2 = recyclerView.computeVerticalScrollOffset();
                Function1 function1 = ((g) obj).f142781c;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(computeVerticalScrollOffset2));
                    break;
                }
                break;
            case 8:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) obj;
                int i16 = LegoPinGridCellImpl.Z2;
                if (legoPinGridCellImpl.r1() || j1.G1(legoPinGridCellImpl.C0, legoPinGridCellImpl.C(), legoPinGridCellImpl.getAdFormats())) {
                    if (legoPinGridCellImpl.isPinMediaHalfVisible()) {
                        f30 f30Var = legoPinGridCellImpl.C0;
                        if (f30Var != null) {
                            legoPinGridCellImpl.b3(f30Var);
                        }
                        legoPinGridCellImpl.d3(true);
                    } else {
                        legoPinGridCellImpl.K0().e();
                        legoPinGridCellImpl.d3(false);
                    }
                }
                legoPinGridCellImpl.k0().getClass();
                ((s) legoPinGridCellImpl.Q2.getValue()).l();
                ((t0) legoPinGridCellImpl.R2.getValue()).l();
                break;
        }
    }
}

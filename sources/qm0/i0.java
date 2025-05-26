package qm0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.f30;
import com.pinterest.feature.board.redesign.common.SavedContentPreviewModuleView;
import com.pinterest.feature.board.redesign.landing.components.BoardLandingHeaderView;
import com.pinterest.feature.board.redesign.landing.components.SectionHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ni1.t2;
import so.ba;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104281i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0 f104282j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(p0 p0Var, int i13) {
        super(0);
        this.f104281i = i13;
        this.f104282j = p0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = 6;
        int i14 = this.f104281i;
        AttributeSet attributeSet = null;
        int i15 = 2;
        int i16 = 1;
        p0 p0Var = this.f104282j;
        switch (i14) {
            case 0:
                m242invoke();
                return Unit.f80348a;
            case 1:
                m242invoke();
                return Unit.f80348a;
            case 2:
                m242invoke();
                return Unit.f80348a;
            case 3:
                m242invoke();
                return Unit.f80348a;
            case 4:
                m242invoke();
                return Unit.f80348a;
            case 5:
                return com.bumptech.glide.d.i0(null, p0Var.f104325c1, p0Var.f104324b1, p0Var.l9());
            case 6:
                qb0.f fVar = p0Var.P0;
                if (fVar != null) {
                    return new om0.p(fVar);
                }
                Intrinsics.r("numberFormatter");
                throw null;
            case 7:
                return new androidx.recyclerview.widget.c0(p0Var, 10);
            case 8:
                qa2.j0 j0Var = p0Var.L0;
                if (j0Var == null) {
                    Intrinsics.r("pinGridCellFactory");
                    throw null;
                }
                Context requireContext = p0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return (View) ((qa2.d) j0Var).a(requireContext, true);
            case 9:
                Context requireContext2 = p0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                BoardLandingHeaderView boardLandingHeaderView = new BoardLandingHeaderView(i13, requireContext2, attributeSet);
                int Z = bs1.c.Z(boardLandingHeaderView, eo1.c.space_400);
                boardLandingHeaderView.setPaddingRelative(Z, boardLandingHeaderView.getPaddingTop(), Z, bs1.c.Z(boardLandingHeaderView, eo1.c.space_300));
                om0.k events = new om0.k(new n0(p0Var, 0), new n0(p0Var, 1), new n0(p0Var, 2));
                Intrinsics.checkNotNullParameter(events, "events");
                boardLandingHeaderView.f45314i.setValue(events);
                RecyclerView g83 = p0Var.g8();
                if (g83 != null) {
                    kh2.j1.i1(g83, boardLandingHeaderView);
                }
                return boardLandingHeaderView;
            case 10:
                Context requireContext3 = p0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                SavedContentPreviewModuleView savedContentPreviewModuleView = new SavedContentPreviewModuleView(i13, requireContext3, attributeSet);
                int Z2 = bs1.c.Z(savedContentPreviewModuleView, eo1.c.space_300);
                savedContentPreviewModuleView.setPaddingRelative(savedContentPreviewModuleView.getPaddingStart(), Z2, savedContentPreviewModuleView.getPaddingEnd(), Z2);
                om0.f0 pinRepSetup = (om0.f0) p0Var.W0.getValue();
                Intrinsics.checkNotNullParameter(pinRepSetup, "pinRepSetup");
                savedContentPreviewModuleView.f45310h.setValue(pinRepSetup);
                om0.w0 events2 = new om0.w0(new om0.u0(new i0(p0Var, 12), new n0(p0Var, 4)), new om0.s0(new om0.a1(new i0(p0Var, 13), new n0(p0Var, 5), new i0(p0Var, 14), new n0(p0Var, 6), 16), new i0(p0Var, 15)));
                Intrinsics.checkNotNullParameter(events2, "events");
                savedContentPreviewModuleView.f45312j.setValue(events2);
                RecyclerView g84 = p0Var.g8();
                if (g84 != null) {
                    kh2.j1.i1(g84, savedContentPreviewModuleView);
                }
                return savedContentPreviewModuleView;
            case 11:
                int i17 = p0.f104322d1;
                p0Var.getClass();
                Context requireContext4 = p0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                SectionHeaderView sectionHeaderView = new SectionHeaderView(i13, requireContext4, attributeSet);
                int Z3 = bs1.c.Z(sectionHeaderView, eo1.c.space_500);
                int Z4 = bs1.c.Z(sectionHeaderView, eo1.c.space_200);
                int Z5 = bs1.c.Z(sectionHeaderView, eo1.c.space_400);
                sectionHeaderView.setPaddingRelative(Z5, Z3, Z5, Z4);
                RecyclerView g85 = p0Var.g8();
                if (g85 != null) {
                    kh2.j1.i1(g85, sectionHeaderView);
                }
                return sectionHeaderView;
            case 12:
                m242invoke();
                return Unit.f80348a;
            case 13:
                m242invoke();
                return Unit.f80348a;
            case 14:
                m242invoke();
                return Unit.f80348a;
            case 15:
                m242invoke();
                return Unit.f80348a;
            default:
                f30 f30Var = ni1.a2.f90595a;
                wa2.m a13 = wa2.m.a(m60.f0.i0(bs1.c.q(true)), false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, true, false, null, false, false, null, new bb2.e(1.5f, (bb2.f) null, 6), null, false, y32.f.BOARD, "board", false, false, null, null, false, 2068839930, 2143287294, 1020);
                androidx.lifecycle.z viewLifecycleOwner = p0Var.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner);
                qa2.j0 j0Var2 = p0Var.L0;
                if (j0Var2 == null) {
                    Intrinsics.r("pinGridCellFactory");
                    throw null;
                }
                t2 t2Var = p0Var.M0;
                if (t2Var == null) {
                    Intrinsics.r("pinRepViewModelFactory");
                    throw null;
                }
                om0.e0 e0Var = new om0.e0(S, j0Var2, t2Var, a13, p0Var.s7());
                ni1.d0 d0Var = p0Var.N0;
                if (d0Var != null) {
                    return new om0.f0(e0Var, new om0.d0(((ba) d0Var).a(a13, new o0(p0Var, i16), new h0(p0Var, i15))));
                }
                Intrinsics.r("pinToVMStateConverterFactory");
                throw null;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m242invoke() {
        b0 b0Var = b0.f104246a;
        int i13 = this.f104281i;
        p0 p0Var = this.f104282j;
        switch (i13) {
            case 0:
                r rVar = r.f104332a;
                int i14 = p0.f104322d1;
                p0Var.n9(rVar);
                break;
            case 1:
                q qVar = q.f104327a;
                int i15 = p0.f104322d1;
                p0Var.n9(qVar);
                break;
            case 2:
                s sVar = s.f104340a;
                int i16 = p0.f104322d1;
                p0Var.n9(sVar);
                break;
            case 3:
                u uVar = u.f104345a;
                int i17 = p0.f104322d1;
                p0Var.n9(uVar);
                break;
            case 4:
                t tVar = t.f104342a;
                int i18 = p0.f104322d1;
                p0Var.n9(tVar);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                int i19 = p0.f104322d1;
                p0Var.n9(b0Var);
                break;
            case 12:
                int i23 = p0.f104322d1;
                p0Var.n9(b0Var);
                break;
            case 13:
                c0 c0Var = c0.f104251a;
                int i24 = p0.f104322d1;
                p0Var.n9(c0Var);
                break;
            case 14:
                int i25 = p0.f104322d1;
                p0Var.n9(b0Var);
                break;
        }
    }
}

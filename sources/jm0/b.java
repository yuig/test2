package jm0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.core.view.EmptyView;
import com.pinterest.feature.profile.emptystate.EmptyStateBannerView;
import com.pinterest.ui.components.sections.LegoSectionRep;
import java.lang.ref.WeakReference;
import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import qa2.j0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f76955i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f76956j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(j jVar, int i13) {
        super(0);
        this.f76955i = i13;
        this.f76956j = jVar;
    }

    public final EmptyStateBannerView b() {
        int i13 = this.f76955i;
        j jVar = this.f76956j;
        switch (i13) {
            case 0:
                Context requireContext = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return j.k9(jVar, requireContext);
            default:
                Context requireContext2 = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                EmptyStateBannerView k93 = j.k9(jVar, requireContext2);
                k93.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                lm0.b bVar = lm0.e.f83859b;
                Context requireContext3 = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                k93.o(g3.x2(bVar, requireContext3));
                return k93;
        }
    }

    public final View e() {
        int i13 = this.f76955i;
        j jVar = this.f76956j;
        switch (i13) {
            case 5:
                Context requireContext = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new LegoSectionRep(requireContext);
            case 6:
                Context requireContext2 = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new LegoSectionRep(requireContext2);
            case 7:
                Context requireContext3 = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new LegoSectionRep(requireContext3);
            default:
                j0 j0Var = jVar.M0;
                if (j0Var == null) {
                    Intrinsics.r("pinGridCellFactory");
                    throw null;
                }
                Context requireContext4 = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                return (View) ((qa2.d) j0Var).a(requireContext4, true);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        tk0.h hVar = tk0.h.f117967a;
        tk0.m mVar = tk0.m.f117984a;
        int i13 = this.f76955i;
        int i14 = 1;
        j jVar = this.f76956j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                return Float.valueOf(bs1.c.X(jVar, y60.a.board_tool_bar_elevation));
            case 2:
                return new cj0.e(jVar, i14);
            case 3:
                return com.bumptech.glide.d.i0(null, jVar.f76988j1, jVar.f76987i1, jVar.l9());
            case 4:
                if (jVar.Q0 != null) {
                    return lm0.a0.a(zf0.f.h(), true);
                }
                Intrinsics.r("educationHelper");
                throw null;
            case 5:
                return e();
            case 6:
                return e();
            case 7:
                return e();
            case 8:
                Context requireContext = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new com.pinterest.feature.board.organize.l(requireContext, null);
            case 9:
                return b();
            case 10:
                EmptyView emptyView = new EmptyView(jVar.requireContext());
                emptyView.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
                emptyView.setMinimumHeight(1);
                return emptyView;
            case 11:
                return e();
            case 12:
                Context requireContext2 = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                d0 s73 = jVar.s7();
                androidx.lifecycle.z viewLifecycleOwner = jVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner);
                wa2.m mVar2 = (wa2.m) jVar.f76983e1.getValue();
                um0.a aVar = jVar.Z0;
                return new v42.k(requireContext2, s73, S, mVar2, aVar != null ? new WeakReference(aVar) : null, true, true, true, false, false, null, 3584);
            case 13:
                switch (i13) {
                    case 13:
                        lm0.i a13 = lm0.d0.a(hVar);
                        int i15 = j.f76978k1;
                        jVar.n9(a13);
                        break;
                    default:
                        lm0.i a14 = lm0.d0.a(mVar);
                        int i16 = j.f76978k1;
                        jVar.n9(a14);
                        break;
                }
                return Unit.f80348a;
            default:
                switch (i13) {
                    case 13:
                        lm0.i a15 = lm0.d0.a(hVar);
                        int i17 = j.f76978k1;
                        jVar.n9(a15);
                        break;
                    default:
                        lm0.i a16 = lm0.d0.a(mVar);
                        int i18 = j.f76978k1;
                        jVar.n9(a16);
                        break;
                }
                return Unit.f80348a;
        }
    }
}

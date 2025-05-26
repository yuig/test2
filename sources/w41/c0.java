package w41;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.profile.emptystate.EmptyStateBannerView;
import h32.a4;
import h32.d4;
import h32.x3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.n5;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127989i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n0 f127990j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(n0 n0Var, int i13) {
        super(0);
        this.f127989i = i13;
        this.f127990j = n0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f127989i;
        n0 n0Var = this.f127990j;
        switch (i13) {
            case 2:
                return Boolean.valueOf(n0Var.getActiveUserManager().b(n0Var.k9()));
            default:
                if (n0Var.L0 != null) {
                    return Boolean.valueOf(zf0.f.h());
                }
                Intrinsics.r("educationHelper");
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f127989i;
        n0 n0Var = this.f127990j;
        switch (i13) {
            case 0:
                Context requireContext = n0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                EmptyStateBannerView emptyStateBannerView = new EmptyStateBannerView(6, requireContext, (AttributeSet) null);
                int W = bs1.c.W(emptyStateBannerView, eo1.c.space_600);
                emptyStateBannerView.setPaddingRelative(W, bs1.c.W(emptyStateBannerView, nz1.a.profile_tab_empty_state_top_spacing), W, emptyStateBannerView.getPaddingBottom());
                return emptyStateBannerView;
            case 1:
                y32.f fVar = n0Var.f128046b1;
                xk2.v vVar = n0Var.U0;
                qa2.e v13 = kh2.r.v1(q0.d(fVar, ((Boolean) vVar.getValue()).booleanValue(), true), new a.z0(n0Var, 8));
                n5 n5Var = n0Var.M0;
                if (n5Var != null) {
                    FragmentActivity requireActivity = n0Var.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    qa2.n a13 = v13.a();
                    kh2.b0.a2(a13, k51.b.f78314a, ((Boolean) vVar.getValue()).booleanValue());
                    Unit unit = Unit.f80348a;
                    String id3 = n0Var.k9();
                    a4 viewParameter = n0Var.getF86878d0();
                    Intrinsics.checkNotNullParameter(id3, "id");
                    d4 view = n0Var.f128047c1;
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(viewParameter, "viewParameter");
                    h32.g0 component = n0Var.f128048d1;
                    Intrinsics.checkNotNullParameter(component, "component");
                    return n5Var.a(requireActivity, n0Var, a13, new h32.i0(view, viewParameter, new x3(null, null, null, null, null, id3, null, null, null, null, null, null, null, null, null, null, null), component, null, null));
                }
                Intrinsics.r("gridViewsHelperFactory");
                throw null;
            case 2:
                return invoke();
            case 3:
                Context requireContext2 = n0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                w0 w0Var = new w0(requireContext2);
                int W2 = bs1.c.W(w0Var, eo1.c.space_400);
                int W3 = bs1.c.W(w0Var, eo1.c.space_600);
                w0Var.setPaddingRelative(W2, W3, W2, W3);
                return w0Var;
            case 4:
                return invoke();
            default:
                return com.bumptech.glide.d.Z(n0Var, "com.pinterest.EXTRA_USER_ID", "");
        }
    }
}

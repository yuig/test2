package hc1;

import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import p91.v;
import rm1.q;
import so.q3;
import sq0.c0;
import yq0.z;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lhc1/e;", "Lyq0/b0;", "", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends a<Object> implements c0 {
    public static final /* synthetic */ int C0 = 0;
    public q3 A0;
    public final d4 B0 = d4.PHONE_COUNTRY;

    /* renamed from: z0, reason: collision with root package name */
    public f0 f68713z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE, new v(10, this, requireContext));
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        q qVar = q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        GestaltToolbarImpl toolbar2 = (GestaltToolbarImpl) toolbar;
        toolbar2.P(qVar.drawableRes(requireContext, dl2.b.f1(requireContext2)), eo1.b.color_themed_text_default);
        toolbar2.Y(j52.c.country_code);
        toolbar2.a0(getString(j52.c.country_code));
        toolbar2.m();
        Intrinsics.checkNotNullParameter(toolbar2, "toolbar");
    }

    @Override // yk1.k
    public final yk1.m V7() {
        q3 q3Var = this.A0;
        if (q3Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        f0 f0Var = this.f68713z0;
        if (f0Var != null) {
            return q3Var.a(new uk1.d(f0Var));
        }
        Intrinsics.r("pinalyticsFactory");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF78828p0() {
        return this.B0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(j52.b.fragment_phone_country, j52.a.p_recycler_view);
    }
}

package c31;

import a.z0;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ey.c3;
import h32.a4;
import h32.d4;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.n5;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25586i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f25587j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(r rVar, int i13) {
        super(0);
        this.f25586i = i13;
        this.f25587j = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f25586i;
        r rVar = this.f25587j;
        switch (i13) {
            case 0:
                ky.d dVar = new ky.d(rVar.f7());
                s92.i iVar = s92.i.ALL_PINS;
                c3 c3Var = rVar.N0;
                if (c3Var != null) {
                    return new pr0.g(null, dVar, null, null, null, null, null, iVar, c3Var, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
                }
                Intrinsics.r("perfEventsRouter");
                throw null;
            case 1:
                if (rVar.L0 != null) {
                    return Boolean.valueOf(zf0.f.h());
                }
                Intrinsics.r("educationHelper");
                throw null;
            case 2:
                boolean b13 = rVar.getActiveUserManager().b((String) rVar.S0.getValue());
                Set set = h31.g.f66813a;
                qa2.e v13 = kh2.r.v1(bp1.h.e(y32.f.PROFILE, ((Boolean) rVar.R0.getValue()).booleanValue()), new z0(rVar, 7));
                n5 n5Var = rVar.M0;
                if (n5Var == null) {
                    Intrinsics.r("mvpGridViewsHelperFactory");
                    throw null;
                }
                FragmentActivity requireActivity = rVar.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                return n5Var.a(requireActivity, rVar, v13.a(), new h32.i0(d4.USER, b13 ? a4.USER_SELF : a4.USER_OTHERS, null, h32.g0.USER_PINS, null, null));
            case 3:
                Context requireContext = rVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new ho0.f(requireContext, (Integer) null);
            default:
                return com.bumptech.glide.d.Z(rVar, "com.pinterest.EXTRA_USER_ID", "");
        }
    }
}

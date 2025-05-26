package mv0;

import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88393i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f88394j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i13) {
        super(0);
        this.f88393i = i13;
        this.f88394j = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f88393i;
        r rVar = this.f88394j;
        switch (i13) {
            case 0:
                Context requireContext = rVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new q21.d(requireContext, rVar.s7(), rVar.p7(), null, 0, null, rVar.f88401m1, null, RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_REP);
            default:
                Context requireContext2 = rVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                b0 b0Var = new b0(requireContext2);
                String newTitle = b0Var.getResources().getString(x0.recently_saved);
                Intrinsics.checkNotNullExpressionValue(newTitle, "getString(...)");
                Intrinsics.checkNotNullParameter(newTitle, "newTitle");
                pk.a0.p(b0Var.f88326a, newTitle);
                return b0Var;
        }
    }
}

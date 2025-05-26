package pc1;

import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.z3;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99619i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f99620j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(0);
        this.f99619i = i13;
        this.f99620j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f99619i;
        d dVar = this.f99620j;
        switch (i13) {
            case 0:
                break;
            case 1:
                Context requireContext = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                break;
            case 2:
                Context requireContext2 = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                break;
            case 3:
                m232invoke();
                break;
            case 4:
                m232invoke();
                break;
            default:
                m232invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m232invoke() {
        int i13 = this.f99619i;
        d dVar = this.f99620j;
        switch (i13) {
            case 3:
                dVar.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.GET_STARTED_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                dVar.f7().d(Navigation.w1(z3.c()));
                break;
            case 4:
                d0.B(dVar.s7(), f1.DISMISS, null, null, null, 30);
                break;
            default:
                d0.B(dVar.s7(), f1.VIEW, g0.BUSINESS_PRIVATE_PROFILE_MODAL, null, null, 28);
                break;
        }
    }
}

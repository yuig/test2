package mu;

import android.content.Context;
import com.pinterest.navigation.Navigation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88213i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0 f88214j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(p0 p0Var, int i13) {
        super(0);
        this.f88213i = i13;
        this.f88214j = p0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f88213i;
        p0 p0Var = this.f88214j;
        switch (i13) {
            case 0:
                return new k0(p0Var);
            case 1:
                return new cu.k(p0Var, 1);
            default:
                Navigation navigation = p0Var.I;
                if (navigation == null || !navigation.S("com.pinterest.EXCLUDE_AD", false)) {
                    Context requireContext = p0Var.requireContext();
                    Intrinsics.f(requireContext);
                    return requireContext;
                }
                Context requireContext2 = p0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return kh2.s0.c1(requireContext2);
        }
    }
}

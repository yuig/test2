package lq0;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84409i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r1 f84410j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(r1 r1Var, int i13) {
        super(0);
        this.f84409i = i13;
        this.f84410j = r1Var;
    }

    public final mp.s b() {
        int i13 = this.f84409i;
        r1 r1Var = this.f84410j;
        switch (i13) {
            case 1:
                Context requireContext = r1Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new mp.s(requireContext, 1);
            default:
                Context requireContext2 = r1Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new mp.s(requireContext2, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f84409i;
        r1 r1Var = this.f84410j;
        switch (i13) {
            case 0:
                Context requireContext = r1Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new rb2.t(requireContext, new cp.s(r1Var, 1), false);
            case 1:
                return b();
            case 2:
                Context requireContext2 = r1Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new mp.f(requireContext2);
            case 3:
                return b();
            default:
                Context requireContext3 = r1Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new rb2.n(requireContext3, false);
        }
    }
}

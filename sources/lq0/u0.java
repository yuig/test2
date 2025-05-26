package lq0;

import android.content.Context;
import com.pinterest.ui.components.users.LegoUserRep;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84443i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v0 f84444j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(v0 v0Var, int i13) {
        super(0);
        this.f84443i = i13;
        this.f84444j = v0Var;
    }

    public final mp.n b() {
        int i13 = this.f84443i;
        v0 v0Var = this.f84444j;
        switch (i13) {
            case 1:
                Context requireContext = v0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new mp.n(requireContext, Integer.valueOf(xc0.i.members_header), 28);
            default:
                Context requireContext2 = v0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new mp.n(requireContext2, null, 30);
        }
    }

    public final mp.r e() {
        int i13 = this.f84443i;
        v0 v0Var = this.f84444j;
        switch (i13) {
            case 2:
                Context requireContext = v0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new mp.r(requireContext, false);
            default:
                Context requireContext2 = v0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new mp.r(requireContext2, true);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f84443i) {
            case 0:
                Context requireContext = this.f84444j.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                LegoUserRep legoUserRep = new LegoUserRep(requireContext);
                legoUserRep.y1(ze0.a.List);
                return legoUserRep;
            case 1:
                return b();
            case 2:
                return e();
            case 3:
                return e();
            default:
                return b();
        }
    }
}

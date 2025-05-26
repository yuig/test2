package rl0;

import android.content.Context;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.components.users.LegoUserRep;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.f0;
import rl1.n;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108516i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f108517j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i13) {
        super(0);
        this.f108516i = i13;
        this.f108517j = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f108516i;
        c cVar = this.f108517j;
        switch (i13) {
            case 0:
                f0 f0Var = cVar.f108518z0;
                if (f0Var == null) {
                    Intrinsics.r("devUtils");
                    throw null;
                }
                Navigation navigation = cVar.I;
                f0Var.N(navigation != null ? navigation.getF49940b() : null, "pin id not set as navigation id for pin favorite user list fragment", new Object[0]);
                Navigation navigation2 = cVar.I;
                String f49940b = navigation2 != null ? navigation2.getF49940b() : null;
                return f49940b == null ? "" : f49940b;
            default:
                Context requireContext = cVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                LegoUserRep legoUserRep = new LegoUserRep(requireContext);
                legoUserRep.y1(ze0.a.List);
                Context requireContext2 = cVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                legoUserRep.H0(n.f(requireContext2));
                legoUserRep.r0(false);
                legoUserRep.t0(false);
                return legoUserRep;
        }
    }
}

package n70;

import android.content.Context;
import com.pinterest.feature.board.common.newideas.view.OneTapSavePinGridFlipContainer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89686i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f89687j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ wa2.i f89688k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ xk2.k f89689l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(w wVar, wa2.i iVar, xk2.v vVar, int i13) {
        super(0);
        this.f89686i = i13;
        this.f89687j = wVar;
        this.f89688k = iVar;
        this.f89689l = vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f89686i;
        wa2.i iVar = this.f89688k;
        xk2.k kVar = this.f89689l;
        w wVar = this.f89687j;
        switch (i13) {
            case 0:
                Context requireContext = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner = wVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner);
                nx.d0 d0Var = ((uk1.d) kVar.getValue()).f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                return new tj0.z(requireContext, d0Var, m60.f0.i0(iVar), S);
            default:
                Context requireContext2 = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner2 = wVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                androidx.lifecycle.u S2 = bf.b.S(viewLifecycleOwner2);
                nx.d0 d0Var2 = ((uk1.d) kVar.getValue()).f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
                return new OneTapSavePinGridFlipContainer(requireContext2, true, S2, d0Var2, m60.f0.i0(iVar));
        }
    }
}

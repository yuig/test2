package lu;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84904i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f84905j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, int i13) {
        super(0);
        this.f84904i = i13;
        this.f84905j = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f84904i;
        k kVar = this.f84905j;
        switch (i13) {
            case 0:
                nx.d0 n83 = kVar.n8();
                lh0.g gVar = kVar.f62952z0;
                if (gVar == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                es.a aVar = kVar.S0;
                if (aVar != null) {
                    return new vt.e(n83, gVar, aVar);
                }
                Intrinsics.r("adFormats");
                throw null;
            case 1:
                Context context = kVar.getLayoutInflater().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                f fVar = new f(context, kVar.v8(), kVar.f53234n0);
                fVar.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
                return fVar;
            default:
                Context requireContext = kVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new y(requireContext, kVar.v8());
        }
    }
}

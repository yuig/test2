package wu;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;

/* loaded from: classes3.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131131i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f131132j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i13) {
        super(0);
        this.f131131i = i13;
        this.f131132j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f131131i;
        d dVar = this.f131132j;
        switch (i13) {
            case 0:
                Context context = dVar.getLayoutInflater().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                xu.a aVar = new xu.a(context, dVar.v8(), dVar.f53234n0);
                aVar.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
                return aVar;
            case 1:
                Context requireContext = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                xt.f v83 = dVar.v8();
                es.a aVar2 = dVar.T0;
                if (aVar2 != null) {
                    return new i(requireContext, v83, aVar2);
                }
                Intrinsics.r("adFormats");
                throw null;
            default:
                d0 n83 = dVar.n8();
                es.h hVar = dVar.S0;
                if (hVar != null) {
                    return new xt.f(n83, hVar);
                }
                Intrinsics.r("adsCommonDisplay");
                throw null;
        }
    }
}

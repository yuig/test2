package vu;

import android.content.Context;
import com.pinterest.api.model.b40;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126648i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f126649j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, int i13) {
        super(0);
        this.f126648i = i13;
        this.f126649j = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f126648i;
        i iVar = this.f126649j;
        switch (i13) {
            case 0:
                Context context = iVar.getLayoutInflater().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                e eVar = new e(context, iVar.f53234n0, b40.U0(iVar.getPin()), iVar.getPin().G3());
                eVar.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
                return eVar;
            default:
                Context requireContext = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                b60.b activeUserManager = iVar.getActiveUserManager();
                es.h hVar = iVar.T0;
                if (hVar == null) {
                    Intrinsics.r("adsCommonDisplay");
                    throw null;
                }
                k kVar = new k(requireContext, activeUserManager, hVar);
                kVar.J0 = new h(iVar);
                return kVar;
        }
    }
}

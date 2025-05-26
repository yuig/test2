package w82;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import z70.m;

/* loaded from: classes4.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128462i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f128463j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(i iVar, int i13) {
        super(0);
        this.f128462i = i13;
        this.f128463j = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f128462i;
        i iVar = this.f128463j;
        switch (i13) {
            case 0:
                Context requireContext = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                c92.f fVar = new c92.f(requireContext, new kd1.j(iVar.a8().f54181d.e(), 19));
                fVar.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
                return fVar;
            default:
                String str = ((z82.j) iVar.Z7()).f141136j;
                if (str != null) {
                    m mVar = iVar.f128476d0;
                    if (mVar == null) {
                        Intrinsics.r("chromeTabHelper");
                        throw null;
                    }
                    m.f(mVar, str, null, null, null, true, null, null, false, null, false, true, null, false, null, h.f128473i, 15232);
                }
                return Unit.f80348a;
        }
    }
}

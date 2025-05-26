package mx;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mq.z;
import qp1.n;
import z70.m;

/* loaded from: classes3.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88445i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f88446j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(h hVar, int i13) {
        super(0);
        this.f88445i = i13;
        this.f88446j = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f88445i;
        h hVar = this.f88446j;
        switch (i13) {
            case 0:
                Context requireContext = hVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                pp1.f fVar = new pp1.f(requireContext, new z(hVar.a8().f104843e.e(), 13));
                fVar.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
                return fVar;
            default:
                String str = ((np1.i) hVar.Z7()).f91798j;
                if (((np1.i) hVar.Z7()).f()) {
                    hVar.a8().f104843e.e().a(n.f104812a);
                    hVar.b8(str);
                } else if (str != null) {
                    m mVar = hVar.f88460e0;
                    if (mVar == null) {
                        Intrinsics.r("chromeTabHelper");
                        throw null;
                    }
                    m.f(mVar, str, null, null, null, true, null, null, false, null, false, true, null, false, null, g.f88456i, 15232);
                }
                return Unit.f80348a;
        }
    }
}

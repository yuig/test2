package jp;

import android.content.Context;
import c50.c1;
import cp.u;
import kh2.b0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lb0.q;
import rb2.p;

/* loaded from: classes3.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77249i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f77250j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, int i13) {
        super(0);
        this.f77249i = i13;
        this.f77250j = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f77249i;
        h hVar = this.f77250j;
        switch (i13) {
            case 0:
                hVar.getClass();
                g gVar = g.f77253j;
                com.pinterest.framework.multisection.datasource.pagedlist.s sVar = new com.pinterest.framework.multisection.datasource.pagedlist.s(hVar.f77260a, new ex.d(3, 16), gVar, new f(hVar, 0), new f(hVar, 1), null, null, null, 8160);
                sVar.o(3, new ep.c(14));
                return new com.pinterest.framework.multisection.datasource.pagedlist.g(sVar, new c1(0), "", null);
            default:
                u uVar = (u) ((p) hVar.getView());
                q qVar = uVar.f52976c1;
                if (qVar == null) {
                    Intrinsics.r("prefsManagerPersisted");
                    throw null;
                }
                Context requireContext = uVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return Boolean.valueOf(b0.z1(requireContext, qVar));
        }
    }
}

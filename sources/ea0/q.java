package ea0;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57994i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f57995j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(t tVar, int i13) {
        super(1);
        this.f57994i = i13;
        this.f57995j = tVar;
    }

    public final void b(ra0.c ids) {
        int i13 = this.f57994i;
        t tVar = this.f57995j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(ids, "ids");
                c cVar = new c(ids);
                int i14 = t.W0;
                kh2.j.x2(tVar.k9(), cVar);
                break;
            default:
                Intrinsics.checkNotNullParameter(ids, "ids");
                r0 r0Var = new r0(ids);
                int i15 = t.W0;
                kh2.j.x2(tVar.k9(), r0Var);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f57994i) {
            case 0:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d(kotlin.collections.e0.b(vn1.e.BOLD));
                Context requireContext = this.f57995j.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                bind.h(pk.a0.w(requireContext));
                bind.f108891f = 2;
                bind.c(rn1.b.END);
                break;
            case 1:
                b((ra0.c) obj);
                break;
            default:
                b((ra0.c) obj);
                break;
        }
        return Unit.f80348a;
    }
}

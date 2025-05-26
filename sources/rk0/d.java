package rk0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.k;
import rm1.l;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108455i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ sk0.a f108456j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(sk0.a aVar, int i13) {
        super(1);
        this.f108455i = i13;
        this.f108456j = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f108455i;
        sk0.a aVar = this.f108456j;
        switch (i13) {
            case 0:
                l standard = (l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(aVar.f113045b);
                return Unit.f80348a;
            case 1:
                k bind = (k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new d(aVar, 0));
                bind.a(aVar.f113047d ? rm1.c.DEFAULT : rm1.c.DISABLED);
                return Unit.f80348a;
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, aVar.f113044a, aVar.f113047d ? vn1.c.DEFAULT : vn1.c.DISABLED, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
        }
    }
}

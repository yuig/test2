package cj0;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import so.ba;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27845i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f27846j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, int i13) {
        super(1);
        this.f27845i = i13;
        this.f27846j = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f27845i;
        p pVar = this.f27846j;
        switch (i13) {
            case 0:
                i rawItemVMState = (i) obj;
                Intrinsics.checkNotNullParameter(rawItemVMState, "rawItemVMState");
                ni1.d0 d0Var = pVar.Q0;
                if (d0Var != null) {
                    return ((ba) d0Var).a(rawItemVMState.f27832b, new mq.w(pVar, 2), new mj.m(2)).a(rawItemVMState.f27833c, rawItemVMState.f27831a);
                }
                Intrinsics.r("pinToVMStateConverterFactory");
                throw null;
            default:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                int i14 = p.X0;
                kh2.j.x2(pVar.l9(), new u0(pin));
                return Unit.f80348a;
        }
    }
}

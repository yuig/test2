package kd1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mq.w;
import ni1.d0;
import so.ba;
import zw0.t;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79242i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f79243j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(k kVar, int i13) {
        super(1);
        this.f79242i = i13;
        this.f79243j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f79242i;
        k kVar = this.f79243j;
        switch (i13) {
            case 0:
                ln1.l bind = (ln1.l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d(d7.b.Z(kVar.P0));
                return Unit.f80348a;
            default:
                t productVMState = (t) obj;
                Intrinsics.checkNotNullParameter(productVMState, "productVMState");
                d0 d0Var = kVar.N0;
                if (d0Var != null) {
                    return ((ba) d0Var).a(productVMState.f142931c, new w(kVar, 12), new mj.m(28)).a(productVMState.f142930b, productVMState.f142929a);
                }
                Intrinsics.r("pgcVMStateConverterFactory");
                throw null;
        }
    }
}

package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127581i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b2.t0 f127582j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(b2.t0 t0Var, int i13) {
        super(1);
        this.f127581i = i13;
        this.f127582j = t0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f127581i;
        b2.t0 t0Var = this.f127582j;
        switch (i13) {
            case 0:
                return new e.b(t0Var, 5);
            default:
                long j13 = ((a3.c) obj).f482a;
                t0Var.t();
                return Unit.f80348a;
        }
    }
}

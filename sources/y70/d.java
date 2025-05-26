package y70;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import nx.o0;

/* loaded from: classes.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f137985i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f137986j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i13) {
        super(1);
        this.f137985i = i13;
        this.f137986j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f137985i) {
            case 0:
                o0 o0Var = this.f137986j.f137990d;
                synchronized (o0Var) {
                    o0Var.f92440c.e();
                }
                return Unit.f80348a;
            default:
                this.f137986j.f137991e.o("Failed to flush events", (Throwable) obj);
                return Unit.f80348a;
        }
    }
}

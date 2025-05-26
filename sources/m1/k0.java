package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class k0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o3.f f85410i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t0 f85411j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(t0 t0Var, o3.f fVar) {
        super(2);
        this.f85410i = fVar;
        this.f85411j = t0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j13 = ((a3.c) obj2).f482a;
        kg.n.b(this.f85410i, (n3.q) obj);
        co2.q qVar = this.f85411j.f85582t;
        if (qVar != null) {
            qVar.g(new w(j13));
        }
        return Unit.f80348a;
    }
}

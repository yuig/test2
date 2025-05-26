package br1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f0 f23804i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f23805j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f23806k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f23807l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f0 f0Var, u2.q qVar, int i13, int i14) {
        super(2);
        this.f23804i = f0Var;
        this.f23805j = qVar;
        this.f23806k = i13;
        this.f23807l = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f23806k | 1);
        u2.q qVar = this.f23805j;
        int i13 = this.f23807l;
        e0.d(this.f23804i, qVar, (i2.o) obj, p13, i13);
        return Unit.f80348a;
    }
}

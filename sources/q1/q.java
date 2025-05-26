package q1;

import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import q3.q0;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101966i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.c0 f101967j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f101968k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f101969l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f101970m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(androidx.compose.foundation.lazy.layout.c0 c0Var, long j13, int i13, int i14, int i15) {
        super(3);
        this.f101966i = i15;
        this.f101967j = c0Var;
        this.f101968k = j13;
        this.f101969l = i13;
        this.f101970m = i14;
    }

    public final q0 b(int i13, int i14, Function1 function1) {
        int i15 = this.f101966i;
        androidx.compose.foundation.lazy.layout.c0 c0Var = this.f101967j;
        int i16 = this.f101970m;
        long j13 = this.f101968k;
        int i17 = this.f101969l;
        switch (i15) {
            case 0:
                return ((androidx.compose.foundation.lazy.layout.d0) c0Var).f17231b.s0(bs1.c.J(i13 + i17, j13), bs1.c.I(i14 + i16, j13), z0.d(), function1);
            case 1:
                return ((androidx.compose.foundation.lazy.layout.d0) c0Var).f17231b.s0(bs1.c.J(i13 + i17, j13), bs1.c.I(i14 + i16, j13), z0.d(), function1);
            default:
                return ((androidx.compose.foundation.lazy.layout.d0) c0Var).f17231b.s0(bs1.c.J(i13 + i17, j13), bs1.c.I(i14 + i16, j13), z0.d(), function1);
        }
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f101966i) {
        }
        return b(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1) obj3);
    }
}

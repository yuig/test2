package w80;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128347i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h1 f128348j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f128349k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(h1 h1Var, i2.q1 q1Var, int i13) {
        super(1);
        this.f128347i = i13;
        this.f128348j = h1Var;
        this.f128349k = q1Var;
    }

    public final long b(n4.b offset) {
        int i13 = this.f128347i;
        i2.q1 q1Var = this.f128349k;
        h1 h1Var = this.f128348j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                return d7.b.a(0, ((int) ((a3.d) h1Var.f128302c.getValue()).f485b) - (((int) (((n4.j) q1Var.getValue()).f89186a & 4294967295L)) / 2));
            default:
                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                a3.d dVar = (a3.d) h1Var.f128303d.getValue();
                return d7.b.a(((int) a3.c.d(dVar.b())) - ((int) (((n4.j) q1Var.getValue()).f89186a >> 32)), (int) a3.c.e(dVar.b()));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f128347i) {
        }
        return new n4.h(b((n4.b) obj));
    }
}

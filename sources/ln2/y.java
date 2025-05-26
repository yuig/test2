package ln2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84147i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0 f84148j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ tm2.i0 f84149k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ nn2.s f84150l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(a0 a0Var, tm2.i0 i0Var, nn2.s sVar, int i13) {
        super(0);
        this.f84147i = i13;
        this.f84148j = a0Var;
        this.f84149k = i0Var;
        this.f84150l = sVar;
    }

    public final dn2.g b() {
        int i13 = this.f84147i;
        tm2.i0 i0Var = this.f84149k;
        nn2.s sVar = this.f84150l;
        a0 a0Var = this.f84148j;
        switch (i13) {
            case 0:
                e0 a13 = a0Var.a((am2.m) a0Var.f84059a.f82655d);
                Intrinsics.f(a13);
                c cVar = ((o) a0Var.f84059a.f82653b).f84112e;
                pn2.b0 returnType = sVar.getReturnType();
                Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                return (dn2.g) cVar.b(a13, i0Var, returnType);
            default:
                e0 a14 = a0Var.a((am2.m) a0Var.f84059a.f82655d);
                Intrinsics.f(a14);
                c cVar2 = ((o) a0Var.f84059a.f82653b).f84112e;
                pn2.b0 returnType2 = sVar.getReturnType();
                Intrinsics.checkNotNullExpressionValue(returnType2, "getReturnType(...)");
                return (dn2.g) cVar2.a(a14, i0Var, returnType2);
        }
    }

    public final on2.j e() {
        int i13 = this.f84147i;
        tm2.i0 i0Var = this.f84149k;
        nn2.s sVar = this.f84150l;
        a0 a0Var = this.f84148j;
        switch (i13) {
            case 1:
                on2.u d2 = a0Var.f84059a.d();
                y yVar = new y(a0Var, i0Var, sVar, 0);
                on2.q qVar = (on2.q) d2;
                qVar.getClass();
                return new on2.j(qVar, yVar);
            default:
                on2.u d13 = a0Var.f84059a.d();
                y yVar2 = new y(a0Var, i0Var, sVar, 2);
                on2.q qVar2 = (on2.q) d13;
                qVar2.getClass();
                return new on2.j(qVar2, yVar2);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f84147i) {
            case 0:
                return b();
            case 1:
                return e();
            case 2:
                return b();
            default:
                return e();
        }
    }
}

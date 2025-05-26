package gk1;

import kotlin.jvm.functions.Function0;
import so.ec;
import so.nd;
import so.yb;

/* loaded from: classes2.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f65260i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l82.e f65261j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0 f65262k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(l82.e eVar, x0 x0Var, int i13) {
        super(0);
        this.f65260i = i13;
        this.f65261j = eVar;
        this.f65262k = x0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        nd ndVar = nd.f113572a;
        int i13 = this.f65260i;
        x0 x0Var = this.f65262k;
        l82.e eVar = this.f65261j;
        switch (i13) {
            case 0:
                eVar.a(new g0(ndVar));
                return Boolean.valueOf(x0Var.f65299g.f90850e);
            case 1:
                eVar.a(new g0(ec.f113407a));
                return Boolean.valueOf(x0Var.f65299g.f90846c);
            case 2:
                eVar.a(new g0(yb.f114733a));
                return Boolean.valueOf(x0Var.f65299g.I);
            default:
                eVar.a(new g0(ndVar));
                return Boolean.valueOf(x0Var.f65299g.f90850e);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f65260i) {
        }
        return invoke();
    }
}

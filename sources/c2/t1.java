package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i2 f25238i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n4.b f25239j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f25240k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(i2 i2Var, n4.b bVar, float f13) {
        super(0);
        this.f25238i = i2Var;
        this.f25239j = bVar;
        this.f25240k = f13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        i2 i2Var = this.f25238i;
        i2Var.f24843b = this.f25239j;
        p1.h1 h1Var = new p1.h1(this.f25240k, 0.0f, 4);
        r1 r1Var = new r1();
        h1Var.invoke(r1Var);
        a3 a3Var = new a3(r1Var.f25127a);
        w wVar = i2Var.f24842a;
        boolean isNaN = Float.isNaN(wVar.f25334j.h());
        i2.o0 o0Var = wVar.f25332h;
        if (isNaN) {
            value = o0Var.getValue();
        } else {
            value = a3Var.a(wVar.f25334j.h());
            if (value == null) {
                value = o0Var.getValue();
            }
        }
        if (!Intrinsics.d(wVar.d(), a3Var)) {
            wVar.f25337m.setValue(a3Var);
            if (!wVar.i(value)) {
                wVar.h(value);
            }
        }
        return Unit.f80348a;
    }
}

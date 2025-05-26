package j1;

import i2.v3;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class x1 implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final b2 f74308a;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f74309b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f74310c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y1 f74311d;

    public x1(y1 y1Var, b2 b2Var, Function1 function1, Function1 function12) {
        this.f74311d = y1Var;
        this.f74308a = b2Var;
        this.f74309b = function1;
        this.f74310c = function12;
    }

    public final void b(z1 z1Var) {
        Object invoke = this.f74310c.invoke(z1Var.a());
        boolean g13 = this.f74311d.f74326c.g();
        b2 b2Var = this.f74308a;
        if (g13) {
            b2Var.g(this.f74310c.invoke(z1Var.c()), invoke, (h0) this.f74309b.invoke(z1Var));
        } else {
            b2Var.h(invoke, (h0) this.f74309b.invoke(z1Var));
        }
    }

    @Override // i2.v3
    public final Object getValue() {
        b(this.f74311d.f74326c.f());
        return this.f74308a.f74002h.getValue();
    }
}

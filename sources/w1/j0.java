package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127303i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b2.t0 f127304j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(b2.t0 t0Var, int i13) {
        super(0);
        this.f127303i = i13;
        this.f127304j = t0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f127303i;
        b2.t0 t0Var = this.f127304j;
        switch (i13) {
            case 0:
                t0Var.n();
                break;
            case 1:
                t0Var.h(true);
                break;
            case 2:
                t0Var.d(true);
                break;
            default:
                t0Var.f();
                break;
        }
        return Boolean.TRUE;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f127303i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                m277invoke();
                break;
            case 5:
                m277invoke();
                break;
            case 6:
                m277invoke();
                break;
            default:
                m277invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m277invoke() {
        int i13 = this.f127303i;
        b2.t0 t0Var = this.f127304j;
        switch (i13) {
            case 4:
                t0Var.d(true);
                t0Var.m();
                break;
            case 5:
                t0Var.f();
                t0Var.m();
                break;
            case 6:
                t0Var.n();
                t0Var.m();
                break;
            default:
                t0Var.o();
                break;
        }
    }
}

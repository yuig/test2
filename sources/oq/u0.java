package oq;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97142i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0 f97143j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(x0 x0Var, int i13) {
        super(0);
        this.f97142i = i13;
        this.f97143j = x0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f97142i;
        x0 x0Var = this.f97143j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(x0Var.k0().w() && !x0Var.k0().f());
            default:
                return Boolean.valueOf(x0Var.k0().K());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f97142i) {
            case 0:
                return invoke();
            case 1:
                return invoke();
            default:
                return Integer.valueOf(bs1.c.b0(this.f97143j, eo1.c.space_1100));
        }
    }
}

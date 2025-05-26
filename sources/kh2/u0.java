package kh2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79712i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z0 f79713j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(z0 z0Var, int i13) {
        super(0);
        this.f79712i = i13;
        this.f79713j = z0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79712i;
        z0 z0Var = this.f79713j;
        switch (i13) {
            case 0:
                return (ag2.b) z0Var.f79775k.a(z0Var, z0.f79764n[11]);
            default:
                return (lg2.d) z0Var.f79774j.a(z0Var, z0.f79764n[9]);
        }
    }
}

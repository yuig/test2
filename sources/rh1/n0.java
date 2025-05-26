package rh1;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108256i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q0 f108257j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(q0 q0Var, int i13) {
        super(0);
        this.f108256i = i13;
        this.f108257j = q0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f108256i;
        q0 q0Var = this.f108257j;
        switch (i13) {
            case 0:
                return q0Var.generateLoggingContext();
            case 1:
                int i14 = q0.B1;
                q0Var.getClass();
                if (q0.m9()) {
                    return null;
                }
                return new ca2.e(true, null, 0, 0, null, 0, null, new bh.b(q0Var.s7(), new n0(q0Var, 0)), false, false, 894);
            default:
                return new cu.k(q0Var, 5);
        }
    }
}

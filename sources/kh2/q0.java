package kh2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class q0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79658i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function0 f79659j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b1 f79660k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Function0 function0, b1 b1Var, int i13) {
        super(0);
        this.f79658i = i13;
        this.f79659j = function0;
        this.f79660k = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79658i;
        b1 b1Var = this.f79660k;
        Function0 function0 = this.f79659j;
        switch (i13) {
            case 0:
                try {
                    c0.d.M2("process-state-service-init");
                    androidx.lifecycle.z zVar = (androidx.lifecycle.z) function0.invoke();
                    if (zVar == null) {
                        zVar = androidx.lifecycle.s0.f18675i;
                    }
                    return new bi2.e(((d1) b1Var).f79455a, ((d1) b1Var).f79456b, zVar);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } finally {
                        c0.d.N();
                    }
                }
            default:
                nf2.n nVar = (nf2.n) function0.invoke();
                return nVar == null ? new nf2.n(((d1) b1Var).f79456b) : nVar;
        }
    }
}

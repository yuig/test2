package kh2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class u extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79710i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d3 f79711j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(d3 d3Var, int i13) {
        super(0);
        this.f79710i = i13;
        this.f79711j = d3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79710i;
        d3 d3Var = this.f79711j;
        switch (i13) {
            case 0:
                return ((f3) d3Var).a().b("embrace_crash_marker");
            default:
                return new xg2.b(xk2.m.b(new u(d3Var, 0)));
        }
    }
}

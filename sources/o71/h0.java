package o71;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93299i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f93300j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(j0 j0Var, int i13) {
        super(0);
        this.f93299i = i13;
        this.f93300j = j0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f93299i;
        j0 j0Var = this.f93300j;
        switch (i13) {
            case 0:
                return j0Var.f93398i;
            default:
                return Integer.valueOf(j0Var.getDataSourceProvider().a());
        }
    }
}

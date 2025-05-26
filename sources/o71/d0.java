package o71;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93254i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f93255j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(f0 f0Var, int i13) {
        super(0);
        this.f93254i = i13;
        this.f93255j = f0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f93254i;
        f0 f0Var = this.f93255j;
        switch (i13) {
            case 0:
                return f0Var.f93398i;
            default:
                l71.f fVar = f0Var.C;
                if (fVar != null) {
                    return Integer.valueOf(fVar.a());
                }
                Intrinsics.r("mainList");
                throw null;
        }
    }
}

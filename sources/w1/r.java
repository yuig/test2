package w1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127463i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v2 f127464j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(v2 v2Var, int i13) {
        super(0);
        this.f127463i = i13;
        this.f127464j = v2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        b4.l0 l0Var;
        int i13 = 2;
        int i14 = this.f127463i;
        v2 v2Var = this.f127464j;
        switch (i14) {
            case 0:
                return Boolean.valueOf(v2Var != null ? ((Boolean) new r(v2Var, i13).invoke()).booleanValue() : false);
            case 1:
                return Boolean.valueOf(v2Var != null ? ((Boolean) new r(v2Var, i13).invoke()).booleanValue() : false);
            default:
                b4.g gVar = v2Var.f127551c;
                b4.m0 m0Var = (b4.m0) v2Var.f127550b.getValue();
                return Boolean.valueOf(Intrinsics.d(gVar, (m0Var == null || (l0Var = m0Var.f21615a) == null) ? null : l0Var.f21603a));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f127463i) {
        }
        return invoke();
    }
}

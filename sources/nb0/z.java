package nb0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90336i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0 f90337j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(p0 p0Var, int i13) {
        super(0);
        this.f90336i = i13;
        this.f90337j = p0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f90336i;
        p0 p0Var = this.f90337j;
        switch (i13) {
            case 0:
                return (e) ((bf2.b) p0Var.f90307c).get();
            default:
                return (lb0.o) ((bf2.b) p0Var.f90308d).get();
        }
    }
}

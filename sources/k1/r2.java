package k1;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class r2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77996i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t2 f77997j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(t2 t2Var, int i13) {
        super(0);
        this.f77996i = i13;
        this.f77997j = t2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f77996i;
        t2 t2Var = this.f77997j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(t2Var.f78027a.h() > 0);
            default:
                return Boolean.valueOf(t2Var.f78027a.h() < t2Var.f78030d.h());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f77996i) {
        }
        return invoke();
    }
}

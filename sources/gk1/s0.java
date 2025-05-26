package gk1;

import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class s0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f65264i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0 f65265j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(x0 x0Var, int i13) {
        super(0);
        this.f65264i = i13;
        this.f65265j = x0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f65264i;
        x0 x0Var = this.f65265j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(x0Var.f65299g.D);
            case 1:
                return Boolean.valueOf(x0Var.f65299g.I);
            case 2:
                return Boolean.valueOf(x0Var.f65299g.f90846c);
            case 3:
                return Boolean.valueOf(x0Var.f65299g.D);
            default:
                return Boolean.valueOf(x0Var.f65299g.I);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f65264i) {
        }
        return invoke();
    }
}

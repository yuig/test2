package pu;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101344i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f101345j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(j0 j0Var, int i13) {
        super(0);
        this.f101344i = i13;
        this.f101345j = j0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f101344i;
        j0 j0Var = this.f101345j;
        switch (i13) {
            case 0:
                int i14 = j0.f101356u0;
                qu.a aVar = new qu.a(j0Var.c8(), null, 0, j0Var.f8());
                aVar.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
                return aVar;
            case 1:
                int i15 = j0.f101356u0;
                return new ru.b(j0Var.c8(), null, 0, j0Var.f8());
            default:
                j0Var.f8().a(i.f101352a);
                return Unit.f80348a;
        }
    }
}
